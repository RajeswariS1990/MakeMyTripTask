package pom;

import base.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends baseClass {

    public static WebDriver driver;

    public homePage(WebDriver dr) {
        this.driver = dr;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@data-cy='closeModal']")
    public WebElement closeButton1;

    @FindBy(xpath = "(//div[@class='tp-dt-header-icon'])[2]")
    public WebElement closeButton2;

    @FindBy(xpath = "//li[@class='menu_Buses']")
    public WebElement busMenu;

    @FindBy(id = "fromCity")
    public WebElement pickUp;

    @FindBy(xpath = "//input[@aria-controls='react-autowhatever-1']")
    public WebElement from;

    @FindBy(id = "react-autowhatever-1-section-0-item-0")
    public WebElement fromCity;

    @FindBy(xpath = "//div[@data-cy='BusSearchWidget_23']")
    public WebElement dropTo;

    @FindBy(xpath = "//input[@aria-controls='react-autowhatever-1']")
    public WebElement to;

    @FindBy(id = "react-autowhatever-1-section-0-item-0")
    public WebElement toCity;

    @FindBy(xpath = "(//div[@class='DayPicker-Day'])[12]")
    public WebElement journeyDate;

    @FindBy(id = "search_button")
    public WebElement searchButton;

    public void close() throws InterruptedException {
        Thread.sleep(1000);
        closeButton1.click();
        Thread.sleep(1000);
        closeButton2.click();
    }

    public void clickBusMenu() throws InterruptedException {
        Thread.sleep(1000);
        busMenu.click();
    }

    public void enterPickUp(String fromLocation) throws InterruptedException {
        Thread.sleep(1000);
        pickUp.click();
        Thread.sleep(1000);
        sendKeys(from, fromLocation);
        Thread.sleep(1000);
        fromCity.click();
    }

    public void enterDropTo(String toLocation) throws InterruptedException {
        Thread.sleep(1000);
        dropTo.click();
        Thread.sleep(1000);
        sendKeys(to, toLocation);
        Thread.sleep(1000);
        toCity.click();
    }

    public void selectDate() throws InterruptedException {
        Thread.sleep(1000);
        journeyDate.click();
        Thread.sleep(1000);
        searchButton.click();
    }

}
