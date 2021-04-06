package com.orangehrm.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base{

	@FindBy(id = "menu_admin_viewAdminModule")
	private WebElement navigationAdmin;
	
	@FindBy(id = "menu_admin_UserManagement")
	private WebElement navigationUserManagement;
	
	@FindBy(id = "menu_admin_viewSystemUsers")
	private WebElement navigationUsers;
	
	public HomePage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	/**
	 * Returns the Web Element of the Admin navigation in the home page.
	 * 
	 * @return navigationAdmin The web element for the Admin navigation.
	 */
	public WebElement getAdminNavigation() {
		return navigationAdmin;
	}
	
	/**
	 * Returns the Web Element of the Admin user management navigation in the home page.
	 * 
	 * @return navigationUserManagement The web element for the Admin user management navigation.
	 */
	public WebElement getAdminUserManagementNavigation() {
		return navigationUserManagement;
	}
	
	/**
	 * Returns the Web Element of the Admin user management users navigation in the home page.
	 * 
	 * @return navigationUsers The web element for the Admin user management users navigation.
	 */
	public WebElement getAdminUsersNavigation() {
		return navigationUsers;
	}
}
