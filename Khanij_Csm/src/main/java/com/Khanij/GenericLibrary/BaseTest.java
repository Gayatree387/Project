package com.Khanij.GenericLibrary;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author gayatree.rath
 *
 */
public class BaseTest implements AutoConstant
{
	public WebDriver driver; 
	public int row;

  @BeforeClass public WebDriver openBrowser() {
  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  driver.get(url); return driver; }
  
  @AfterClass 
  public void closeBrowser() { 
	  //driver.quit(); 
	  }
 
	/*
	 * public WebDriver driver; public int row;
	 * 
	 * @BeforeClass public WebDriver openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 * driver.get(url); return driver; }
	 * 
	 * @AfterClass public void closeBrowser() { //driver.quit(); }
	 */
}
