package com.automationpractice.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressCheckoutPage {


	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement btnProceedToCheckout;
	
	@FindBy(css = "#address_invoice .address_city.address_state_name.address_postcode")
	private WebElement txtBillingAddress;
	
	
	

	public AddressCheckoutPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	public WebElement getBtnProceedToCheckout() {
		return btnProceedToCheckout;
	}
	
	public WebElement getAddressCityStatePostCode() {
		return txtBillingAddress;
	}
	
	
}
