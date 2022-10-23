package library.pages;

import library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentDashboardPage {
    public StudentDashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(xpath = "//a[@class=\"navbar-brand\"]")
    public WebElement studentDashboard;

}
