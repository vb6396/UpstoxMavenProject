package upstoxLoginUserVerifyPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2Page {
	
	@FindBy(xpath = "//input[@id = 'yob']") private WebElement yob;
	
	public UpstoxLogin2Page(WebDriver driverValue) {
		PageFactory.initElements(driverValue, this);
	}
	
	public void inpUpstoxLogin2PageYob(String yobValue) {
		yob.sendKeys(yobValue);
	}
}
