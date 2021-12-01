package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Random;

public class RandomSearch {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.id("L2AGLb")).click();
        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("Kodilla");
        inputField.submit();
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




