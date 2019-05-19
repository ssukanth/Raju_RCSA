package com.infotech.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.infotech.wc.ui.testscripts.RcsSaasConfigurationUsersPage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"WebClientFeatures"}, 
         glue = { "com.infotech.wc.ui.testscripts" }, strict = true, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber.json", "usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/repo"}, 
         dryRun = false,  tags="@Authorization", monochrome = true)


//public class TestRunner extends AbstractTestNGCucumberTests {
public class TestRunnerWebClient{

	protected static WebDriver driver;
	protected static DesiredCapabilities capabilities;
	static RcsSaasConfigurationUsersPage configurationPage;
	protected static ChromeOptions options;
	
	@BeforeClass
	public static void setUp() throws Throwable {
	    getDriver();
		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
        ExtentCucumberFormatter.loadConfig(new File("extent-config.xml"));

		configurationPage = new RcsSaasConfigurationUsersPage();
		configurationPage.i_Login_to_the_WC();
	}

	@AfterClass
	public static void tearDown(){

		if (driver != null) {
			System.out.println("Closing browser");
			driver.quit();
		}
	}

	
	
	protected static WebDriver getDriver() {

		if (driver == null) {
			if ("IE".equalsIgnoreCase("ie2")) {
				capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				capabilities.setCapability("allow-blocked-content", true);
				capabilities.setCapability("allowBlockedContent", true);
				System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
				driver = new InternetExplorerDriver(capabilities);

			} else if ("Chrome".equalsIgnoreCase("chrome")) {

				options = new ChromeOptions();
				//options.addExtensions(new File("Buster-Captcha-Solver-for-Humans.crx"));
				capabilities = new DesiredCapabilities ();
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver(capabilities);
			}
		}
		return driver;
	}
}
