package com.Khanij.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BasePage;

public class Khanij_VehicleOwnerRegistration extends BasePage implements AutoConstant, Khanij_TestData{
	
	public Khanij_VehicleOwnerRegistration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ActionUse(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.perform();
	}
//Storing xpath	

	@FindBy(xpath="//span[contains(text(),'×')]")
	private WebElement ClickNoticeModel;
	@FindBy(id="A2")
	private WebElement ClickRegistration;
	@FindBy(xpath="//a[contains(text(),'Vehicle Owner')]")
	private WebElement ClickVehicleOwnerRegistration;
	@FindBy(id="AadhaarNumber")
	private WebElement EnterAadhaarNumber;
	@FindBy(id="TransporterName")
	private WebElement EnterNameOfTheApplicant;
	@FindBy(xpath="//span[@id='searchableselect-StateId-container']")
	private WebElement SelectState;
	@FindBy(id="DistrictId")
	private WebElement SelectDistrict;
	@FindBy(id="MobileNo")
	private WebElement EnterMobileNumber;
	@FindBy(id="PAN")
	private WebElement EnterPANCardNumber;
	@FindBy(id="PinCode")
	private WebElement EnterPinCodeNumber;
	@FindBy(id="Address")
	private WebElement EnterCompleteAddress;
	@FindBy(id="EmailID")
	private WebElement EnterEmailID;
	@FindBy(id="SQuestionId")
	private WebElement SelectSecurityQuestion;
	@FindBy(id="SQAnswer")
	private WebElement EnterAnswer;
	@FindBy(xpath="//label[contains(text(),'Declaration - I declare that all the information g')]")
	private WebElement ClickOnDeclaration;
	
	public void LoginMethod() throws InterruptedException
	{
		/*
		 * Thread.sleep(1000); UserNameTextField.sendKeys("Admin"); Thread.sleep(1000);
		 * PasswordTextField.sendKeys("Password@1"); Thread.sleep(3000);
		 * LoginButton.click(); Thread.sleep(1000); MasterLinkClick.click();
		 */
		Thread.sleep(5000);
		ClickNoticeModel.click();
		Thread.sleep(1000);
		ClickRegistration.click();
	}
	 public void ClickonClickNoticeModel()
	 {
		 ClickNoticeModel.click(); 
	 }
	 public void ClickonRegistration()
	 {
		 ClickRegistration.click(); 
	 }
	 public void ClickonVehicleOwnerRegistration()
	 {
		 ClickVehicleOwnerRegistration.click(); 
	 }
	 public void EnterAadhaarNumberTextField()
	 {
		 EnterAadhaarNumber.sendKeys(AadharcardNo); 
	 }
	 public void EnterNameOfTheApplicantTextField()
	 {
		 EnterNameOfTheApplicant.sendKeys(Applicantname); 
	 }
	 public void SelectStateDropdown()
	 {
		 SelectState.sendKeys(State);
	 }
	 public void SelectDistrictDropdown()
	 {
		 selectbyvisibletext(SelectDistrict,District);
	 }
	 public void EnterMobileNumberTextField()
	 {
		 EnterMobileNumber.sendKeys(MobileNumber); 
	 }
	 public void EnterPANCardNumberTextField()
	 {
		 EnterPANCardNumber.sendKeys(PANCardNumber); 
	 }
	 public void EnterPinCodeNumberTextField()
	 {
		 EnterPinCodeNumber.sendKeys(Pincode); 
	 }
	 public void EnterCompleteAddressTextField()
	 {
		 EnterCompleteAddress.sendKeys(Address); 
	 }
	 public void EnterEnterEmailIDTextField()
	 {
		 EnterEmailID.sendKeys(EmailID); 
	 }
	 public void SelectSecurityQuestionDropdown()
	 {
		 selectbyvisibletext(SelectSecurityQuestion,SecurityQuestion);
	 }
	 public void EnterAnswerTextField()
	 {
		 EnterAnswer.sendKeys(Answer); 
	 }
	 public void ClickOnDeclaration()
	 {
		 ClickOnDeclaration.click(); 
	 }
	 
	 //Alphanumeric/Specialchar/sqlchar
	 public void AadhaarNumberTextFieldCheck(String A)
	 {
		 EnterAadhaarNumber.sendKeys(A); 
	 }
	 public void NameOfTheApplicantTextFieldCheck(String A)
	 {
		 EnterNameOfTheApplicant.sendKeys(A); 
	 }
	 public void MobileNumberTextFieldCheck(String A)
	 {
		 EnterMobileNumber.sendKeys(A); 
	 }
	 public void PANCardNumberTextFieldCheck(String A)
	 {
		 EnterPANCardNumber.sendKeys(A); 
	 }
	 public void PinCodeNumberTextFieldCheck(String A)
	 {
		 EnterPinCodeNumber.sendKeys(A); 
	 }
	 public void CompleteAddressTextFieldCheck(String A)
	 {
		 EnterCompleteAddress.sendKeys(A); 
	 }
	 public void EnterEmailIDTextFieldCheck(String A)
	 {
		 EnterEmailID.sendKeys(A); 
	 }
	 public void AnswerTextFieldCheck(String A)
	 {
		 EnterAnswer.sendKeys(A); 
	 }
	 
	 //GetText Values
	 public String AadhaarNumberGetTextMethod()
		{
			String AadhaarNumberget = EnterAadhaarNumber.getAttribute("value");
			return AadhaarNumberget;
		}
	 public String NameOfTheApplicantGetTextMethod()
		{
			String EnterNameOfTheApplicantget = EnterNameOfTheApplicant.getAttribute("value");
			return EnterNameOfTheApplicantget;
		}
	 public String MobileNumberGetTextMethod()
		{
			String MobileNumberget = EnterMobileNumber.getAttribute("value");
			return MobileNumberget;
		}
	 public String PANCardNumberGetTextMethod()
		{
			String PANCardNumberget = EnterPANCardNumber.getAttribute("value");
			return PANCardNumberget;
		}
	 public String PinCodeNumberGetTextMethod()
		{
			String PinCodeNumberget = EnterPinCodeNumber.getAttribute("value");
			return PinCodeNumberget;
		}
	 public String CompleteAddressGetTextMethod()
		{
			String CompleteAddressget = EnterCompleteAddress.getAttribute("value");
			return CompleteAddressget;
		}
	 public String EmailIDGetTextMethod()
		{
			String EmailIDget = EnterEmailID.getAttribute("value");
			return EmailIDget;
		}
	 public String AnswerGetTextMethod()
		{
			String Answerget = EnterAnswer.getAttribute("value");
			return Answerget;
		}
}

