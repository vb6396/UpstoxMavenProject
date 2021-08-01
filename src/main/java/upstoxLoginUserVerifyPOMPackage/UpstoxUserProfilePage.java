package upstoxLoginUserVerifyPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxUserProfilePage {
	
	@FindBy(xpath = "//span[text() = '418571']") private WebElement myAccountBtn;
	
	public UpstoxUserProfilePage(WebDriver driverValue) {
		PageFactory.initElements(driverValue, this);
	}
	
	public void clickUpstoxUserProfilePageMyAccountBtn() {
		myAccountBtn.click();
	}
	
}
