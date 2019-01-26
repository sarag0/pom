package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement eleLogout;

	public LoginPage clickLogout() {		
		click(eleLogout);
		return new LoginPage();
	}
	@FindBy(linkText ="CRM/SFA") WebElement eleCrmLinkText;
	public MyHomeLeads ClickCrmsfaLink()   
	{
		click(eleCrmLinkText);
		return new MyHomeLeads();
		
	}
	








}
