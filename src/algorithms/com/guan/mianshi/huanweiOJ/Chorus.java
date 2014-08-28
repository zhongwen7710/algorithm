package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	计算最少出列多少位同学，使得剩下的同学排成合唱队形
	说明：
	N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。 
	合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得Ti<T2<......<Ti-1<Ti>Ti+1>......>TK。 
     	你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。 

	知识点：循环
	输  入： 
		整数N
		一行整数，空格隔开，N位同学身高
	输  出：最少需要几位同学出列

 * @author guanxiangqing
 *
 */
public class Chorus {
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] heights = sc.nextLine().split(" ");
		int[] height = new int[num];
		for (int i = 0; i < num; i++) {
			height[i] = Integer.parseInt(heights[i]);
		}

		int rest = dequeue(height, num);
		System.out.println(rest);
		sc.close();
	}

	public static int dequeue(int[] height, int num) {
		int max = 0;
		int[] inc = new int[num];
		int[] dec = new int[num];
		inc[0] = 1;
		for (int i = 1; i < num; i++) {
			inc[i] = 1;
			for (int j = 0; j < i; j++) {
				if (height[i] > height[j] && inc[j] + 1 > inc[i]) {
					inc[i] = inc[j] + 1;
				}
			}
		}
		dec[num - 1] = 1;
		for (int k = num - 2; k >= 0; k--) {
			dec[k] = 1;
			for (int g = num - 1; g > k; g--) {
				if (height[k] > height[g] && dec[g] + 1 > dec[k]) {
					dec[k] = dec[g] + 1;
				}
			}
		}
		for (int n = 0; n < num; n++) {
			if (inc[n] + dec[n] - 1 > max) {
				max = inc[n] + dec[n] - 1;
			}
		}
		return num - max;
	}

}