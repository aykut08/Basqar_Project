package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class _3_3_and_3_4_CountryCitySteps {
    LeftNavigation leftNavigation=new LeftNavigation();
    DialogContent dialogContent=new DialogContent();

    @And("^navigate to parameter page$")
    public void navigateToParameterPage() {
        leftNavigation.findElementAndClickFunction("setUpGeneral");
        leftNavigation.findElementAndClickFunction("parameterButton");
    }

    @Then("^navigate to cities page$")
    public void navigateToCitiesPage() {


        leftNavigation.findElementAndClickFunction("citiesButton");
           }


    @Then("^create a city with a country$")
    public void createACityWithACountry()  {

        dialogContent.findElementAndClickFunction("addCityButton");
        dialogContent.findElementAndClickFunction("addCountryinCityBtn");
        dialogContent.findElementAndSendKeysFunction("nameInputinCity","tryCountry2");
        dialogContent.findElementAndSendKeysFunction("codeInput","2222");
        dialogContent.findElementAndClickFunction("saveBtnCountryinCity");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        dialogContent.findElementAndClickFunction("countryiesBtn");
        dialogContent.findElementandSelectFunction("tryCountry2");
        dialogContent.findElementAndSendKeysFunction("nameInput", "tryCity2");
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }

    @Then("^navigate to country page and delete a country$")
    public void navigateToCountryPageAndDeleteACountry() {
        leftNavigation.findElementAndClickFunction("countryButton");
        dialogContent.findElementAndSendKeysFunction("nameInputforSearch","tryCountry2");
        dialogContent.findElementAndClickFunction("searchBtn");
        dialogContent.findElementAndDeleteFunction("tryCountry2");
        dialogContent.findElementAndClickFunction("yesBtn");
    }

    @And("^error message should  be displayed$")
    public void errorMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer","Error");
    }

    @And("^delete a cityN$")
    public void deleteACity() {
        dialogContent.findElementAndSendKeysFunction("nameInputforSearch","tryCity");
        dialogContent.findElementAndClickFunction("searchBtn");
        dialogContent.findElementAndClickFunction("deleteBtn");
        dialogContent.findElementAndClickFunction("yesBtn");
         }
}
