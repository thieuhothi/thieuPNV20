package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
    @FindBy(xpath = "//*[@id=\"userSelect\"]")
    WebDriver name;
    @FindBy(xpath = "//*[@id=\"userSelect\"]/option[3]")
    WebElement namelogin;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/form/button")
    WebElement buttonsubmit;

//    public void setName() throws InterruptedException{
//        Thread.sleep(200);
//        name.click
//    }
    public void setNamelogin() throws InterruptedException{
        namelogin.click();
        Thread.sleep(200);
    }

    public void setButtonsubmit() throws InterruptedException {
        Thread.sleep(200);
        buttonsubmit.click();
    }

}
