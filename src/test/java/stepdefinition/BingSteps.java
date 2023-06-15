package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BingPage;

import static org.assertj.core.api.Assertions.*;

public class BingSteps {
    WebDriver driver;

    @Given("User is on bing.com webpage")
    public void userIsOnBingComWebpage() {
        driver = new ChromeDriver();
        driver.get("https://bing.com");
    }

    @When("User searches for {string}")
    public void userSearchesFor(String queryString) {
        BingPage bp = new BingPage(driver);
        bp.searchFor(queryString);
    }


    @Then("First three results contains {string}")
    public void firstThreeResultsContains(String arg0) {
        assertThat(1).isEqualTo(10);
        driver.quit();
    }
}
