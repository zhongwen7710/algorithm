package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * 问题描述：
	有4个线程和1个公共的字符数组。线程1的功能就是向数组输出A，线程2的功能就是向字符输出B，线程3的功能就是向数组输出C，线程4的功能就是向数组输出D。要求按顺序向数组赋值ABCDABCDABCD，ABCD的个数由线程函数1的参数指定。[注：C语言选手可使用WINDOWS SDK库函数]
	接口说明：
	void init();  //初始化函数
	void Release(); //资源释放函数
	unsignedint__stdcall ThreadFun1(PVOID pM)  ; //线程函数1，传入一个int类型的指针[取值范围：1 – 250，测试用例保证]，用于初始化输出A次数，资源需要线程释放
	unsignedint__stdcall ThreadFun2(PVOID pM)  ;//线程函数2，无参数传入
	unsignedint__stdcall ThreadFun3(PVOID pM)  ;//线程函数3，无参数传入
	Unsigned int __stdcall ThreadFunc4(PVOID pM);//线程函数4，无参数传入
	char  g_write[1032]; //线程1,2,3,4按顺序向该数组赋值。不用考虑数组是否越界，测试用例保证
	
	知识点：基于输入输出,语言基础,字符串,循环,数据结构,链表,队列,栈,算法,查找,搜索,排序,树,图,数组,函数,指针,枚举,位运算,结构体,联合体,文件操作,递归
	输  入：输入一个int整数
	输  出：输出多个ABCD
 * @author guanxiangqing
 *
 */
public class MultithreadingProgramming {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		char[] s = { 'A', 'B', 'C', 'D' };

		Pint a = new Pint(s[0], n);
		Pint b = new Pint(s[1], n);
		Pint c = new Pint(s[2], n);
		Pint d = new Pint(s[3], n);

		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		Thread t4 = new Thread(d);

		t1.start();
		Thread.sleep(10);
		t2.start();
		Thread.sleep(10);
		t3.start();
		Thread.sleep(10);
		t4.start();
		Thread.sleep(10);

	}

}

class Pint implements Runnable {
	private char name;
	private int num;

	public Pint(char name, int num) {
		this.name = name;
		this.num = num;

	}

	public synchronized void run() {

		for (int i = 0; i < num; i++) {
			System.out.print(name);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
