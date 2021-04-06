package com.orangehrm.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

	@FindBy(id = "txtUsername")
	private WebElement txtUsername;

	@FindBy(id = "txtPassword")
	private WebElement txtPassword;

	@FindBy(id = "btnLogin")
	private WebElement btnLogin;

	public LoginPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	/**
	 * Returns the Web Element of the name field in the login page.
	 * 
	 * @return txtUsername The web element for the user name.
	 */
	public WebElement getTxtUsername() {
		return txtUsername;
	}

	/**
	 * Enters text to name field in the login page
	 * 
	 * @param txtUsername
	 *            The web element for the name
	 */
	public void setTxtUsername(String txtUsername) {
		this.txtUsername.clear();
		this.txtUsername.sendKeys(txtUsername);
	}

	/**
	 * Returns the Web Element of the password field in the login page.
	 * 
	 * @return txtPassword The web element for the password.
	 */
	public WebElement getTxtPassword() {
		return txtPassword;
	}

	/**
	 * Enters text to password field in the login page
	 * 
	 * @param txtPassword
	 *            The web element for the password
	 */
	public void setTxtPassword(String txtPassword) {
		this.txtPassword.clear();
		this.txtPassword.sendKeys(txtPassword);
	}

	/**
	 * Clicks the login button in the login page.
	 */
	public void clickLogin() {
		btnLogin.click();
	}

	/**
	 * Login into the application
	 * 
	 */
	public void login() {
		txtUsername.sendKeys(getConfig("username"));
		txtPassword.sendKeys(getConfig("password"));
		clickLogin();
	}
}