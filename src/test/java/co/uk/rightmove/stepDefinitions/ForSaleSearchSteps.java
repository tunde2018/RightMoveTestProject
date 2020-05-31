package co.uk.rightmove.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForSaleSearchSteps {

    WebDriver driver;

    @Given("I navigate to rightmove homepage")
    public void i_navigate_to_rightmove_homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.rightmove.co.uk/");

    }

    @When("I enter a {string} in the search text box")
    public void i_enter_a_in_the_search_text_box(String string) {

    }

    @When("I click on ForSale")
    public void i_click_on_ForSale() {

    }

    @When("I select {string} from search radius dropdown")
    public void i_select_from_search_radius_dropdown(String string) {

    }

    @When("I select {string} from Min price dropdown")
    public void i_select_from_Min_price_dropdown(String string) {

    }

    @When("I select {string} from Max price dropdown")
    public void i_select_from_Max_price_dropdown(String string) {

    }

    @When("select {string} from Property type dropdown")
    public void select_from_Property_type_dropdown(String string) {

    }

    @When("I select {string} from Bedrooms dropdown")
    public void i_select_from_Bedrooms_dropdown(String string) {

    }

    @When("I click on Find properties button")
    public void i_click_on_Find_properties_button() {

    }

    @Then("a list of {string} in {string} are displayed")
    public void a_list_of_in_are_displayed(String string, String string2) {

    }

    @Then("I click on any of the result to view more detail")
    public void i_click_on_any_of_the_result_to_view_more_detail() {

    }

    @Then("an error result page is displayed")
    public void an_error_result_page_is_displayed() {

    }




}
