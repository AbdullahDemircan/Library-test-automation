package library.pages;

import library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibrarianDashboardPage {
    public LibrarianDashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "//span[.=\"Dashboard\"]")
    public WebElement LibrarianDashboard;

    @FindBy(xpath = "//h2[@id='user_count']")
    public WebElement userCount;

    @FindBy(xpath = "//h6[@class='text-muted']")
    public WebElement userText;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement LibraryUser;


}
