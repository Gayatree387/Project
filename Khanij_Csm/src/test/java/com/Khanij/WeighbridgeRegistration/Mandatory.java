package com.Khanij.WeighbridgeRegistration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BaseTest;
import com.Khanij.ObjectRepository.Khanij_TestData;
import com.Khanij.ObjectRepository.LoginToKhanijWeb;
import com.Khanij.ObjectRepository.WB.CommonMethods;
public class Mandatory {
	public class Alphanumeric extends BaseTest implements  Khanij_TestData{
		@Test(priority = 0)
		public void loginPageOpen()throws Exception
		{
			LoginToKhanijWeb WBdata=new LoginToKhanijWeb(driver);
			WBdata.LoginToKhanijPortal(driver);
			WBdata.LoginToKhanijPortalexp(driver);
			WBdata.WeighbridgeModule();
			WBdata.WeighbridgeModuleAdd();
		}
	@Test(priority = 1)
	public void CheckMandatoryForWeighbridgeName() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Weighbridge Name"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 61, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 61, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 2)
	public void CheckMandatoryForsupervisorname() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Supervisor Name"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 62, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 62, "Fail");
			cmn.PopupOkMethod();
		}
	}

	@Test(priority = 3)
	public void CheckMandatoryForsupervisorContact() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Supervisor Contact"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 63, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 63, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 4)
	public void CheckMandatoryForCapacity() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Capacity"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 64, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 64, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 5)
	public void CheckMandatoryForAreaType() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Land Area Type"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 65, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 65, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 6)
	public void CheckMandatoryForAreaOfLand() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Area of Land"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 66, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 66, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 7)
	public void CheckMandatoryForLocation() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();	
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Location"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 67, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 67, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 8)
	public void CheckMandatoryForUploadStampCopy() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Weighbridge Name"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 68, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 68, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 9)
	public void CheckMandatoryForStampValidFrom() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Select Stamp Valid From"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 69, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 69, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 10)
	public void CheckMandatoryForStampValidTo() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Select Stamp Valid To"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 70, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 70, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 11)
	public void CheckMandatoryForWeighbridgeMake() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Select Weighbridge Make"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 71, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 71, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 12)
	public void CheckMandatoryForWeighbridgeModel() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Select Weighbridge Model"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 72, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 72, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 13)
	public void CheckMandatoryForModelBaudRate() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter ModelBaudRate"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 73, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 73, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 14)
	public void CheckMandatoryForDataBit() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter DataBit"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 74, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 74, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 15)
	public void CheckMandatoryForStopBit() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter StopBit"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 75, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 75, "Fail");
			cmn.PopupOkMethod();
		}
	}
	@Test(priority = 16)
	public void CheckMandatoryForParity() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.StopBit();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Parity"))
			 {
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 76, "Pass");
			 }
		else
			 {
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 76, "Fail");
			cmn.PopupOkMethod();
			 }
	     }	
	@Test(priority = 17)
	public void CheckMandatoryForStringReadFromHyperterminal() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.StopBit();
		Thread.sleep(700);
		cmn.Parity();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter HyperterminalReading"))
			 {
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 77, "Pass");
			 }
		else
			 {
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 77, "Fail");
			cmn.PopupOkMethod();
			 }
	     }		
	@Test(priority = 18)
	public void CheckMandatoryForPoint1Latitude() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.StopBit();
		Thread.sleep(700);
		cmn.Parity();
		Thread.sleep(700);
		cmn.HyperterminalReading();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Point 1 Latitude"))
			 {
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 78, "Pass");
			 }
		else
			 {
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 78, "Fail");
			cmn.PopupOkMethod();
			 }
	     }		
	@Test(priority = 19)
	public void CheckMandatoryForPoint1Longitude() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.StopBit();
		Thread.sleep(700);
		cmn.Parity();
		Thread.sleep(700);
		cmn.HyperterminalReading();
		Thread.sleep(700);
		cmn.Point1Lat1TextField();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Point 1 Longitude"))
			 {
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 79, "Pass");
			 }
		else
			 {
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 79, "Fail");
			cmn.PopupOkMethod();
			 }
	     }		
	@Test(priority = 20)
	public void CheckMandatoryForPoint2Latitude() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.StopBit();
		Thread.sleep(700);
		cmn.Parity();
		Thread.sleep(700);
		cmn.HyperterminalReading();
		Thread.sleep(700);
		cmn.Point1Lat1TextField();
		Thread.sleep(700);
		cmn.Point1Long1TextField();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Point 2 Latitude"))
			 {
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 80, "Pass");
			 }
		else
			 {
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 80, "Fail");
			cmn.PopupOkMethod();
			 }
	     }		
	@Test(priority = 21)
	public void CheckMandatoryForPoint2Longitude() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.StopBit();
		Thread.sleep(700);
		cmn.Parity();
		Thread.sleep(700);
		cmn.HyperterminalReading();
		Thread.sleep(700);
		cmn.Point1Lat1TextField();
		Thread.sleep(700);
		cmn.Point1Long1TextField();
		Thread.sleep(700);
		cmn.Point2Lat2TextField();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Point 2 Longitude"))
			 {
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 81, "Pass");
			 }
		else
			 {
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 81, "Fail");
			cmn.PopupOkMethod();
			 }
	     }		
	@Test(priority = 22)
	public void CheckMandatoryForPoint3Latitude() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.StopBit();
		Thread.sleep(700);
		cmn.Parity();
		Thread.sleep(700);
		cmn.HyperterminalReading();
		Thread.sleep(700);
		cmn.Point1Lat1TextField();
		Thread.sleep(700);
		cmn.Point1Long1TextField();
		Thread.sleep(700);
		cmn.Point2Lat2TextField();
		Thread.sleep(700);
		cmn.Point2Long2TextField();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Point 3 Latitude"))
			 {
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 82, "Pass");
			 }
		else
			 {
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 82, "Fail");
			cmn.PopupOkMethod();
			 }
	     }	
	@Test(priority = 23)
	public void CheckMandatoryForPoint3Longitude() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.StopBit();
		Thread.sleep(700);
		cmn.Parity();
		Thread.sleep(700);
		cmn.HyperterminalReading();
		Thread.sleep(700);
		cmn.Point1Lat1TextField();
		Thread.sleep(700);
		cmn.Point1Long1TextField();
		Thread.sleep(700);
		cmn.Point2Lat2TextField();
		Thread.sleep(700);
		cmn.Point2Long2TextField();
		Thread.sleep(700);
		cmn.Point3Lat3TextField();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Point 3 Longitude"))
			 {
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 83, "Pass");
			 }
		else
			 {
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 83, "Fail");
			cmn.PopupOkMethod();
			 }
	     }		
	@Test(priority = 24)
	public void CheckMandatoryForPoint4Latitude() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.StopBit();
		Thread.sleep(700);
		cmn.Parity();
		Thread.sleep(700);
		cmn.HyperterminalReading();
		Thread.sleep(700);
		cmn.Point1Lat1TextField();
		Thread.sleep(700);
		cmn.Point1Long1TextField();
		Thread.sleep(700);
		cmn.Point2Lat2TextField();
		Thread.sleep(700);
		cmn.Point2Long2TextField();
		Thread.sleep(700);
		cmn.Point3Lat3TextField();
		Thread.sleep(700);
		cmn.Point3Long3TextField();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Point 4 Latitude"))
			 {
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 84, "Pass");
			 }
		else
			 {
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 84, "Fail");
			cmn.PopupOkMethod();
			 }
	     }	
	@Test(priority = 25)
	public void CheckMandatoryForPoint4Longitude() throws InterruptedException {
		//row=2;
		CommonMethods cmn = new CommonMethods(driver);
		driver.navigate().refresh();
		Thread.sleep(700);
		cmn.WeighBridgeName();
		Thread.sleep(700);
		cmn.SupervisorName();
		Thread.sleep(700);
		cmn.SupervisorContact();
		Thread.sleep(700);
		cmn.CapacityTextField();
		Thread.sleep(700);
		cmn.SelectAreaType();
		Thread.sleep(700);
		cmn.AreaofLandTextField();
		Thread.sleep(700);
		cmn.SelectLocation();
		Thread.sleep(700);
		cmn.StampValidFromDate(driver);
		Thread.sleep(700);
		cmn.StampValidToDate(driver);
		Thread.sleep(700);
		cmn.SelectWeighbridgeMake();
		Thread.sleep(700);
		cmn.SelectWeighbridgeModel();
		Thread.sleep(700);
		cmn.ModelBaudRateTextField();
		Thread.sleep(700);
		cmn.DataBitTextField();
		Thread.sleep(700);
		cmn.StopBit();
		Thread.sleep(700);
		cmn.Parity();
		Thread.sleep(700);
		cmn.HyperterminalReading();
		Thread.sleep(700);
		cmn.Point1Lat1TextField();
		Thread.sleep(700);
		cmn.Point1Long1TextField();
		Thread.sleep(700);
		cmn.Point2Lat2TextField();
		Thread.sleep(700);
		cmn.Point2Long2TextField();
		Thread.sleep(700);
		cmn.Point3Lat3TextField();
		Thread.sleep(700);
		cmn.Point3Long3TextField();
		Thread.sleep(700);
		cmn.Poing4Lat4TextField();
		Thread.sleep(700);
		cmn.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = cmn.PopupMsgMethod();
		if(msg.contains("Please Enter Point 4 Longitude"))
			 {
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 85, "Pass");
			 }
		else
			 {
			System.out.println("Validation Message Not Showing/Wrong message is displaying");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 85, "Fail");
			cmn.PopupOkMethod();
			 }
	     }		
     }
}
