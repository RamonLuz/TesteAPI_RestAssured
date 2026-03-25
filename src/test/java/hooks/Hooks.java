package hooks;

import io.cucumber.java.Before;
import utils.BaseTest;

public class Hooks {

	@Before
    public void beforeScenario() {
        BaseTest.setup();
    }
	
}