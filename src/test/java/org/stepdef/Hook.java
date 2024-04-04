package org.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;

	@Before
	public static void browserlaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	@After
	public static void close() {
		driver.close();
	}
	
	public void push()
	{
		// push code
	}
}
