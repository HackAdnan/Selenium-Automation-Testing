package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyPost_Script {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97150\\IdeaProjects\\mytestproject\\chromedriver\\win64-131.0.6778.109\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();





        try {

            driver.get("http://localhost:5174/sign-in");


            WebDriverWait wait = new WebDriverWait(driver, 10); // Explicit wait

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            emailField.sendKeys("k225175@nu.edu.pk");

            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("fast1234");

            WebElement signInButton = driver.findElement(By.cssSelector("button.bg-indigo-600"));
            signInButton.click();

            System.out.println("Sign In button clicked.");


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred during the automation process.");
        } finally {
            driver.quit();
        }

    }
}
