package pages;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;
    private GoogleResults googleResults;


   public GoogleSearch(WebDriver driver) {
       super(driver);
   }


   public void searchResults () {
            PageFactory.initElements(driver, GoogleSearch.class);
            inputField.sendKeys("Kodilla");
            googleResults = loadResults(driver);
            googleResults.iSeeResults();

        }

        public  GoogleResults loadResults (WebDriver driver){
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
            GoogleResults googleResults = new GoogleResults(driver);
            return googleResults;

        }
        public void RandomSearch(WebDriver driver) {
       WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement boxarea = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[10]"));
        List<WebElement> l1 = boxarea.findElements(By.tagName("h3"));
        System.out.print("Number of links in the box area is  :  " + l1.size());
            for (int i = 0; i < l1.size(); i++) {
                Random r = new Random();
                //  r.nextInt(13)
                l1.get(r.nextInt(10)).click();
                String linkTitle = driver.getTitle();
                System.out.print(" The title of the page is " + linkTitle);

            }

        }
    }

