package com.Mahmuda.PageAction;

import org.testng.Assert;

import com.Mahmuda.PageLocator.HomePageeeLocator;
import com.Mahmuda.Uuuil.TestBase_MD;




public class HomePageeeAction extends TestBase_MD{
	HomePageeeLocator homePageeeLocator= new HomePageeeLocator();
	
	
	public void EntersamsungtvinSearchField() {
		
		
		homePageeeLocator.Searchfield.sendKeys("samsung tv");
	}
	public void ClickonSearchLink() {
		homePageeeLocator.SearchLink.click();
	}

	public void Verifysearchresultdisplay() {
	boolean searchresult= homePageeeLocator.verifySearchResult.isDisplayed();
	Assert.assertTrue(searchresult);
	
	}

	public void ClickPCdeals () {
		homePageeeLocator.PCDeals.click();
	}
	
	}
	

