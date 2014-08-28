package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * 问题描述：
	有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，只保留第1个，其余几个丢弃。现在，修改过的那个单词死于字母表的下面，如下所示：
	A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
	T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
	上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固定于顶上那行，并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。因此，使用这个密匙，Attack AT DAWN(黎明时攻击)就会被加密为Tpptad TP ITVH。
	请实现下述接口，通过指定的密匙和明文得到密文。
	详细描述：
	接口说明
	原型：
	voidencrypt(char * key,char * data,char * encrypt);
	输入参数：
	    char * key：密匙
	    char * data：明文
	输出参数：
	    char * encrypt：密文
	返回值：
	        void
	知识点：字符串
	输  入：先输入key和要加密的字符串
	输  出：返回加密后的字符串

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