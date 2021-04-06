package com.automationpractice.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Navigation extends Base{
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement navTShirt;

	
	
	public Navigation() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	
	public WebElement getBtnNavTShirt() {
		return navTShirt;
	}
	
	
}
