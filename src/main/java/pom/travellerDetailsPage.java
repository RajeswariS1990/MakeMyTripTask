package pom;

import base.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class travellerDetailsPage extends baseClass {

    public travellerDetailsPage(WebDriver dr) {
        this.driver = dr;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "fname")
    public WebElement name;

    @FindBy(name = "age")
    public WebElement age;

    @FindBy(xpath = "//div[text()='Female']")
    public WebElement gender;

    @FindBy(name = "email id")
    public WebElement emailId;

    @FindBy(name = "Mobile Number")
    public WebElement mobileNumber;

    @FindBy(xpath = "//span[@class='checkboxWpr']")
    public WebElement checkbox;

    @FindBy(xpath = "//span[text()='Continue']")
    public WebElement continueBtn;


    public void travellerDetails(String travellerName, String travellerAge, String travellerEmail, String travellerMobile) throws InterruptedException {
        scrollT0(300);
        sendKeys(name, travellerName);
        Thread.sleep(1000);
        sendKeys(age, travellerAge);
        Thread.sleep(1000);
        gender.click();
        Thread.sleep(1000);
        sendKeys(emailId, travellerEmail);
        Thread.sleep(1000);
        sendKeys(mobileNumber, travellerMobile);
        Thread.sleep(1000);
        scrollT0(500);
        Thread.sleep(1000);
        checkbox.click();
    }

    public void clickContinue() throws InterruptedException {
        Thread.sleep(1000);
        continueBtn.click();
        Thread.sleep(5000);
    }

}
