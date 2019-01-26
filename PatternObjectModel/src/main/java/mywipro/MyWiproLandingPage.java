package mywipro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wdMethods1.ProjectMethods;


public class MyWiproLandingPage extends ProjectMethods {
	
	public MyWiproLandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Wipro Limited']")WebElement eleWiproLimited;
	public MywiproLogin MyLandingPage()
	{
		click(eleWiproLimited);
		return new MywiproLogin();
	}
	
}
