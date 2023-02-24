package com.juaracoding.postday14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class posttestday14 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        System.out.println("get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");
        System.out.println("Delay 3 second");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
    }
}