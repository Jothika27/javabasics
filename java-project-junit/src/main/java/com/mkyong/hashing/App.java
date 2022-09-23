package com.mkyong.hashing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class App {
    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://talentx.kgisl.com/");
        // driver.get("file:///D:/my%20project/contact.html");
        driver.get("file:///D:/jothika/html/New.html");
        WebElement user = driver.findElement(By.id("Username"));
        WebElement user1=driver.findElement(By.id("mob"));
        user.sendKeys("jothika");
        user1.sendKeys("6381166376");
        System.out.println( driver.getTitle());
       System.out.println( driver.getPageSource());
       System.out.println(driver.getCurrentUrl());
    }
}
