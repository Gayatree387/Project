package com.Khanij.ObjectRepository;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Khanij.GenericLibrary.BasePage;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;



public class Khanij_WBRegistrationByUser extends BasePage implements Khanij_TestData{

	  @FindBy(id="UserName") 
	  private WebElement EnterUserName;
	  @FindBy(id="Password") 
	  private WebElement EnterPassword;
	  @FindBy(id="Submit") 
	  private WebElement ClickOnSubmit;	 
	  @FindBy(id="a_13") 
	  private WebElement ClickOnWeighbridgeModule;	 
	  @FindBy(xpath="//body/div[3]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	 private WebElement ClickOnAddWeighbridgeSubModule;
	 @FindBy (id = "txtCaptcha") 
	 private WebElement textbox;
	 @FindBy (xpath = "/html/body/div[2]/div/div[3]/div/button") 
	 private WebElement ClickonInvalid;
	  
	 public void LoginMethod(WebDriver driver) throws Exception {
	  
	  EnterUserName.sendKeys(WBUserId); 
	  Thread.sleep(1000);
	  EnterPassword.sendKeys(WBPassword); 
	  Thread.sleep(40000);
	  ClickOnSubmit.click(); 
	 }	  
	 
	 //**************** Click on Weighbridge Module *****************

	public void WeighbridgeModule() throws InterruptedException {
		Thread.sleep(1000);
		ClickOnWeighbridgeModule.click();
	}

	// **************** Click on Weighbridge Sub Module ******************//

	public void WeighbridgeModuleAdd() throws InterruptedException {
		Thread.sleep(1000);
					ClickOnAddWeighbridgeSubModule.click();
				}
	public Khanij_WBRegistrationByUser(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}