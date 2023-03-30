package package1Test;

import java.io.IOException;

import Utilitiesz.Constants;
import Utilitiesz.ExcelUtilities;

public class testingExcelUtilities {

	public static void main(String[] args) throws IOException {
   
      /*  
		//this one just shows the locatioon of data
		Object[][] data =  ExcelUtilities.readExcelFile(Constants.excelDocument_path, "Sheet2");
		// System.out.println(data);
		
		//two dimentional data
		for (int i=0; i<data.length;i++) {
			for (int j =0; j<data[i].length;j++) {
				System.out.println(data[i][j]+" ");
			}
		//this one printing actual content of data
        System.out.println(data);
        
		}
     */
	
	    Object[][] data1 = {{"John", 25, true}, {"Mary", 30, false}, {"Bob", 40, true}};
	    ExcelUtilities.writeExcelFile(Constants.excelDocument_path, "Sheet1", data1);
	    
	    
	    
}
	
	
}