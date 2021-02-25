package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC004_Admin_DeleteUser_POM 
{
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	UserManagement userManagement;
	DeleteUser deleteUser;
	String username, password, userToDelete, expectedValue;

  @BeforeTest
  public void beforeTest() 
  {
	  seleniumWrapper = new SeleniumWrapper(driver);
	  driver = seleniumWrapper.chromeDriverConnection();
	  login = new Login(driver);
	  userManagement = new UserManagement(driver);
	  deleteUser = new DeleteUser(driver);
	  username = "Admin";
	  password = "admin123";
	  userToDelete = "Leo119";
	  expectedValue = "No Records Found";
  }
  
  @Test
  public void TC004_Admin_DeleteUser_POM_TestScript() 
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
	  userManagement.searchUser(userToDelete, true);
	  
	  //STEP 7 (STUB - Placebo, replace with a way to obtain it from case 3 or something like that)
	  userManagement.validateFromSearchTable(userToDelete);
	  
	  //STEP 8
	  //STEP 9
	  userManagement.SelectUserAndDelete();
	  
	  //STEP 10
	  deleteUser.validateDeleteModal();
	  
	  //STEP 11
	  deleteUser.mdl_delete_clickOk();
	  
	  //STEP 12
	  userManagement.searchUser(userToDelete, true);
	  userManagement.validateFromSearchTable(expectedValue,"1","1");
	  
	  //STEP 13
	  login.logoutOrange();
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  //STEP 14
	  seleniumWrapper.closeBrowser();
  }

}
