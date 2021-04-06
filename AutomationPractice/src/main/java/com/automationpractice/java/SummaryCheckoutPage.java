package com.automationpractice.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryCheckoutPage {
	
	
	@FindBy(xpath = "//p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")
	private WebElement btnProceedToCheckout;
	
	@FindBy(xpath = "(//span[@class='address_address1'])[1]")
	private WebElement txtDeliveryAddress1;
	
	@FindBy(xpath = "(//span[@class='address_address1'])[2]")
	private WebElement txtInvoiceAddress1;
	
	
	

	public SummaryCheckoutPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	public WebElement getBtnProceedToCheckout() {
		return btnProceedToCheckout;
	}

	public WebElement getTxtDeliveryAddress1() {
		return txtDeliveryAddress1;
	}
	

	public WebElement getTxtInvoiceAddress1() {
		return txtInvoiceAddress1;
	}
}
