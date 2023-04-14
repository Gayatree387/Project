package com.Khanij.GenericLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	WebDriver driver;
	public void selectbyvisibletext(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectbyvalue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void selectbyindex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.deselectByIndex(index);
	}
	
	public void jsclick(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	public void mousehoveroperation(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void robotTAB() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public void FileUploadRobot() throws AWTException, InterruptedException {
		// Specify the file location with extension
			 StringSelection sel = new StringSelection("D:\\TEST DATA\\sample.pdf");
			 
			   // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
			 //JavascriptExecutor js = (JavascriptExecutor)driver1;
			// js.executeScript("scroll(0,350)");
			// Create object of Robot class
			 Robot robot = new Robot();
			 Thread.sleep(1000);
			      
			  // Press Enter
			 robot.keyPress(KeyEvent.VK_ENTER);
			 
			// Release Enter
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			  // Press CTRL+V
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 
			// Release CTRL+V
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_V);
			 Thread.sleep(1000);
			        
			 //Press Enter 
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
		}
	public void alertaccept(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public void alertdismiss(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	
	public void Date(String Date) 
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('give id of element').value='" + Date+ "'");
	}
}
