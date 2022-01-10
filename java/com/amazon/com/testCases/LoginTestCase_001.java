package com.amazon.com.testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.com.pageObjects.LoginPage;
import com.amazon.com.utility.ScreenRecorderUtil;

public class LoginTestCase_001 extends TC_BaseClass {

	@Test
	public void loginTest() throws Exception {
		driver.get(baseURL);
		LoginPage loginObj = new LoginPage(driver);
		driver.manage().window().maximize();
		loginObj.setUsrName(usrName);
		logger.info("User Name Entered" + usrName);
		loginObj.clickContinue();
		driver.manage().window().maximize();
		loginObj.setPassword(password);
		logger.info("Password Entered" + password);
		driver.manage().window().fullscreen();

		loginObj.clickSubmit();

		if (driver.getTitle().equals(
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

	// @Test
	void verifyLinks() throws Exception {
		ScreenRecorderUtil.startRecord("CheckingLinks");

		// Apparel
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		System.out.println(driver.getTitle());
		ScreenRecorderUtil.stopRecord();

	}
	/*
	 * @Test(dataProvider="data-provider")
	 * 
	 * public void withParameterTest(String param) { System.out.println("param"); }
	 * 
	 * //Enter your email or mobile phone number
	 * 
	 * @DataProvider(name="data-provider") public Object getData() { return new
	 * Object[][] { {"usrName"," "},{"usrName"," "}}; }
	 */
}
