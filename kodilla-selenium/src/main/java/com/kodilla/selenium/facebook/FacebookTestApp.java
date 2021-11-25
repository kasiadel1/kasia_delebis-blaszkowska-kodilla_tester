package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\katar\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.xpath("//button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();


        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[3]")));

    /*    WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);*/
//albo
        WebElement yearCombo = driver.findElement(
                By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));

        Select yearSelect = new Select(yearCombo);
        yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);

    }
}


