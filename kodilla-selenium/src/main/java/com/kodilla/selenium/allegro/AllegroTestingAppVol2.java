package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class AllegroTestingAppVol2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\katar\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        WebDriverWait wait;


        WebElement acceptButton = driver.findElement(By.cssSelector("button[data-role='accept-consent']"));
        acceptButton.click();
        driver.manage().window().maximize();
        //1.Link Text
        //driver.findElement(By.linkText("Elektronika")).click();
        //2. Css Selector
        driver.findElement(By.cssSelector("div.main-wrapper:nth-child(3) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_k4.carousel-item:nth-child(2) div.opbox-sheet._26e29_11PCu div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_ua.carousel-item:nth-child(2) div.opbox-sheet._26e29_11PCu div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_k4.carousel-item:nth-child(2) div.opbox-sheet._26e29_11PCu div.mjru_ua.mpof_z0.munh_56.m3h2_56._31b7f_FRiq9:nth-child(2) nav.msts_9u.mse2_k4.mjyo_6x._31b7f_2EAjV.mg9e_8.mh36_24.mvrt_24.mpof_5r.mpof_ki_m.myre_zn._31b7f_3eJxT:nth-child(1) div._1v16j.m7er_k4._1n8xp:nth-child(2) div.mg9e_16.mvrt_0.mh36_0.mj7a_0._9plbd._4b3d3_3La74._152v3:nth-child(2) div:nth-child(1) div.mp7g_oh.m7er_56._162a5_1sSS4:nth-child(2) div.mgn2_14.mp0t_0a.mqu1_21.mgmw_wo.mli8_k4.mpof_ki.mwfq_6m.mqen_m6._162a5_2vUHQ:nth-child(1) > a.mgn2_14.mp0t_0a.mgmw_wo.mqu1_21.mj9z_5r.mli8_k4.mqen_m6.l1e4v.l1s57.m7er_k4.mpof_ki.m389_6m.mh36_16._162a5_1dpSQ"));
        WebElement inputField = driver.findElement(By.name("string"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("string")));


        List<WebElement> elements = driver.findElements(By.cssSelector("div[data-box-name='items-v3'] > div >div > section > article"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-box-name='items-v3'] > div >div > section > article")));
        System.out.println(elements.get(15).getText());



    }
}