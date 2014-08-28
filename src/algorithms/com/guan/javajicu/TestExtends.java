package algorithms.com.guan.javajicu;

public class TestExtends extends A{

	public static void prt(){
		System.out.println("2");
	}
	
	public TestExtends(){
		super();
		System.out.println("B");
	}
	
	public static void main(String [] args){
		A a = new TestExtends();
		a = new A();
	}
}


