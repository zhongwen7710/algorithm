package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * ����������
	��һ�ּ��ɿ��Զ����ݽ��м��ܣ���ʹ��һ��������Ϊ�����ܳס����������Ĺ���ԭ�����ȣ�ѡ��һ��������Ϊ�ܳף���TRAILBLAZERS����������а������ظ�����ĸ��ֻ������1�������༸�����������ڣ��޸Ĺ����Ǹ�����������ĸ������棬������ʾ��
	A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
	T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
	������������ĸ����ʣ�����ĸ����������ڶ���Ϣ���м���ʱ����Ϣ�е�ÿ����ĸ���̶��ڶ������У������������еĶ�Ӧ��ĸһһȡ��ԭ�ĵ���ĸ(��ĸ�ַ��Ĵ�Сд״̬Ӧ�ñ���)����ˣ�ʹ������ܳף�Attack AT DAWN(����ʱ����)�ͻᱻ����ΪTpptad TP ITVH��
	��ʵ�������ӿڣ�ͨ��ָ�����ܳ׺����ĵõ����ġ�
	��ϸ������
	�ӿ�˵��
	ԭ�ͣ�
	voidencrypt(char * key,char * data,char * encrypt);
	���������
	    char * key���ܳ�
	    char * data������
	���������
	    char * encrypt������
	����ֵ��
	        void
	֪ʶ�㣺�ַ���
	��  �룺������key��Ҫ���ܵ��ַ���
	��  �������ؼ��ܺ���ַ���

 * @author guanxiangqing
 *
 */
public class StringDataEncryption {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String key[] = scanner.nextLine().split("");
		for (int i = 0; i < key.length; i++) {
			for (int j = i + 1; j < key.length; j++) {
				if (key[i].compareTo(key[j]) == 0)
					key[j] = "";
			}
		}
		String zimu = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		String ZIMU[] = zimu.split(" ");
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < key.length; i++) {
			if (key[i].compareTo("") != 0)
				list.add(key[i]);
		}
		for (int i = 0; i < ZIMU.length; i++) {
			boolean biaoji = false;
			for (int j = 0; j < key.length; j++) {
				if (ZIMU[i].compareTo(key[j]) == 0) {
					biaoji = true;
					break;
				}
			}
			if (!biaoji)
				list.add(ZIMU[i]);
		}
		// for(int i=0;i<list.size();i++){
		// System.out.print(list.get(i));
		// }
		String jiami[] = scanner.nextLine().split("");
		for (int i = 0; i < jiami.length; i++) {
			for (int j = 0; j < ZIMU.length; j++) {
				if (jiami[i].compareTo(ZIMU[j]) == 0) {
					System.out.print(list.get(j));
					break;
				}
			}
		}
	}
}