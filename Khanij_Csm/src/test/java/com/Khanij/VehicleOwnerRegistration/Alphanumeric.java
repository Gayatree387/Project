package com.Khanij.VehicleOwnerRegistration;

import org.testng.annotations.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BaseTest;
import com.Khanij.ObjectRepository.Khanij_TestData;
import com.Khanij.ObjectRepository.Khanij_VehicleOwnerRegistration;
import com.Khanij.ObjectRepository.Khanij_WBRegistrationByUser;
import com.Khanij.ObjectRepository.WB.WeighbridgeName;

public class Alphanumeric extends BaseTest implements  Khanij_TestData{
	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		Khanij_VehicleOwnerRegistration masterdata=new Khanij_VehicleOwnerRegistration(driver);
		
		masterdata.LoginMethod();
		//masterdata.alertDismissMethod(driver);
		Thread.sleep(700);
		masterdata.ClickonVehicleOwnerRegistration ();
	}
	
	@Test(priority = 1)
	
	public void AadhaarNumberTextFieldAlphanumericCheck()throws InterruptedException
	{
		row=2;
		Khanij_VehicleOwnerRegistration masterdata=new Khanij_VehicleOwnerRegistration(driver);
		Thread.sleep(700);
		masterdata.AadhaarNumberTextFieldCheck(AlphaNumeric);
		Thread.sleep(1000);
		
		String getactualData=masterdata.AadhaarNumberGetTextMethod();
		 Pattern special = Pattern.compile ("[a-zA-Z]");
			Matcher matcher = special.matcher(getactualData);
			boolean constainsSpecial = matcher.find();
			Thread.sleep(600);
	 try {
		
		
		 if(constainsSpecial == true)
		{
			
			AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "pass");
			row++;
			
		}
		else
		{
			System.out.println("Incorrect Message is  Showing");
			AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "fail");
			row++;
			
		}
		
	} catch (Exception e) {
		System.out.println("Validation Message Not Showing");
		AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "Can't Vallidate");
		System.out.println("Fail");
		row++;
		
		
	}
	
	
}


@Test(priority = 2)

public void NameOfTheApplicantTextFieldAlphanumericCheck()throws InterruptedException
{
	row=3;
	Khanij_VehicleOwnerRegistration masterdata=new Khanij_VehicleOwnerRegistration(driver);
	Thread.sleep(700);
	masterdata.NameOfTheApplicantTextFieldCheck(AlphaNumeric);
	Thread.sleep(1000);
	
	String getactualData=masterdata.NameOfTheApplicantGetTextMethod();
	 Pattern special = Pattern.compile ("[a-zA-Z]");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	
	
	 if(constainsSpecial == true)
	{
		
		AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "pass");
		row++;
		
	}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "fail");
		row++;
		
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
	
}


}
@Test(priority = 3)

public void MobileNumberTextFieldAlphanumericCheck()throws InterruptedException
{
	row=4;
	Khanij_VehicleOwnerRegistration masterdata=new Khanij_VehicleOwnerRegistration(driver);
	Thread.sleep(700);
	masterdata.MobileNumberTextFieldCheck(AlphaNumeric);
	Thread.sleep(1000);
	
	String getactualData=masterdata.MobileNumberGetTextMethod();
	 Pattern special = Pattern.compile ("[a-zA-Z]");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	
	
	 if(constainsSpecial == true)
	{
		
		AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "pass");
		row++;
		
	}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "fail");
		row++;
		
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
	
	}

}
@Test(priority = 4)

public void WeighbridgeNameTextFieldAlphanumericCheck()throws InterruptedException
{
	row=5;
	Khanij_VehicleOwnerRegistration masterdata=new Khanij_VehicleOwnerRegistration(driver);
	Thread.sleep(700);
	masterdata.PANCardNumberTextFieldCheck(AlphaNumeric);
	Thread.sleep(1000);
	
	String getactualData=masterdata.PANCardNumberGetTextMethod();
	 Pattern special = Pattern.compile ("[a-zA-Z]");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	
	
	 if(constainsSpecial == true)
	{
		
		AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "pass");
		row++;
		
	}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "fail");
		row++;
		
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
	
		}


	}
@Test(priority = 5)

