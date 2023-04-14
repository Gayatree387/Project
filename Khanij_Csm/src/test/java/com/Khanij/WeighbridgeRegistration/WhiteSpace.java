package com.Khanij.WeighbridgeRegistration;

import org.testng.annotations.Test;

import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BaseTest;
import com.Khanij.ObjectRepository.Khanij_TestData;
import com.Khanij.ObjectRepository.Khanij_WBRegistrationByUser;
import com.Khanij.ObjectRepository.LoginToKhanijWeb;
import com.Khanij.ObjectRepository.WB.CommonMethods;
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

public class WhiteSpace extends BaseTest implements  Khanij_TestData{
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
	
	public void WBNameTextFieldWhitespaceCheck()throws InterruptedException
	{
		row=106;
		WeighbridgeName WbNM=new WeighbridgeName(driver);
		Thread.sleep(700);
		driver.navigate().refresh();
		Thread.sleep(700);
		WbNM.WhiteSpaceInitialMethod();
		Thread.sleep(1000);
		CommonMethods cmn=new CommonMethods(driver);
		cmn.SubmitButtonMethod();
		String msg=cmn.PopupMsgMethod();
		System.out.println(msg);
		if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
			row++;
		}
		else
		{
			System.out.println("Validation  message is not showing");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
			row++;
		}
	}
@Test(priority = 2)
	
	public void SPNameTextFieldWhitespaceCheck()throws InterruptedException
	{
		row=107;
		WBSupervisorName WbNM=new WBSupervisorName(driver);
		Thread.sleep(700);
		driver.navigate().refresh();
		Thread.sleep(700);
		WbNM.WhiteSpaceInitialMethod();
		Thread.sleep(1000);
		
		CommonMethods cmn=new CommonMethods(driver);
		cmn.SubmitButtonMethod();
		String msg=cmn.PopupMsgMethod();
		System.out.println(msg);
		if(msg.equalsIgnoreCase("Please Enter Supervisor Name"))
		{
			System.out.println(msg);
			cmn.PopupOkMethod();
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
			row++;
		}
		else
		{
			System.out.println("Validation  message is not showing");
			AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
			row++;
		}
	}
@Test(priority = 3)

public void SPCNameTextFieldWhitespaceCheck()throws InterruptedException
{
	row=108;
	WBSupervisorContact WbNM=new WBSupervisorContact(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 4)

public void CapacityNameTextFieldWhitespaceCheck()throws InterruptedException
{
	row=109;
	WBCapacity WbNM=new WBCapacity(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 5)

public void AreaOfLandTextFieldWhitespaceCheck()throws InterruptedException
{
	row=110;
	WBAreaofLand WbNM=new WBAreaofLand(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 6)

public void WBModelBaudRateTextFieldWhitespaceCheck()throws InterruptedException
{
	row=111;
	WBModelBaudRate WbNM=new WBModelBaudRate(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 7)

public void WBDataBitTextFieldWhitespaceCheck()throws InterruptedException
{
	row=112;
	WBDataBit WbNM=new WBDataBit(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 8)

public void WBStopBitTextFieldWhitespaceCheck()throws InterruptedException
{
	row=113;
	WBStopBit WbNM=new WBStopBit(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 9)

public void WBParityTextFieldWhitespaceCheck()throws InterruptedException
{
	row=114;
	WBParity WbNM=new WBParity(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 10)

public void WBStringReadFromHyperterminalTextFieldWhitespaceCheck()throws InterruptedException
{
	row=115;
	WBStringReadFromHyperterminal WbNM=new WBStringReadFromHyperterminal(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 11)

public void WBPoint1LatitudeTextFieldWhitespaceCheck()throws InterruptedException
{
	row=116;
	WBPoint1Latitude WbNM=new WBPoint1Latitude(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 12)

public void WBPoint1LongitudeTextFieldWhitespaceCheck()throws InterruptedException
{
	row=117;
	WBPoint1Longitude WbNM=new WBPoint1Longitude(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 13)

public void WBPoint2LatitudeTextFieldWhitespaceCheck()throws InterruptedException
{
	row=118;
	WBPoint2Latitude WbNM=new WBPoint2Latitude(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 15)

public void WBPoint2LongitudeTextFieldWhitespaceCheck()throws InterruptedException
{
	row=119;
	WBPoint2Longitude WbNM=new WBPoint2Longitude(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 17)

public void WBPoint3LatitudeTextFieldWhitespaceCheck()throws InterruptedException
{
	row=120;
	WBPoint3Latitude WbNM=new WBPoint3Latitude(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 19)

public void WBPoint3LongitudeTextFieldWhitespaceCheck()throws InterruptedException
{
	row=121;
	WBPoint3Longitude WbNM=new WBPoint3Longitude(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 20)

public void WBPoint4LatitudeTextFieldWhitespaceCheck()throws InterruptedException
{
	row=122;
	WBPoint4Latitude WbNM=new WBPoint4Latitude(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
}
@Test(priority = 21)

public void WBPoint4LongitudeTextFieldWhitespaceCheck()throws InterruptedException
{
	row=123;
	WBPoint4Longitude WbNM=new WBPoint4Longitude(driver);
	Thread.sleep(700);
	driver.navigate().refresh();
	Thread.sleep(700);
	WbNM.WhiteSpaceInitialMethod();
	Thread.sleep(1000);
	
	CommonMethods cmn=new CommonMethods(driver);
	cmn.SubmitButtonMethod();
	String msg=cmn.PopupMsgMethod();
	System.out.println(msg);
	if(msg.equalsIgnoreCase("Please Enter Weighbridge Name"))
	{
		System.out.println(msg);
		cmn.PopupOkMethod();
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "pass");
		row++;
	}
	else
	{
		System.out.println("Validation  message is not showing");
		AutoConstant.fileone.setCellData(WeighbridgeRegistration_Sheet, Column_name, row, "Fail");
		row++;
	}
	}
}

