package io.swagger.petstore.test.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

import java.util.Map;

public class PlaceAnOrderStepDefinition {

    @Given("^A user send the request to place an order for pet in the endpoint \"([^\"]*)\"$")
    public void aUserSendTheRequestToPlaceAnOrderForPetInTheEndpoint(String url, Map<String,String> body) {
        SerenityRest.given().baseUri(url).header("Content-Type","application/json").body(body).post();
        SerenityRest.lastResponse().then().log().all();
    }


    @Then("^Validate in the response that the status code is (\\d+)$")
    public void validateInTheResponseThatTheStatusCodeIs(int statusCode) {
        SerenityRest.lastResponse().then().statusCode(statusCode);
    }

    @Then("^Validate in the response that the response contains the key \"([^\"]*)\" must be \"([^\"]*)\"$")
    public void validateInTheResponseThatTheResponseContainsTheKeyMustBe(String status, String expectedStatus) {
        SerenityRest.lastResponse().then().body(status, Matchers.equalTo(expectedStatus));
    }

    @Then("^Validate in the response that the response  \"([^\"]*)\" must be true$")
    public void validateInTheResponseThatTheResponseMustBeTrue(String complete) {
        SerenityRest.lastResponse().then().body(complete, Matchers.equalTo(true));
    }




}
