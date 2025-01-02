package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class SelectDate {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/amarapalli-naidu/ChromeDriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".react-date-picker__calendar-button")).click();

        String date ="12";
        String month ="November";
        String year ="2004";
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();


        driver.findElement(By.cssSelector(".react-calendar__navigation__prev-button")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__prev-button")).click();

        driver.findElement(By.xpath("//*[text()='"+year+"']")).click();
        driver.findElement(By.xpath("//*[text()='"+month+"']")).click();
        driver.findElement(By.xpath("//*[text()='"+date+"']")).click();

        List<WebElement> webElementList= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        int i=0;
        while(webElementList.size()>i){
            System.out.println(webElementList.get(i).getAttribute("value"));
            i++;
        }






    }
}
