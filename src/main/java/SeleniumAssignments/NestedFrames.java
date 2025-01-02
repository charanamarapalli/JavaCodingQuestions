package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NestedFrames {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/amarapalli-naidu/ChromeDriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.partialLinkText("Nested Frames")).click();

        driver.switchTo().frame(driver.findElement(By.name("frame-top")));
        driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
        /*driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");*/

        String text = driver.findElement(By.id("content")).getText();
        System.out.println(text);

    }
}
