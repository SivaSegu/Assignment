package com.practice.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	@FindBy(linkText="Test Cases")
	WebElement Testcases;
	@FindBy(linkText="AT Site")
	WebElement Atsite;
	@FindBy(linkText="Shop")
	WebElement Shop;
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
//		this.driver = driver;
	}
	public void testcases() {
		Testcases.click();
	}
	public void atsite() {
		Atsite.click();
	}
	public void shop() {
		Shop.click();
	}

}
