package nuacom.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "nuacom.steps", "nuacom.hooks"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src/main/report/cucumber-reports/report.html"},

        features = {"./src/main/resources/feature" },
        tags = {"@nuaconLogin" })
public class LoginRunner {

    public LoginRunner() {
        // TODO Auto-generated constructor stub
    }
}
