package com.qa.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo {
	//Login - File Transfer - Logout
	//Login - Utility bill payment - Logout
	//Login - credit card bill payment - Logout

	@Test(priority=1,groups="Payments")
	public void FundTransfer() {
		//System.out.println("I m fund transfer method");
		Reporter.log("I am a fund transfer method",true);
	}
	@Test(priority=1,groups="Payments",enabled=false)
	public void UtilityBillPayment() {
		//System.out.println("I m utility bill payment method");
		Reporter.log("I am a utility bill payment method",true);
		}
	@Test(priority=1,groups="Payments",invocationCount=3)
	public void CCBillPayment() {
		//System.out.println("I m credit card bill payment method");
		Reporter.log("I am credit card bill payment method",true);
	}
	@BeforeClass
	public void login() {
		System.out.println("I am login method");
	}
	@AfterClass
	public void logout() {
		System.out.println("I am logout method");
	}
	@BeforeTest
	public void InvokeBrowser() {
		System.out.println("Launch the browser");
	}
	@AfterTest
	public void CloseBrowser() {
		System.out.println("Close the browser");
	}
	@BeforeMethod
	public void CheckBalance() {
		System.out.println("I am CheckBalance method");
	}
	@AfterMethod
	public void Acknowledgement() {
		System.out.println("I am Acknowledgement method");
	}
	@Test(priority=4,groups="Insurance")
	public void VehicleInsurance() {
		Reporter.log("I am a vehicle Insurance method",true);
	}
	@Test(priority=5,groups="Insurance")
	public void MedicalInsurance() {
		Reporter.log("I am a medical insurance method",true);
	}
}