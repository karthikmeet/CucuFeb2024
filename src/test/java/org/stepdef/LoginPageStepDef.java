package org.stepdef;

import java.sql.Driver;

import org.junit.Assert;
import org.pagerepo.LoginPageRepo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDef {
	LoginPageRepo repo = new LoginPageRepo();

	@Given("Open facebook and launch the application")
	public void open_facebook_and_launch_the_application() {
		Hook.driver.get("https://www.facebook.com/");
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		Hook.type(repo.getUsername(), "AiiteCucumber");
		Hook.type(repo.getPassword(), "cucu123");
	}

	@When("Enter the username as {string} and password as {string}")
	public void enter_the_username_and_password_outline(String arg1, String arg2) {
		Hook.type(repo.getUsername(), arg1);
		Hook.type(repo.getPassword(), arg2);
	}

	@And("supporting statement1")
	public void and1() {
		System.out.println("supporting statement1");
	}

	@But("supporting statement2")
	public void but1() {
		System.out.println("supporting statement2");
	}

	@Then("Test execution completed")
	public void xxxxxxx() {
		System.out.println("Test execution success");
	}
}
