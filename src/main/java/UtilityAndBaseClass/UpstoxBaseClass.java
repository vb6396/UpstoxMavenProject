package UtilityAndBaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxBaseClass {
	
	protected WebDriver driver;
	public void InitializeBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\.eclipse\\UpstoxAppMaven\\UpstoxMavenProject\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(UpstoxUtilityClass.getTestDataFromProperties("url"));
	}

}
