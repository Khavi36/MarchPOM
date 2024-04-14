package org.pages;

import org.junit.Assert;
import org.locators.PLPPageLocators;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import util.base.org.BaseClass;

public class PLPPage extends BaseClass {
	public static void verifyUserRedirectsToPLPPage() {
		try {
			WebElement sortBy = new PLPPageLocators().getSortBy();
			if(sortBy.isDisplayed()) {
				System.out.println("User redirects to PLPPage");
			}
		} catch(NoSuchElementException e) {
			Assert.fail("User doesn't redirects to PLPPage");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void clickOnFirstProduct() {
		try {
			WebElement ele = new PLPPageLocators().getRedmiMob();
			click(ele);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
