package pack.steps;

/**
 * Created by Andrii_Grygoruk on 11/16/2017.
 */

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import org.junit.Assert;
import pack.steps.serenity.UserSteps;

import static org.hamcrest.Matchers.is;

public class GeneralSteps {

    @Steps
    UserSteps userSteps;


    @Given("user opens Wiki start page")
    public void userOpensWikiStartPage() {
        userSteps.openStartPage();
    }

    @When("user searches for a term '$text'")
    public void userSearchesForATerm(String text) {
        userSteps.searchFor(text);
    }

    @Then("page page title should be '$title'")
    public void verifyPageTitle(String title) {
        Assert.assertThat("Title is wrong", userSteps.getPageTitle(), is(title));
    }

}

