package com.infotech.basepage;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjects {

	private static final int MAX_ATTEMPTS = 2;

	public static boolean SelectByCSSSelector(WebDriver driver, String locator, int timeout) throws Exception {

		boolean didSucceed = false;
		int attempts = 1;

		while (!didSucceed && attempts <= MAX_ATTEMPTS) {
			try {

				//JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement element = driver.findElement(By.cssSelector(locator));
				//js.executeScript("arguments[0].style.border='3px solid red'", element);
				WebDriverWait wait = new WebDriverWait(driver, timeout);
				wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(locator))));
				Thread.sleep(1000);
			    //js.executeScript("arguments[0].style.border='0px'", element);
				element.click();
				didSucceed = true;

			} catch (NoSuchElementException NoSuchElementException) {
				Assert.fail("No such element" +NoSuchElementException);
				break;
			} catch (TimeoutException TimeOutException) {
				Assert.fail("Time Out" + TimeOutException);
				break;
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			} catch (WebDriverException WebDriverException) {
				System.out.println("Webdriver exception" + WebDriverException);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(locator)));
			}
			attempts++;
		}
		return didSucceed;
	}

	
	
	public static boolean SelectByXpath(WebDriver driver, String locator, int timeout) throws Exception {

		boolean didSucceed = false;
		int attempts = 1;

		while (!didSucceed && attempts <= MAX_ATTEMPTS) {
			try {

				//JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement element = driver.findElement(By.xpath(locator));
				//js.executeScript("arguments[0].style.border='3px solid red'", element);
				WebDriverWait wait = new WebDriverWait(driver, timeout);
				wait.until(ExpectedConditions.
						presenceOfElementLocated((By.xpath(locator))));
				Thread.sleep(1000);
				//js.executeScript("arguments[0].style.border='0px'", element);
				element.click();
				didSucceed = true;

			} catch (NoSuchElementException NoSuchElementException) {
				Assert.fail("No such element" +NoSuchElementException);
				break;
			} catch (TimeoutException TimeOutException) {
				Assert.fail("Time Out" + TimeOutException);
				break;
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			} catch (WebDriverException WebDriverException) {
				System.out.println("Webdriver exception" + WebDriverException);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.xpath(locator)));
			}
			attempts++;
		}
		return didSucceed;
	}
	
	
	
	public static boolean SelectByVisibleText(WebDriver driver, By locator, int timeout, String text) throws Exception {

		boolean didSucceed = false;
		int attempts = 1;

		while (!didSucceed && attempts <= MAX_ATTEMPTS) {
			try {

				Select select = new Select(driver.findElement(locator));
				List<WebElement> options = select.getOptions();
				for(WebElement option: options) {
					if(null!=option.getText() && option.getText().contains(text)) {
						if(!option.isSelected()) {
							option.click();
							break;
						}
					didSucceed = true;
					}
				}

			} catch (NoSuchElementException NoSuchElementException) {
				Assert.fail("No such element" +NoSuchElementException);
				break;
			} catch (TimeoutException TimeOutException) {
				Assert.fail("Time Out" + TimeOutException);
				break;
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			} catch (WebDriverException WebDriverException) {
				System.out.println("Webdriver exception" + WebDriverException);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(locator));
			}
			attempts++;
		}
		return didSucceed;
	}
	
	
	public static boolean ClickwithJavascript(WebDriver driver, By locator, int timeout) throws Exception {

		boolean didSucceed = false;
		int attempts = 1;

		while (!didSucceed && attempts <= MAX_ATTEMPTS) {
			try {

				/*WebDriverWait wait = new WebDriverWait(driver, timeout);
				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(2000);*/
				JavascriptExecutor js = (JavascriptExecutor) driver;
				/*js.executeScript("arguments[0].style.border='3px solid red'", locator);
                Thread.sleep(1000);*/
				js.executeScript("arguments[0].click();", driver.findElement(locator));
				didSucceed = true;
				//js.executeScript("arguments[0].style.border='0px'", locator);

			} catch (NoSuchElementException NoSuchElementException) {
				Assert.fail("No such element" +NoSuchElementException);
				break;
			} catch (TimeoutException TimeOutException) {
				Assert.fail("Time Out" + TimeOutException);
				break;
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			} catch (WebDriverException WebDriverException) {
				System.out.println("Webdriver exception" + WebDriverException);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(locator));
			}
			attempts++;
		}
		return didSucceed;
	}
	
	
	
	public static boolean SelectByCSSSelectorWithSendKeys(WebDriver driver, String locator, int timeout, String value) throws Exception {

		boolean didSucceed = false;
		int attempts = 1;

		while (!didSucceed && attempts <= MAX_ATTEMPTS) {
			try {

				//JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement element = driver.findElement(By.cssSelector(locator));
				//js.executeScript("arguments[0].style.border='3px solid red'", element);
				WebDriverWait wait = new WebDriverWait(driver, timeout);
				wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(locator))));
				Thread.sleep(1000);
				//js.executeScript("arguments[0].style.border='0px'", element);
				element.sendKeys(value);
				didSucceed = true;

			} catch (NoSuchElementException NoSuchElementException) {
				Assert.fail("No such element" +NoSuchElementException);
				break;
			} catch (TimeoutException TimeOutException) {
				Assert.fail("Time Out" + TimeOutException);
				break;
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			} catch (WebDriverException WebDriverException) {
				System.out.println("Webdriver exception" + WebDriverException);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(locator)));
			}
			attempts++;
		}
		return didSucceed;
	}
	
	
	
	public static boolean SelectByXpathWithSendKeys(WebDriver driver, String locator, int timeout, String value) throws Exception {

		boolean didSucceed = false;
		int attempts = 1;

		while (!didSucceed && attempts <= MAX_ATTEMPTS) {
			try {

				//JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement element = driver.findElement(By.xpath(locator));
				//js.executeScript("arguments[0].style.border='3px solid red'", element);
				WebDriverWait wait = new WebDriverWait(driver, timeout);
				wait.until(ExpectedConditions.
						presenceOfElementLocated((By.xpath(locator))));
				Thread.sleep(1000);
				//js.executeScript("arguments[0].style.border='0px'", element);
				element.sendKeys(value);
				didSucceed = true;

			} catch (NoSuchElementException NoSuchElementException) {
				Assert.fail("No such element" +NoSuchElementException);
				break;
			} catch (TimeoutException TimeOutException) {
				Assert.fail("Time Out" + TimeOutException);
				break;
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			} catch (WebDriverException WebDriverException) {
				System.out.println("Webdriver exception" + WebDriverException);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.xpath(locator)));
			}
			attempts++;
		}
		return didSucceed;
	}
	
	
	
	public static boolean SelectByXpathWithoutClick(WebDriver driver, String locator, int timeout) throws Exception {

		boolean didSucceed = false;
		int attempts = 1;

		while (!didSucceed && attempts <= MAX_ATTEMPTS) {
			try {

				//JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("arguments[0].style.border='3px solid red'", element);
				WebDriverWait wait = new WebDriverWait(driver, timeout);
				wait.until(ExpectedConditions.
						presenceOfElementLocated((By.xpath(locator))));
				Thread.sleep(1000);
				//js.executeScript("arguments[0].style.border='0px'", element);
				didSucceed = true;

			} catch (NoSuchElementException NoSuchElementException) {
				Assert.fail("No such element" +NoSuchElementException);
				break;
			} catch (TimeoutException TimeOutException) {
				Assert.fail("Time Out" + TimeOutException);
				break;
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			} catch (WebDriverException WebDriverException) {
				System.out.println("Webdriver exception" + WebDriverException);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.xpath(locator)));
			}
			attempts++;
		}
		return didSucceed;
	}
	
	
	
	public static boolean SelectByCSSSelectorWithoutClick(WebDriver driver, String locator, int timeout) throws Exception {

		boolean didSucceed = false;
		int attempts = 1;

		while (!didSucceed && attempts <= MAX_ATTEMPTS) {
			try {

				//JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("arguments[0].style.border='3px solid red'", element);
				WebDriverWait wait = new WebDriverWait(driver, timeout);
				wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(locator))));
				Thread.sleep(1000);
			    //js.executeScript("arguments[0].style.border='0px'", element);
				didSucceed = true;

			} catch (NoSuchElementException NoSuchElementException) {
				Assert.fail("No such element" +NoSuchElementException);
				break;
			} catch (TimeoutException TimeOutException) {
				Assert.fail("Time Out" + TimeOutException);
				break;
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			} catch (WebDriverException WebDriverException) {
				System.out.println("Webdriver exception" + WebDriverException);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(locator)));
			}
			attempts++;
		}
		return didSucceed;
	}

}
