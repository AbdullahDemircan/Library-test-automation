package library.pages;

import library.utilities.ConfigurationReader;
import library.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("login-url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
