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

public class Activateaccount {
    public static void main(String args[]) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "G:/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*");
		 */

        WebDriver driver = new ChromeDriver();


        Workbook workbook = new SubmitPreferences().loadExcel();
        {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                String url = row.getCell(0).getStringCellValue();

                driver.get(url);
                
                driver.findElement(By.id("password")).sendKeys("@Test123");
                driver.findElement(By.id("confirm-password")).sendKeys("@Test123");
                driver.findElement(By.xpath("//button//span")).click();
            }

            driver.quit();

        }
    }

    public Workbook loadExcel() throws IOException {

    	FileInputStream fileInputStream = new FileInputStream("G:/Downloads/Book1.xlsx");
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