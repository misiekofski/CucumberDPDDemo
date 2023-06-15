package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/features",
        glue = { "stepdefinition" },
        plugin = {"pretty", "html:target/cucumber.html"}
)
public class RunnerWithHTMLReport extends AbstractTestNGCucumberTests {
}
