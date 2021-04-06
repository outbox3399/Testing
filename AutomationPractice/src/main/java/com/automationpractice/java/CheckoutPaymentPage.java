package com.automationpractice.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPaymentPage {

	
	@FindBy(css = ".bankwire")
	private WebElement bankWire;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement btnConfirmMyOrder;
	
	@FindBy(xpath = "//p[@class='cheque-indent']/strong")
	private WebElement msgOrderConfirmation;
	
	@FindBy(css = ".label.label-success")
	private WebElement btnInStock;
	
	

	public CheckoutPaymentPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	public WebElement getBtnBankWire() {
		return bankWire;
	}
	
	public WebElement getBtnConfirmMyOrder() {
		return btnConfirmMyOrder;
	}
	
	public WebElement getMsgOrderConfirmation() {
		return msgOrderConfirmation;
	}
	
	public WebElement getBtnInStock() {
		return btnInStock;
	}
}
