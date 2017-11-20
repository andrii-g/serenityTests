package pack.pages;

/**
 * Created by Andrii_Grygoruk on 11/16/2017.
 */

import net.serenitybdd.core.annotations.findby.How;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.remote.server.SeleniumServer;

import java.util.List;

@DefaultUrl("https://en.wikipedia.org/wiki/Main_Page")
public class MainPage extends PageObject{

    @FindBy(name = "search")
    private WebElementFacade searchInput;

    @FindBy(xpath = "//*[@id='searchButton']")
    private WebElementFacade searchButton;

    public void typeInSearchInput(String text) {
        searchInput.type(text);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

}
