package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using  = "viewLead_companyName_sp") WebElement companyName;
	public void verifyFirstName(String fn) {
		verifyPartialText(companyName, fn);
	}
}
