package com.castroantonio.selenium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumApplicationTests {

	// To avoid mixing Selenium and test code, we use the Page Object pattern.
	// A class that represents the oage we are testing
	private PageObject page;

	@BeforeEach
	public void beforeEachTest() {
		page = new PageObject();
	}

	@AfterEach
	public void afterEachTest() {
		page.closeBrowser();
	}

	@Test
	public void shouldFillTextBoxSubmitSeeResult() {
		String name = "Antonio Castro";

		page.fillForm(name);

		assertThat(page.getMessageOnPage(name).contentEquals("Hello " + name + "!!!"));
	}
}