package pom;

import base.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchBusPage extends baseClass {

    public static WebDriver driver;

    public searchBusPage(WebDriver dr) {
        this.driver = dr;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[@class='FilterTabs_tabSection__DfwGX ']")
    public WebElement filterAc;

    @FindBy(xpath = "//p[text()='Seater']")
    public WebElement filterSeatType;

    @FindBy(id = "filter-CAhSAlgB")
    public WebElement scrollElement1;

    @FindBy(xpath = "//span[@class='Checkbox_toggleText__2JoGx']")
    public WebElement showAll;

    @FindBy(xpath = "//div[@class='headerOuter']")
    public WebElement scrollElement2;

    @FindBy(xpath = "//p[text()='Koyambedu']")
    public WebElement pickUpPoint;

    @FindBy(xpath = "//p[text()='Price']")
    public WebElement filterPrice;

    @FindBy(xpath = "//button[text()='Select Seats']")
    public WebElement selectSeat;

    public void filter() throws InterruptedException {
        Thread.sleep(1000);
        filterAc.click();
        Thread.sleep(1000);
        filterSeatType.click();
        Thread.sleep(1000);
        scroll(scrollElement1);
        Thread.sleep(1000);
        showAll.click();
        Thread.sleep(1000);
        pickUpPoint.click();
        Thread.sleep(1000);
        scroll(scrollElement2);


    }

    public void cheapAndLowPriceBus() throws InterruptedException {
        Thread.sleep(1000);
        filterPrice.click();
    }

    public void selectSeat() throws InterruptedException {
        Thread.sleep(1000);
        selectSeat.click();

    }
}
