package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination2 
{
	@Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() 
	{
        System.out.println("User is on netbanking landing page");
    }

	 @When("^User login into Application with (.+) and (.+)$")
	 public void user_login_into_application_with_and(String user, String pass) throws Throwable 
	 {
		 System.out.println(user);
		 System.out.println(pass);
		 
	 }
   

    @Then("^Home page is populated$")
    public void home_page_is_populated() 
    {
    	System.out.println("Home page is populated");
    }


    @And("^Cards are displayed$")
    public void cards_are_displayed() 
    {
    	System.out.println("Cards are displayed");
    }

}
