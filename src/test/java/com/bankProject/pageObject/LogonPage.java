package com.bankProject.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogonPage {

	private WebDriver driver;
	
	private WebDriverWait explecitWait;

	private By titleText;

	public LogonPage(WebDriver driver) {

		this.driver = driver;

		titleText = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee");
		
		explecitWait= new WebDriverWait(driver, 10);
	}
	
	public void confirmAlert() {

		explecitWait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
	}

	public void assertPage() {

		Assert.assertTrue(driver.findElement(titleText).getText().contains("Welcome To Manager's Page of GTPL Bank"));

	}

	

}
