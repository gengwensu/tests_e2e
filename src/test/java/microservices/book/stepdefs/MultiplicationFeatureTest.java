package microservices.book.stepdefs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber",
        "junit:target/junit-report.xml" }, features = "src/test/resources/features/multiplication.feature")
public class MultiplicationFeatureTest {

}
