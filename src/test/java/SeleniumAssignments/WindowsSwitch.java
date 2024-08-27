package SeleniumAssignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class WindowsSwitch {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/amarapalli-naidu/ChromeDriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.partialLinkText("Multiple Windows")).click();

        driver.findElement(By.partialLinkText("Click Here")).click();

        Set<String> windows=  driver.getWindowHandles();

        Iterator<String> it = windows.iterator();

        String window1 = it.next();
        String window2 = it.next();

        driver.switchTo().window(window2);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());

        driver.switchTo().window(window1);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());










    }
}
