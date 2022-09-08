package io.swagger.petstore.test.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

import java.util.Map;

public class CreateUserStepDefiniton {

    @Given("^A user send the request to create a new user in the endpoint \"([^\"]*)\"$")
    public void aUserSendTheRequestToCreateANewUserInTheEndpoint(String url, Map<String,String> body) {
        SerenityRest.given().baseUri(url).header("Content-Type","application/json").body(body).post();
        SerenityRest.lastResponse().then().log().all();
    }

    @Then("^Validate that the status code is (\\d+)$")
    public void validateThatTheStatusCodeIs(int statusCode) {
    SerenityRest.lastResponse().then().statusCode(statusCode);

    }

    @And("^Validate that the response contains the key \"([^\"]*)\" must be \"([^\"]*)\"$")
    public void validateThatTheResponseContainsTheKeyMustBe(String type, String typeStatus) {
    SerenityRest.lastResponse().then().body(type, Matchers.equalTo(typeStatus));
    }

    @And("^Validate that the response  \"([^\"]*)\" must be \"([^\"]*)\"$")
    public void validateThatTheResponseMustBe(String message, String messageStatus) {
        SerenityRest.lastResponse().then().body(message, Matchers.equalTo(messageStatus));
    }





}
