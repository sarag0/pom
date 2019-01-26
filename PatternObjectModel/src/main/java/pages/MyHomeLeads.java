package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomeLeads extends ProjectMethods{
	
	public MyHomeLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Leads")WebElement eleClkLeadLink;
	public MyHomeLeads ClickLeads()
	{
		click(eleClkLeadLink);
		return this;
	}
	@FindBy(linkText ="Create Lead")WebElement eleClkCreateLeadSec;
	public CreateLeadPage ClickCreateLeadSection()
	{
		click(eleClkCreateLeadSec);
		return new CreateLeadPage();
	}
	@FindBy(linkText="Merge Leads")WebElement eleClkMergeLeadSec;
	public MergeLeadPage mergeLeadSection()
	{
		click(eleClkMergeLeadSec);
		return new MergeLeadPage();
	}

}
