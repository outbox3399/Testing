package com.automationpractice.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingCheckoutPage {

	
	@FindBy(css = "#cgv")
	private WebElement checkboxTermsOfService;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement btnProceedToCheckout;
	
	
	

	public ShippingCheckoutPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	public WebElement getcheckboxTermsOfService() {
		return checkboxTermsOfService;
	}
	
	public WebElement getBtnProceedToCheckout() {
		return btnProceedToCheckout;
	}
}
