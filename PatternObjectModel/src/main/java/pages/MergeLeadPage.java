package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	public MergeLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//img[@alt='Lookup'])[1]") WebElement eleFromicon;
	public FromToWindowPage FromMergeWindow()
	{
	clickWithNoSnap(eleFromicon);
	switchToWindow(1);
	return new FromToWindowPage();
	
	}
	@FindBy(xpath="(//img[@alt='Lookup'])[2]")WebElement eleToicon;
	public FromToWindowPage ToMergeWindow()
	{
	clickWithNoSnap(eleToicon);
	switchToWindow(1);
	return new FromToWindowPage();
	}
	

}


//(//a[@class ='linktext'])[1]