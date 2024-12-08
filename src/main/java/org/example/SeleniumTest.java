package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97150\\IdeaProjects\\mytestproject\\chromedriver\\win64-131.0.6778.109\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:5174/sign-in");
        //driver.findElement(By.id("email")).sendKeys("adnansajid877@gmail.com");
        //driver.findElement(By.id("password")).sendKeys("123456");
//      driver.findElement(By.id("button")).click();
//      driver.findElement(By.xpath("//a[text()='Marketplace']")).click();
        driver.findElement(By.xpath("//a[text()='Dashboard']")).click();
//      driver.findElement(By.xpath("//a[text() ='Contact Us']")).click();
//      driver.findElement(By.xpath("//a[text() = 'Start Selling Solar']")).click();
//      driver.findElement(By.xpath("//a[text() = 'Start Buying Solar']")).click();
//      driver.navigate().refresh();
        WebElement createPostButton =        driver.findElement(By.xpath("//button[contains(text(),'Create Post') or contains(text(),'Hide Create Post')]"));
//              WebElement createPostButton = driver.findElement(By.id("CreatePostButton"));
              createPostButton.click();
            //driver.quit();


    }
}

