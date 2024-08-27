package Survey;

import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestFlowNewRR {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/amarapalli-naidu/ChromeDriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //driver.get("https://mettl.xyz/360feedback/respondent/L-nm7X20j6-0Mh4ZmPntG6SbPhtrco_QY9SBv4sriQc");
        driver.get("https://tests.mettl.pro/v2/take-test?ecc=RERO%2FRzJfQ3%2F8jH8zvSh5O9fW0wb6YVnsEYgogo9w%2Fw%3D&showReg=true&showInst=true");
       /* driver.findElement(By.xpath("//button[contains(@class, 'mat-focus-indicator')]")).click();
        driver.findElement(By.cssSelector("span.mat-tooltip-trigger.d-inline-block.mr-2.ng-tns-c246-0.ng-star-inserted")).click();
        Set<String> windowHandles =  driver.getWindowHandles();
        System.out.println(windowHandles.size());
        Iterator<String> it = windowHandles.iterator();
        String window1 = it.next();
        String window2 = it.next();*/

        //driver.switchTo().window(window2);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@aria-label='animation']")));
        driver.findElement(By.xpath("//span[@class='d-md-inline-block d-none'] //button[contains(@class,'btn-primary')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fas fa-xl align-middle fa-check-circle text-tertiary-dark']")));
        driver.findElement(By.id("prcd-btn")).click();
        Thread.sleep(3000);

        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("consentForCheckbox")))).click();
        driver.findElement(By.id("consentForCheckbox")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("start-test-btn")).click();
        Thread.sleep(3000);

        String questions = driver.findElement(By.xpath("//p[@class='mb-0']")).getText();
        System.out.println(questions);
        String[] arr=questions.split("/");
        System.out.println(arr[1]);
        int i=1;
        while(i<=Integer.parseInt(arr[1])){
            driver.findElement(By.linkText(String.valueOf(i))).click();
            List<WebElement> webElements= driver.findElements(By.xpath("//div[contains(@id,'answer')]"));
            System.out.println(webElements.size());
            webElements.get((int)(Math.random()*webElements.size())).click();
            i++;
        }

        //generateRandomNumber();


        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='d-md-inline-block d-none'] //button[contains(@class,'btn-primary')]'"))).click();

    }

    public static void generateRandomNumber(){
        int randomNumber = (int)(Math.random()*5);
        System.out.println(randomNumber);
    }
}
