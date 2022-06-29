package FirstTask;

import LogIn.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs {

    private WebDriver driver;

    @Given("user at main page")

    public void openMainPage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/");
    }

    @When("user login to his account {word}, {word}")
    public void openLogInPage(String email, String password) {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.logIn();
        logInPage.enterEmail(email);
        logInPage.enterPassword(password);
        logInPage.submitLogin();

    }

    @And("user add new address {word}, {word}, {word}, {word}, {word} is entered in input fields")
    public void enterFirstTaskPage(String alias, String address, String city, String postal_code, String phone) {
        FirstTaskPage firstTaskPage = new FirstTaskPage(driver);
        firstTaskPage.addresses();
        firstTaskPage.newAddress();
        firstTaskPage.newAlias(alias);
        firstTaskPage.newAddress1(address);
        firstTaskPage.newCity(city);
        firstTaskPage.newPostcode(postal_code);
        firstTaskPage.setUserNewPhone(phone);
    }

    @Then("address fields  should contain {word}, {word}, {word}, {word}, {word}")
    public void shouldContainExpectedAddress(String expectedAlias, String expectedAddress, String expectedCity, String expectedPostal_Code, String expectedPhone) {
        FirstTaskResultPage firstTaskResultPage = new FirstTaskResultPage(driver);
        String aliasResultTest = firstTaskResultPage.getNewAlias();
        String address1ResultTest = firstTaskResultPage.getNewAddress1();
        String cityResultTest = firstTaskResultPage.getNewCity();
        String postal_codeResultTest = firstTaskResultPage.getNewPostal_Code();
        String phoneResultTest = firstTaskResultPage.getNewPhone();

        Assert.assertTrue(aliasResultTest.contains(expectedAlias));
        Assert.assertTrue(address1ResultTest.contains(expectedAddress));
        Assert.assertTrue(cityResultTest.contains(expectedCity));
        Assert.assertTrue(postal_codeResultTest.contains(expectedPostal_Code));
        Assert.assertTrue(phoneResultTest.contains(expectedPhone));
    }
}
