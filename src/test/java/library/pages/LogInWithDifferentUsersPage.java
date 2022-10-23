package library.pages;

import library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInWithDifferentUsersPage {
    public LogInWithDifferentUsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "(//a/span)[5]")
    public WebElement UserTitle;

    @FindBy(xpath = "(//a/span)[7]")
    public WebElement LibrarianTitle;
}
