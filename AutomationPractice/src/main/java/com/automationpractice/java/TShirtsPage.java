package com.automationpractice.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TShirtsPage extends Base{
	
	@FindBy(xpath = "//a[@title='Faded Short Sleeve T-shirts']/img")
	private WebElement imgTShirt;	
	
	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement btnAddToCart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement btnProceedToCheckout;
	
	@FindBy(css = ".available-now")
	private WebElement btnInStock;
	
	
	
	public TShirtsPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}
	
	public WebElement getBtnProceedToCheckout() {
		return btnProceedToCheckout;
	}
	
	/*public void getHoverTshirt(WebElement tshirt) {
		new Actions(Base.getDriver()).moveToElement(tshirt).build().perform();;
	}*/
	
	public void getHoverTshirt() {
		Base.actionClass(imgTShirt);
	}
	
	public WebElement getBtnInStock() {
		return btnInStock;
	}
	
	
	
	
	
	
	
	
	
	
	

}
