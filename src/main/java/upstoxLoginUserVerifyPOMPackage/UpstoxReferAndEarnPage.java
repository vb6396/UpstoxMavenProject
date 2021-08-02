package upstoxLoginUserVerifyPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxReferAndEarnPage {
	
	@FindBy(xpath = "//span[@class = '_1rI0VtSsW1aaDnqUIunB97']") private WebElement earnedAmount;
	
	public UpstoxReferAndEarnPage(WebDriver driverValue) {
		PageFactory.initElements(driverValue, this);
	}
	
	public String getUpstoxReferAndEarnPageEarnedAmount() {
		String amount = earnedAmount.getText();
		
		return amount;
	}

}
