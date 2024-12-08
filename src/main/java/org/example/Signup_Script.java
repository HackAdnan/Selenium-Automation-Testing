package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup_Script {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97150\\IdeaProjects\\mytestproject\\chromedriver\\win64-131.0.6778.109\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:5174/sign-up");
        driver.findElement(By.id("username")).sendKeys("Adnan Sajid");

        Thread.sleep(1500);
        driver.findElement(By.id("email")).sendKeys("adnansajid877@gmail.com");
        Thread.sleep(1500);

        driver.findElement(By.id("password")).sendKeys("fast1234");
        Thread.sleep(1500);
        WebElement SignupButton = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
        Thread.sleep(1500);
        SignupButton.click();
    }

}
