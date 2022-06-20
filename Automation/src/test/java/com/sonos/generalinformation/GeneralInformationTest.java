package com.sonos.generalinformation;

import com.sonos.core.BasePage;
import com.sonos.core.DashboardPage;
import com.sonos.core.DriverFactory;
import com.sonos.core.ElementsCore;
import com.sonos.core.GetStartedPage;
import com.sonos.core.LoginPage;

//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GeneralInformationTest extends DriverFactory {
	
	public GeneralInformationTest() {
		super();
	}
	
	BasePage pageSonos = new BasePage();
	LoginPage loginSonos = new LoginPage();
	GeneralInformationPage GenInfSonos = new GeneralInformationPage();
	GetStartedPage GetStSonos = new GetStartedPage();
	DashboardPage DashSonos = new DashboardPage();
	
	
	
	@Given("I am a partner")
	public void i_am_a_partner() {
	    pageSonos.logarPartner();
	    DashSonos.ClickBtnManageUnderReview();
	    
	}

	@And("I access session General Information")
	public void i_access_session_general_information() {
	    
	}

	@And("I dont fill the fields")
	public void i_dont_fill_the_fields() {
	   
	}

	@When("I try to save")
	public void i_try_to_save() {
	   
	}

	@Then("valid that there is mandatory fields")
	public void valid_that_there_is_mandatory_fields() {
	  
	}

	@And("^I access subsection WebSite$")
	public void iAccessSubsectionWebSite() throws Throwable {
		
	}
	
	@Then("valid that there is mandatory fields in the session WebSite")
	public void valid_that_there_is_mandatory_fields_in_the_session_web_site() {
	   
	}


}
