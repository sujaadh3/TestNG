package AnnotationsDemo;
import org.testng.annotations.*;
//import org.testng.annotations.BeforeSuite;

public class BeforeTest1 {
	@Test
	public void hello1() {
		System.out.println("hello1");
		}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforesuite");
		}
	@Test
	public void hello3() {
		System.out.println("hello3");
		}

}
