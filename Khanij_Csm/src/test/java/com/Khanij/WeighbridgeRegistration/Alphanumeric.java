package com.Khanij.WeighbridgeRegistration;

import org.testng.annotations.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BaseTest;
import com.Khanij.ObjectRepository.Khanij_TestData;
import com.Khanij.ObjectRepository.Khanij_WBRegistrationByUser;
import com.Khanij.ObjectRepository.LoginToKhanijWeb;
import com.Khanij.ObjectRepository.WB.WBAreaofLand;
import com.Khanij.ObjectRepository.WB.WBCapacity;
import com.Khanij.ObjectRepository.WB.WBDataBit;
import com.Khanij.ObjectRepository.WB.WBModelBaudRate;
import com.Khanij.ObjectRepository.WB.WBParity;
import com.Khanij.ObjectRepository.WB.WBPoint1Latitude;
import com.Khanij.ObjectRepository.WB.WBPoint1Longitude;
import com.Khanij.ObjectRepository.WB.WBPoint2Latitude;
import com.Khanij.ObjectRepository.WB.WBPoint2Longitude;
import com.Khanij.ObjectRepository.WB.WBPoint3Latitude;
import com.Khanij.ObjectRepository.WB.WBPoint3Longitude;
import com.Khanij.ObjectRepository.WB.WBPoint4Latitude;
import com.Khanij.ObjectRepository.WB.WBPoint4Longitude;
import com.Khanij.ObjectRepository.WB.WBStopBit;
import com.Khanij.ObjectRepository.WB.WBStringReadFromHyperterminal;
import com.Khanij.ObjectRepository.WB.WBSupervisorContact;
import com.Khanij.ObjectRepository.WB.WBSupervisorName;
import com.Khanij.ObjectRepository.WB.WeighbridgeName;

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
	
	public void WBNameTextFieldAlphanumericCheck()throws InterruptedException
	{
		row=2;
		WeighbridgeName WbNM=new WeighbridgeName(driver);
		Thread.sleep(700);
		WbNM.AlphaNumericMethod();
		Thread.sleep(1000);
		
		String getactualData=WbNM.GetTextMethod();
		 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
			Matcher matcher = special.matcher(getactualData);
			boolean constainsSpecial = matcher.find();
			Thread.sleep(600);
	 try {
		 if(constainsSpecial == true)
		{
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
			row++;
			}
		else
		{
			System.out.println("Incorrect Message is  Showing");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
			row++;
		}
		
	} catch (Exception e) {
		System.out.println("Validation Message Not Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
		System.out.println("Fail");
		row++;
		
	}	
	
	}
@Test(priority = 2)
	
	public void SPNameTextFieldAlphanumericCheck()throws InterruptedException
	{
		row=3;
		WBSupervisorName WbNM=new WBSupervisorName(driver);
		Thread.sleep(700);
		WbNM.AlphaNumericMethod();
		Thread.sleep(1000);
		
		String getactualData=WbNM.GetTextMethod();
		 Pattern special = Pattern.compile ("[a-zA-Z]");
			Matcher matcher = special.matcher(getactualData);
			boolean constainsSpecial = matcher.find();
			Thread.sleep(600);
	 try {
		 if(constainsSpecial == true)
		{
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
			row++;
			}
		else
		{
			System.out.println("Incorrect Message is  Showing");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
			row++;
		}
		
	} catch (Exception e) {
		System.out.println("Validation Message Not Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
		System.out.println("Fail");
		row++;
		
	}	
	
	}
@Test(priority = 3)

public void SPCNOTextFieldAlphanumericCheck()throws InterruptedException
{
	row=4;
	WBSupervisorContact WbNM=new WBSupervisorContact(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
}	

}
@Test(priority = 4)

public void CapacityNameTextFieldAlphanumericCheck()throws InterruptedException
{
	row=5;
	WBCapacity WbNM=new WBCapacity(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
}	

}
@Test(priority = 5)

public void AreaOfLandTextFieldAlphanumericCheck()throws InterruptedException
{
	row=6;
	WBAreaofLand WbNM=new WBAreaofLand(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 6)

public void WBModelBaudRateTextFieldAlphanumericCheck()throws InterruptedException
{
	row=7;
	WBModelBaudRate WbNM=new WBModelBaudRate(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 7)

public void WBDataBitTextFieldAlphanumericCheck()throws InterruptedException
{
	row=8;
	WBDataBit WbNM=new WBDataBit(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 8)

public void WBStopBitTextFieldAlphanumericCheck()throws InterruptedException
{
	row=9;
	WBStopBit WbNM=new WBStopBit(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 9)

public void WBParityTextFieldAlphanumericCheck()throws InterruptedException
{
	row=10;
	WBParity WbNM=new WBParity(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 10)

public void WBStringReadFromHyperterminalTextFieldAlphanumericCheck()throws InterruptedException
{
	row=11;
	WBStringReadFromHyperterminal WbNM=new WBStringReadFromHyperterminal(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 11)

public void WBPoint1LatitudeTextFieldAlphanumericCheck()throws InterruptedException
{
	row=12;
	WBPoint1Latitude WbNM=new WBPoint1Latitude(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 12)

public void WBPoint1LongitudeTextFieldAlphanumericCheck()throws InterruptedException
{
	row=13;
	WBPoint1Longitude WbNM=new WBPoint1Longitude(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 13)

public void WBPoint2LatitudeTextFieldAlphanumericCheck()throws InterruptedException
{
	row=14;
	WBPoint2Latitude WbNM=new WBPoint2Latitude(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 15)

public void WBPoint2LongitudeTextFieldAlphanumericCheck()throws InterruptedException
{
	row=15;
	WBPoint2Longitude WbNM=new WBPoint2Longitude(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 16)

public void WBPoint3LatitudeTextFieldAlphanumericCheck()throws InterruptedException
{
	row=16;
	WBPoint3Latitude WbNM=new WBPoint3Latitude(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 18)

public void WBPoint3LongitudeTextFieldAlphanumericCheck()throws InterruptedException
{
	row=17;
	WBPoint3Longitude WbNM=new WBPoint3Longitude(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 19)

public void WBPoint4LatitudeTextFieldAlphanumericCheck()throws InterruptedException
{
	row=18;
	WBPoint4Latitude WbNM=new WBPoint4Latitude(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
@Test(priority = 20)

public void WBPoint4LongitudeTextFieldAlphanumericCheck()throws InterruptedException
{
	row=19;
	WBPoint4Longitude WbNM=new WBPoint4Longitude(driver);
	Thread.sleep(700);
	WbNM.AlphaNumericMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	 Pattern special = Pattern.compile ("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(getactualData);
		boolean constainsSpecial = matcher.find();
		Thread.sleep(600);
 try {
	 if(constainsSpecial == true)
	{
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
		}
	else
	{
		System.out.println("Incorrect Message is  Showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "fail");
		row++;
	}
	
} catch (Exception e) {
	System.out.println("Validation Message Not Showing");
	AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Can't Vallidate");
	System.out.println("Fail");
	row++;
	
		}	

	}
}

