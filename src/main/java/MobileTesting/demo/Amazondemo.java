package MobileTesting.demo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Amazondemo {
	AppiumDriver<MobileElement> driver;
	
	@BeforeClass
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
	public void testCase() throws InterruptedException, IOException
	{
	
	driver.findElementById("in.amazon.mShop.android.shopping:id/sso_use_different_account").click();
	Thread.sleep(5000);
	driver.findElementById("continue").click();
	Thread.sleep(5000);
	driver.findElementById("ap_password").sendKeys("Memories@95");
	Thread.sleep(5000);
	driver.findElementById("signInSubmit").click();
	Thread.sleep(5000);
	driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").sendKeys("Women Shoes");
	Thread.sleep(5000);
	((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	Thread.sleep(5000);
	driver.findElementByXPath("//*[@class='android.widget.ImageView']").click();
	Thread.sleep(5000);
	//driver.findElementByXPath("//*[@text='Power Women's Engage Running Shoes']").click();
	/*driver.findElementByClassName("android.view.View").click();
	Thread.sleep(5000);*/
	
	
	
	
	}

	}

	


