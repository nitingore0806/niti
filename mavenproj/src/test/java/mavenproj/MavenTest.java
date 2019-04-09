package mavenproj;

import org.testng.annotations.Test;

public class MavenTest {
	
	@Test(dependsOnMethods= "m2")
	public void m2() {
		System.out.println("inside m2");
	}
	@Test(dependsOnGroups="aaa")
	public void m2() {
		int w=10/0;
		System.out.println("inside m2");
		
	}@Test()
	public void m3() {
		System.out.println("inside m3");
	}
	@Test(groups="aaa")
	public void m4() {
		System.out.println("inside m4");
		
	}

}
@Test
class B{
	@Test(groups="aaa")
	public void m5() {
		System.out.println("inside m5");
		int j = 10/0;
	}
	@Test
	public void m6() {
		System.out.println("inside m6");
	}
	@Test
	public void m7() {
		System.out.println("inside m7");
	}
	@Test
	public void m8() {
		System.out.println("inside m8");
	}
	@Test
	public void m9() {
		System.out.println("inside m9");
	}


	@Test
	public void m10() {
		System.out.println("inside m10");
	}
}