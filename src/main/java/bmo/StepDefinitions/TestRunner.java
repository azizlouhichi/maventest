package bmo.StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",
    glue = {"StepDefinition"},
    plugin = {
        "pretty", 
        "html:target/reports/HTMLReport.html",
        "json:target/reports/JSONReport.json",
        "junit:target/reports/JUnitReport.xml"
    }
)
public class TestRunner {  
}
