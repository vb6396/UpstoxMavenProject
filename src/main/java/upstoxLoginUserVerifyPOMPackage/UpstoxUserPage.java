package upstoxLoginUserVerifyPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxUserPage {

	@FindBy(xpath = "(//div[text() = '418571'])[2]") private WebElement userId;
	
	public UpstoxUserPage(WebDriver driverValue) {
		PageFactory.initElements(driverValue, this);
	}
	
	public String getUpstoxUserPageUserIdOfUser() {
		String actUserID=userId.getText();
		return actUserID;
	}
}
