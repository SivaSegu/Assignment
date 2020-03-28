package com.practice.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginUiTesting {
	WebDriver driver;
	MyAccount MyAccount;
	TestCases TestCases;

	@BeforeSuite
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C://Cts//chromedriver.exe");
	}
	@BeforeTest
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		MyAccount=new MyAccount(driver);
		TestCases=new TestCases(driver);
}
	@Test(priority=1)
	public void Myaccount() {
//		driver.findElement(By.linkText("My Account")).click();
//		driver.findElement(By.id("username")).sendKeys("segusivateja@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("workfromhome12$");
//		driver.findElement(By.name("login")).click();
//		driver.findElement(By.linkText("Dashboard")).click();
		MyAccount.account();
		MyAccount.SetUserName("username");
		MyAccount.SetPassword("password");
		MyAccount.LoginBtnClick();
		MyAccount.Dashboard();
	}
	
	@Test(priority=2)
	public void testcases() {
//		driver.findElement(By.linkText("Test Cases")).click();
//		driver.findElement(By.xpath("//div[@id='accordion-222-sub_row_1-0-1-0-0']//li[2]//div[1]"));  
		TestCases.open();
		TestCases.SelectTestCase();
	}
}