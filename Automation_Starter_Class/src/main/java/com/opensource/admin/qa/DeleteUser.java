package com.opensource.admin.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class DeleteUser  extends SeleniumWrapper 
{
	By btn_mdl_delete = By.xpath("//input[@id = 'dialogDeleteBtn']");

	public DeleteUser(WebDriver driver) 
	{
		super(driver);
	}
	
	By modal_DeleteModal = By.xpath("//div[@id = 'deleteConfModal']");
	
	public void validateDeleteModal()
	{
		reporterLog("Validate the modal to delete the record is available");
		waitForElementPresent(modal_DeleteModal, 10);
	}
	
	public void mdl_delete_clickOk()
	{
		reporterLog("Click the ok button");
		click(btn_mdl_delete,"Click the delete button");
	}
	
}
