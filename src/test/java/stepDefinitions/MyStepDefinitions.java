package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.Then;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class MyStepDefinitions {

	 @Given("^user is on internet landing page$")
	    public void user_is_on_internet_landing_page() throws Throwable {
	        System.out.println("user is on internet landing page");
	        System.out.println("user is on landing page -  for git");
	        System.out.println("user is on landing page -  for git2..");
	    }

	 @When("^user login into application with (.+) and (.+)$")
	    public void user_login_into_application_with_and(String username, String password) throws Throwable {
	       System.out.println(username);
	       System.out.println(password);
	    }

	    @Then("^home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	       System.out.println("home page is populated");
	    }

	    @And("^cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	       System.out.println("cards are displayed");
	    }
}