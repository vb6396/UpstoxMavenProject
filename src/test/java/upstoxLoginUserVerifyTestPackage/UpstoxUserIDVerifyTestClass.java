package upstoxLoginUserVerifyTestPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UtilityAndBaseClass.UpstoxBaseClass;
import UtilityAndBaseClass.UpstoxUtilityClass;
import junit.framework.Assert;
import upstoxLoginUserVerifyPOMPackage.UpstoxHomePage;
import upstoxLoginUserVerifyPOMPackage.UpstoxLogin1Page;
import upstoxLoginUserVerifyPOMPackage.UpstoxLogin2Page;
import upstoxLoginUserVerifyPOMPackage.UpstoxLogin3Page;
import upstoxLoginUserVerifyPOMPackage.UpstoxReferAndEarnPage;
import upstoxLoginUserVerifyPOMPackage.UpstoxUserPage;
import upstoxLoginUserVerifyPOMPackage.UpstoxUserProfilePage;

public class UpstoxUserIDVerifyTestClass extends UpstoxBaseClass {
	
	UpstoxLogin1Page login1;
	UpstoxLogin2Page login2;
	UpstoxLogin3Page login3;
	UpstoxHomePage home;
	UpstoxUserProfilePage profilePage;
	UpstoxReferAndEarnPage referAndEarnPage;
	UpstoxUserPage userPage;
	WebDriver driver;
	ArrayList<String> al;
	
	
	@BeforeClass
	public void BrowserSetUp() throws IOException {
		InitializeBrowser();
		
		login1 = new UpstoxLogin1Page(driver);
		login2 = new UpstoxLogin2Page(driver);
		login3 = new UpstoxLogin3Page(driver);
		home = new UpstoxHomePage(driver);
		profilePage = new UpstoxUserProfilePage(driver);
		referAndEarnPage = new UpstoxReferAndEarnPage(driver);
		userPage = new UpstoxUserPage(driver);
	}
	
	@BeforeMethod
	public void LoginToUpstoxApplication() throws IOException, InterruptedException {
		login1.inpUpstoxLogin1PageUserID();
		login1.inpUpstoxLogin1PagePassword(UpstoxUtilityClass.getTestDataFromProperties("password"));
		login1.clickUpstoxLogin1PageLoginBtn();
		
		login2.inpUpstoxLogin2PageYob(UpstoxUtilityClass.getTestDataFromProperties("yob"));
		
		login3.clickUpstoxLogin3PageContBtn();
		
	}
	
	@Test
	public void VerifyUserUpstoxApplication() throws IOException {
		home.clickUpstoxHomePageProfileIdBtn();
		
		profilePage.clickUpstoxUserProfilePageMyAccountBtn();
		
		Set<String> addresses= driver.getWindowHandles();
		al = new ArrayList<String>(addresses);
		
		driver.switchTo().window(al.get(1));
		
		String actUserID = userPage.getUpstoxUserPageUserIdOfUser();
		String expUserID = UpstoxUtilityClass.getTestDataFromProperties("userID");
		Assert.assertEquals(actUserID, expUserID );
	}
	
	@AfterMethod
	public void LogoutAndRefreshPage() {
		
		driver.switchTo().window(al.get(0));
		home.clickUpstoxHomePageProfileIdBtn();
		profilePage.clickUpstoxProfilePageLogoutBtn();
		
	}
	
	
	@AfterClass
	public void CloseTheBrowser() {
		driver.quit();
		
		
	}

}
