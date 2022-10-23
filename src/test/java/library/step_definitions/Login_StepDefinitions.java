package library.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.pages.LibrarianDashboardPage;
import library.pages.LogInWithDifferentUsersPage;
import library.pages.LoginPage;
import library.pages.StudentDashboardPage;
import library.utilities.BrowserUtils;
import library.utilities.ConfigurationReader;
import library.utilities.Driver;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    LibrarianDashboardPage librarianDashboardPage = new LibrarianDashboardPage();
    StudentDashboardPage studentDashboardPage = new StudentDashboardPage();

    LogInWithDifferentUsersPage logInWithDifferentUsersPage= new LogInWithDifferentUsersPage();

    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("login-url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void teardown(){
        Driver.closeDriver();
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        BrowserUtils.verifyTitle("Login - Library");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
    loginPage.emailAddressInput.sendKeys("librarian1@library");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
    loginPage.passwordInput.sendKeys("qU9mrvur");
    }

    @Then("user as librarian should see the dashboard")
    public void userAsLibrarianShouldSeeTheDashboard() {
    loginPage.signInButton.click();
    Assert.assertTrue(librarianDashboardPage.LibrarianDashboard.isDisplayed());
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
    loginPage.emailAddressInput.sendKeys("student2@library");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
    loginPage.passwordInput.sendKeys("zyxa10vg");
    }

    @Then("user as student should see the dashboard")
    public void userAsStudentShouldSeeTheDashboard() {
    loginPage.signInButton.click();
    Assert.assertTrue(studentDashboardPage.studentDashboard.isDisplayed());
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        BrowserUtils.verifyTitle("Login - Library");
    }


    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String arg0, String arg1) {
        loginPage.emailAddressInput.sendKeys(arg0);
        loginPage.passwordInput.sendKeys(arg1);
        loginPage.signInButton.click();
    }

    @Then("dashboard should be displayed")
    public void dashboardShouldBeDisplayed() {
    Assert.assertTrue(librarianDashboardPage.LibrarianDashboard.isDisplayed());
    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String arg0) {
        if(arg0.contains("Student")){
            Assert.assertEquals(arg0, logInWithDifferentUsersPage.UserTitle.getText());
        }else{
            Assert.assertEquals(arg0, logInWithDifferentUsersPage.LibrarianTitle.getText() );
        }

    }


    /*@Then("there should be {int} users")
    public void there_should_be_users(Integer int1) {
      //int actual = (int) Integer.valueOf(librarianDashboardPage.userCount.getText());
      //String userCount = librarianDashboardPage.userCount.getText();
      int actual=1239;
        int expected=int1;
      Assert.assertEquals(expected,actual);
    }*/

}
