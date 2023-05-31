package test;

import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.BaseClass;
import pom.LoginPage;

public class LoginTest extends BaseClass{
	@BeforeMethod 
	public void OpenBrowser () throws InterruptedException {
		driver = Browser.launchChrome();
		Thread.sleep(2000);
	}

	@Test
	public void login() {
		//LoginPage l = new LoginPage(driver);
		//l.clickonlogin();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
