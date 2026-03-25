package steps;

import io.cucumber.java.pt.*;
import io.restassured.response.Response;
import services.PostService;
import utils.ScenarioContext;
import static io.restassured.RestAssured.*;

import static org.junit.Assert.*;

public class PostSteps {

	private ScenarioContext context;
	
	public PostSteps(ScenarioContext context) {
        this.context = context;
    }
    PostService service = new PostService();

    @Quando("eu busco o post {int}")
    public void buscarPostInt(int id) {
      Response response = get("/posts/" + id);
      context.setResponse(response);
    }
    
    @Quando("eu busco o post {string}")
    public void buscarPostString(String id) {
        Response response = get("/users/" + id);
        context.setResponse(response);
    }

}


