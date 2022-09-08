package io.swagger.petstore.test.Runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\placeAnOrder.feature",
        glue = "io.swagger.petstore.test.StepDefinitions",
        snippets = SnippetType.CAMELCASE)


public class PlaceAnOrderRunner {
}


