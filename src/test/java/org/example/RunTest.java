package org.example;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = " . ",tags = " @Purchase",format = {"pretty", "html:target/destination"})
public class RunTest {
}
