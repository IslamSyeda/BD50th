package StepDefinationMD;

import com.Mahmuda.PageAction.HomePageeeAction;
import com.Mahmuda.Uuuil.TestBase_MD;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef_Homepeg extends TestBase_MD {
	
	HomePageeeAction homePageeAction= new HomePageeeAction();
	
	
	
	
	@Given("^Open Application \"([^\"]*)\"$")
	public void open_Application(String URL) throws Throwable {
		launchApplication(URL);
	}

	@Then("^Enter samsung tv in search field$")
	public void enter_samsung_tv_in_search_field() throws Throwable {
		homePageeAction.EntersamsungtvinSearchField();
	}

	@Then("^Click search$")
	public void click_search() throws Throwable {
		homePageeAction.ClickonSearchLink();
	}

	@Then("^Verify search result display$")
	public void Verify_search_result_display() throws Throwable {
		homePageeAction.Verifysearchresultdisplay();
	}


}
