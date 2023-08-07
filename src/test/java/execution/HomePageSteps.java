package execution;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	
	HomePage home=new HomePage(DriverFactory.getDriver());
	
	@Given("User should be at HomePage")
	public void user_should_be_at_home_page() {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://demo.opencart.com/");
		
	}

	@When("User clicks on Tablets functionality")
	public void user_clicks_on_laptops_and_notebook_functionality() {
		home.validateTablets();
		
	}

	@When("User clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
		home.addToCart();
	}

	@Then("product should get added to cart")
	public void product_should_get_added_to_cart() {
		System.out.println("its done");
		
	}

	

}
