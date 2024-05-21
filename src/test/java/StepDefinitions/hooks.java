package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

// Background 
public class hooks {

	@Before
	public void netBanking() {
		System.out.println("login to webpage");
	}
	
	// To run for any specific scenario provide the tag as below
	
	@Before("@SmokeTest")
	public void mortageAccount() {
		System.out.println("login to netBanking");
	}
	
	@After 
	public void lastStep() {
		System.out.println("Cleared Evreything");
	}
	
	//Before(hooks)> Background > Scenario > After
}
