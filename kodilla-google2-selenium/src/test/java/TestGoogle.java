import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ClickedPage;
import pages.GoogleResults;
import pages.GoogleSearch;

import static org.junit.Assert.assertSame;


public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\katar\\OneDrive\\Pulpit\\kodilla-course\\kodilla-google2-selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
    }

    /*@Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();

    }*/

        @Test
        public void testRandomResult() {
            GoogleSearch googleSearch = new GoogleSearch(driver);
            googleSearch.searchResults();
            GoogleResults googleResults = new GoogleResults(driver);
        WebElement webElement = googleResults.oneRandomResult();
        ClickedPage resultRandomPage = new ClickedPage(driver);

        WebElement webElement1 = resultRandomPage.clickRandomPage(webElement);

        assertSame(webElement, webElement1);
    }

    @After
    public void tearDown() {
        driver.close();
    }
    }

