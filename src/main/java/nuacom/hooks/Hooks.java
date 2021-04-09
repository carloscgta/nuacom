package nuacom.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import nuacom.core.DriverFactory;
import nuacom.core.TipoDriver;

public class Hooks {

    @Before
    public void antesScenario(Scenario cenario) throws Exception {

        System.out.println("This will run before the Scenario - Browser is not being initiated");
        DriverFactory.getDriver(TipoDriver.CHROME)
                .get("https://nuacom.io/");

    }

    @After
    public static void depoisScenario() throws Exception {
        System.out.println("This will run after the Scenario");
        //	 DriverFactory.closeDriver();
    }
}
