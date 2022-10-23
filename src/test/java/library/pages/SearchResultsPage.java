package library.pages;

import library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage {
    public SearchResultsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//thead/tr/th)[1]")
    public WebElement actions;

    @FindBy (xpath = "(//thead/tr/th)[2]")
    public WebElement userID;

    @FindBy (xpath = "(//thead/tr/th)[3]")
    public WebElement fullName;

    @FindBy (xpath = "(//thead/tr/th)[4]")
    public WebElement eMail;

    @FindBy (xpath = "(//thead/tr/th)[5]")
    public WebElement group;

    @FindBy (xpath = "(//thead/tr/th)[6]")
    public WebElement status;

    }

