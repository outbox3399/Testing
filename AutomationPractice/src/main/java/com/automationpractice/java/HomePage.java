package com.automationpractice.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base{

	@FindBy(css = ".login")
	private WebElement btnSignIn;
	
	@FindBy(css = ".logout")
	private WebElement btnSignOut;
	
	
	public HomePage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	/**
	 * Returns the Web Element of the sign in button in the home page.
	 * 
	 * @return btnSignIn The web element for the sign in button.
	 */
	public WebElement getBtnSignIn() {
		return btnSignIn;
	}
	
	/**
	 * Returns the Web Element of the signout button in the home page.
	 * 
	 * @return btnSignOut The web element for the signout button.
	 */
	public WebElement getBtnSignOut() {
		return btnSignOut;
	}
	
}
