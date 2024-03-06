package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APIResources;
import resources.TestDataBuilder;
import resources.Utils;

public class PetStoreStepDefinition extends Utils {

	public RequestSpecification load;
	public Response post;
	TestDataBuilder data = new TestDataBuilder();

	@Given("I add user payload")
	public void i_add_user_payload() throws Throwable {
		load = given().log().all().spec(requestSpecification()).body(data.addUserPayload());
	}

	@When("I call {string} with {string} http request")
	public void i_call_user_api_with_post_http_request(String resource, String method) {
		APIResources resourceAPI = APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());

		if (method.equalsIgnoreCase("POST")) {
			post = load.when().post(resourceAPI.getResource());
		} else if (method.equalsIgnoreCase("GET")) {
			post = load.when().get(resourceAPI.getResource());
		}
	}

	@Then("I get API call success with status code {int}")
	public void i_get_api_call_success_with_status_code(Integer int1) {
		Response respo = post.then().extract().response();
		String result = respo.asString();
		System.out.println(result);
	}
	
	@Given("I get user payload")
	public void i_get_user_payload() throws IOException {
		load = given().log().all().spec(requestSpecification());
	}
}
