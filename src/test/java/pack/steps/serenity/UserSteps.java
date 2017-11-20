package pack.steps.serenity;

/**
 * Created by Andrii_Grygoruk on 11/16/2017.
 */


import net.thucydides.core.annotations.Step;

import pack.pages.MainPage;


public class UserSteps {


    MainPage mainPage = new MainPage();

    @Step
    public void searchFor(String text){
        enterTermInSearchInput(text);
        clickSearchButton();
    }

    @Step
    public void enterTermInSearchInput(String text){
        mainPage.typeInSearchInput(text);
    }

    @Step
    public void clickSearchButton(){
        mainPage.clickSearchButton();
    }

    @Step
    public void openStartPage(){
        mainPage.open();
    }

    @Step
    public String getPageTitle(){
        return mainPage.getTitle();
    }

}
