package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath = "//p [@data-cy='LoginHeaderText']") private WebElement clicklogin;
	
public LoginPage (WebDriver driver) {
	PageFactory.initElements(driver, this );
}
public void clickonlogin () {
	clicklogin.click();}











}