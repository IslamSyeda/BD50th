package StepDefinationMD;

import com.Mahmuda.PageAction.DealsPageeeAction;
import com.Mahmuda.PageAction.HomePageeeAction;
import com.Mahmuda.PageLocator.HomePageeeLocator;
import com.Mahmuda.Uuuil.TestBase_MD;

import cucumber.api.java.en.Then;

public class StepDef_Deals extends TestBase_MD{
	
	HomePageeeAction homePageeAction= new HomePageeeAction();
	
	DealsPageeeAction dealsPageeeAction=new DealsPageeeAction();
	
	
	
	@Then("^Click PC deals$")
	public void click_PC_deals() throws Throwable {
		homePageeAction.ClickPCdeals();
	}

	@Then("^Click Laptop deals$")
	public void click_Laptop_deals() throws Throwable {
		dealsPageeeAction.ClickLaptopdeals();
	}

	@Then("^Verify Laptop deals display$")
	public void verify_Laptop_deals_display() throws Throwable {
	    
		dealsPageeeAction.VerifyLaptopdealsdisplay();
	}


}
