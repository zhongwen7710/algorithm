package algorithms.com.guan.mianshi;

import java.util.Scanner;

/**
 * 测试用例：
 * AACTGTGCACGACCTGA
 * 5
 * GCACG
 * @author Administrator
 *
 */
public class DnaSequence {

	private static Scanner sca;

	public static void main(String[] args) {
		sca = new Scanner(System.in);
		String  dna = sca.next();
		//System.out.println("你输入的DNA为：" + dna);
		
		sca = new Scanner(System.in);
		int num = sca.nextInt();
		//System.out.println("你输入的查找个数为："+num);

		String findgooddna = fingmaxDNAFragment(dna,num);
		System.out.println(findgooddna);
	}
	
	public static String fingmaxDNAFragment(String dna,int num){
		String maxDNAFragment ="";
		int dnalength = dna.length();
		int gap = dnalength - num + 1;
		double mid = 0.0;
		int midcent = 0;
		
		//System.out.println("dna的长度为：" + dna.length());
		//System.out.println("ｇａｐ的大小为："+ gap);
		
		for(int i =0; i < gap; i++){
			maxDNAFragment = dna.substring(i, i+num);
			//System.out.println("maxDNAFragment个数：" + maxDNAFragment.length());
			
			//mid = calculatePercent(maxDNAFragment);
			//System.out.println("mid的值为："+mid);
			
			if(mid < calculatePercent(maxDNAFragment)){
				mid = calculatePercent(maxDNAFragment);
				//System.out.println("mid的值为："+mid);
				midcent = i;
			}
			
			//System.out.println("midcent的值为："+midcent);
			
		}
		
		return dna.substring(midcent, midcent+num);
	}
	
	public static double calculatePercent(String s){
		double percent = 0.0;
		char s1 = 'G';
		char s2 = 'C';
		char [] chars = s.toCharArray();
		int count = 0;
		int ssize = s.length();
		
		for(int k=0; k < ssize; k++){
			if(chars[k] == s1  || chars[k] == s2){
				count++;
			}
		}
		
		percent = (double)count/ssize;
		return percent;
	}

}



