package com.Khanij.ObjectRepository;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Khanij.GenericLibrary.AutoConstant;
import com.Khanij.GenericLibrary.BasePage;
import com.Khanij.ObjectRepository.Khanij_TestData;

public class Khanij_UserRegistration extends BasePage implements AutoConstant, Khanij_TestData{
	
	//Common Function
	public Khanij_UserRegistration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/*
	 * @FindBy(id="txtusername") private WebElement UserNameTextField;
	 * 
	 * @FindBy(id="txtpassword") private WebElement PasswordTextField;
	 * 
	 * @FindBy(xpath="//button[contains(text(),'Sign in')]") private WebElement
	 * LoginButton;
	 * 
	 * @FindBy(xpath="//span[.='Master']") private WebElement MasterLinkClick;
	 */
	@FindBy(xpath="//span[contains(text(),'×')]")
	private WebElement ClickNoticeModel;
	
	@FindBy(id="A2")
	private WebElement ClickRegistration;
	
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
	
	//**************** Sub Modules Web Elements ******************//
	
	@FindBy(xpath="//a[contains(text(),'EndUser Registration')]")
	private WebElement ClickEndUserRegistration;
	@FindBy(xpath="//a[contains(text(),'Vehicle Owner')]")
	private WebElement ClickVehicleOwnerRegistration;
	@FindBy(xpath="//a[contains(text(),'Contractor Builder')]")
	private WebElement ClickContractorBuilderRegistration;
	@FindBy(xpath="//a[contains(text(),'VTD Vendor')]")
	private WebElement ClickVTDVendorRegistration;
	@FindBy(xpath="//a[contains(text(),'Tailing Dam|Ashdyke|Mud Pond')]")
	private WebElement ClickTailingDamRegistration;
	
	//**************** Sub Modules Methods ******************//

	public void ClickEndUserRegistration() throws InterruptedException
	{
		Thread.sleep(1000);
		ClickEndUserRegistration.click();
	}
	public void ClickVehicleOwnerRegistration() throws InterruptedException
	{
		Thread.sleep(1000);
		ClickVehicleOwnerRegistration.click();
	}
	public void ClickContractorBuilderRegistration() throws InterruptedException
	{
		Thread.sleep(1000);
		ClickContractorBuilderRegistration.click();
	}
	public void ClickVTDVendorRegistration() throws InterruptedException
	{
		Thread.sleep(1000);
		ClickVTDVendorRegistration.click();
	}
	public void ClickTailingDamRegistration() throws InterruptedException
	{
		Thread.sleep(1000);
		ClickTailingDamRegistration.click();
	}
	
	//*************** Submit Button ******************//
	
		@FindBy(id="btnSubmit")
		private WebElement SubmitButtonClick;
		
		public void SubmitButtonMethod()
		{
			SubmitButtonClick.click();
		}
		
		//************************ Alert ********************************//
		public void alertAcceptMethod(WebDriver driver)
		{
			Alert alt = driver.switchTo().alert();
			alt.accept();
		}
		public void alertDismissMethod(WebDriver driver)
		{
			Alert alt = driver.switchTo().alert();
			alt.dismiss();
		}
		public String alertMsgHandle(WebDriver driver) {
			String msg = driver.switchTo().alert().getText();
			return msg;
		}
		
		//************************ Popup Alert ********************************//
		
		@FindBy(xpath="//div[@class='swal-title']")
		private WebElement PopupMsg;
		
		public String PopupMsgMethod()
		{
			String popupmsg = PopupMsg.getText();
			return popupmsg;
		}
		
		@FindBy(xpath="//button[.='OK']")
		private WebElement PopupOK;
		
		public void PopupOkMethod()
		{
			PopupOK.click();
		}
		
		@FindBy(xpath="//div[@class='swal-text']")
		private WebElement SubmitPopupMsg;
		
		public String SubmitPopupMsgMethod()
		{
			String submitpopupmsg = SubmitPopupMsg.getText();
			return submitpopupmsg;
		}
		
		@FindBy(xpath="//button[.='Yes']")
		private WebElement PopupYes;
		
		public void PopupYesMethod()
		{
			PopupYes.click();
		}
		
		@FindBy(xpath="//button[.='No']")
		private WebElement PopupNo;
		
