package package1Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilitiesz.Constants;



public class writeExcelTest {

	public static void main(String[] args) throws IOException {

		// open connection to the file
		FileInputStream fs = new FileInputStream(Constants.excelDocument_path);

		// gets a workbook open
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        
        //get sheet index of
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        
        int lastRowNum = sheet.getLastRowNum();
        System.out.println(lastRowNum);
        
        
        for(int i = 0; i<= lastRowNum; i++) {
                Row row = sheet.getRow(i);
                //Row row = sheet.createRow(i);
             //   Cell cell = row.createCell(6);
                Cell cell = row.getCell(6); // Get the cell at index 6
               // if (cell != null) {
                //	row.removeCell(cell);
                 //}
               cell.setCellValue("Hello, hows the project going");
        
                }  
        
        
        FileOutputStream fos = new FileOutputStream(Constants.excelDocument_path);
        
        workbook.write(fos);
        
        fos.close();
	}
}