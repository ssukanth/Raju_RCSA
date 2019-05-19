package com.infotech.basepage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class CallObject {

	private static final int MAX_TIME = 8;

	public static String timestamp() {

		DateFormat format = new SimpleDateFormat("HH_mm_YYYY");
		Date date = new Date();
		String time = format.format(date);
		return time;
	}
	
	
	public static String presentTimestamp() {

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String time = format.format(date);
		return time;
	}
	
	
	public static String futureDate() {
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		    Calendar cal = Calendar.getInstance();
		    cal.setTime(new Date());
		    cal.add(Calendar.DATE, 2);
		    String newDate = dateFormat.format(cal.getTime());
		return newDate;
	}
	
	
	public static String utilitiesfutureDate() {
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		    Calendar cal = Calendar.getInstance();
		    cal.setTime(new Date());
		    cal.add(Calendar.DATE, 7);
		    String newDate = dateFormat.format(cal.getTime());
		return newDate;
	}
	
	
	public static String pastDate() {
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		    Calendar cal = Calendar.getInstance();
		    cal.setTime(new Date());
		    cal.add(Calendar.DATE, -3);
		    String newDate = dateFormat.format(cal.getTime());
		return newDate;
	}
	

	public static void switchToAlert(WebDriver driver) throws Exception {
		
		block(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		block(5000);
		waitForPageLoad(driver);
	}
	
	
	public static void waitForPageLoad(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, MAX_TIME);

		Predicate<WebDriver> pageLoaded = new Predicate<WebDriver>() {

			public boolean apply(WebDriver input) {
				return ((JavascriptExecutor) input).
						executeScript("return document.readyState").equals("complete");
			}
		};
		wait.until(pageLoaded);
		block(1000);
	}
	
	
	public static void block(long sec) throws Exception {
		Thread.sleep(sec);
	}
}
