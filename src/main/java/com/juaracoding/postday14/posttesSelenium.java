package com.juaracoding.postday14;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class posttesSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        System.out.println("get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        driver.findElement(By.id("first-name")).sendKeys("Hadi");
        driver.findElement(By.id("last-name")).sendKeys("Kurniawan");
        driver.findElement(By.id("job-title")).sendKeys("Anu Anu Anu");


        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();

        WebElement selectMenu = driver.findElement(By.id("select-menu"));
        selectMenu.click();
        List<WebElement> options = selectMenu.findElements(By.cssSelector("option[value='1']"));
        options.get(0).click();

        driver.findElement(By.id("datepicker")).sendKeys("10/10/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        System.out.println("===Delay 3 second===");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw  new RuntimeException(e);
        }

        driver.quit();
        System.out.println("Quit Browser");
    }
}
