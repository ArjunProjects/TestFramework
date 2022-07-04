package pageTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import pageObjects.Base;
import pageObjects.Depend;
import pageObjects.HomePage;
import pageObjects.Preference;

public class HomeTest extends Base {

	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		HomePage h = new HomePage(driver);
		h.preference.click();
		
		Preference p =new Preference(driver);
		p.dependencies.click();
		
		Depend d =new Depend(driver);
		d.wifiCheck.click();
		d.wifiSetting.click();
		d.editBox.sendKeys("testhybrid");
		d.okBtn.click();
		
		System.out.println("test");

	}

}
