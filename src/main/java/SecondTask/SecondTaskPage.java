package SecondTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondTaskPage {

    private WebDriver driver;

    public SecondTaskPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"_desktop_logo\"]/a/img")
        WebElement toMainPage;

    @FindBy(xpath = "//*[@id=\"content\"]/section/div/article[2]/div/a/img")
    WebElement userSelectProduct;

    @FindBy(id="group_1")
    WebElement userSelectSize;

    @FindBy(id="quantity_wanted")
    WebElement userSelectQuantity;

    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    WebElement userAddProduct;

    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    WebElement userProceedToCheckout;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    WebElement userProceedToCheckout2;

    @FindBy(name = "confirm-addresses")
    WebElement userConfirmAddress;

    @FindBy(id="delivery_option_1")
    WebElement userSelectDelivery;

    @FindBy(name = "confirmDeliveryOption")
    WebElement userConfirmDeliveryOption;


    @FindBy(id="payment_option_1")
    WebElement userSelectPaymentOption;

    @FindBy(id="conditions_to_approve[terms-and-conditions]")
    WebElement userAgreeTerms;

    @FindBy(className = "btn btn-primary center-block")
    WebElement userConfirmOrder;

    public void mainPage(){
        toMainPage.click();
    }

    public void selectProduct(){
        userSelectProduct.click();
    }

    public void selectSize(String size){
        userSelectSize.click();
        userSelectSize.sendKeys(size);
    }

    public void selectQuantity(String quantity){
        userSelectQuantity.click();
        userSelectQuantity.clear();
        userSelectQuantity.sendKeys(quantity);
    }

    public void addProduct(){
        userAddProduct.click();
    }

    public void proceedToCheckout1(){
        userProceedToCheckout.click();
    }

    public void proceedToCheckout2(){
        userProceedToCheckout2.click();
    }

    public void confirmAddress(){
        userConfirmAddress.click();
    }

    public void selectDelivery(){
        userSelectDelivery.click();
    }

    public void confirmDelivery(){
        userConfirmDeliveryOption.click();
    }

    public void paymentOption(){
        userSelectPaymentOption.click();
    }

    public void agreeTerms(){
        userAgreeTerms.click();
    }

    public void confirmOrder(){
        userConfirmOrder.click();
    }









}
