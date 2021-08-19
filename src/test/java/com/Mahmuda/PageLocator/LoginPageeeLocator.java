package com.Mahmuda.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Mahmuda.Uuuil.TestBase_MD;


	
		public class LoginPageeeLocator extends TestBase_MD{

			public LoginPageeeLocator() {
			PageFactory.initElements(driver, this);
				
				}
			@FindBy(how=How.XPATH  , using="//input[@class='mh-search-input']")
			public WebElement Searchfield;
	}

