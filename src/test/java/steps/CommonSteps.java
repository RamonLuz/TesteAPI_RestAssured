package steps;

import io.cucumber.java.pt.Então;
import static org.junit.Assert.*;
import utils.ScenarioContext;

public class CommonSteps {

	private ScenarioContext context;
	
	public CommonSteps(ScenarioContext context) {
        this.context = context;
    }

    @Então("o status code deve ser {int}")
    public void validarStatus(int status) {
    	assertEquals(status, context.getResponse().getStatusCode());
    }
    
    @Então("o id retornado deve ser {int}")
    public void validarId(int id) {
        assertEquals(id, context.getResponse().jsonPath().getInt("id"));
    }
}