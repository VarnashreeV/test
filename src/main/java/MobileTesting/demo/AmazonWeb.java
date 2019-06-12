package MobileTesting.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;

public class AmazonWeb {
	AppiumDriver<MobileElement> driver;

	@BeforeClass
	public void setup() throws MalformedURLException
	{

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "ZY3229ZXDW");
		cap.setCapability("browserName", "Chrome");
		//cap.setCapability("automationName", "uiautomator2");
		driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		String context = driver.getContext();
		System.out.println(context);
		Thread.sleep(3000);
		//entering text
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("story books");
		Thread.sleep(3000);
		//Click on Search
		/*driver.findElement(By.xpath("//*[@value='Go']")).click();
		Thread.sleep(3000);
		//Select story book
		driver.findElement(By.xpath("//*[text()='365 Bedtime Stories and Rhymes'][1]")).click();
		Thread.sleep(3000);
		//Add to cart
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
		//Proceed to checkout
		driver.findElement(By.xpath("//*[@id='a-autoid-0-announce']")).click();
		Thread.sleep(3000);
		//Enter email
		driver.findElement(By.xpath("//*[@id='ap_email_login']")).sendKeys("varnashreevaru95@gmail.com");
		Thread.sleep(3000);
		//Enter password
		driver.findElement(By.xpath("//*[@placeholder='Amazon password']")).sendKeys("Memories@95");
		Thread.sleep(3000);
		//Sign in
		driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		Thread.sleep(3000);
		//Delivery to this address
		driver.findElement(By.xpath("//*[@id='a-autoid-0-announce']")).click();
		Thread.sleep(3000);
		//continue button
		driver.findElement(By.xpath("//*[@type='submit'][1]")).click();
		Thread.sleep(3000);
		//Select visa card 4111
		driver.findElement(By.xpath("(//*[@value='Continue'])[1]")).click();
		Thread.sleep(3000);
		//Skip for now
		driver.findElement(By.xpath("//*[@id='kyc_xborder_skip_section_label']")).click();
		Thread.sleep(3000);
		//Click on continue
		driver.findElement(By.xpath("//*[@aria-labelledby='kyc-xborder-continue-button-announce']")).click();
		Thread.sleep(3000);
		//Place order
		driver.findElement(By.xpath("//*[@aria-labelledby='placeYourOrder-announce']")).click();
		Thread.sleep(3000);
		//add a new payment method
		
		
		driver.findElement(By.xpath("(//*[@class='a-box-inner'])[3]")).click();
		Thread.sleep(3000);
		//Card holder name
		driver.findElement(By.xpath("//*[@id='ccName']")).sendKeys("Test");
		Thread.sleep(3000);
		//Card number
		driver.findElement(By.xpath("//*[@id='addCreditCardNumber']")).sendKeys("4111111111111111");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//*[@role='button'])[1]")).click();
		Thread.sleep(30000);*/

		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.messaging", "com.google.android.apps.messaging.ui.ConversationListActivity"));
		driver.findElementByXPath("//android.widget.LinearLayout[@index=1]").click();
	}
}


