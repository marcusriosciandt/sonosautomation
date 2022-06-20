package com.sonos.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.sonos.core.DriverFactory;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;*/



//import io.cucumber.core.runner.*;
//import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = { //"src/test/java/com/sonos/brandassets",
					 "src/test/java/com/sonos/generalinformation",
//					 "src/test/java/com/sonos/integrationsresources",
//					 "src/test/java/com/sonos/localizationresources",
//					 "src/test/java/com/sonos/qualityassurance",
//					 "src/test/java/com/sonos/sonosmusicapi"
			
							},
		glue = { 
//				"com.sonos.brandassets",
				"com.sonos.generalinformation",
//				"com.sonos.integrationsresources",
//				"com.sonos.localizationresources",
//				"com.sonos.qualityassurance",
//				"com.sonos.sonosmusicapi"
				},
		monochrome = true, //remove os caracteres especiais
		//snippets = SnippetType.CAMELCASE, //Gera os métodos com letra iniciais maiusculas ao invés dos _
		//plugin = {"json:json/cucumber.json"}
		//plugin = "html:target/cucumber-reports",
		
		plugin = {"json:target/cucumber-report/cucumber.json"},
		tags = "@test1"
			)
		// tags = {//"~@ignore"}
		// tags = {"@test1, @test2"} -> roda os cenários que possuem as duas tags
		
			

public class RunnerTest {
	
	@BeforeClass
	public static void OpenDriver() {
		DriverFactory.startDriver();
	}
	

	@AfterClass
	public static void CloseDriver() {
		DriverFactory.killDriver();
	}
}
