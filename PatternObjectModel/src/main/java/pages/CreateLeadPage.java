package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="createLeadForm_companyName")WebElement elecname;
	@FindBy(id="createLeadForm_firstName")WebElement elefname;
	@FindBy(id="createLeadForm_lastName")WebElement elelname;
	@FindBy(how = How.CLASS_NAME, using="smallSubmit")WebElement eleclkCreateLeadBtn;
	public CreateLeadPage enterCompanyName(String data)
	{
	type(elecname,data);	
	return this;
	}
	public CreateLeadPage enterFirstName(String data)
	{
	type(elefname, data);
	return this;
	}
	public CreateLeadPage enterLastName(String data)
	{
	type(elelname,data);	
	return this;
	}
	public ViewLeadPage ClickCreateLeadBtn()
	{
		click(eleclkCreateLeadBtn);
		return new ViewLeadPage();
	}
}
