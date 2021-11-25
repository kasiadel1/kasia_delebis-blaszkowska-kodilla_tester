package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\katar\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        driver.findElement(By.xpath("/html/body/div[2]/div[8]/div/div/div/div/div[2]/div[2]/button[1]")).click();
        //copy xpath
     // driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[1]/div/div/div/div/div/div[2]/div/nav/div/div/div[2]/div/div/div[1]/a")).click();
        //klasa +szukanie po tekscie
        driver.findElement(By.xpath("//a[starts-with(text(),'Elektronika') and contains(@class, 'mgn2_14 mp0t_0a mgmw_wo mqu1_21 mj9z_5r mli8_k4 mqen_m6 l1e4v l1s57 m7er_k4 mpof_ki m389_6m mh36_16 _162a5_1dpSQ')]")).click();
        WebElement inputField = driver.findElement(By.name("string"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

    }
}
