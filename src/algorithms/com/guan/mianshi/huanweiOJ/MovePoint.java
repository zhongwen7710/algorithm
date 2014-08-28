package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	����һ��������㹤�ߣ� A��ʾ�����ƶ���D��ʾ�����ƶ���W��ʾ�����ƶ���S��ʾ�����ƶ����ӣ�0,0���㿪ʼ�ƶ����������ַ��������ȡһЩ���꣬�����������������������ļ����档
���룺
�Ϸ�����ΪA(����D����W����S) + ���֣���λ���ڣ�
����֮����;�ָ���
�Ƿ��������Ҫ���ж�������AA10;  A1A;  $%$;  YAD; �ȡ�
������һ���򵥵����� �磺
A10;S20;W10;D30;X;A1A;B10A11;;A10;
������̣�
��㣨0,0��
+   A10   =  ��-10,0��
+   S20   =  (-10,-20)
+   W10  =  (-10,-10)
+   D30  =  (20,-10)
+   x    =  ��Ч
+   A1A   =  ��Ч
+   B10A11   =  ��Ч
+  һ���� ��Ӱ��
+   A10  =  (10,-10)
��� ��10�� -10)

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