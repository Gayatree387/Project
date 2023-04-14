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

public class LoginToKhanijWeb extends BasePage implements Khanij_TestData {

	 @FindBy(id="UserName") 
	  private WebElement EnterUserName;
	  @FindBy(id="Password") 
	  private WebElement EnterPassword;
	  @FindBy(id="Submit") 
	  private WebElement LoginButton;	
	  
	  public LoginToKhanijWeb(WebDriver driver) 
	  	{
			PageFactory.initElements(driver, this);
		}
	
	public void LoginToKhanijPortal(WebDriver driver) throws Exception {
		
	EnterUserName.sendKeys(WBUserId);
	EnterPassword.sendKeys(WBPassword);
	
	Thread.sleep(3000);
//	File src = driver.findElement(By.id("capt1")).getScreenshotAs(OutputType.FILE);
	File src = driver.findElement(By.xpath("//div[@id='capt1']")).getScreenshotAs(OutputType.FILE);
	String path = System.getProperty("user.dir") + "/test-output/captcha.png";

	try {
		FileHandler.copy(src, new File(path));

		ITesseract image = new Tesseract();

		String imageText = image.doOCR(new File(path));
		System.out.println(imageText);
		WebElement Captche = driver.findElement(By.id("txtCaptcha"));
		Captche.sendKeys(imageText);
					Thread.sleep(3000);   // Login is automatic
					// pg.SignIn().click();
	} catch (NoSuchElementException e) {
		System.out.println("Not working");
	}
	Thread.sleep(1000);
	ClickonInvalidOk.click();
	
	textbox.sendKeys(Keys.BACK_SPACE);
	textbox.sendKeys(Keys.BACK_SPACE);
	
	LoginButton.click();
	Thread.sleep(5000);

	
	}
	public void LoginToKhanijPortalexp(WebDriver driver) throws Exception {
		System.out.print("enter in to exp");
	
		while(1<2)
		{
			System.out.print("enter in to while");
			try {
		WebElement E=driver.findElement(By.id("a_13"));
		if(E.isDisplayed())
		{
			System.out.print("Login is working");
			break;
		}}catch(Exception e)
			{
			
			System.out.print("Login is not working");
			ClickonInvalidOk.click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			LoginToKhanijPortal(driver);
		
		}}}
	@FindBy (id = "txtCaptcha")
	private WebElement textbox;
	
	@FindBy (xpath ="//button[contains(text(),'OK')]")
	private WebElement ClickonInvalidOk;
	public void ClickonInvalid() {
		ClickonInvalidOk.click();
	}
	public void ClickOnLogin() 
	{
		LoginButton.click();
	}
	
	//************Module Specific************//
	@FindBy(id="a_13") 
	 private WebElement ClickOnWeighbridgeModule;	 
	 @FindBy(xpath="//body/div[3]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	 private WebElement ClickOnAddWeighbridgeSubModule;
	 
	 //**************** Click on Weighbridge Module *****************

	public void WeighbridgeModule() throws InterruptedException {
	Thread.sleep(700);
	ClickOnWeighbridgeModule.click();
	}

	// **************** Click on Weighbridge Sub Module ******************//

	public void WeighbridgeModuleAdd() throws InterruptedException {
	Thread.sleep(700);
	ClickOnAddWeighbridgeSubModule.click();
	}
}