/**
 * 
 */
/**
 * @author 30955
 *
 */
package com.infotech.android.testscripts;

import com.infotech.testrunner.TestRunnerMobility;


public class SusMislaneousInvIbPage1 extends TestRunnerMobility{
	
	/*public SusMislaneousInvIbPage1() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file4 = new ExcelApiFile("TestData4.xlsx");
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	
	
	try {
		WebDriverWait driverWait = new WebDriverWait(driver, 3);
		MobileElement access = (MobileElement) driverWait.until(ExpectedConditions.presenceOfElementLocated(
				 By.xpath("//android.widget.TextView[@text='Allow RCS8 to access photos, media and files on your device?']")));
		if(access.isDisplayed()) {
		driverWait.until(ExpectedConditions.presenceOfElementLocated(
					 By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
		}
	}catch (NoSuchElementException NoSuchElementException) {
		System.out.println("No such element" +NoSuchElementException);
	}catch (StaleElementReferenceException StaleElementReferenceException) {
		System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
	}catch (TimeoutException TimeOutException) {
		System.out.println("Time Out" + TimeOutException);
	}
	 
	wait.until(ExpectedConditions.presenceOfElementLocated(
			 By.id("userName"))).sendKeys("Anand_Krishna_SIT");
	 wait.until(ExpectedConditions.presenceOfElementLocated(
			 By.id("pwd"))).sendKeys("Welcome@12345");
	 wait.until(ExpectedConditions.presenceOfElementLocated(
			 By.xpath("//android.widget.Button[@content-desc='Login ']"))).click();
	 
	 wait.until(ExpectedConditions.presenceOfElementLocated(
			 By.xpath("//android.view.View[@content-desc='Journey Plan']")));
	 
	 wait.until(ExpectedConditions.presenceOfElementLocated(
			 By.id("expMenuList"))).click();
	 
	 wait.until(ExpectedConditions.presenceOfElementLocated(
			 By.id("addoutletName"))).click();
	 
	 MobileElement element = driver.findElementByAndroidUIAutomator(
			 "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().index(1).instance(0))");
	 element.sendKeys(Keys.ENTER);
	 List<MobileElement> items = driver.findElements(By.xpath("//android.view.View[2]"));
	 items.get(1).click();
	 //String a = "3s";
	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"3S Shopping Center 1000906 Kulukulu"+"\").instance(0))").click();
	 
	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"3S Shopping Center 1000906 Kulukulu"+"\").instance(0))").click();
	 
	 driver.findElementByAndroidUIAutomator(
			 "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().index(0).instance(0))").click();
	 
	 wait.until(ExpectedConditions.presenceOfElementLocated(
			 By.xpath("//android.widget.Button[@content-desc='Submit ']"))).click();
	 
	 try {
			WebDriverWait driverWait = new WebDriverWait(driver, 3);
			driverWait.until(ExpectedConditions.presenceOfElementLocated(
					 By.xpath("//android.widget.Button[@text='OK']"))).click();
		} catch (NoSuchElementException NoSuchElementException) {
			System.out.println("No such element" +NoSuchElementException);
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}catch (TimeoutException TimeOutException) {
			System.out.println("Time Out" + TimeOutException);
		}
	 
	 try {
			WebDriverWait driverWait = new WebDriverWait(driver, 3);
			driverWait.until(ExpectedConditions.presenceOfElementLocated(
					 By.xpath("//android.view.View[@resource-id='startVisitButton-0']"))).click();
			
			MobileElement confirm = (MobileElement) driverWait.until(ExpectedConditions.presenceOfElementLocated(
					 By.xpath("//android.view.View[@content-desc='Do you want to start the call?']")));
			if(confirm.isDisplayed()) {
				driverWait.until(ExpectedConditions.presenceOfElementLocated(
						 By.xpath("//android.widget.Button[@content-desc='OK ']"))).click();

				CallObject.block(3000);
				 wait.until(ExpectedConditions.elementToBeClickable(
						 By.xpath("//android.view.View[@resource-id='expandMenuId']"))).click();
				 
				 CallObject.block(3000);
				 wait.until(ExpectedConditions.elementToBeClickable(
						 By.xpath("//android.view.View[@resource-id='endCallInProgress']"))).click();
				 wait.until(ExpectedConditions.elementToBeClickable(
						 By.xpath("//android.widget.Button[@content-desc='Cancel ']"))).click();

				 wait.until(ExpectedConditions.elementToBeClickable(
						 By.xpath("//android.view.View[@resource-id='preSales']"))).click();
			}
			
		} catch (NoSuchElementException NoSuchElementException) {
			System.out.println("No such element" +NoSuchElementException);
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}catch (TimeoutException TimeOutException) {
			System.out.println("Time Out" + TimeOutException);
		}
	 
	 
	 try {
		 WebDriverWait driverWait = new WebDriverWait(driver, 3);
		 MobileElement orderNum = (MobileElement) driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ordNum")));
		 if(orderNum.isDisplayed()) {
			 String getOrderNum = wait.until(ExpectedConditions.presenceOfElementLocated(
					 By.id("ordNum"))).getAttribute("content-desc");  
		 wait.until(ExpectedConditions.presenceOfElementLocated(
				 By.xpath("//android.view.View[@content-desc='Booked']"))).click();
		     
		     wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ordNum")));
		     
		     wait.until(ExpectedConditions.presenceOfElementLocated(By.id("paymentBtn"))).click();
		     //Assert.assertEquals(orderNum.getAttribute("content-desc"), actual);
		     
		 //}
	} catch (NoSuchElementException NoSuchElementException) {
		System.out.println("No such element" +NoSuchElementException);
	}catch (StaleElementReferenceException StaleElementReferenceException) {
		System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
	}catch (TimeoutException TimeOutException) {
		System.out.println("Time Out" + TimeOutException);
	}
	 
	 
	 try {
		 WebDriverWait driverWait = new WebDriverWait(driver, 3);
		 MobileElement alert = (MobileElement) driverWait.until(
				 ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc='Are you sure you want to make the payment?']")));
		 if(alert.isDisplayed()) {		 
		     wait.until(ExpectedConditions.presenceOfElementLocated(
				 By.xpath("//android.widget.Button[@content-desc='Yes ']"))).click();
		     wait.until(ExpectedConditions.presenceOfElementLocated(
					 By.id("savePay"))).click();
		 }
	} catch (NoSuchElementException NoSuchElementException) {
		System.out.println("No such element" +NoSuchElementException);
	}catch (StaleElementReferenceException StaleElementReferenceException) {
		System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
	}catch (TimeoutException TimeOutException) {
		System.out.println("Time Out" + TimeOutException);
	}
	 
	 
	 Thread.sleep(10000);
	 }
	
	

	
	
	public void scrollDown() {
		Dimension dimensions = driver.manage().window().getSize();
	    int Startpoint = (int) (dimensions.getHeight() * 0.5);
	    int scrollEnd = (int) (dimensions.getHeight() * 0.5);
	    driver.swipe(200, Startpoint,200,scrollEnd,2000);
	}
 
        public MobileElement getItemViews() {
		return driver.findElement(By.xpath("//android.view.View[@content-desc='Coastal Trading 1000875 Nayawa']"));
	}
	
	public List<MobileElement> getItemWebView(){
		return driver.findElements(By.xpath("//android.view.View[@content-desc='3S Shopping Center 1000906 Kulukulu']"));
	}
	
	public void scrollTillWebView() throws InterruptedException {
		getItemViews().click();
		
		while(getItemWebView().size() == 0) {
			scrollDown();
		}
		
		if(getItemWebView().size() > 0) {
			getItemWebView().get(0).click();
		}
		Thread.sleep(4000);	
		
	}*/
}