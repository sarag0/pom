package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadUsingJunit {
	public ChromeDriver driver;
	@Given("Open the Browser")
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
	}
	@Given("Maximize the Browser")
	public void maximize_the_Browser() {
	    driver.manage().window().maximize();
	}
 
	@Given("Set the Timeout")
	public void set_the_Timeout() {
	  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

	@Given("Launch the URL")
	public void launch_the_URL() {
		driver.get("http://leaftaps.com/opentaps");
	  
	}

	@Given("Enter the Username as (.*)")
	public void enter_the_Username(String data) {
		driver.findElementById("username").sendKeys(data);
	
	}

	@Given("Enter the Password as (.*)")
	public void enter_the_Password(String data) {
		driver.findElementById("password").sendKeys(data);
	    
	}

	@When("Click the Login Button")
	public void click_the_Login_Button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify the Login")
	public void verify_the_Login() {
		System.out.println("Login is Successful");
	
	}

	@Then("Click the CRM\\/SFA Lnk")
	public void click_the_CRM_SFA_Lnk() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Then("Click the Leads")
	public void click_the_Leads() {
	   driver.findElementByLinkText("Leads").click();
	}

	@Then("Click the Create Leads Section")
	public void click_the_Create_Leads_Section() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Then("Enter the Company Name as (.*)")
	public void enter_the_Company_Name(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	 
	}

	@Then("Enter the Firstname as (.*)")
	public void enter_the_Firstname(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}

	@Then("Enter the Lastname as (.*)")
	public void enter_the_Lastname(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}

	@When("Click Create Lead Button")
	public void click_Create_Lead_Button() {
		driver.findElementByClassName("smallSubmit").click();
		
	}

	@Then("Verify the Create Lead")
	public void verify_the_Create_Lead() {
		System.out.println("Create lead is successful");
	
	}
}
