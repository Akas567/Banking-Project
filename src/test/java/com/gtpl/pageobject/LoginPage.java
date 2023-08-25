package com.gtpl.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="uid")
	private WebElement username;


	@FindBy(name="password")
	private WebElement password;


	@FindBy(name="btnLogin")
	private WebElement LoginButton;


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void username(String user)
	{
		username.sendKeys(user);
	}

	public void password(String pass)
	{
		password.sendKeys(pass);
	}

	public void login()
	{
		LoginButton.click();
	}


}
