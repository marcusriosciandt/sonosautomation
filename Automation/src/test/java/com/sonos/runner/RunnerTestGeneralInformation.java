package com.sonos.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.sonos.core.DriverFactory;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = { "src/test/java/com/sonos/generalinformation"},
		glue = { "com.sonos.generalinformation" },
		monochrome = true,
		plugin = {"json:target/cucumber-report/cucumber.json"},
		tags = "@test1"
		)


public class RunnerTestGeneralInformation {
	
	@BeforeClass
	public static void startTest() {
		DriverFactory.startDriver();
	}
	

	@AfterClass
	public static void EndTest() {
		DriverFactory.killDriver();
	}

}
