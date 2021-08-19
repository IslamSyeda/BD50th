package com.Mahmuda.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Mahmuda.Uuuil.TestBase_MD;

public class DealsPageeeLocator extends TestBase_MD {
	public DealsPageeeLocator() {
		PageFactory.initElements(driver, this);
			
			}
	@FindBy(how=How.XPATH, using="//*[@id=\"sd-navbar\"]/div/nav/div[2]/a")
	public WebElement ClickLaptopdeals;
	
	@FindBy(how=How.XPATH, using="//h1[text()='Laptop Deals']")
	public WebElement VerifyLaptopdealsdisplay;
}
