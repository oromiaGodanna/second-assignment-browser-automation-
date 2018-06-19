package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    WebDriver driver = new ChromeDriver();
    public void facebook(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("someone@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password");

        driver.findElement(By.id("loginbutton")).click();
        System.out.println("You have "+driver.findElement(By.id("notificationsCountValue")).getText()+" notifications u should read.");
        //System.out.println(driver.findElement(By.id("notificationsCountValue")).getText());
        driver.close();
    }
    public static void main(String[] args) {
        Main autotest1 = new Main();
        autotest1.facebook();



    }
}

