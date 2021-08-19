package com.Mahmuda.PageLocator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import com.Mahmuda.Uuuil.TestBase_MD;



	public class HomePageeeLocator extends TestBase_MD{

		public HomePageeeLocator() {
		PageFactory.initElements(driver, this);
			
			}
	
	@FindBy(how=How.XPATH  , using="//input[@class='mh-search-input']")
	public WebElement Searchfield;
		
	
	@FindBy(how=How.XPATH  , using="//span[@class='mh-search-button-label']")
	public WebElement SearchLink;
	
	@FindBy(how=How.XPATH  , using="//h2[@class='direct-content__title']")
	public WebElement verifySearchResult;
	
	@FindBy(how=How.LINK_TEXT , using="PC Deals")
	public WebElement PCDeals;
	
	
	
	
	
}
