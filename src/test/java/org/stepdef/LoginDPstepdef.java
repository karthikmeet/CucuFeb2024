package org.stepdef;

import java.util.List;
import java.util.Map;

import org.pagerepo.LoginPageRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginDPstepdef {
	LoginPageRepo repo = new LoginPageRepo();

	@Given("DP Open facebook and launch the application")
	public void dp_Open_facebook_and_launch_the_application() {
		Hook.driver.get("https://www.facebook.com/");
	}

	@When("DP Enter the username and password")
	public void dp_Enter_the_username_and_password(DataTable dt) {
		List<Map<String, String>> mps = dt.asMaps();
		System.out.println(mps);
		System.out.println(mps.get(0));
		System.out.println(mps.get(0).get("Username"));

		Hook.type(repo.getUsername(), mps.get(0).get("Username"));
		Hook.type(repo.getPassword(), mps.get(0).get("Password"));
	}

	@Then("DP Test execution completed")
	public void dp_Test_execution_completed() {
		System.out.println("Test execution success");
	}
}
