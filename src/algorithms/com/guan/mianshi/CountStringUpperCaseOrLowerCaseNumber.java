package algorithms.com.guan.mianshi;

public class CountStringUpperCaseOrLowerCaseNumber {

	public static void main(String[] args) {
		 String s = "1jkhKhjklhklHLHjb90kBNo9" ;
	     System.out.println("***********方法一***********") ;
	     numChar1(s) ;
	     System.out.println("***********方法二***********") ;
	     numChar2(s) ;
	     System.out.println("***********方法三***********") ;
	     numChar3(s) ;
	}

	public static void numChar1(String s) {
        int cU = 0 ;
        int cL = 0 ;
        int cN = 0 ;
        char c ;
        for(int i=0 ;i<s.length() ;i++) {
            c = s.charAt(i) ;
            if(c >= 'a' && c <= 'z') {
                cL ++ ;
            }
            else if(c >= 'A' && c <= 'Z') {
                cU ++ ;
            }
            else {
                cN ++ ;
            }
        }
        System.out.println("Number of LowerCase:" + cL) ;
        System.out.println("Number of UpperCase:" + cU) ;
        System.out.println("Number of NotChar:" + cN) ;
    }

    public static void numChar2(String s) {
        String sL = "abcdefghijklmnopqrstuvwxyz" ;
        String sU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
        int cU = 0 ;
        int cL = 0 ;
        int cN = 0 ;
        char c ;
        for(int i=0 ; i<s.length() ;i++) {
            c = s.charAt(i) ;
            if(sL.indexOf(c) != -1) {
                cL ++ ;
            }
            else if(sU.indexOf(c) != -1) {
                cU ++ ;
            }
            else {
                cN ++ ;
            }
        }
        System.out.println("Number of LowerCase:" + cL) ;
        System.out.println("Number of UpperCase:" + cU) ;
        System.out.println("Number of NotChar:" + cN) ;
    }

    public static void numChar3(String s) {
        int cU = 0 ;
        int cL = 0 ;
        int cN = 0 ;
        char c ;
        for(int i=0 ;i<s.length() ;i++) {
            c = s.charAt(i) ;
            if(Character.isLowerCase(c)) {
                cL ++ ;
            }
            else if(Character.isUpperCase(c)) {
                cU ++ ;
            }
            else {
                cN ++ ;
            }
        }
        System.out.println("Number of LowerCase:" + cL) ;
        System.out.println("Number of UpperCase:" + cU) ;
        System.out.println("Number of NotChar:" + cN) ;
    }
}
