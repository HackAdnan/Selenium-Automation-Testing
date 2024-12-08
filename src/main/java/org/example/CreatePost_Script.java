////In this script , the user Adnan Sajid creates Post for sale & logs Out
//
//
//
//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class CreatePost_Script {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97150\\IdeaProjects\\mytestproject\\chromedriver\\win64-131.0.6778.109\\chromedriver-win64\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        try {
//            // Navigate to the SignIn page
//            driver.get("http://localhost:5174/sign-in");
//
//            driver.manage().window().maximize();
//
//            WebElement emailField = driver.findElement(By.id("email"));
//            emailField.sendKeys("adnansajid877@gmail.com");
//
//            Thread.sleep(1500);
//
//            WebElement passwordField = driver.findElement(By.id("password"));
//            passwordField.sendKeys("fast1234");
//
//            Thread.sleep(1500);
//
//            WebElement signInButton = driver.findElement(By.id("button"));
//            signInButton.click();
//
//            System.out.println("Sign In button clicked.");
//
//
//            Thread.sleep(2000);
//
//            WebElement createPostButton = driver.findElement(By.xpath("//button[contains(text(),'Create Post') or contains(text(),'Hide Create Post')]"));
//            createPostButton.click();
//            Thread.sleep(1500);
//
//            System.out.println("Create Post button clicked.");
//
//            WebElement unitsField = driver.findElement(By.name("units"));
//            unitsField.sendKeys("10");
//
//            Thread.sleep(1500);
//
//
//            WebElement priceField = driver.findElement(By.name("price"));
//            priceField.sendKeys("100");
//
//            Thread.sleep(1500);
//
//
//            WebElement locationDropdown = driver.findElement(By.name("location"));
//            Select locationSelect = new Select(locationDropdown);
//            locationSelect.selectByIndex(2);
//
//            Thread.sleep(1500);
//
//
//            WebElement postForSaleButton = driver.findElement(By.xpath("//button[text()='Post for Sale']"));
//            postForSaleButton.click();
//            System.out.println("Post for Sale button clicked.");
//
//            driver.navigate().refresh();
//
//            Thread.sleep(1500);
//            WebElement logoutButton = driver.findElement(By.xpath("//a[@href='/logout']//button[contains(@class, 'bg-red-500')]"));
//            logoutButton.click();
//            System.out.println("Logout button is clicked.");
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Error occurred during login.");
//        } finally {
//            //driver.quit();
//        }
//
//
//
//    }
//}







package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePost_Script {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97150\\IdeaProjects\\mytestproject\\chromedriver\\win64-131.0.6778.109\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the SignIn page
            driver.get("http://localhost:5174/sign-in");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, 10); // Explicit wait

            // Sign In
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            emailField.sendKeys("adnansajid877@gmail.com");

            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("fast1234");

            WebElement signInButton = driver.findElement(By.id("button"));
            signInButton.click();

            System.out.println("Sign In button clicked.");

            // Wait for dashboard to load and "Create Post" button to appear
            WebElement createPostButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Create Post')]")));
            createPostButton.click();
            System.out.println("Create Post button clicked.");

            // Fill out the form
            WebElement unitsField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("units")));
            unitsField.sendKeys("10");

            WebElement priceField = driver.findElement(By.name("price"));
            priceField.sendKeys("100");

            WebElement locationDropdown = driver.findElement(By.name("location"));
            Select locationSelect = new Select(locationDropdown);
            locationSelect.selectByIndex(2); // Adjust index as needed

            // Submit the form
            WebElement postForSaleButton = driver.findElement(By.xpath("//button[text()='Post for Sale']"));
            postForSaleButton.click();
            System.out.println("Post for Sale button clicked.");

            // Wait for form submission and logout button to appear
            WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/logout']//button[contains(@class, 'bg-red-500')]")));
            logoutButton.click();
            System.out.println("Logout button clicked.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occurred during the process.");
        } finally {
            //driver.quit(); // Uncomment to close the browser after execution
        }
    }
}
