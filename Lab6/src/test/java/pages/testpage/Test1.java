package pages.testpage;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.freymworks.*;
import pages.freymworks.PageStart;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.lang.Thread;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static WebDriver driver;
    @BeforeClass
    public static void Init(){
        String exePath = "C:\\Users\\Ivan\\Desktop\\Java_Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maxi-mazed");
        driver = new ChromeDriver(chromeOptions);
        String LURL = "https://www.google.com.ua/";
        driver.navigate().to(LURL);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void Close(){
        driver.quit();
    }
    @Test
    public void Go()throws InterruptedException{
        PageStart Now = new PageStart(driver);
        PageFind Then;
        Then = Now.GoTo(driver, "Vano");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        ArrayList ListLinks = new ArrayList();
        boolean isNext;
        do {
            Then.Druk(ListLinks);
            isNext = Then.NexpPage();
        }while (isNext);

        System.out.println(ListLinks.get(50));


    }


}
