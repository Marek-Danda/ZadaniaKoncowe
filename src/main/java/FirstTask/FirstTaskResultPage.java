package FirstTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstTaskResultPage {

    private WebDriver driver;


    public FirstTaskResultPage(WebDriver driver){
        this.driver = driver;
    }

    public String getNewAlias() {
        return driver.findElement(By.name("alias")).getText();
    }

    public String getNewAddress1(){
        return driver.findElement(By.name("address1")).getText();
    }

    public String getNewCity(){
        return driver.findElement(By.name("city")).getText();
    }

    public String getNewPostal_Code(){
        return driver.findElement(By.name("postcode")).getText();
    }

    public String getNewPhone(){
        return driver.findElement(By.name("phone")).getText();
    }

}
