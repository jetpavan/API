package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinitions", dryRun = false, tags = "@addUser",
plugin = {"json:target/jsonReports/cucumber-report.json", "html:target/HtmlReports.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
