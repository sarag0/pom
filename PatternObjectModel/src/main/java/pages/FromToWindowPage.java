package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FromToWindowPage extends ProjectMethods{

	public FromToWindowPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@name='firstName']")WebElement eleLeadName;
	public FromToWindowPage fromNewWindowPageLeadname(String data)
	{
	type(eleLeadName,data);
	return this;
	}
	@FindBy(xpath = "//button[text()='Find Leads']")WebElement eleFindLeadBtn;
	public FromToWindowPage fromNewWindowPageFindLeadBtn()
	{
		click(eleFindLeadBtn);
		return this;
	}
	@FindBy(xpath="(//a[@class ='linktext'])[1]")WebElement eleSelFirstResult;
	public MergeLeadPage selectFirstResults()
	{
		clickWithNoSnap(eleSelFirstResult);
		switchToWindow(0);
		return new MergeLeadPage();
	}
	@FindBy(xpath="//a[text()='Merge']")WebElement eleMergeBtn;
	public void mergeleadbutton()
	{
		click(eleMergeBtn);
		
	}
}
