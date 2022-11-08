package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features",
        glue = {"steps"},
        tags = "@Regression",
        plugin = {"pretty", "html:target/cucumber.html"}
)

public class TestRunner {
}
