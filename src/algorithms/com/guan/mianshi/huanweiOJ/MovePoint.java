package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
输入：
合法坐标为A(或者D或者W或者S) + 数字（两位以内）
坐标之间以;分隔。
非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
下面是一个简单的例子 如：
A10;S20;W10;D30;X;A1A;B10A11;;A10;
处理过程：
起点（0,0）
+   A10   =  （-10,0）
+   S20   =  (-10,-20)
+   W10  =  (-10,-10)
+   D30  =  (20,-10)
+   x    =  无效
+   A1A   =  无效
+   B10A11   =  无效
+  一个空 不影响
+   A10  =  (10,-10)
结果 （10， -10)

 * @author guanxiangqing
 *
 */
public class MovePoint {
	public static boolean judge(String string) {
		boolean flag = false;
		if (string.length() > 0) {
			char c = string.charAt(0);
			if (c == 'A' || c == 'S' || c == 'D' || c == 'W'
					&& string.length() <= 3) {
				String str = string.substring(1);
				try {
					int n = Integer.parseInt(str);
					flag = true;
				} catch (NumberFormatException e) {
					flag = false;
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		String string = inScanner.nextLine();
		String strings[] = string.split(";");
		int x = 0;
		int y = 0;
		for (String str : strings) {
			if (judge(str)) {
				char c = str.charAt(0);
				int distance = Integer.parseInt(str.substring(1));
				if (c == 'A') {
					x -= distance;
				}
				if (c == 'D') {
					x += distance;
				}
				if (c == 'W') {
					y += distance;
				}
				if (c == 'S') {
					y -= distance;
				}
			} else {
				continue;
			}
		}
		System.out.print(x + "," + y);
	}
}