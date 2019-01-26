package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import mywipro.MyWiproLandingPage;
import wdMethods1.ProjectMethods;

public class TCMyWipro extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TCMyWipro";
		testDescription = "LandingPage";
		authors = "Saranya";
		category = "smoke";
		dataSheetName = "Wiprodata";
		testNodes = "Leads";
	}
	
	public void setData1() {
		testCaseName = "TC001_LoginAndLogout";
		testDescription = "LoginAndLogout";
		authors = "sarath";
		category = "smoke";
		dataSheetName = "TC001";
		testNodes = "Leads";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void callFunc(String username, String password)
	{
		new MyWiproLandingPage().MyLandingPage().enterUserName(username).enterPassword(password);
		
	}
}
