package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class baseClass {
    public static WebDriver driver;

    public static void launch() {
        driver = new ChromeDriver();
    }

    public static void url(String url) {
        driver.get(url);
    }

    public static void max() {
        driver.manage().window().maximize();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public static void sendKeys(WebElement ele, String text) {
        ele.sendKeys(text);
    }

    public static void scrollT0(int height) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0," + height + ");");
    }

    public static void scrollBy(int height) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + height + ")");
    }

    public static void scroll(WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ele);
    }



}
