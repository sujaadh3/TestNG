package annotationAtrribute;

import org.testng.annotations.Test;

public class dependOnMethods {
	@Test
	public void testFirst() {
		System.out.println("This is 1st test case");
	}
	@Test(dependsOnMethods= {"testThird"})
	public void testSecond() {
		System.out.println("This is 2nd test case");
	}
	@Test    
	public void testThird() {
		System.out.println("This is 3rd test case");
	}
	@Test
	public void testFourth() {
		System.out.println("This is 4th test case");
	}

}
