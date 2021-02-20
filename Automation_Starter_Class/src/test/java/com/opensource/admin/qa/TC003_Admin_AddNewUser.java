package com.opensource.admin.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC003_Admin_AddNewUser 
{
	  @BeforeTest
	  public void beforeTest() 
	  {
		  
		  // DATOS
	  }
	  
	  @Test
	  public void TC003_Admin_AddNewUser_TC() throws InterruptedException 
	  {
		  //DATA GENERATION
		  int random = (int)(Math.random()*1000);
		  String userName = "Leo" + random; 
		  
		  // STEP 1
		  Reporter.log("Open Browser \"OrangeHRM\" web page");
		  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  // STEP 2
		  Reporter.log("Enter Username and Password");
		  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  // STEP 3
		  Reporter.log("Validate that you have logged in successfully");
		  WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id = 'menu_admin_viewAdminModule']")));
		  
		  // STEP 4
		  Reporter.log("Click Admin - Go to the admin page");
		  driver.findElement(By.xpath("//a[@id = 'menu_admin_viewAdminModule']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  // STEP 5
		  Reporter.log("Click the -Add- button");
		  driver.findElement(By.xpath("//input[@id = 'btnAdd']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  // STEP 6
		  Reporter.log("Enter a valid Employee name");
		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id = 'frmSystemUser']")));
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@id = 'systemUser_employeeName_empName']")).sendKeys("Maggie Manning");
		  		  
		  // STEP 7
		  Reporter.log("Enter a valid username");
		  driver.findElement(By.xpath("//input[@id = 'systemUser_userName']")).sendKeys(userName);
		  
		  // STEP 8
		  Reporter.log("Enter a new password and confirmation password");
		  driver.findElement(By.xpath("//input[@id = 'systemUser_password']")).sendKeys("TxT @567!");
		  driver.findElement(By.xpath("//input[@id = 'systemUser_confirmPassword']")).sendKeys("TxT @567!");
		  
		  
		  // STEP 9
		  Reporter.log("Click Save");
		  WebDriverWait waitBeforeSave = new WebDriverWait(driver, 15);
		  waitBeforeSave.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='systemUser_password_strength_meter']")));
		  driver.findElement(By.xpath("//input[@id = 'btnSave']")).click();
				  
		  // STEP 10
		  Reporter.log("Search in the field -Username-");
		  WebDriverWait waitAfterSave = new WebDriverWait(driver, 15);
		  waitAfterSave.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchSystemUser_userName']")));
		  driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(userName);		  
		  
		  // STEP 11
		  Reporter.log("Click search");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@id = 'searchBtn']")).click();
		  
		  // STEP 12
		  Reporter.log("Verify the username exists in the table");
		  String actualUsername = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		  Assert.assertEquals(actualUsername, userName);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  // STEP 13
		  Reporter.log("Log out");
		  WebDriverWait waitUntilWelcomeAvl = new WebDriverWait(driver, 15);
		  waitUntilWelcomeAvl.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='panelTrigger']")));
		  //Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[@class='panelTrigger']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  WebDriverWait waitUntilClickWelcomeAvl = new WebDriverWait(driver, 15);
		  waitUntilClickWelcomeAvl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='panelTrigger activated-welcome']")));
		  WebDriverWait waitUntilLogOutAvl = new WebDriverWait(driver, 15);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  waitUntilLogOutAvl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Logout')]")));
		  driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
		  
		  // STEP 14
		  Reporter.log("Close Browser");
		  driver.close();
		  
		  //soft.assertAll();
	  }
	  
	  @AfterTest
	  public void afterTest() 
	  {
		  
	  }
}
