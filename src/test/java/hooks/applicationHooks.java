package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class applicationHooks {

	@Before(order = 1)
	public void beforeHook()
	{
		System.out.println("Before hook is executing");
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Before step is executing");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After step is executing");
	}
	
	
	@After(order=2)
	public void afterHook()
	{
		System.out.println("After hook is executing");
	}
	
	@Before(order=2)
	public void beforeHook2()
	{
		System.out.println("Before hook2 is executing");
	}
	
	@After(order=1)
	public void afterHook2()
	{
		System.out.println("After hook2 is executing");
		
	}
}


