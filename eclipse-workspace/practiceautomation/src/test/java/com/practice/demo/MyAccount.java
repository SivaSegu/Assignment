package com.practice.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	@FindBy(linkText="My Account")
	WebElement account;
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement passwordElement;
	@FindBy(name="login")
	WebElement loginBtnElement;
	@FindBy(xpath="//a[contains(text(),'Dashboard')]")
	WebElement dashBoard;
	
	public MyAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver = driver;
	}
	public void account() {
		account.click();
	}
	
	public void SetUserName(String userName)
	{
		username.sendKeys("segusivateja@gmail.com");
	}
	
	public void SetPassword(String password)
	{
		passwordElement.sendKeys("workfromhome12$");
	}
	
	public void LoginBtnClick()
	{
		loginBtnElement.click();
	}
	public void Dashboard()
	{
		dashBoard.click();
	}
}
