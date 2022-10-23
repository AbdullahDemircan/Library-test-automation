package library.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import library.pages.LibrarianDashboardPage;
import library.pages.LoginPage;
import library.pages.SearchResultsPage;
import library.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchResults_StepDefinitions {


    LoginPage loginPage = new LoginPage();
    LibrarianDashboardPage librarianDashboardPage = new LibrarianDashboardPage();

    SearchResultsPage searchResultsPage = new SearchResultsPage();
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
    loginPage.emailAddressInput.sendKeys(ConfigurationReader.getProperty("librarianUsername") + Keys.ENTER);
    loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("librarianPassword")+ Keys.ENTER);
    loginPage.signInButton.click();
    }
    @Given("I click on {string} link")
    public void i_click_on_link(String string) {
    librarianDashboardPage.LibraryUser.click();
        Assert.assertEquals(string, librarianDashboardPage.LibraryUser.getText());
    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> columnsList) {

    List<WebElement> listWebElement = new ArrayList<>();

    listWebElement.addAll(Arrays.asList(searchResultsPage.actions, searchResultsPage.userID, searchResultsPage.fullName,
            searchResultsPage.eMail, searchResultsPage.group, searchResultsPage.status));

    List<String> webElementsText = new ArrayList<>();

    for (WebElement webElement : listWebElement) {
    String eachText= webElement.getText();
        webElementsText.add(eachText);
        }
    Assert.assertEquals(columnsList,webElementsText);

    }

}
