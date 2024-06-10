package DemoParameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class First {
	@Test
	@Parameters({"i","j"})
	public void add(int a , int b) {
		System.out.println("The sum is :" + " " + (a +b));
	}
	@Test
	@Parameters({"i","j"})
	public void sub(int a, int b) {
		System.out.println("The sub is :" + " " + (a -b));
	}
	@Test
	@Parameters({"i","j"})
	public void mul(int a, int b) {
		System.out.println("The mul is:" +" "+ (a*b));
	}
}
