package com.Khanij.ObjectRepository.WB;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BasePage;
import com.Khanij.ObjectRepository.Khanij_TestData;

public class CommonMethods extends BasePage implements AutoConstant, Khanij_TestData{
	 WebDriver driver;
	public CommonMethods(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//************* Common Methods***********************************//
	
		@FindBy(id="btnSaveWB")
		public WebElement SubmitButton;
		
		@FindBy(xpath="//body/div[4]/div[1]")
		public WebElement PopupMsgMethod;
		
		@FindBy(xpath="//button[contains(text(),'Yes')]")
		public WebElement PopupYesMethod;
		
		@FindBy(xpath="//button[contains(text(),'OK')]")
		public WebElement PopupOkMethod;
		
		@FindBy(xpath="//button[contains(text(),'RESET')]")
		public WebElement ResetButton;
		
		@FindBy(xpath="//a[contains(text(),'Add')]")
		public WebElement AddTab;
		
		@FindBy(xpath="//div[contains(text(),'Weighbridge Name already exists!. Try different na')]")
		private WebElement SubmitPopupMsg;
		
		public String SubmitPopupMsgMethod()
		{
			String submitpopupmsg = SubmitPopupMsg.getText();
			return submitpopupmsg;
		}
		
		public void SubmitButtonMethod() throws InterruptedException
		{
			Thread.sleep(2000);
			SubmitButton.click();
		}
		public String PopupMsgMethod()
		{
			String msg=PopupMsgMethod.getText();
			return msg;
		}
		public void PopupYesMethod() throws InterruptedException
		{
			Thread.sleep(2000);
			PopupYesMethod.click();
		}
		public void PopupOkMethod() throws InterruptedException
		{
			Thread.sleep(2000);
			PopupOkMethod.click();
		}
		public void ResetButtonMethod()
		{
			ResetButton.click();
		}
		public void AddTabMethod() throws InterruptedException
		{
			Thread.sleep(3000);
			AddTab.click();
		}
		//************* All Webelement ***********************************//
		
		@FindBy(id="WeighBridgeName")
		public WebElement WeighBridgeNameTextField;
		@FindBy(id="SupervisorName")
		public WebElement SupervisorNameTextField;
		@FindBy(id="SupervisorContact")
		public WebElement SupervisorContactTextField;
		@FindBy(id="HyperterminalReading")
		public WebElement HyperterminalReadingTextField;
		@FindBy(id="StopBit")
		public WebElement StopBitTextField;
		@FindBy(id="Lon4")
		public WebElement Lon4TextField;
		@FindBy(id="Lat4")
		public WebElement Lat4TextField;
		@FindBy(id="Lon3")
		public WebElement Lon3TextField;
		@FindBy(id="Lat3")
		public WebElement Lat3TextField;
		@FindBy(id="Lon2")
		public WebElement Lon2TextField;
		@FindBy(id="Lat2")
		public WebElement Lat2TextField;
		@FindBy(id="Lon1")
		public WebElement Lon1TextField;
		@FindBy(id="Lat1")
		public WebElement Lat1TextField;
		@FindBy(id="Parity")
		public WebElement ParityTextField;
		@FindBy(id="ModelBaudRate")
		public WebElement ModelBaudRateTextField;
		@FindBy(id="DataBit")
		public WebElement DataBitTextField;
		@FindBy(id="Capacity")
		public WebElement CapacityTextField;
		@FindBy(id="AreaofLand")
		public WebElement AreaofLandTextField;
		@FindBy(id="LandAreaTypeID")
		public WebElement SelectAreaType;
		@FindBy(id="Location")
		public WebElement SelectLocation;
		@FindBy(id="StampCopy")
		public WebElement UploadStampCopy;
		@FindBy(id="StampValidFrom")
		public WebElement StampValidFromDate;
		@FindBy(id="StampValidTo")
		public WebElement StampValidToDate;
		@FindBy(id="MakeID")
		public WebElement SelectWeighbridgeMake;
		@FindBy(id="ModelID")
		public WebElement SelectWeighbridgeModel;
		@FindBy(id="StampCopy")
		public WebElement Uploadstampcopy;
		@FindBy(id="StampValidFrom")
		public WebElement Selectfromdate;
		@FindBy(id="StampValidTo")
		public WebElement Selecttodate;
		
		public void WeighBridgeName()
		{
			WeighBridgeNameTextField.sendKeys(WeighBridgeName);
		}
		public void SupervisorName()
		{
			SupervisorNameTextField.sendKeys(SupervisorName);
		}
		public void SupervisorContact()
		{
			SupervisorContactTextField.sendKeys(SupervisorContact);
		}
		public void HyperterminalReading()
		{
			HyperterminalReadingTextField.sendKeys(HyperterminalReading);
		}
		public void StopBit()
		{
			StopBitTextField.sendKeys(StopBit);
		}
		public void Parity()
		{
			ParityTextField.sendKeys(Parity);
		}
		public void ModelBaudRateTextField()
		{
			ModelBaudRateTextField.sendKeys(ModelBaudRate);
		}
		public void DataBitTextField()
		{
			DataBitTextField.sendKeys(DataBit);
		}
		public void CapacityTextField()
		{
			CapacityTextField.sendKeys(Capacity);
		}
		public void AreaofLandTextField()
		{
			AreaofLandTextField.sendKeys(AreaofLand);
		}
		public void Point1Lat1TextField()
		{
			Lat1TextField.sendKeys(Lat1);
		}
		public void Point1Long1TextField()
		{
			Lon1TextField.sendKeys(Lon1);
		}
		public void Point2Lat2TextField()
		{
			Lat2TextField.sendKeys(Lat2);
		}
		public void Point2Long2TextField()
		{
			Lon2TextField.sendKeys(Lon2);
		}
		public void Point3Lat3TextField()
		{
			Lat3TextField.sendKeys(Lat3);
		}
		public void Point3Long3TextField()
		{
			Lon3TextField.sendKeys(Lon3);
		}
		public void Poing4Lat4TextField()
		{
			Lat4TextField.sendKeys(Lat4);
		}
		public void Point4Long4TextField()
		{
			Lon4TextField.sendKeys(Lon4);
		}
		public void SelectAreaType() throws InterruptedException
		{
			Thread.sleep(1000);
			selectbyvisibletext(SelectAreaType,AreaType);
		}
		public void SelectLocation() throws InterruptedException
		{
			Thread.sleep(1000);
			selectbyvisibletext(SelectLocation,Location);
		}
		
		 public void UpoadStampCopy() throws AWTException, InterruptedException 
		 { 
			//WebElement chooseFile = driver.findElement((By) Uploadstampcopy);
			Uploadstampcopy.sendKeys("D:\\TEST DATA\\sample.pdf");
			// Thread.sleep(5000);
			 //((BasePage) Uploadstampcopy).FileUploadRobot();
		 } 
		public void SelectWeighbridgeMake() throws InterruptedException
		{
			Thread.sleep(1000);
			selectbyvisibletext(SelectWeighbridgeMake,WeighbridgeMake);
		}
		public void SelectWeighbridgeModel() throws InterruptedException
		{
			Thread.sleep(1000);
			selectbyvisibletext(SelectWeighbridgeModel,WeighbridgeModel);
		}
		public void StampValidFromDate(WebDriver driver) throws InterruptedException 
		{
			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementById('StampValidFrom').value='29-Dec-2022'");
		}
		public void StampValidToDate(WebDriver driver) throws InterruptedException 
		{
			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('StampValidTo').value='3-Jan-2023'");
		}
	}
		
