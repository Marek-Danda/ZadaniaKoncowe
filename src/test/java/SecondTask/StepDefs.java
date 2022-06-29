package SecondTask;

import LogIn.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs {

    private WebDriver driver;




    @Given("user at main shop page")


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

    @And("user select product size {word} and quantity {word}")
    public void userSelectProduct(String size, String quantity){
        SecondTaskPage secondTaskPage=new SecondTaskPage(driver);
        secondTaskPage.mainPage();
        secondTaskPage.selectProduct();
        secondTaskPage.selectSize(size);
        secondTaskPage.selectQuantity(quantity);
        secondTaskPage.addProduct();
        secondTaskPage.proceedToCheckout1();
        secondTaskPage.proceedToCheckout2();
        secondTaskPage.confirmAddress();
    }

    @And("user select delivery and payment options")
    public void userSelectDeliveryAndPayment(){
        SecondTaskPage secondTaskPage=new SecondTaskPage(driver);
        secondTaskPage.selectDelivery();
        secondTaskPage.confirmDelivery();
        secondTaskPage.paymentOption();
        secondTaskPage.agreeTerms();
        secondTaskPage.confirmOrder();
    }

    @Then("user's order should be confirmed by text {word}")
    public void orderShouldBeConfirmed(String orderConfirmed){
        SecondTaskResultPage secondTaskResultPage=new SecondTaskResultPage(driver);
        String secondTaskResultText=secondTaskResultPage.getSecondTaskResultText();

        Assert.assertTrue(secondTaskResultText.contains(orderConfirmed));

    }

    @And("make a screenshot")
    public void makeA_Screenshot(){
       // TakesScreenshot takesScreenshot=new TakesScreenshot() {
         //   @Override
           // public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
             //   return null;
           // }
       // };

        }

    }


