package annotationAtrribute;
import org.testng.annotations.*;
public class timeOut{
	@Test (description="This is Test Case1")
	public void hello3() {
		System.out.println("Hello World3 ");
	}
	@Test(timeOut = 200)
	public void hello4() {
		try {
			Thread.sleep(400);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("This is timeout ");
	}
	@Test
	public void hello5() {
		System.out.println("Hello World5 ");
	}
}