		public void PopupNoMethod()
		{
			PopupNo.click();
		}
		//********************** Enduser registration Input Field ***************************//
		public void EndUserRegistrationMethod()
		{
			ClickEndUserRegistration.click();
		}
		
		@FindBy(id="searchableselect-NatureOfBusiness-container")
		private WebElement SelectRegistrationType;
		
		public void SelectRegistrationTypeMethod()
		{
			selectbyvisibletext(SelectRegistrationType, RegistrationType);
		}
		@FindBy(id="EUPTypeId")
		
		private WebElement  SelectIndustryType;
		
		public void SelectIndustryType()
		{
			selectbyvisibletext(SelectIndustryType, IndustryType);
		}
		
		@FindBy(id="ApplicantName")
		private WebElement ApplicantNameTextField;
		
		public void EnterApplicantName()
		{
			ApplicantNameTextField.sendKeys(Applicantname);
		}
		
		@FindBy(id="EMailId")
		private WebElement EMailIdTextField;
		
		public void EnterEMailId()
		{
			EMailIdTextField.sendKeys(EmailID);
		}
		
		@FindBy(id="MobileNo")
		private WebElement MobileNoTextField;
		
		public void EnterMobileNo()
		{
			MobileNoTextField.sendKeys(Mobileno);
		}
		@FindBy(id="Designation")
		private WebElement DesignationTextField;
		
