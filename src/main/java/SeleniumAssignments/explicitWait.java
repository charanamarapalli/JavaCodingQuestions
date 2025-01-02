package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class explicitWait {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/amarapalli-naidu/ChromeDriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//label[@class='customradio'] //span[text()=' User']")).click();
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();

        Select select = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
        select.selectByVisibleText("Consultant");

        driver.findElement(By.id("signInBtn")).click();

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
        List<WebElement> webElements = driver.findElements(By.xpath("//*[@class='btn btn-info']"));


        for(int i=0;i<webElements.size();i++){
            webElements.get(i).click();


        }



        driver.findElement(By.partialLinkText("Checkout")).click();

    }











}

