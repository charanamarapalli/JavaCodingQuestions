package Certification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddApplicant {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/amarapalli-naidu/ChromeDriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        for(int i=37; i<=18*6;i++) {
            driver.get("https://certification.mettl.pro/r8-admit-card/applicant/signup");
            driver.findElement(By.id("Email Address")).sendKeys("bitsuser" + i + "@yopmail.com");
            driver.findElement(By.id("inputPassword")).sendKeys("@Test123");
            driver.findElement(By.id("field-First Name")).sendKeys("bitsuser" + i);
            driver.findElement(By.id("field-Last Name")).sendKeys("lastname");
            driver.findElement(By.xpath("//input[@class='_file-upload imageUpload']"))
                    .sendKeys("/Users/amarapalli-naidu/Downloads/april 30/cand images/image" + (i%18) + ".jpg");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("register-button"))));
            driver.findElement(By.id("register-button")).click();
        }




    }
}
