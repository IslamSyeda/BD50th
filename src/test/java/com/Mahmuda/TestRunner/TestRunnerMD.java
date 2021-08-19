package com.Mahmuda.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Mahmuda.Uuuil.TestBase_MD;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		
		features= {"src\\test\\resources\\Feauuture"}, 

		plugin = {"json:target/cucumber.json"},
		glue ="StepDefinationMD", tags ={" @TD,@TN"})

public class TestRunnerMD extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void LaunchApplicationURL() {
		TestBase_MD lunch= new 	TestBase_MD();
		lunch.intialize();
	}

@AfterTest
public void CloseApplicationURL() {
	TestBase_MD lunch= new 	TestBase_MD();
	lunch.driver.quit();
	
}

}
