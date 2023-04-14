package com.Khanij.ObjectRepository.WB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BasePage;
import com.Khanij.ObjectRepository.Khanij_TestData;

public class WBPoint1Longitude extends BasePage implements AutoConstant, Khanij_TestData{
	
	public WBPoint1Longitude(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Lon1")
	private WebElement TextField;
	public void ClearMethod()
	{
		TextField.clear();
	}

	
	public void NumericMethod()
	{
		TextField.sendKeys(Numeric);
	}
	public void AlphaNumericMethod()
	{
		TextField.sendKeys(AlphaNumeric);
	}
	public String GetTextMethod()
	{
		String name = TextField.getAttribute("value");
		return name;
	}
	//**************** White Space character ******************//
	
	public void WhiteSpaceInitialMethod()
	{
		TextField.sendKeys(WhiteSpaceInitial);
	}

	public void WhiteSpaceiMiddleMethod()
	{
		TextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Special Char Field  ***************************//

	public void SpecialCharMethod()
	{
		TextField.sendKeys(SpecialChar);
	}
	
	//********************** WB Name Sql Char  ***************************//
	
	public void SqlCharMethod()
	{
		TextField.sendKeys(SQLChar);
	}
	//********************** WB Name Length  ***************************//
	
	public void LengthMoreThan50CharMethod()
	{
		TextField.sendKeys(CharMoreThan50);
	}
	public void LengthMoreThan15NoMethod()
	{
		TextField.sendKeys(NoMoreThan15);
	}
	public void LengthMoreThanNo10Method()
	{
		TextField.sendKeys(NoMoreThan10);
	}
	
	//********************** WB Name Duplicate  ***************************//
	public void DuplicateMethod()
	{
		TextField.sendKeys(Applicantname);
	}
	
}
	



