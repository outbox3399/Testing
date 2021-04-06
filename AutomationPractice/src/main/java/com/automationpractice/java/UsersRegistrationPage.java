package com.automationpractice.java;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class UsersRegistrationPage extends Base{

	
	@FindBy(css = "#email_create")
	private WebElement txtEmailAddressCreateAnAccount;
	
	@FindBy(id = "SubmitCreate")
	private WebElement btnCreateAnAccount;
	
	@FindBy(id = "uniform-id_gender1")
	private WebElement rdoTitleMr;
	
	@FindBy(id = "uniform-id_gender2")
	private WebElement rdoTitleMrs;
	
	@FindBy(css = "#customer_firstname")
	private WebElement txtFirstName;
	
	@FindBy(css = "#customer_lastname")
	private WebElement txtLastName;
	
	@FindBy(css = "#email")
	private WebElement txtEmail;
	
	@FindBy(css = "#passwd")
	private WebElement txtPassword;
	
	@FindBy(css = "#days")
	private WebElement selectDOBDays;
	
	@FindBy(css = "#months")
	private WebElement selectDOBMonths;
	
	@FindBy(css = "#years")
	private WebElement selectDOBYears;
	
	@FindBy(css = ".required.form-group #firstname")
	private WebElement txtYourAddressFirstName;
	
	@FindBy(css = ".required.form-group #lastname")
	private WebElement txtYourAddressLastName;
	
	@FindBy(css = "#company")
	private WebElement txtYourAddressCompany;
	
	@FindBy(css = "#address1")
	private WebElement txtYourAddressAddress1;
	
	@FindBy(css = "#address2")
	private WebElement txtYourAddressAddress2;
	
	@FindBy(css = "#city")
	private WebElement txtYourAddressCity;
	
	@FindBy(css = "#id_state")
	private WebElement selectYourAddressState;
	
	@FindBy(css = "#postcode")
	private WebElement txtYourAddressZipCode;
	
	@FindBy(css = "#id_country")
	private WebElement selectYourAddressCountry;
	
	@FindBy(css = "#phone")
	private WebElement txtYourAddressHomePhone;
	
	@FindBy(css = "#phone_mobile")
	private WebElement txtYourAddressMobilePhone;
	
	@FindBy(css = "#alias")
	private WebElement txtYourAddressAlias;
	
	@FindBy(id = "submitAccount")
	private WebElement btnRegister;
	
	@FindBy(css = ".info-account")
	private WebElement msgAccountSuccessfulCreation;
	
	
	public UsersRegistrationPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	public void setEmailAddressCreateAnAccount(String emailAddress) {
		this.txtEmailAddressCreateAnAccount.clear();
		this.txtEmailAddressCreateAnAccount.sendKeys(emailAddress);
	}
	
	public WebElement getBtnCreateAnAccount() {
		return btnCreateAnAccount;
	}
	
	public WebElement getRadioBtnTitleMr() {
		return rdoTitleMr;
	}
	
	public WebElement getRadioBtnTitleMrs() {
		return rdoTitleMrs;
	}
	
	public void setFirstName(String firstName) {
		this.txtFirstName.clear();
		this.txtFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		this.txtLastName.clear();
		this.txtLastName.sendKeys(lastName);
	}
	
	public void setEmail(String email) {
		this.txtEmail.clear();
		this.txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.txtPassword.clear();
		this.txtPassword.sendKeys(password);
	}
	
	public void setDOBDays(String days) {
		new Select(selectDOBDays).selectByValue(days);
	}
	
	public void setDOBMonth(String month) {
		new Select(selectDOBMonths).selectByValue(month);
	}
	
	public void setDOBYear(String year) {
		new Select(selectDOBYears).selectByValue(year);
	}
	
	public void setYourAddreddFirstName(String firstName) {
		this.txtYourAddressFirstName.clear();
		this.txtYourAddressFirstName.sendKeys(firstName);
	}
	
	public void setyourAddressLastName(String lastName) {
		this.txtYourAddressLastName.clear();
		this.txtYourAddressLastName.sendKeys(lastName);
	}
	
	public void setYourAddressCompany(String company) {
		this.txtYourAddressCompany.clear();
		this.txtYourAddressCompany.sendKeys(company);
	}
	
	public void setYourAddressLine1(String address1) {
		this.txtYourAddressAddress1.clear();
		this.txtYourAddressAddress1.sendKeys(address1);
	}
	
	public void setYourAddressLine2(String address2) {
		this.txtYourAddressAddress2.clear();
		this.txtYourAddressAddress2.sendKeys(address2);
	}
	public void setYourAddressCity(String city) {
		this.txtYourAddressCity.clear();
		this.txtYourAddressCity.sendKeys(city);
	}
	
	public void setYourAddressState(String state) {
		new Select(selectYourAddressState).selectByVisibleText(state);
	}
	
	public void setYourAddressZipCode(String zipcode) {
		this.txtYourAddressZipCode.clear();
		this.txtYourAddressZipCode.sendKeys(zipcode);
	}

	public void setYourAddressCountry(String country) {
		new Select(selectYourAddressCountry).selectByVisibleText(country);
	}
	
	public void setYourAddressHomePhone(String homephone) {
		this.txtYourAddressHomePhone.clear();
		this.txtYourAddressHomePhone.sendKeys(homephone);
	}
	
	public void setYourAddressMobilePhone(String mobilePhone) {
		this.txtYourAddressMobilePhone.clear();
		this.txtYourAddressMobilePhone.sendKeys(mobilePhone);
	}
	
	public void setAssignAnAddress(String assignAddress) {
		this.txtYourAddressAlias.clear();
		this.txtYourAddressAlias.sendKeys(assignAddress);
	}
	
	public WebElement getBtnRegister() {
		return btnRegister;
	}
	
	public WebElement getMsgAccountSuccessfulCreationMessage() {
		return msgAccountSuccessfulCreation;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