		public void EnterDesignation()
		{
			DesignationTextField.sendKeys(Designation);
		}
		@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]")
		private WebElement SelectMineralName;
		
		public void SelectMineralNameMethod()
		{
			selectbyvisibletext(SelectMineralName, MineralName);
		}
		@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]")
		private WebElement SelectMineralForm;
		
		public void SelectMineralFormMethod()
		{
			selectbyvisibletext(SelectMineralForm, MineralForm);
		}
		@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]")
		private WebElement SelectMineralGrade;
		
		public void SelectMineralGradeMethod()
		{
			selectbyvisibletext(SelectMineralGrade, MineralGrade);
		}
		@FindBy(id="PurposeOfPurchaseMineral")
		private WebElement SelectPurpose;
		
		public void SelectPurposeMethod()
		{
			selectbyvisibletext(SelectPurpose, Purpose);
		}
		@FindBy(id="MineralUse")
		private WebElement MineralUseTextField;
		
		public void EnterMineralUseMethod()
		{
			MineralUseTextField.sendKeys(UseoftheMineral);
		}
		@FindBy(id="AadhaarNumber")
		private WebElement AadhaarNumberTextField;
		
		public void EnterAadhaarNumberMethod()
		{
			AadhaarNumberTextField.sendKeys(AadharcardNo);
		}
		@FindBy(id="doc")
		private WebElement UploadAadharcardDocs;
		
		public void UploadAadharcardDocsMethod() throws AWTException, InterruptedException
		{
			((BasePage) UploadAadharcardDocs).FileUploadRobot();
		}
		@FindBy(id="PAN")
		private WebElement PANNumberTextField;
		
		public void PANNumberMethod()
		{
			PANNumberTextField.sendKeys(PANCardNumber);
		}
		@FindBy(id="docpan")
		private WebElement UploadPANNoDocs;
		
		public void UploadPANNoDocsMethod() throws AWTException, InterruptedException
		{
			((BasePage) UploadPANNoDocs).FileUploadRobot();
		}
		@FindBy(id="TINNo")
		private WebElement TinNumberTextField;
		
		public void TINNumberMethod()
		{
			TinNumberTextField.sendKeys(TinNumber);
		}
		@FindBy(id="docTin")
		private WebElement UploadTINNoDocs;
		
		public void UploadTinNumberDocsMethod() throws AWTException, InterruptedException
		{
			((BasePage) UploadTINNoDocs).FileUploadRobot();
		}
		@FindBy(id="GSTNO")
		private WebElement GSTNumberTextField;
		
		public void GSTNumberMethod()
		{
			GSTNumberTextField.sendKeys(GSTNumberनंबर);
		}
		@FindBy(id="docGST")
		private WebElement UploadGSTNODocs;
		
		public void UploadGSTNODocsMethod() throws AWTException, InterruptedException
		{
			((BasePage) UploadGSTNODocs).FileUploadRobot();
		}
		@FindBy(id="docebill")
		private WebElement UploadElecticBillDocs;
		
		public void UploadElecticBillDocsMethod() throws AWTException, InterruptedException
		{
			((BasePage) UploadElecticBillDocs).FileUploadRobot();
		}
		@FindBy(id="docCTO")
		private WebElement UploadCTODocs;
		
		public void UploadCTODocsMethod() throws AWTException, InterruptedException
		{
			((BasePage) UploadCTODocs).FileUploadRobot();
		}
		
		@FindBy(id="CTOApprovalNumber")
		private WebElement CTOApprovalNumberTextField;
		
		public void CTOApprovalNumberMethod()
		{
			CTOApprovalNumberTextField.sendKeys(TinNumber);
		}
		@FindBy(id="CTOOrderDate")
		private WebElement CTOOrderDateField;
		
		public void CTOOrderDateFieldMethod()
		{
			CTOOrderDateField.click();
		}
		@FindBy(id="CTOValidityFrom")
		private WebElement CTOValidityFromDateField;
		
		public void CTOValidityFromDateFieldMethod()
		{
			CTOValidityFromDateField.click();
		}
		@FindBy(id="CTOValidityTo")
		private WebElement CTOValidityToField;
		
		public void CTOValidityToFieldMethod()
		{
			CTOValidityToField.click();
		}
		@FindBy(id="IBMRegistrationNo")
		private WebElement IBMRegistrationNoTextField;
		
		public void IBMRegistrationNoMethod()
		{
			IBMRegistrationNoTextField.sendKeys(IBMRegistrationNo);
		}
		@FindBy(id="Address")
		private WebElement AddressTextField;
		
		public void AddressMethod()
		{
			AddressTextField.sendKeys(Address);
		}
		@FindBy(id="StateId")
		private WebElement SelectState;
		
		public void SelectStateMethod()
		{
			selectbyvisibletext(SelectState, State);
		}
		@FindBy(id="DistrictID")
		private WebElement SelectDistrict;
		
		public void SelectDistrictMethod()
		{
			selectbyvisibletext(SelectDistrict, District);
		}
		@FindBy(id="PinCode")
		private WebElement PinCodeTextField;
		
		public void PinCodeMethod()
		{
			PinCodeTextField.sendKeys(Pincode);
		}
		@FindBy(id="OfficeAddress")
		private WebElement OfficeAddressTextField;
		
		public void OfficeAddressMethod()
		{
			OfficeAddressTextField.sendKeys(Address);
		}
		@FindBy(id="StateId_O")
		private WebElement OfcSelectState;
		
		public void SelectOfcStateMethod()
		{
			selectbyvisibletext(OfcSelectState, State);
		}
		@FindBy(id="DistrictID_O")
		private WebElement SelectOfcDistrict;
		
		public void SelectOfcDistrictMethod()
		{
			selectbyvisibletext(SelectOfcDistrict, District);
		}
		@FindBy(id="PinCode_O")
		private WebElement PinCodeOfcTextField;
		
		public void PinCodeOfcTextfieldMethod()
		{
			PinCodeOfcTextField.sendKeys(Pincode);
		}
		@FindBy(id="SQuestionId")
		private WebElement SelectSequrityQuestionId;
		
		public void SelectSequrityQuestionIdMethod()
		{
			selectbyvisibletext(SelectSequrityQuestionId, SecurityQuestion);
		}
		@FindBy(id="SQAnswer")
		private WebElement SQAnswerTextField;
		
		public void SQAnswerTextfieldMethod()
		{
			SQAnswerTextField.sendKeys(Answer);
		}
		@FindBy(id="captcha")
		private WebElement captchaTextField;
		
		public void captchaTextfieldMethod()
		{
			captchaTextField.sendKeys(Captcha);
		}
		@FindBy(id="VerifyOTP")
		private WebElement OtpTextField;
		
		public void OtpTextFieldMethod()
		{
			OtpTextField.sendKeys(Otp);
		}
		@FindBy(id="chkIagree")
		private WebElement Declarationcheckbox;
		
		public void DeclarationcheckboxMethod()
		{
			Declarationcheckbox.click();
		}
		
}