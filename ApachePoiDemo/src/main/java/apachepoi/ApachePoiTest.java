package apachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoiTest {
	
	public static void main(String[] args) {
		
		try {
			Workbook w=new XSSFWorkbook(new FileInputStream("C:\\Users\\Nikhil Tripathi\\Documents\\ExelSheet.xlsx"));
			Sheet s=w.getSheet("Sheet1");
			
			FormulaEvaluator f = w.getCreationHelper().createFormulaEvaluator();
			
			for(Row r: s){
				for (Cell c:r) {
					switch (f.evaluateInCell(c).getCellType()) {
					case NUMERIC:System.out.print(c.getNumericCellValue()+ "\t\t"); 
						
						break;
					case STRING:System.out.print(c.getStringCellValue() + "\t\t");
						break;
					default:
						break;

					}
					
				}
				System.out.println();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
