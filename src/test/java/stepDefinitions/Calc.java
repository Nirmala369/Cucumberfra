package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Borrowpage;
import utils.TestContextSetup;

public class Calc {
    public WebDriver driver;
    public Borrowpage borrowpage;

    TestContextSetup testContextSetup;
    //Spring framework, EJB,
//SRP
//
    public Calc(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.borrowpage = testContextSetup.pageObjectManager.getBorrowpage();
    }


    @Given("^User is on Calculators and tools page$")
    public void user_is_on_calculators_and_tools_page() throws Throwable {
        System.out.println("home page of borrow calculator");

    }

    @When("^user adds details application type as single and zero dependants$")
    public void user_adds_details_application_type_as_single_and_zero_dependants() throws Throwable {
        borrowpage.selectSingleType();

    }

    @Then("^User calculates borrow estimate$")
    public void user_calculates_borrow_estimate() throws Throwable {
String valfinalestimatedborrow=borrowpage.getuserborrowestimate();
System.out.println("valfinalestimatedborrow");

    }

    @Then("^user encounters message of estimation$")
    public void user_encounters_message_of_estimation() throws Throwable {
        borrowpage.getuserborrowestimate
    }

    @And("^user Added following income details$")
    public void user_added_following_income_details(DataTable data) throws Throwable {
        List<List<String>> obj=data.asLists();
        String valannualincome=obj.get(0).get(0);
        String valotherincome=obj.get(0).get(1);
        borrowpage.getannualincome(valannualincome);
        borrowpage.getotherincome(valotherincome);

    }

    @And("^user adds following existing financial commitments$")
    public void user_adds_following_existing_financial_commitments(DataTable data) throws Throwable {
        List<List<String>> obj=data.asLists();
        String vallivingexpense=obj.get(0).get(0);
        String valhomeloanrepayment=obj.get(0).get(1);
        String valothercommit=obj.get(0).get(2);

        borrowpage.getlivingexpense(vallivingexpense)
        borrowpage.gethomeloanrepayment(valhomeloanrepayment)
        borrowpage.getothercommit(valothercommit)
    }

    @And("^user adds following credit card limits (.+)$")
    public void user_adds_following_credit_card_limits(String 10000) throws Throwable {
        borrowpage.getothercommit(10000);
    }




}
