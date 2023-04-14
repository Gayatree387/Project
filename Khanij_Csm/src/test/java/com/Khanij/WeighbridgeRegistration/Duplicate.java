package com.Khanij.WeighbridgeRegistration;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BaseTest;
import com.Khanij.ObjectRepository.Khanij_TestData;
import com.Khanij.ObjectRepository.LoginToKhanijWeb;
import com.Khanij.ObjectRepository.WB.CommonMethods;

	public class Duplicate extends BaseTest implements Khanij_TestData{
		
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
		public void CheckDuplicateNotAllowForWBName()throws InterruptedException, AWTException
		{
			CommonMethods cmn = new CommonMethods(driver);
			Thread.sleep(700);
			cmn.WeighBridgeName();
			cmn.SupervisorName();
			cmn.SupervisorContact();
			cmn.HyperterminalReading();
			cmn.StopBit();
			cmn.Parity();
			cmn.ModelBaudRateTextField();
			cmn.DataBitTextField();
			cmn.CapacityTextField();
			cmn.AreaofLandTextField();
			cmn.Point1Lat1TextField();
			cmn.Point1Long1TextField();
			cmn.Point2Lat2TextField();
			cmn.Point2Long2TextField();
			cmn.Point3Lat3TextField();
			cmn.Point3Long3TextField();
			cmn.Poing4Lat4TextField();
			cmn.Point4Long4TextField();
			cmn.SelectAreaType();
			cmn.Point4Long4TextField();
			cmn.SelectWeighbridgeMake();
			cmn.SelectWeighbridgeModel();
			cmn.SelectLocation();
			cmn.UpoadStampCopy();
			cmn.StampValidFromDate(driver);
			cmn.StampValidToDate(driver);
			cmn.SubmitButtonMethod();
			//cmn.PopupMsgMethod();
			cmn.PopupYesMethod();
			cmn.PopupOkMethod();
			//cmn.ResetButtonMethod();
			cmn.AddTabMethod();
			cmn.WeighBridgeName();
			cmn.SupervisorName();
			cmn.SupervisorContact();
			cmn.HyperterminalReading();
			cmn.StopBit();
			cmn.Parity();
			cmn.ModelBaudRateTextField();
			cmn.DataBitTextField();
			cmn.CapacityTextField();
			cmn.AreaofLandTextField();
			cmn.Point1Lat1TextField();
			cmn.Point1Long1TextField();
			cmn.Point2Lat2TextField();
			cmn.Point2Long2TextField();
			cmn.Point3Lat3TextField();
			cmn.Point3Long3TextField();
			cmn.Poing4Lat4TextField();
			cmn.Point4Long4TextField();
			cmn.SelectAreaType();
			cmn.Point4Long4TextField();
			cmn.SelectWeighbridgeMake();
			cmn.SelectWeighbridgeModel();
			cmn.SelectLocation();
			cmn.UpoadStampCopy();
			cmn.StampValidFromDate(driver);
			cmn.StampValidToDate(driver);
			cmn.SelectWeighbridgeMake();
			cmn.SubmitButtonMethod();
			//cmn.PopupYesMethod();
			//cmn.PopupOkMethod();
			String msg = cmn.SubmitPopupMsgMethod();
			Thread.sleep(1000);
			if(msg.equalsIgnoreCase("Weighbridge Name already exists!. Try different name"))
			{
				System.out.println(msg);
				cmn.PopupOkMethod();
				AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 59, "Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, 59, "Fail");
			}
		}
}