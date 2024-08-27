package Certification;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class SubmitPreferences {
    public static void main(String args[]) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/amarapalli-naidu/ChromeDriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);


        Workbook workbook = new SubmitPreferences().loadExcel();
        {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                String userName = row.getCell(0).getStringCellValue();

                driver.get("https://certification.mettl.pro/r8-admitcard-2/applicant/login");
                driver.findElement(By.id("inputEmail")).sendKeys("one@yopmail.com");
                System.out.println(userName);
                driver.findElement(By.id("inputPassword")).sendKeys("@Test123");
                driver.findElement(By.id("login")).click();

                driver.findElement(By.partialLinkText("Register for Test"));
                driver.get("https://certification.mettl.pro/r8-admitcard-2/applicant/register-for-test");
                selectSemester(driver);

                driver.findElement(By.xpath("//span[@class= 'MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-chh9cp']")).click();
                System.out.println("entered");
                WebElement l = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
                //WebElement l = driver.findElement(By.xpath("//button[contains(@class, 'MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-9owtry')]"));
                JavascriptExecutor jscript = (JavascriptExecutor) driver;
                jscript.executeScript("arguments[0].scrollIntoView(true);", l);
                l.click();

                driver.get("https://certification.mettl.pro/admitcard-bulktesting/applicant/logout");
            }

            driver.quit();



        }
    }

    public Workbook loadExcel() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("/Users/amarapalli-naidu/Automation/src/main/resources/learning.xlsx");
        Workbook workbook = new XSSFWorkbook(fileInputStream);

        return workbook;
    }

    public static void selectSemester(WebDriver driver){
        driver.findElement(By.cssSelector("#semester-select")).click();
        driver.findElement(By.cssSelector("li[data-value='Semester 2']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#exam-cycle-select")));
        driver.findElement(By.cssSelector("#exam-cycle-select")).click();
        driver.findElement(By.cssSelector("li[data-value='Cycle 2']")).click();

    }

    public static void waitForElementToBeClickable(WebDriver driver){

    }
}