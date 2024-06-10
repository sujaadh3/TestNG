package annotationAtrribute;
import org.testng.annotations.*;
public class PriorityDemo {
	@Test(priority=1)
	public void testFirst() {
		System.out.println("This is 1st test case");
	}
	@Test(priority=2)
	public void testSecond() {
		System.out.println("This is 2nd test case");
	}
	@Test    
	public void testThird() {
		System.out.println("This is 3rd test case");
	}
	@Test(priority=4)
	public void testFourth() {
		System.out.println("This is 4th test case");
	}

}
