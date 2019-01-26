package mywipro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import wdMethods1.ProjectMethods;
@Test
public class MywiproLogin extends ProjectMethods {
	
 	public void MyLogin()
	{	
		PageFactory.initElements(driver, this);
	}
 	 
 	@FindBy(id= "userNameInput") WebElement eleUsername;
 	public MywiproLogin enterUserName(String data)
 	{
 		type(eleUsername,data);
 		return this;
 	}
 	

 	@FindBy(id="passwordInput")WebElement elePassword;
 	public MywiproLogin enterPassword(String data)
 	{
 		type(elePassword, data);
 		return this;
 	}
 	@FindBy(id="submitButton")WebElement eleClickLogin;
 	public MyWiproMainPage clickWiproLogin()
 	{
 		click(eleClickLogin);
 		return new MyWiproMainPage();
 	}
}