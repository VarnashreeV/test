package MobileTesting.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ToReadMsg {
	AppiumDriver<MobileElement> driver;

	@BeforeClass
	public void toTest() throws MalformedURLException
	{

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "ZY3229ZXDW");
		cap.setCapability("appPackage", "com.google.android.apps.messaging");
		cap.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");
		driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.2:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test
	public void test() throws InterruptedException
	{

	}
}