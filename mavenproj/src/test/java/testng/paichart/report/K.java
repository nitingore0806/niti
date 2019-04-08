package testng.paichart.report;

public interface K {
void m1();

void m2();
void m3();
void m4();
}

abstract class AbsSet implements K{
	
	
	public void m3() {
		System.out.println("inside m3");
		
	}
	public void m4() {
		System.out.println("inside m4");
	}
	
}

	
class  L extends AbsSet implements K{

	public void m1() {
		System.out.println("inside m1 L");
	}

	public void m2() {

System.out.println("inside m2 L");
	}
	
	public static void main(String[] args) {
		L l = new L();
		l.m3();
	}
	
}



