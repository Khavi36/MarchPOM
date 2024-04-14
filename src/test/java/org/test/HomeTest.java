package org.test;

import org.junit.Test;
import org.pages.HomePage;
import org.pages.PLPPage;

import util.base.org.BaseClass;

public class HomeTest extends BaseClass{
	@Test 
	public void validateUserAbleToAddProductIntoTheCart() throws Exception {
		
		String data = getTestData("SearchData");
		
		HomePage.testSetup();
		HomePage.clickOnCloseButton();
		HomePage.searchData(data);
		PLPPage.verifyUserRedirectsToPLPPage();
		PLPPage.clickOnFirstProduct();
	
}
}
