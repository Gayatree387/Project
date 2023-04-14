package com.Khanij.GenericLibrary;


import com.Khanij.GenericLibrary.Xls_AllMethods;

public interface AutoConstant {
	static Xls_AllMethods fileone = new Xls_AllMethods("E:\\Selenium\\Test\\Khanij_Csm\\Khanij_FieldValidation_Mapping.xlsx");
	String url = "http://khanij.csmpl.com/Home/Index";
	String browser="chrome";
	//String loginurl = "http://khanij.csmpl.com/Home/Index";
	String Column_name= "Status";
	String EndUserRegistration_Sheet="EndUserRegistration";
	String VehicleOwnerRegistration_Sheet="VehicleOwnerRegistration";
	String ContractorBuilderRegistration_Sheet="ContractorBuilder";
	String VTDVendorRegistration_Sheet="VTDVendorRegistration";
	String TailingDamRegistration_Sheet="TailingDamRegistration";
	String WeighbridgeRegistration_Sheet="WeighbridgeRegistration";

}
