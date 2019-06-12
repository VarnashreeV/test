package MobileTesting.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AmazonLoginPage {
	AppiumDriver<MobileElement> driver;

    //Use a different account for this app
	@FindBy(id="in.amazon.mShop.android.shopping:id/sso_use_different_account")
	private WebElement ClickOnUseDifferentAcc;
	
	//Click on continue
	@FindBy(id="continue")
	private WebElement ClickOnContinue;
	
	//Enter password
	@FindBy(id="ap_password")
	private WebElement ClickOnPassword;
	
	//Click on submit
	@FindBy(id="signInSubmit")
	private WebElement ClickOnSubmit;
	
	public AmazonLoginPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}


	public void ClkOnDifferentAcc(){
		ClickOnUseDifferentAcc.click();
	        }
	public void ClkOnContinue(){
		ClickOnContinue.click();
	        }
	public void ClkOnpwd(){
		ClickOnPassword.sendKeys("Memories@95");
	        }
	public void ClkSubmit(){
		ClickOnSubmit.click();
	        }
}