public void PinCodeNumberTextFieldAlphanumericCheck()throws InterruptedException
{
	row=6;
	Khanij_VehicleOwnerRegistration masterdata=new Khanij_VehicleOwnerRegistration(driver);
	Thread.sleep(700);
	masterdata.PinCodeNumberTextFieldCheck(AlphaNumeric);
	Thread.sleep(1000);
	
	String getactualData=masterdata.PinCodeNumberGetTextMethod();
	 Pattern special = Pattern.compile ("[a-zA-Z]");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	
	
	 if(constainsSpecial == true)
	{
		
		AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "pass");
		row++;
		
	}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "fail");
		row++;
		
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
	}

}
@Test(priority = 6)

public void CompleteAddressTextFieldAlphanumericCheck()throws InterruptedException
{
row=7;
Khanij_VehicleOwnerRegistration masterdata=new Khanij_VehicleOwnerRegistration(driver);
Thread.sleep(700);
masterdata.CompleteAddressTextFieldCheck(AlphaNumeric);
Thread.sleep(1000);

String getactualData=masterdata.CompleteAddressGetTextMethod();
 Pattern special = Pattern.compile ("[a-zA-Z]");
	Matcher matcher = special.matcher(getactualData);
	boolean constainsSpecial = matcher.find();
	Thread.sleep(600);
try {


 if(constainsSpecial == true)
 {
	
	AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "pass");
	row++;
	
	}
else
	{
	System.out.println("Incorrect Message is  Showing");
	AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "fail");
	row++;
	
	}

} catch (Exception e) {
System.out.println("Validation Message Not Showing");
AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "Can't Vallidate");
System.out.println("Fail");
row++;


	}


}
@Test(priority = 8)

public void EnterEmailIDTextFieldAlphanumericCheck()throws InterruptedException
{
row=9;
Khanij_VehicleOwnerRegistration masterdata=new Khanij_VehicleOwnerRegistration(driver);
Thread.sleep(700);
masterdata.EnterEmailIDTextFieldCheck(AlphaNumeric);
Thread.sleep(1000);

String getactualData=masterdata.EmailIDGetTextMethod();
 Pattern special = Pattern.compile ("[a-zA-Z]");
	Matcher matcher = special.matcher(getactualData);
	boolean constainsSpecial = matcher.find();
	Thread.sleep(600);
try {


 if(constainsSpecial == true)
 {
	
	AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "pass");
	row++;
	
 }	
else
	{
	System.out.println("Incorrect Message is  Showing");
	AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "fail");
	row++;
	
	}

} catch (Exception e) {
System.out.println("Validation Message Not Showing");
AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "Can't Vallidate");
System.out.println("Fail");
row++;


	}


}
@Test(priority = 10)

public void AnswerTextFieldAlphanumericCheck()throws InterruptedException
{
row=11;
Khanij_VehicleOwnerRegistration masterdata=new Khanij_VehicleOwnerRegistration(driver);
Thread.sleep(700);
masterdata.AnswerTextFieldCheck(AlphaNumeric);
Thread.sleep(1000);

String getactualData=masterdata.AnswerGetTextMethod();
 Pattern special = Pattern.compile ("[a-zA-Z]");
	Matcher matcher = special.matcher(getactualData);
	boolean constainsSpecial = matcher.find();
	Thread.sleep(600);
try {


 if(constainsSpecial == true)
 {
	
	AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "pass");
	row++;
	
 }
else
	{
	System.out.println("Incorrect Message is  Showing");
	AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "fail");
	row++;
	
	}

} catch (Exception e) {
System.out.println("Validation Message Not Showing");
AutoConstant.fileone.setCellData(VehicleOwnerRegistration_Sheet, Column_name, row, "Can't Vallidate");
System.out.println("Fail");
row++;


		}


	}
}

/*
 * masterdata.NameOfTheApplicantTextFieldCheck(AlphaNumeric);
 * Thread.sleep(1000); masterdata.MobileNumberTextFieldCheck(AlphaNumeric);
 * Thread.sleep(1000); masterdata.PANCardNumberTextFieldCheck(AlphaNumeric);
 * Thread.sleep(1000); masterdata.PinCodeNumberTextFieldCheck(AlphaNumeric);
 * Thread.sleep(1000); masterdata.CompleteAddressTextFieldCheck(AlphaNumeric);
 * Thread.sleep(1000); masterdata.EnterEmailIDTextFieldCheck(AlphaNumeric);
 * Thread.sleep(1000); masterdata.AnswerTextFieldCheck(AlphaNumeric);
 */
