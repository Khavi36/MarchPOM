package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.base.org.BaseClass;

public class PDPPageLocators extends BaseClass{
	public PDPPageLocators() {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//*[text()='Add to cart']")
private WebElement addToCartButton;


public WebElement addToCartButton() {
	return addToCartButton;
}
}
