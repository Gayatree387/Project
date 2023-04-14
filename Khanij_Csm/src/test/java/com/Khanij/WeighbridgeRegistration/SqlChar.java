package com.Khanij.WeighbridgeRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

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

public class SqlChar extends BaseTest implements  Khanij_TestData{
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
	
	public void WBNameTextFieldSpecialCharCheck()throws InterruptedException
	{
		row=40;
		WeighbridgeName WbNM=new WeighbridgeName(driver);
		Thread.sleep(700);
		WbNM.SqlCharMethod();
		Thread.sleep(1000);
		
		String getactualData=WbNM.GetTextMethod();
		 Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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
	
	public void SPNameTextFieldSpecialCharCheck()throws InterruptedException
	{
		row=41;
		WBSupervisorName WbNM=new WBSupervisorName(driver);
		Thread.sleep(700);
		WbNM.SqlCharMethod();
		Thread.sleep(1000);
		
		String getactualData=WbNM.GetTextMethod();
		Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void SPCNameTextFieldSpecialCharCheck()throws InterruptedException
{
	row=42;
	WBSupervisorContact WbNM=new WBSupervisorContact(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void CapacityNameTextFieldSpecialCharCheck()throws InterruptedException
{
	row=43;
	WBCapacity WbNM=new WBCapacity(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void AreaOfLandTextFieldSpecialCharCheck()throws InterruptedException
{
	row=44;
	WBAreaofLand WbNM=new WBAreaofLand(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBModelBaudRateTextFieldSpecialCharCheck()throws InterruptedException
{
	row=45;
	WBModelBaudRate WbNM=new WBModelBaudRate(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBDataBitTextFieldSpecialCharCheck()throws InterruptedException
{
	row=46;
	WBDataBit WbNM=new WBDataBit(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBStopBitTextFieldSpecialCharCheck()throws InterruptedException
{
	row=47;
	WBStopBit WbNM=new WBStopBit(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBParityTextFieldSpecialCharCheck()throws InterruptedException
{
	row=48;
	WBParity WbNM=new WBParity(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBStringReadFromHyperterminalTextFieldSpecialCharCheck()throws InterruptedException
{
	row=49;
	WBStringReadFromHyperterminal WbNM=new WBStringReadFromHyperterminal(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBPoint1LatitudeTextFieldSpecialCharCheck()throws InterruptedException
{
	row=50;
	WBPoint1Latitude WbNM=new WBPoint1Latitude(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBPoint1LongitudeTextFieldSpecialCharCheck()throws InterruptedException
{
	row=51;
	WBPoint1Longitude WbNM=new WBPoint1Longitude(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBPoint2LatitudeTextFieldSpecialCharCheck()throws InterruptedException
{
	row=52;
	WBPoint2Latitude WbNM=new WBPoint2Latitude(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBPoint2LongitudeTextFieldSpecialCharCheck()throws InterruptedException
{
	row=53;
	WBPoint2Longitude WbNM=new WBPoint2Longitude(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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
@Test(priority = 17)

public void WBPoint3LatitudeTextFieldSpecialCharCheck()throws InterruptedException
{
	row=54;
	WBPoint3Latitude WbNM=new WBPoint3Latitude(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBPoint3LongitudeTextFieldSpecialCharCheck()throws InterruptedException
{
	row=55;
	WBPoint3Longitude WbNM=new WBPoint3Longitude(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

public void WBPoint4LatitudeTextFieldSpecialCharCheck()throws InterruptedException
{
	row=56;
	WBPoint4Latitude WbNM=new WBPoint4Latitude(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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
@Test(priority = 21)

public void WBPoint4LongitudeTextFieldSpecialCharCheck()throws InterruptedException
{
	row=57;
	WBPoint4Longitude WbNM=new WBPoint4Longitude(driver);
	Thread.sleep(700);
	WbNM.SqlCharMethod();
	Thread.sleep(1000);
	
	String getactualData=WbNM.GetTextMethod();
	Pattern special = Pattern.compile ("[!@#$%&*<>\\\\\\\\[\\\\\\\\]-]");
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

