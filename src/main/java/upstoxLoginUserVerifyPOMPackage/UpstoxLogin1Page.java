package upstoxLoginUserVerifyPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1Page {
	@FindBy(xpath = "//input[@name = 'userId']") private WebElement userID;
	@FindBy(xpath = "//input[@name = 'password']") private WebElement password;
	@FindBy(xpath = "//div[text() = 'Sign into Upstox']") private WebElement loginBtn;
	
	public UpstoxLogin1Page(WebDriver driverValue) {
		PageFactory.initElements(driverValue, this);
	}
	
	public void inpUpstoxLogin1PageUserID(String userIDValue) {
		userID.sendKeys(userIDValue);
	}
	
	public void inpUpstoxLogin1PagePassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}
	
	public void clickUpstoxLogin1PageLoginBtn() {
		loginBtn.click();
	}
	

}
