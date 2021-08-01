package upstoxLoginUserVerifyPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin3Page {
	
	@FindBy(xpath = "") private WebElement contBtn;
	
	public UpstoxLogin3Page(WebDriver driverValue) {
		PageFactory.initElements(driverValue, this);
	}
	
	public void clickUpstoxLogin3PageContBtn() {
		contBtn.click();
	}

}
