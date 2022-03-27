package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(how = How.ID, using="search_query_top")
	WebElement searchText;
	@FindBy(how = How.XPATH, using="//button[@name='submit_search']")
	WebElement searchBtn;
	
	
	public void searchText(String text) {
		searchText.sendKeys(text);
	}
	public void clickSearchBtn() {
		searchBtn.click();
	}
		
}
