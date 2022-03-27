package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(how =How.XPATH, using="//a[normalize-space()='Sign in']")
	WebElement clickSignin;
	@FindBy(how =How.ID, using="email")
	WebElement emailText;
	@FindBy(how =How.ID, using="passwd")
	WebElement passwordText;
	@FindBy(how =How.XPATH, using="//span[normalize-space()='Sign in']")
	WebElement clickSigninBtn;

	public void clickSigninText() {
		clickSignin.click();
	}
	public void enterEmailText(String email) {
		emailText.sendKeys(email);
	}
	public void enterPasswordText(String password) {
		passwordText.sendKeys(password);
	}
	public void clickSigninBtn() {
		clickSigninBtn.click();
	}
}
