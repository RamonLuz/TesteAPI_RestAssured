package steps;

import io.cucumber.java.pt.*;
import io.restassured.response.Response;
import services.GetService;
import utils.ScenarioContext;
import static io.restassured.RestAssured.*;

import static org.junit.Assert.*;

public class GetSteps {

	private ScenarioContext context;
	
	public GetSteps(ScenarioContext context) {
        this.context = context;
    }
	
    GetService service = new GetService();

    @Quando("eu busco o get {int}")
    public void buscarUsuarioInt(int id) {
        Response response = get("/users/" + id);
        context.setResponse(response);
    }
    
    @Quando("eu busco o get {string}")
    public void buscarUsuarioString(String id) {
        Response response = get("/users/" + id);
        context.setResponse(response);
    }

}