package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;

public class Searching {

	WebDriver driver;
	@Given("^Open browser and  navigate website$")
	public void open_browser_and_navigate_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}


	@Given("^Type searching \"([^\"]*)\"$")
	public void type_searching(String text) throws Throwable {
		HomePage home = new HomePage(driver);
		home.searchText(text);
	}

	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		HomePage home = new HomePage(driver);
		home.clickSearchBtn();
	}

	@Then("^Searching complete\\.$")
	public void searching_complete() throws Throwable {
	    System.out.println("Display searching result.");
	    driver.close();
	}

	@Then("^Searching not complete\\.$")
	public void searching_not_complete() throws Throwable {
		System.out.println("Not display searching result.");
		driver.close();
	}
}
