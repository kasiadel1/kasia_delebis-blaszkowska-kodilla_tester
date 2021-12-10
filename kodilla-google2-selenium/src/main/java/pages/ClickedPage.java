
package pages;
        import java.util.List;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class ClickedPage extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    public ClickedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void clickFirst() {
        WebElement boxarea = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[10]"));
        List<WebElement> l1 = boxarea.findElements(By.tagName("a"));
        l1.get(0).click();
        String linkTitle = driver.getTitle();
        System.out.print(" The title of the page is " + linkTitle);

    }
}