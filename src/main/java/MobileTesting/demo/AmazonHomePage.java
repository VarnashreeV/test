package MobileTesting.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AmazonHomePage {
	AppiumDriver<MobileElement> driver;

	//Click on Search button
	@FindBy(id="in.amazon.mShop.android.shopping:id/rs_search_src_text")
	private WebElement ClickOnSearch;
	
	@FindBy(xpath="//android.view.View[contains(text()='Skechers Women's Go Walk Lite-Shanti Nordic Walking Shoes Sponsored Skechers Women's Go Walk Lite-Shanti Nordic Walking Shoes 4.6 out of 5 stars 31 ₹2,999M.R.P.: ₹4,999Save ₹2,000 (40%) FREE Delivery by Amazon product')]")
	private WebElement ClickOnShoe;

	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	}

	public void ClkOnSearch(String name){
		ClickOnSearch.sendKeys(name);
	}
	
	public void ClkOnShoes(){
		ClickOnShoe.click();
	}

}
