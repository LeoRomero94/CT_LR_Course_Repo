package com.opensource.admin.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class Login extends SeleniumWrapper 
{
	/*
	 * Constructor
	 */
	
	public Login(WebDriver driver) {
		super(driver);
	}
	By txt_username = By.xpath("//input[@id='txtUsername']");
	By txt_password = By.xpath("//input[@id='txtPassword']");
	By btn_login = By.xpath("//input[@id='btnLogin']");
	By btn_welcome = By.xpath("//a[@id='welcome']");
	By btn_logout = By.xpath("//a[contains(text(), 'Logout')]");
	  
	  /*
	   * Login Orange opensource
	   * @Author Leonardo Romero
	   * @date 20/02/2021
	   */
	
	public void loginOrange(String username, String password)
	{
		reporterLog("Login into Orange open source");
		waitForElementPresent(txt_username, 10);
		type(txt_username, username, "Username text field");
		type(txt_password, password, "Username text field");
		click(btn_login, "Button Login");
		implicitlyWait(5);
	}
	
	  /*
	   * Logout Orange opensource
	   * @Author Leonardo Romero
	   * @date 20/02/2021
	   */
	
	public void logoutOrange()
	{
		reporterLog("Logout of the Orange open source");
		//TRAERLO DE TC001 O EL 3 QUE ME FUNCIONÓ MEJOR...
		  click(btn_welcome, "Button for user value");
		  click(btn_logout, "Button for logout");
	}
}
