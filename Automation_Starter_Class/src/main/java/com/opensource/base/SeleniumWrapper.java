package com.opensource.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class SeleniumWrapper 
{
	private WebDriver driver;
	
	/*
	 * Constructor SeleniumWrapper
	 */
	
	public SeleniumWrapper(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/*
	 * Chrome driver connection
	 */
	
	public WebDriver chromeDriverConnection()
	{
		  System.setProperty(GlobalVariables.CHROME_DRIVER,GlobalVariables.PATH_CHROME_DRIVER);
		  driver = new ChromeDriver();
		  return driver;
	}
	
	/*
	 * Launch Browser
	 */
	
	public void launchBrowser(String url)
	{
		Reporter.log("Launching... "+url);  
		driver.get(url);
		driver.manage().window().maximize();
		implicitlyWait(5);
	}
	
	/*
	 * Reporter log
	 */
	
	public void reporterLog(String log)
	{
		Reporter.log(log);
	}
	
	/*
	 * Implicitly wait
	 */
	
	public void implicitlyWait(int seconds)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	/*
	 * Find element
	 */
	
	public WebElement findElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	/*
	 * Type method
	 */
	
	public void type(By locator, String inputText, String description)
	{
		System.out.println("Typing text: "+inputText+" "+description);
		driver.findElement(locator).sendKeys(inputText);
	}
	
	/*
	 * click Object
	 */
	
	public void click(By locator, String description)
	{
		System.out.println("Clicking... "+description);
		driver.findElement(locator).click();
	}
	
	/*
	 * Wait for Element Present
	 */
	
	public void waitForElementPresent(By locator, int timeout)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
			catch(TimeoutException e)
			{
				
			}
	}
	
	/*
	 * Get Text
	 */
	
	public String getText(By locator)
	{
		try
		{
			return driver.findElement(locator).getText();
		}
			catch(NoSuchElementException e)
			{
				return null;
			}
	}
	
	/*
	 * Assertion (Hard)
	 */
	
	public void assertEquals(String actualValue, String expectedValue)
	{
		try
		{
			Assert.assertEquals(actualValue, expectedValue);
		}
			catch(AssertionError e)
			{
				Assert.fail("Not able to assert Actual Value: "+actualValue+" Expected Value: "+expectedValue);
			}
	}
	
	/*
	 * Close browser
	 */
	
	public void closeBrowser() 
	{
		try
		{
			reporterLog("Close browser");
			driver.close();
		}
			catch(NoSuchSessionException e)
			{
				Assert.fail("Not able to close browser");
			}
	}
	
	/**
	 * Get Data from JSON file (1 Node)
	 * 
	 * @author Ricardo Avalos
	 * @param jsonFile, jsonObjName, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 */
	public String getJSONValue(String jsonFile, String jsonObjName, String jsonKey) throws FileNotFoundException {
		try {
 
			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFile + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
 
			// Get Data
			String jsonValue = (String) jsonObject.getJSONObject(jsonObjName).get(jsonKey);
			return jsonValue;
 
		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}
 
	/*
	 * Get Value from Excel
	 * @author Ricardo Avalos 
	 * @date 02/18/2021
	 */
	public String getCellData(String excelName, int row, int column) {
		try {
			// Reading Data
			FileInputStream fis = new FileInputStream(GlobalVariables.PATH_EXCEL_DATA+excelName+".xlsx");
			// Constructs an XSSFWorkbook object
			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			Row rowObj = sheet.getRow(row);
			Cell cell = rowObj.getCell(column);
			String value = cell.getStringCellValue();
			return value;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}
	}
	
	/*
	 * Get text from data table
	 * Author: Ricardo
	 */
	
	public String getValueFromTable(String row, String column)
	{
		try
		{
			return driver.findElement(By.xpath("//tbody/tr["+row+"]/td["+column+"]")).getText();
		}
			catch(NoSuchElementException e)
			{
				return null;
			}
	}
	
	
}
