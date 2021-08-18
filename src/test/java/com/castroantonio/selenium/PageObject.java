package com.castroantonio.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {

	private WebDriver browser;
	private final String MAIN_PAGE = "http://localhost:8080";

	public PageObject() {
		// sets where did you put the web browser driver in your project
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		browser = new ChromeDriver();
		browser.navigate().to(MAIN_PAGE);
	}

	public void closeBrowser() {
		browser.quit();
	}

	public void fillForm(String name) {
		// ZK framework generates different new ID for HTML pages each time it runs, so
		// we have to use class or other ways
		browser.findElement(By.className("z-textbox")).sendKeys(name);
	}

	public void submitForm() {
		browser.findElement(By.className("z-button")).click();
	}

	public String getMessageOnPage(String name) {
		return browser.findElement(By.className("z-label")).getText();
	}
}