package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;


public class Reading_Excel 
{
	//Excel File -->Workbook-->Sheets-->Rows-->Cells
	public static void main(String args[])throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int row = sheet.getLastRowNum();//Total number of rows
		int col = sheet.getRow(1).getLastCellNum();//Total number  of columns in a row
		
		System.out.println("The no of rows :" +row);
		System.out.println("The no of column :" +col);
		
		for(int r=0;r<=row;r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c=0;c<col;c++)
			{
				//XSSFCell cell = currentRow.getCell(c);
				//String value = cell.toString();
				
				String value = currentRow.getCell(c).toString();
				System.out.print(value + "   ");
			}
			System.out.println("   ");
		}
		workbook.close();
		file.close();
	}
}
