package MobileTesting.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class VerifyAmazon {
	AppiumDriver<MobileElement> driver;
	AmazonHomePage apage;
	AmazonLoginPage lpage;

	@BeforeTest
	public void setup() throws MalformedURLException
	{

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "ZY3229ZXDW");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.2:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test
	public void verify() throws Exception{ 

		lpage=new AmazonLoginPage(driver);
		lpage.ClkOnDifferentAcc();
		lpage.ClkOnContinue();
		lpage.ClkOnpwd();
        lpage.ClkSubmit();

		apage=new AmazonHomePage(driver);
		Thread.sleep(5000);
		apage.ClkOnSearch("Women shoes");
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
		MobileElement ele=driver.findElementByXPath("//android.view.View[contains(text()='Skechers Women's Go Walk Lite-Shanti Nordic Walking Shoes Sponsored Skechers Women's Go Walk Lite-Shanti Nordic Walking Shoes 4.6 out of 5 stars 31 ₹2,999M.R.P.: ₹4,999Save ₹2,000 (40%) FREE Delivery by Amazon product')]");
        ele.click();
		TouchActions action = new TouchActions(driver);
		action.singleTap(ele);
		action.perform();
		apage.ClkOnShoes();


	}
}