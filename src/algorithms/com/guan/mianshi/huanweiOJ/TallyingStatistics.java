package algorithms.com.guan.mianshi.huanweiOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *问题描述：
	请实现接口：
	unsigned int  AddCandidate (char* pCandidateName);
	功能：设置候选人姓名
	输入： char* pCandidateName 候选人姓名
	输出：无
	返回：输入值非法返回0，已经添加过返回0 ，添加成功返回1
	 
	Void Vote(char* pCandidateName);
	功能：投票
	输入： char* pCandidateName 候选人姓名
	输出：无
	返回：无
	
	unsigned int  GetVoteResult (char* pCandidateName);
	功能：获取候选人的票数。如果传入为空指针，返回无效的票数，同时说明本次投票活动结束，释放资源
	输入： char* pCandidateName 候选人姓名。当输入一个空指针时，返回无效的票数
	输出：无
	返回：该候选人获取的票数
	 
	void Clear()
	// 功能：清除投票结果，释放所有资源
	// 输入：
	// 输出：无
	// 返回
	知识点：查找
	输  入：输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。
	输  出：每行输出候选人的名字和得票数量。
 
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