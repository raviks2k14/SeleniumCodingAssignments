package com.seleniumcodingassignments.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumcodingassignments.base.TestBase;
import com.seleniumcodingassignments.pages.HomePage;
import com.seleniumcodingassignments.pages.PropertyListPage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	PropertyListPage propertyListPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void init() {
		initialization();
		homePage = new HomePage();
	}

	@Test
	public void validateSearchTextBoxPresence() {
		Assert.assertTrue(homePage.validateSearchBoxPresence());
	}

	@Test
	public void feedPlaceNameToSearchTextBox() {
		String location = prop.getProperty("location");
		homePage.feedDataToTextBox(location);
		propertyListPage = homePage.clickSearchButton();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
