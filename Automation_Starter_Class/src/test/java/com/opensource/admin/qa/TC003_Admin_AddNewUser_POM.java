package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC003_Admin_AddNewUser_POM 
{
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	UserManagement userManagement;
	String username, password;

  @BeforeTest
  public void beforeTest() 
  {
	  seleniumWrapper = new SeleniumWrapper(driver);
	  driver = seleniumWrapper.chromeDriverConnection();
	  login = new Login(driver);
	  userManagement = new UserManagement(driver);
	  username = "Admin";
	  password = "admin123";
  }

  @Test
  public void TC003_Admin_AddNewUser_POM_TestScript() 
  {
	  //STEP 1
	  seleniumWrapper.launchBrowser(GlobalVariables.QA_URL);
	  
	  //STEP 2
	  login.loginOrange(username, password);
	  
	  //STEP 3
	  userManagement.validateLogged();
	  
	  //STEP 4
	  userManagement.clickAdmin();
	  
	  
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
