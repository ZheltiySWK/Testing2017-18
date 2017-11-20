package pages.freymworks;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class PageFind {
    WebDriver driver;
    public PageFind(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBys({
            @FindBy(className = "r"),
            @FindBy(tagName = "a")
    })
    private List<WebElement> S;

    @FindBy(css = "#pnnext")
    private WebElement Next;
    public boolean NexpPage(){
        boolean b;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> temp = driver.findElements(By.cssSelector("#pnnext"));
        if (temp.size()==0) {
            System.out.println("The end");
            b = false;
        }
        else {
            Next.click();
            b = true;
        }
        return b;

    }
   public void Druk(ArrayList Item){
        for (WebElement temp:S){
            Item.add(temp.getText());
        }

    }
}
