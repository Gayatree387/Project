package com.Khanij.VehicleOwnerRegistration;

import org.testng.annotations.Test;

import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BaseTest;
import com.Khanij.ObjectRepository.Khanij_TestData;
import com.Khanij.ObjectRepository.Khanij_VehicleOwnerRegistration;

	public class Duplicate extends BaseTest implements Khanij_TestData{
		
		@Test(priority = 0)
		public void loginPageOpen()throws InterruptedException
		{
			Khanij_VehicleOwnerRegistration masterdata=new Khanij_VehicleOwnerRegistration(driver);
			masterdata.LoginMethod();
			//masterdata.alertDismissMethod(driver);
			Thread.sleep(700);
			masterdata.ClickonVehicleOwnerRegistration();
		}
		
		@Test(priority = 1)
		public void CheckDuplicateNotAllowForCompositionName()throws InterruptedException
		{
			Khanij_VehicleOwnerRegistration masterdata = new Khanij_VehicleOwnerRegistration(driver);
			Thread.sleep(700);
			masterdata.EnterAadhaarNumberTextField();
			Thread.sleep(700);
			masterdata.EnterNameOfTheApplicantTextField();
			Thread.sleep(900);
			//masterdata.SelectStateDropdown(driver);
			Thread.sleep(900);
			masterdata.SelectDistrictDropdown();
			Thread.sleep(700);
			masterdata.EnterMobileNumberTextField();
			Thread.sleep(700);
			masterdata.EnterPANCardNumberTextField();
			Thread.sleep(700);
			masterdata.EnterPinCodeNumberTextField();
			Thread.sleep(700);
			masterdata.EnterCompleteAddressTextField();
			Thread.sleep(700);
			masterdata.EnterEnterEmailIDTextField();
			Thread.sleep(700);
			masterdata.SelectSecurityQuestionDropdown();
			Thread.sleep(700);
			masterdata.EnterAnswerTextField();
			Thread.sleep(10000);
			masterdata.ClickOnDeclaration();
			
			
			/*
			 * String msg = masterdata.SubmitPopupMsgMethod(); Thread.sleep(1000);
			 * if(msg.equalsIgnoreCase("Composition Name Already Exist")) {
			 * System.out.println(msg); masterdata.PopupOkMethod();
			 * AutoConstant.fileone.setCellData(Composition_Sheet, "Status", 20, "Pass"); }
			 * else { System.out.println("Validation Message Not Showing");
			 * AutoConstant.fileone.setCellData(Composition_Sheet, "Status", 20, "Fail"); }
			 */
		}
}
