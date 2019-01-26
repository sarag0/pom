package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_LoginAndLogout";
		testDescription = "LoginAndLogout";
		authors = "sarath";
		category = "smoke";
		dataSheetName = "TC001";
		testNodes = "Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void login(String userName,String password) {		
		new LoginPage() 
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();
				
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogin();*/
	}
	
}
