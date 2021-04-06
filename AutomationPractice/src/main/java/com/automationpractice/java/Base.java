package com.automationpractice.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	private static WebDriver driver;
	private static final int GLOBAL_WAIT = 90;
	private static Properties myProperties;
	private static String directoryPath = System.getProperty("user.dir");

	public Base() {
		if (driver == null) {
			readConfiguration();
			initWebDriver();
			openUrl();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	}

	public static void initWebDriver() {

		String browser = getConfig("browser") != null ? getConfig("browser") : "firefox";

		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			// System.setProperty("webdriver.chrome.driver", directoryPath +
			// "/Drivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
			// System.setProperty("webdriver.gecko.driver", directoryPath +
			// "/Drivers/geckodriver");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "ie":
			System.setProperty("webdriver.chrome.driver", "Drivers/IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		default:
			driver = null;
		}

	}

	/**
	 * 
	 * To get the web driver
	 */
	public static WebDriver getDriver() {
		return driver;
	}

	/**
	 * 
	 * To get the url of the application
	 */
	public void openUrl() {
		driver.get(getConfig("url"));
	}

	/**
	 * 
	 * To get property file
	 */
	public static String getConfig(String key) {
		return myProperties.getProperty(key);
	}

	/**
	 * 
	 * To get the current url of the application
	 */
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * 
	 * To logout from the application
	 */
	public void userLogout() {

	}

	@SuppressWarnings("unchecked")
	private static void readConfiguration() {
		String jsonFilePath = directoryPath + "/src/test/java/com/automationpractice/jsonfile/configuration.json";
		File configuration = new File(jsonFilePath);
		myProperties = new Properties();
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader(configuration));
			JSONObject configObj = (JSONObject) obj;
			for (Iterator<String> i = configObj.keySet().iterator(); i.hasNext();) {
				String key = i.next();
				myProperties.setProperty(key, (String) configObj.get(key));
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * 
	 * To close the application and browser
	 */
	public static void closeApp() {
		driver.close();
		driver.quit();
		driver = null;
	}

	/**
	 * 
	 * To wait for stipulated time in the page
	 */
	public static void pause() {
		try {
			Thread.sleep(900);
		} catch (Exception e) {
		}
	}

	/**
	 * 
	 * To refresh the page
	 */
	public static void pagerefresh() {
		driver.navigate().refresh();

	}

	/**
	 * 
	 * To wait for stipulated time in the page till the web element appears
	 */
	public static void pause(WebElement element) {
		try {
			WebDriverWait waitobj = new WebDriverWait(driver, GLOBAL_WAIT);
			waitobj.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * To mouse hover to the web element 
	 */
	public static void actionClass(WebElement mouseHoverElement) {
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHoverElement).build().perform();
		

	}
	
	/**
	 * 
	 * To scroll to the particular web element 
	 */
	public static void scrollByVisibleElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	
	
	
	
	
	
	
	
}