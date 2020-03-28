package com.practice.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCases extends BasePage {
	@FindBy(linkText="Test Cases")
	WebElement TestCases;
	@FindBy(xpath="//div[@id='accordion-222-sub_row_1-0-1-0-0']//li[2]//div[1]")
	WebElement SelectTestCase;
	public TestCases(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void open() {
		TestCases.click();
	}
	public void SelectTestCase() {
		SelectTestCase.click();
	}
	
}
