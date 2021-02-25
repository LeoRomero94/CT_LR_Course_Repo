package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC002_Admin_SearchEmployee_NotExist_POM 
{
	
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	UserManagement userManagement;
	String username, password, searchValue, expectedValue;
    
  @BeforeTest
  public void beforeTest() 
  {
	  seleniumWrapper = new SeleniumWrapper(driver);
	  driver = seleniumWrapper.chromeDriverConnection();
	  login = new Login(driver);
	  userManagement = new UserManagement(driver);
	  username = "Admin";
	  password = "admin123";
	  searchValue = "XYZ";
	  expectedValue = "No Records Found";
  }
  
  @Test
  public void TC002_Admin_SearchEmployee_NotExist_POM_TestScript() 
  {
	  //STEP 1
	  seleniumWrapper.launchBrowser(GlobalVariables.QA_URL);
	  
	  //STEP 2
	  login.loginOrange(username, password);
	  
	  //STEP 3
	  userManagement.validateLogged();
	  
	  //STEP 4
	  userManagement.clickAdmin();
	  
	  //STEP 5
	  //STEP 6
	  userManagement.searchUser(searchValue, true);
	  
	  //STEP 7
	  //userManagement.validateNotInTable(expectedValue);
	  userManagement.getValueFromTable("1","1");
	  
	  //STEP 8
	  login.logoutOrange();
  }

  @AfterTest
  public void afterTest() 
  {
	  //STEP 9
	  seleniumWrapper.closeBrowser();
  }

}
