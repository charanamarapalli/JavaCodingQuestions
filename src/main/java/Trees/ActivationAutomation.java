package Trees;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ActivationAutomation {


    public static void main(String args[]) throws IOException {

        System.setProperty("webdriver.chrome.driver", "/Users/amarapalli-naidu/ChromeDriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        Workbook workbook = new ActivationAutomation().loadExcel();
        { Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet)
            { String url = row.getCell(0).getStringCellValue();
                driver.get(url);
                driver.findElement(By.id("password")).sendKeys("@Test123");
                driver.findElement(By.id("confirmPassword")).sendKeys("@Test123");
                driver.findElement(By.xpath("//button[contains(text(),'Create password')]")).click();
            }
            driver.quit();
        }
    }

    public Workbook loadExcel() throws IOException {
        //InputStream inputStream = getClass().getResourceAsStream("Book1123.xlsx");

        FileInputStream fileInputStream = new FileInputStream("/Users/amarapalli-naidu/Automation/src/main/resources/democopy.xlsx");

        Workbook workbook = new XSSFWorkbook(fileInputStream);

        return workbook;
    }
}
