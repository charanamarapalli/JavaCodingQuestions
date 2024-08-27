package Excels;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class ExcelCreation {
    static int startRow, currentRow=0;

    public static void main(String args[]) throws InterruptedException, IOException {


        //FileInputStream fileInputStream = new FileInputStream("/Users/amarapalli-naidu/Automation/src/main/resources/automationcopy.xlsx");
        Workbook workbook = new XSSFWorkbook();
        {
            Sheet sheet = workbook.createSheet("Sheet1");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("SeekerName");
            headerRow.createCell(1).setCellValue("SeekerEmail");
            headerRow.createCell(2).setCellValue("ProviderName");
            headerRow.createCell(3).setCellValue("ProviderEmail");
            headerRow.createCell(4).setCellValue("Role");

            String[] roles = {"Peer", "Direct Report", "Manager", "Customer"};
            Random rd = new Random();
            int randomIndex = rd.nextInt(roles.length);

            for (int j = 1; j <= 20; j++) {
                String seeker = "seekernew"+j;
                String seekerEmail = seeker+"@yopmail.com";

                for (int i = 1; i <= 80; i++) {
                    String provider = "provider" + i + randomString(5);
                    Row row = sheet.createRow((j-1)*80+i);
                    row.createCell(0).setCellValue(seeker);
                    row.createCell(1).setCellValue(seekerEmail);
                    row.createCell(2).setCellValue(provider);
                    row.createCell(3).setCellValue(provider + "@yopmail.com");
                    row.createCell(4).setCellValue(roles[rd.nextInt(roles.length)]);
                }
            }
        }

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/amarapalli-naidu/Downloads/bulkexcel3601.xlsx");
        workbook.write(fileOutputStream);
    }

    public static String randomString(int len) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }



}
