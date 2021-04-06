package com.automationpractice.junittest;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.automationpractice.java.AddressCheckoutPage;
import com.automationpractice.java.Base;
import com.automationpractice.java.CheckoutPaymentPage;
import com.automationpractice.java.HomePage;
import com.automationpractice.java.Navigation;
import com.automationpractice.java.ShippingCheckoutPage;
import com.automationpractice.java.SummaryCheckoutPage;
import com.automationpractice.java.TShirtsPage;
import com.automationpractice.java.UsersRegistrationPage;

public class UserRegistrationTest {
	private static UsersRegistrationPage UsersRegistrationPage;
	private static HomePage homePage;
	private String randomText;
	private static TShirtsPage tshirtPage;
	private static Navigation navigation;
	public static SummaryCheckoutPage summaryCheckoutPage;
	public static AddressCheckoutPage addressCheckoutPage;
	public static ShippingCheckoutPage shippingCheckoutPage;
	public static CheckoutPaymentPage checkoutPaymentPage;

	int length = 6;
	boolean useLetters = true;
	boolean useNumbers = false;
	String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

	@BeforeClass
	public static void start() {
		UsersRegistrationPage = new UsersRegistrationPage();
		homePage = new HomePage();
		tshirtPage = new TShirtsPage();
		navigation = new Navigation();
		summaryCheckoutPage = new SummaryCheckoutPage();
		addressCheckoutPage = new AddressCheckoutPage();
		shippingCheckoutPage = new ShippingCheckoutPage();
		checkoutPaymentPage = new CheckoutPaymentPage();
	}

	@Before
	public void setup() {
		Base.pause();

	}

	@AfterClass
	public static void tearDown() {
		Base.closeApp();
	}

	@Test
	public void verifyUserIsRegisteredSuccessfully() {

		randomText = RandomStringUtils.randomAlphanumeric(6);
		String msgSuccessfulAccountCreation = "Welcome to your account. Here you can manage all of your personal information and orders.";

		homePage.getBtnSignIn().click();

		/* user registers in an application */
		UsersRegistrationPage.setEmailAddressCreateAnAccount(randomText + "@gmail.com");
		UsersRegistrationPage.getBtnCreateAnAccount().click();

		UsersRegistrationPage.getRadioBtnTitleMr().click();
		UsersRegistrationPage.setFirstName("firstName" + generatedString);
		UsersRegistrationPage.setLastName("lastName" + generatedString);
		UsersRegistrationPage.setPassword("123456789");
		UsersRegistrationPage.setDOBDays("2");
		UsersRegistrationPage.setDOBMonth("12");
		UsersRegistrationPage.setDOBYear("2000");
		UsersRegistrationPage.setYourAddreddFirstName("firstName" + generatedString);
		UsersRegistrationPage.setyourAddressLastName("lastName" + generatedString);
		UsersRegistrationPage.setYourAddressCompany("Hexaware");
		UsersRegistrationPage.setYourAddressLine1("4709 TRIBECA LN APT 3103");
		UsersRegistrationPage.setYourAddressCity("PLANO");
		UsersRegistrationPage.setYourAddressState("Texas");
		UsersRegistrationPage.setYourAddressZipCode("75025");
		UsersRegistrationPage.setYourAddressCountry("United States");
		UsersRegistrationPage.setYourAddressHomePhone("8989565623");
		UsersRegistrationPage.setYourAddressMobilePhone("8526352415");
		UsersRegistrationPage.setAssignAnAddress("Alias" + randomText);
		UsersRegistrationPage.getBtnRegister().click();

		Base.pause();

		Assert.assertEquals("Failed : Account is not created successfully", msgSuccessfulAccountCreation,
				UsersRegistrationPage.getMsgAccountSuccessfulCreationMessage().getText());

		/* Product Selection */
		navigation.getBtnNavTShirt().click();
		tshirtPage.getHoverTshirt();
		tshirtPage.getBtnAddToCart().click();
		tshirtPage.getBtnProceedToCheckout().click();

		/* User check/Update Address */
		String deliveryAddress1 = "4709 TRIBECA LN APT 3103";
		String invoiceAddress1 = "4709 TRIBECA LN APT 3103";
		String billingAddress = "PLANO, Texas 75025";
		String orderConfirmationMessage = "Your order on My Store is complete.";
		
		Assert.assertEquals("Failed : Delivery address1 is wrong", deliveryAddress1,
				summaryCheckoutPage.getTxtDeliveryAddress1().getText());
		Assert.assertEquals("Failed : Invoice address1 is wrong", invoiceAddress1,
				summaryCheckoutPage.getTxtInvoiceAddress1().getText());
		
		summaryCheckoutPage.getBtnProceedToCheckout().click();
		
		Assert.assertEquals("Failed : Billing address1 is wrong", billingAddress,
				addressCheckoutPage.getAddressCityStatePostCode().getText());
		
		addressCheckoutPage.getBtnProceedToCheckout().click();
		
		shippingCheckoutPage.getcheckboxTermsOfService().click();
		shippingCheckoutPage.getBtnProceedToCheckout().click();
		
		/*Payment*/
		Base.scrollByVisibleElement(checkoutPaymentPage.getBtnInStock());
		checkoutPaymentPage.getBtnBankWire().click();
		checkoutPaymentPage.getBtnConfirmMyOrder().click();
		
		Assert.assertEquals("Failed : Unable to place order", orderConfirmationMessage,
				checkoutPaymentPage.getMsgOrderConfirmation().getText());

	}

}
