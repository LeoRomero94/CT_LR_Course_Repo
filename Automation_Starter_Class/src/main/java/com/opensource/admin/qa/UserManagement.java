package com.opensource.admin.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class UserManagement extends SeleniumWrapper 
{

	public UserManagement(WebDriver driver) 
	{
		super(driver);
	}
	
	By link_admin = By.xpath("//a[@id = 'menu_admin_viewAdminModule']");
	By txt_search = By.xpath("//input[@id='searchSystemUser_userName']");
	By btn_search = By.xpath("//input[@id = 'searchBtn']");
	By btn_delete = By.xpath("//input[@id = 'btnDelete']");
	By tbl_firstRowSearch = By.xpath("//tbody/tr[1]/td[2]");
	By tbl_noRecordsFound = By.xpath("//tbody/tr[1]/td[1]");
	By cb_chkSelectAll = By.xpath("//input[@id = 'ohrmList_chkSelectAll']");
	
	/*
	 * Validate logged successfully.
	 */
	
	public void validateLogged()
	{
		reporterLog("Validate that you have logged in successfully");
		waitForElementPresent(link_admin, 10);
	}
	
	/*
	 * Click Admin
	 */
	
	public void clickAdmin()
	{
		reporterLog("Click Admin - Go to Admin page");
		click(link_admin,"Admin");
		implicitlyWait(5);
	}
	
	/*
	 * Search User
	 */
	
	public void searchUser(String user, boolean clickSearch)
	{
		reporterLog("Search username in field");
		type(txt_search, user, "Search field");
		if(clickSearch)
			{
				click(btn_search, "Button search");
			}
		implicitlyWait(5);
	}
	
	/*
	 * Select user
	 */
	
	public void SelectUserAndDelete()
	{
		reporterLog("Select the checkbox");
		click(cb_chkSelectAll, "Clicking the checkbox");
		click(btn_delete,"Clicking the delete button");
		implicitlyWait(5);
	}
	
	/*
	 * Validate value from search table.
	 */
	
	public void validateFromSearchTable(String expectedValue)
	{
		reporterLog("Verify username exist in table");
		String actualValue = getText(tbl_firstRowSearch);
		assertEquals(actualValue, expectedValue);
	}
	
	/*
	 * Validate this value is not found in the table.
	 */
	
	public void validateFromSearchTable(String expectedValue, String row, String column)
	{
		reporterLog("Verify username exist in table");
		String actualValue = getValueFromTable(row, column);
		assertEquals(actualValue, expectedValue);
	}
	
	/*
	 * Validate this value is not found in the table.
	 * Este es el mio
	 */
	
	public void validateNotInTable(String expectedValue)
	{
		reporterLog("Verify username does not exist in table");
		String actualValue = getText(tbl_noRecordsFound);
		assertEquals(actualValue, expectedValue);
	}
	
	public void selectUser()
	{
		reporterLog("Click on the 'Select all' checkbox to select the user");
		click(cb_chkSelectAll, "Select User");
		click(btn_delete, "Click Delete");
		implicitlyWait(5);
	}
	

}
