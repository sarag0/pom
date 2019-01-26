package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData()
	{
		testCaseName = "TC003_CreateLead";
		testDescription ="This is to create lead";
		authors = "Saranya G";
		category = "Sanity";
		dataSheetName = "TC003";
		testNodes = "Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void createleadtc(String uName, String pwd, String cname, String fname, String lname)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.ClickCrmsfaLink()
		.ClickLeads()
		.ClickCreateLeadSection()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.ClickCreateLeadBtn()
		.verifyFirstName(cname);
		
	}
}
