package com.Khanij.WeighbridgeRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BaseTest;
import com.Khanij.ObjectRepository.Khanij_TestData;
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

public class Length extends BaseTest implements  Khanij_TestData {
	@Test(priority = 0)
	public void loginPageOpen()throws Exception
	{
		LoginToKhanijWeb WBdata=new LoginToKhanijWeb(driver);
		WBdata.LoginToKhanijPortal(driver);
		WBdata.LoginToKhanijPortalexp(driver);
		WBdata.WeighbridgeModule();
		WBdata.WeighbridgeModuleAdd();
	}
	@Test(priority = 2)
	public void WBNameTextFieldLengthCheck()throws InterruptedException
	{
		row=87;
		WeighbridgeName WbNM=new WeighbridgeName(driver);
		Thread.sleep(700);
		WbNM.LengthMoreThan50CharMethod();
		Thread.sleep(1000);
		String getactualData=WbNM.GetTextMethod();
		Thread.sleep(800);
		int Length = getactualData.length();
		System.out.println(Length);
		if(Length <= 50)
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
	}	

@Test(priority = 2)
	
	public void SPNameLengthCheck()throws InterruptedException
	{
	row=88;
	WBSupervisorName WbNM=new WBSupervisorName(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThan50CharMethod();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length <= 50)
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
	
	}
@Test(priority = 3)
public void SPCNOTextFieldLengthCheck()throws InterruptedException
{
	row=89;
	WBSupervisorContact WbNM=new WBSupervisorContact(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length <= 10)
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
}
@Test(priority = 4)

public void CapacityNameTextFieldLengthCheck()throws InterruptedException
{
	row=90;
	WBCapacity WbNM=new WBCapacity(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThan50CharMethod();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length <= 50)
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
}
@Test(priority = 5)

public void AreaOfLandTextFieldLengthCheck()throws InterruptedException
{
	row=91;
	WBAreaofLand WbNM=new WBAreaofLand(driver);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length <= 10)
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
	}
@Test(priority = 6)

public void WBModelBaudRateTextFieldLengthCheck()throws InterruptedException
{
	row=92;
	WBModelBaudRate WbNM=new WBModelBaudRate(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length <= 10)
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

	}
@Test(priority = 7)

public void WBDataBitTextFieldLengthCheck()throws InterruptedException
{
	row=93;
	WBDataBit WbNM=new WBDataBit(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length <= 10)
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
	}
@Test(priority = 8)

public void WBStopBitTextFieldLengthCheck()throws InterruptedException
{
	row=94;
	WBStopBit WbNM=new WBStopBit(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length <= 10)
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
	}
@Test(priority = 9)

public void WBParityTextFieldLengthCheck()throws InterruptedException
{
	row=95;
	WBParity WbNM=new WBParity(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length <= 10)
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
	}
@Test(priority = 10)

public void WBStringReadFromHyperterminalTextFieldLengthCheck()throws InterruptedException
{
	row=96;
	WBStringReadFromHyperterminal WbNM=new WBStringReadFromHyperterminal(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length <= 10)
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
	}
@Test(priority = 11)

public void WBPoint1LatitudeTextFieldLengthCheck()throws InterruptedException
{
	row=97;
	WBPoint1Latitude WbNM=new WBPoint1Latitude(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length >= 9)
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
	}
@Test(priority = 12)

public void WBPoint1LongitudeTextFieldLengthCheck()throws InterruptedException
{
	row=98;
	WBPoint1Longitude WbNM=new WBPoint1Longitude(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length>=9)
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
	}
@Test(priority = 13)

public void WBPoint2LatitudeTextFieldLengthCheck()throws InterruptedException
{
	row=99;
	WBPoint2Latitude WbNM=new WBPoint2Latitude(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length>=9)
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
	}
@Test(priority = 15)

public void WBPoint2LongitudeTextFieldLengthCheck()throws InterruptedException
{
	row=100;
	WBPoint2Longitude WbNM=new WBPoint2Longitude(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length>=9)
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
	}
@Test(priority = 16)

public void WBPoint3LatitudeTextFieldLengthCheck()throws InterruptedException
{
	row=101;
	WBPoint3Latitude WbNM=new WBPoint3Latitude(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length>=9)
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
	}
@Test(priority = 17)

public void WBPoint3LongitudeTextFieldLengthCheck()throws InterruptedException
{
	row=102;
	WBPoint3Longitude WbNM=new WBPoint3Longitude(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length>=9 )
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
	}
@Test(priority = 18)

public void WBPoint4LatitudeTextFieldLengthCheck()throws InterruptedException
{
	row=103;
	WBPoint4Latitude WbNM=new WBPoint4Latitude(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length>=9 )
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

	}
@Test(priority = 20)

public void WBPoint4LongitudeTextFieldLengthCheck()throws InterruptedException
{
	row=104;
	WBPoint4Longitude WbNM=new WBPoint4Longitude(driver);
	Thread.sleep(700);
	WbNM.LengthMoreThanNo10Method();
	Thread.sleep(1000);
	String getactualData=WbNM.GetTextMethod();
	Thread.sleep(800);
	int Length = getactualData.length();
	System.out.println(Length);
	if(Length>=9 )
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

}
}
