package com.Khanij.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BasePage;

public class Khanij_WeighbridgeRegistration extends BasePage implements AutoConstant, Khanij_TestData{
	public Khanij_WeighbridgeRegistration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//Storing xpath	

	@FindBy(xpath="//span[contains(text(),'×')]")
	private WebElement ClickNoticeModel;
	@FindBy(id="A2")
	private WebElement ClickRegistration;
	@FindBy(xpath="//a[contains(text(),'Weighbridge Registration')]")
	private WebElement ClickWeighbridgeRegistration;
	
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
		 EnterCompleteAddress.click(); 
	 }
	 public void EnterAadhaarNumberTextField()
	 {
		 SelectDistrict.sendKeys(AadharcardNo); 
	 }
	 public void EnterNameOfTheApplicantTextField()
	 {
		 SelectSecurityQuestion.sendKeys(Applicantname); 
	 }
	 public void SelectStateDropdown()
	 {
		 SelectState.sendKeys(State);
	 }
	 public void SelectDistrictDropdown()
	 {
		 selectbyvisibletext(SelectDistrict,District);
	 }
}
