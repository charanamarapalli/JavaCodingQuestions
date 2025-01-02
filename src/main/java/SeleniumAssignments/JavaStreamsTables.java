package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JavaStreamsTables {
    public static void main(String[] args) {
        /*System.setProperty("webdriver.chrome.driver", "/Users/amarapalli-naidu/ChromeDriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//thead/tr/th[1]"));

        List<String> str;
        do {
            List<WebElement> webElementList = driver.findElements(By.xpath("//tr/td[1]"));
            str = webElementList.stream().filter(s -> s.getText().equals("Orange")).map(s -> getVeggieCost(s)).collect(Collectors.toList());
            str.forEach(a -> System.out.println(a));
            if(str.size()<1){
                driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
            }
        }
        while(str.size()<1);*/

    }

    public static String getVeggieCost(WebElement s){
        return s.findElement(By.xpath("following-sibling::td[1]")).getText();

    }
}
