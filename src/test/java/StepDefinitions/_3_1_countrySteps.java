package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _3_1_countrySteps {

    LeftNavigation leftNavigation=new LeftNavigation();
    DialogContent dialogContent=new DialogContent();

    @Then("^create a countryN$")
    public void createACountry() {
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput","tryCountry");
        dialogContent.findElementAndSendKeysFunction("codeInput","22222");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @And("^success message should  be displayed$")
    public void successMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer2","success");
    }

    @Then("^delete a country$")
    public void deleteACountry() {
        dialogContent.findElementAndSendKeysFunction("nameInputforSearch","tryCountry");
        dialogContent.findElementAndClickFunction("searchBtn");
        dialogContent.findElementAndClickFunction("pageSelectBtn");
        dialogContent.findElementAndClickFunction("maxElementBtn");
        dialogContent.findElementAndDeleteFunction("tryCountry");
        dialogContent.findElementAndClickFunction("yesBtn");

    }
}
