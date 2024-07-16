package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class appHooks {

	
	@Before("@sanity")
	public void beforehook()
	{
		System.out.println("This is scenario based hook");
	}
	
	@After("@regression")
	public void afterhook()
	{
		System.out.println("THis is after hook");
	}
	
}
