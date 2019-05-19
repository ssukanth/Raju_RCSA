package com.infotech.basepage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;

/**
 * @author 30955
 *
 */
public class RobotPage {
	
        public void importFile(String file) throws Throwable {
        	try {
        		System.out.println("Attempt:Popup window to import the file should get opened");
        	    StringSelection ss = new StringSelection(file);
        	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        	    CallObject.block(6000);
        	    //imitate mouse events like ENTER, CTRL+C, CTRL+V
        	    Robot robot = new Robot();
        	    robot.delay(250);
        	    robot.keyPress(KeyEvent.VK_ENTER);
        	    robot.keyRelease(KeyEvent.VK_ENTER);
        	    robot.keyPress(KeyEvent.VK_CONTROL);
        	    robot.keyPress(KeyEvent.VK_V);
        	    robot.keyRelease(KeyEvent.VK_V);
        	    robot.keyRelease(KeyEvent.VK_CONTROL);
        	    robot.keyPress(KeyEvent.VK_ENTER);
        	    robot.delay(50);
        	    robot.keyRelease(KeyEvent.VK_ENTER);
        	    CallObject.block(3000);
        	    System.out.println("Success:Popup window to import the file opened successfully");
			} catch (NoSuchElementException NoSuchElementException) {
				Assert.fail("No such element" +NoSuchElementException);
			} catch (TimeoutException TimeOutException) {
				Assert.fail("Time Out" + TimeOutException);
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			} catch (WebDriverException WebDriverException) {
				System.out.println("Webdriver exception" + WebDriverException);
			}
	  }
}
