package com.seleniumcodingassignments.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumcodingassignments.base.TestBase;


public class HomePage extends TestBase {

	@FindBy(id = "search-input-location")
	WebElement searchBox;

	@FindBy(id = "search-submit")
	WebElement searchButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateSearchBoxPresence() {
		return searchBox.isDisplayed();
	}

	public void feedDataToTextBox(String textBoxStr) {
		searchBox.sendKeys(textBoxStr);
	}

	public PropertyListPage clickSearchButton() {
		searchButton.click();
		return new PropertyListPage();
	}
}
