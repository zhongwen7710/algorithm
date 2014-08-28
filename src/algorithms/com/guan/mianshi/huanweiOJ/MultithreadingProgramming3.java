package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;

public class MultithreadingProgramming3 {
	private static Scanner s;
	private static char[] g_write = new char[1032];
	private static int g_count = 0;
	private static int count = 0;

	public static void main(String[] args) {
		init();
		for (int i = 0; i < count; i++) {
			try {
				new ThreadFun1().start();
				Thread.sleep(10);
				new ThreadFun2().start();
				Thread.sleep(10);
				new ThreadFun3().start();
				Thread.sleep(10);
				new ThreadFun4().start();
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		release();
	}

	public static void release() {
		String resString = "";
		for (int i = 0; i < count * 4; i++) {
			resString = String.valueOf(resString + g_write[i]);
		}
		System.out.println(resString);
	}

	public static void init() {
		s = new Scanner(System.in);
		count = s.nextInt();
	}

	static class ThreadFun1 extends Thread {

		public void run() {
			g_write[g_count] = 'A';
			g_count++;
		}
	}

	static class ThreadFun2 extends Thread {

		public void run() {
			g_write[g_count] = 'B';
			g_count++;
		}
	}

	static class ThreadFun3 extends Thread {

		public void run() {
			g_write[g_count] = 'C';
			g_count++;
		}
	}

	static class ThreadFun4 extends Thread {

		public void run() {
			g_write[g_count] = 'D';
			g_count++;
		}
	}
}