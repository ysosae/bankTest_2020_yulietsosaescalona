package com.bankProject.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bankProject.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void LoginTest() {

		driver.get(baseURl);

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		if (driver.getTitle().equals("Welcome To Manager's Page of GTPL Bank")) {

			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

	}

}
