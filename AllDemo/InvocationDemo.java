package AllDemo;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationDemo {
	@Test(invocationCount=5)
	public void Demo1(ITestContext context) // two parameters
	{
		int currentInvocation = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing:"+currentInvocation);
		System.out.println("Runs 5 time");	
		

}
	@Test(invocationCount=3)
	public void Demo2(ITestContext context) 
	{
		System.out.println("Runs 1 time");	
		int currentInvocation = context.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("Executing:"+currentInvocation);
		

}
}

