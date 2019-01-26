package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class HooksClass extends SeMethods {
/*	@Before
	public void before(Scenario sc)
	{
		System.out.println(sc.getId());
		String Tcname = sc.getName();
		System.out.println(Tcname);
	}
	@After
	public void after(Scenario sc)
	{
		System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());
	}*/
	
	
	@Before
	public void before(Scenario sc) {
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("functional");
		test.assignAuthor();
		startApp("chrome", "http://leaftaps.com/opentaps");		
		/*System.out.println(sc.getName());
		System.out.println(sc.getId());*/
		}
	@After
	public void after(Scenario sc) {
		closeAllBrowsers();
		endResult();
		/*System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());*/
	}
}









