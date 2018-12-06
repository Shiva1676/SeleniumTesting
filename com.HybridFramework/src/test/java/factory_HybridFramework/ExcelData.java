/**
 * 
 */
package factory_HybridFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Lenovo
 *
 */
public class ExcelData {

	XSSFWorkbook wb;

	public Object[][] getData(String excelLocation, String sheetname) {

		try {
			File src = new File(excelLocation);

			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("=========Unable to load excel=========");
			
			System.out.println(e.getMessage());
		} 
		
		
		XSSFSheet  sh = wb.getSheet(sheetname);
		
		int rows = sh.getPhysicalNumberOfRows();
		
		int columns = sh.getRow(0).getLastCellNum();
		
		Object[][] arr = new Object[rows][columns];
		
		for(int i=0; i<rows; i++){
			
			for(int j=0; j<columns; j++){
				
				XSSFCell cell = wb.getSheet(sheetname).getRow(i).getCell(j);
				
				if(cell!=null){
					
					DataFormatter df = new DataFormatter();
					
					arr[i][j] = df.formatCellValue(cell);
					
				}
			}
		}
		
		return arr;
	}

}
