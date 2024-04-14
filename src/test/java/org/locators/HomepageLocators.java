package org.locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.base.org.BaseClass;
public class HomepageLocators extends BaseClass{
	public HomepageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='✕']")
	private WebElement closeBtn;
	@FindBy(name="q")
	private WebElement searchInputField;
	
	
	public WebElement getCloseBtn() {
		return closeBtn;
	}
	
	public WebElement getSearchInputField() {
		return searchInputField;
	}
}
