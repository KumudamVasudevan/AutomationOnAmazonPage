package com.amazon.com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {
	WebDriver ldriver;
	public int TimeoutValue = 50;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, TimeoutValue),this);
	}

	@FindBy(id = "ap_email")
	@CacheLookup
	WebElement textUsrName;

	@FindBy(id = "ap_password")
	@CacheLookup
	WebElement password;

	@FindBy(id = "continue")
	WebElement continueBtn;

	@FindBy(id = "signInSubmit")
	WebElement signLogin;

	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement signIn;

	public void setSign() {
		signIn.click();
	}

	public void setUsrName(String usrName) {
		textUsrName.sendKeys(usrName);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickContinue() {
		continueBtn.click();
	}

	public void clickSubmit() {
		signLogin.click();
	}
}
