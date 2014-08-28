package algorithms.com.guan.mianshi.huanweiOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *����������
	��ʵ�ֽӿڣ�
	unsigned int  AddCandidate (char* pCandidateName);
	���ܣ����ú�ѡ������
	���룺 char* pCandidateName ��ѡ������
	�������
	���أ�����ֵ�Ƿ�����0���Ѿ���ӹ�����0 ����ӳɹ�����1
	 
	Void Vote(char* pCandidateName);
	���ܣ�ͶƱ
	���룺 char* pCandidateName ��ѡ������
	�������
	���أ���
	
	unsigned int  GetVoteResult (char* pCandidateName);
	���ܣ���ȡ��ѡ�˵�Ʊ�����������Ϊ��ָ�룬������Ч��Ʊ����ͬʱ˵������ͶƱ��������ͷ���Դ
	���룺 char* pCandidateName ��ѡ��������������һ����ָ��ʱ��������Ч��Ʊ��
	�������
	���أ��ú�ѡ�˻�ȡ��Ʊ��
	 
	void Clear()
	// ���ܣ����ͶƱ������ͷ�������Դ
	// ���룺
	// �������
	// ����
	֪ʶ�㣺����
	��  �룺�����ѡ�˵��������ڶ��������ѡ�˵����֣�����������ͶƱ�˵�����������������ͶƱ��
	��  ����ÿ�������ѡ�˵����ֺ͵�Ʊ������
 
 * @author 
 *
 */
public class TallyingStatistics {

	static Map<Character, Integer> map = new HashMap<Character, Integer>();
	static ArrayList<Character> al = new ArrayList<Character>();

	public static void addCandidate(char[] pCandidateName) {
		for (int i = 0; i < pCandidateName.length; i++) {
			if (al.contains(pCandidateName[i])) {
				break;
			} else {
				al.add(pCandidateName[i]);
			}
		}
	}

	public static void vote(char[] pCandidateName) {

		int value = 0;
		for (int j = 0; j < al.size(); j++) {
			for (int i = 0; i < pCandidateName.length; i++) {
				if (al.get(j) == pCandidateName[i]) {
					value++;
				}
			}
			map.put(al.get(j), value);
			value = 0;

		}

	}

	public static void getVoteResult(char[] pCandidateName) {
		int invalid = pCandidateName.length;
		if (pCandidateName.length == 0) {
			clear();
			System.out.println("Invalid : 0");
		} else {
			for (int i = 0; i < al.size(); i++) {
				if (map.containsKey(al.get(i))) {
					invalid -= map.get(al.get(i));
					System.out.println(al.get(i) + " : " + map.get(al.get(i)));
				}
			}

			System.out.println("Invalid : " + invalid);
		}
	}

	public static void clear() {
		map.clear();
		al.clear();
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		int num1, num2;
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		num1 = Integer.parseInt(sc.readLine());
		char[] candidate = new char[num1];
		String a = sc.readLine();
		int j = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != ' ') {

				candidate[j] = a.charAt(i);
				j++;
			}
		}

		num2 = Integer.parseInt(sc.readLine());
		char[] votes = new char[num2];
		String b = sc.readLine();
		int k = 0;
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) != ' ') {

				votes[k] = b.charAt(i);
				k++;
			}
		}
		addCandidate(candidate);
		vote(votes);
		getVoteResult(votes);
		sc.close();
	}

}