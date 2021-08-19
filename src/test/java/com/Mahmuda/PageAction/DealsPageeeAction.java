package com.Mahmuda.PageAction;

import org.testng.Assert;

import com.Mahmuda.PageLocator.DealsPageeeLocator;
import com.Mahmuda.Uuuil.TestBase_MD;

public class DealsPageeeAction extends TestBase_MD  {

	DealsPageeeLocator dealsPageeeLocator =new DealsPageeeLocator();
	
	public void ClickLaptopdeals() {
		dealsPageeeLocator.ClickLaptopdeals.click();
		
	}
	
	public void VerifyLaptopdealsdisplay() {
	boolean laptopdealsdisplay=	dealsPageeeLocator.VerifyLaptopdealsdisplay.isDisplayed();
		Assert.assertTrue(laptopdealsdisplay);
		
		
	}
	
	
}
