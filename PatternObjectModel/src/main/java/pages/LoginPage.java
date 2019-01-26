package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username") WebElement eleuserName;
	@FindBy(id = "password") WebElement elePassword;
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit") WebElement eleLogin;
	@FindBy(how = How.XPATH, using = "//div[@id='errorDiv']/p[2]") WebElement eleErrMsg;
	public LoginPage enterUserName(String data) {
		//WebElement eleuserName = locateElement("id", "username");
		type(eleuserName, data);
		return this;
	}
	public LoginPage enterPassword(String data) {
		type(elePassword, data);
		return this;
	}
	public HomePage clickLogin() {		
		click(eleLogin);
		//HomePage hp = new HomePage();
		return new HomePage();
	}
	public LoginPage clickLoginForFailure() {		
		click(eleLogin);
		//HomePage hp = new HomePage();
		return this;
	}
	
	public LoginPage verifyErrorMsg(String data) {		
		verifyPartialText(eleErrMsg, data);
		return this;
	}
	
	
	
	
	
	
}
