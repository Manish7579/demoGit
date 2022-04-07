package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

	 @Given("^user is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	        
	        System.out.println("sucessfullay navigate to landing page");
	    } 
	 @When("^user login to application with \"([^\"]*)\" user and \"([^\"]*)\"$")
	    public void user_login_to_application_with_something_user_and_something(String strArg1, String strArg2) throws Throwable {
	       
	    	  System.out.println(strArg1);
	     	  System.out.println(strArg2);
	    }

	  @Then("^Home page is populated \"([^\"]*)\"$")
	    public void home_page_is_populated_something(String strArg1) throws Throwable {
	    	  System.out.println(strArg1);
	    }

	    @And("^some other check the radio buttom$")
	    public void some_other_check_the_radio_buttom() throws Throwable {
	    	  System.out.println("sucessfullay check the radio buttom");
	    }

	    @And("^yet another action$")
	    public void yet_another_action() throws Throwable {
	    	  System.out.println("sucessfullay scroll down the page");
	    }

	    @And("^check more outcomes$")
	    public void check_more_outcomes() throws Throwable {
	    	  System.out.println("sucessfullay automated the page");
	    } 
	    @Then("print the Test complited")
	    public void print_the_test_complited() {
	        // Write code here that turns the phrase above into concrete actions
	        
	        System.out.println("sucessfullay automated the page");
	    }
}
