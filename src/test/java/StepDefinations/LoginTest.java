package StepDefinations;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginTest{
	

	 WebDriver driver;
	 @Given("^Open browser and  navigate url$")
	 public void open_browser_and_navigate_url() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
	 }

	 @Given("^I click the Sign in text$")
	 public void i_click_the_Sign_in_text() throws Throwable {
		 LoginPage lp = new LoginPage(driver);
		 lp.clickSigninText();
	 }

	 @Given("^I enter my \"([^\"]*)\"$")
	 public void i_enter_my(String email) throws Throwable {
		 LoginPage lp = new LoginPage(driver);
		 lp.enterEmailText(email);
	 }

	 @Given("^I also enter my \"([^\"]*)\"$")
	 public void i_also_enter_my(String password) throws Throwable {
		 LoginPage lp = new LoginPage(driver);
		 lp.enterPasswordText(password);
	 }

	 @When("^I click the Sign in button$")
	 public void i_click_the_Sign_in_button() throws Throwable {
		 LoginPage lp = new LoginPage(driver);
		 lp.clickSigninBtn();
	 }

	 @Then("^I signin successfully$")
	 public void i_signin_successfully() throws Throwable {
		 System.out.println("Login successfully.");
		
		 driver.close();
	 }

	 @Then("^I signin not successfully$")
	 public void i_signin_not_successfully() throws Throwable {
		 System.out.println("Login Failed.");
		 driver.close();
	 }

}
