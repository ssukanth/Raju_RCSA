package com.infotech.testrunner;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"WebClientInterfaceFeatures"}, 
         glue = { "com.infotech.android.testscripts" }, strict = true, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber.json", "usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
         dryRun = false,  tags="@MobileLoginCheck", monochrome = true)



public class TestRunnerMobility {

	protected static AndroidDriver<MobileElement> driver;
	protected static DesiredCapabilities capabilities;
	protected static File file;
	 
	
	 @BeforeClass
	public static void appiumSetup() throws Exception {
		
		getDriver();
		/*ExtentCucumberFormatter.initiateExtentCucumberFormatter();
        ExtentCucumberFormatter.loadConfig(new File("extent-config.xml"));
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));*/
	}

	
	@AfterClass
	public static void tearDown(){

		if (driver != null) {
			System.out.println("Closing browser");
			driver.resetApp();
			driver.quit();
		}
	}
	
	protected static AndroidDriver<MobileElement> getDriver() throws Exception {

		if (driver == null) {
			 //File classpathRoot = new File(System.getProperty("user.dir"));
			 file = new File(System.getProperty("user.dir"), "RCS8_7.0_UAT_2.apk");
			 //File app = new File(appDir, "RCS8_6.0_SIT_7.apk");
			 
			 capabilities = new DesiredCapabilities();
			 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			 capabilities.setCapability("deviceName", "5210dfb8b8d2543f");
			 capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
			 capabilities.setCapability("platformName", "Android");
			 capabilities.setCapability("autoGrantPermissions", true);
			 capabilities.setCapability ("clearSystemFiles", true);
			 capabilities.setCapability("noReset", true);
			 capabilities.setCapability("fullReset", false);
			 capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "30");
			 capabilities.setCapability("app", file.getAbsolutePath());
			 capabilities.setCapability("appPackage", "com.itc.bat");
			 capabilities.setCapability("appActivity", "com.itc.bat.MainActivity");
			 
			 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
		return driver;
	}
}
