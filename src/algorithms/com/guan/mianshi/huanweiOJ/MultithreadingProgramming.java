package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 * ����������
	��4���̺߳�1���������ַ����顣�߳�1�Ĺ��ܾ������������A���߳�2�Ĺ��ܾ������ַ����B���߳�3�Ĺ��ܾ������������C���߳�4�Ĺ��ܾ������������D��Ҫ��˳�������鸳ֵABCDABCDABCD��ABCD�ĸ������̺߳���1�Ĳ���ָ����[ע��C����ѡ�ֿ�ʹ��WINDOWS SDK�⺯��]
	�ӿ�˵����
	void init();  //��ʼ������
	void Release(); //��Դ�ͷź���
	unsignedint__stdcall ThreadFun1(PVOID pM)  ; //�̺߳���1������һ��int���͵�ָ��[ȡֵ��Χ��1 �C 250������������֤]�����ڳ�ʼ�����A��������Դ��Ҫ�߳��ͷ�
	unsignedint__stdcall ThreadFun2(PVOID pM)  ;//�̺߳���2���޲�������
	unsignedint__stdcall ThreadFun3(PVOID pM)  ;//�̺߳���3���޲�������
	Unsigned int __stdcall ThreadFunc4(PVOID pM);//�̺߳���4���޲�������
	char  g_write[1032]; //�߳�1,2,3,4��˳��������鸳ֵ�����ÿ��������Ƿ�Խ�磬����������֤
	
	֪ʶ�㣺�����������,���Ի���,�ַ���,ѭ��,���ݽṹ,����,����,ջ,�㷨,����,����,����,��,ͼ,����,����,ָ��,ö��,λ����,�ṹ��,������,�ļ�����,�ݹ�
	��  �룺����һ��int����
	��  ����������ABCD
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
