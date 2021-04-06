package com.orangehrm.java;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class UsersPage {

	
	@FindBy(xpath = "//input[@name='btnAdd']")
	private WebElement btnAdd;
	
	@FindBy(id = "btnDelete")
	private WebElement btnDelete;
	
	@FindBy(name = "systemUser[userType]")
	private WebElement selectUserRole;
	
	@FindBy(name = "systemUser[employeeName][empName]")
	private WebElement txtEmployeeName;
	
	@FindBy(name = "systemUser[userName]")
	private WebElement txtUserName;
	
	@FindBy(name = "systemUser[userName]")
	private WebElement selectStatus;
	
	@FindBy(name = "systemUser[password]")
	private WebElement txtPassword;
	
	@FindBy(name = "systemUser[confirmPassword]")
	private WebElement txtConfirmPassword;
	
	@FindBy(name = "btnSave")
	private WebElement btnSave;
	
	@FindBy(name = "searchSystemUser[userName]")
	private WebElement searchUserName;
	
	@FindBy(id = "searchBtn")
	private WebElement btnSearch;
	
	@FindBy(id = "ohrmList_chkSelectAll")
	private WebElement chkSelectAllUsers;
	
	@FindBy(id = "dialogDeleteBtn")
	private WebElement btnDeleteRecordConfirmPopupOk;
	
	@FindBy(xpath = "//div[@class='message success fadable']")
	private WebElement msgSuccessfulDeletion;
	
	@FindBys({ @FindBy(xpath = "//div[@id='tableWrapper']/table/tbody/tr/td[2]") })
	private List<WebElement> lstUserNames;
	
	public UsersPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
}
