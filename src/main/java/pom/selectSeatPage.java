package pom;

import base.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class selectSeatPage extends baseClass {
    public static WebDriver driver;

    public selectSeatPage(WebDriver dr) {
        this.driver = dr;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='makeFlex PickUpDropSelection_pickDropItem__YQFG2 ']")
    public WebElement boardingPoint;


    @FindBy(xpath = "(//div[@class='makeFlex PickUpDropSelection_pickDropItem__YQFG2 '])[10]")
    public WebElement dropPoint;

    @FindBy(xpath = "(//div[@class='SeatMapContainer_font10__sDtwv false'])[2]")
    public WebElement selectBerth;

    @FindBy(xpath = "//button[text()='Continue']")
    public WebElement continueButton;


    public void selectBerthAndClickContinue() throws InterruptedException {
        Thread.sleep(1000);
        scrollT0(500);
        Thread.sleep(1000);
        boardingPoint.click();
        Thread.sleep(1000);
        dropPoint.click();
        Thread.sleep(1000);
        selectBerth.click();
        Thread.sleep(1000);
        scrollBy(1000);
        Thread.sleep(1000);
        continueButton.click();

    }
}
