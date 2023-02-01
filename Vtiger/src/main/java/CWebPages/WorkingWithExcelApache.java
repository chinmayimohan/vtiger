package CWebPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WorkingWithExcelApache {
	@Test
	public void fetchvalue() throws IOException {
	exceldemo("login");

	}
	public static Object[][] exceldemo(String sheetname) throws IOException {
		
		File file=new File("./testdata/testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet(sheetname);
		int rowcount=sheet.getPhysicalNumberOfRows();
		int clm_count=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowcount+" "+clm_count);
		
		Object[][] data=new Object[rowcount-1][clm_count];
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<clm_count;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(" "+data[i][j]+"  ");
			}
			System.out.println();
		}
		return data;
		
	}
	
	

}
