package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout2 extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_LoginAndLogout(Negative)";
		testDescription = "LoginAndLogout";
		authors = "sarath";
		category = "smoke";
		dataSheetName = "TC001_Negative";
		testNodes = "Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void login(String userName,String password,String errMsg) {		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginForFailure()
		.verifyErrorMsg(errMsg);
				
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogin();*/
	}
	
}
