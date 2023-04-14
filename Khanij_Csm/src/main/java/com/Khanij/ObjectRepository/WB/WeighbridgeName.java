package com.Khanij.ObjectRepository.WB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BasePage;
import com.Khanij.ObjectRepository.Khanij_TestData;

public class WeighbridgeName extends BasePage implements AutoConstant, Khanij_TestData{
	
	public WeighbridgeName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="WeighBridgeName")
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
	public void LengthMoreThanNo15Method()
	{
		TextField.sendKeys(NoMoreThan15);
	}
	
	//********************** WB Name Duplicate  ***************************//
	public void DuplicateMethod()
	{
		TextField.sendKeys(Applicantname);
	}
	//************* Common Methods***********************************//
	
	@FindBy(id="btnSaveWB")
	public WebElement SubmitButtonMethod;
	
	@FindBy(id="//body/div[4]/div[1]")
	public WebElement PopupMsgMethod;
	
	@FindBy(id="//button[contains(text(),'OK')]")
	public WebElement PopupOkMethod;
	
	public void SubmitButtonMethod()
	{
		SubmitButtonMethod.click();
	}
	public String PopupMsgMethod()
	{
		String msg=PopupMsgMethod.getText();
		return msg;
	}
	public void PopupOkMethod()
	{
		PopupOkMethod.click();
	}

}
	

