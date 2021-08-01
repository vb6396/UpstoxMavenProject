package upstoxLoginUserVerifyPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage {
	
	@FindBy(xpath = "//span[text() = 'vijay b.']") private WebElement profileIDBtn;
	
	public UpstoxHomePage(WebDriver driverValue) {
		PageFactory.initElements(driverValue, this);
	}
	
	public void clickUpstoxHomePageProfileIdBtn() {
		profileIDBtn.click();
	}

}
