package Excel;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class Writing_Data_into_Excel_without_Loops 
{
	//Excel File-->Workbook-->Sheet-->Rows-->Cells
	public static void main(String args[]) throws IOException
	{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		//Crete WorkBook
		XSSFWorkbook workbook = new XSSFWorkbook();
		//Create Sheet
		XSSFSheet sheet = workbook.createSheet();
		
		//Create row, cell and update data without loops
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("C++");
		row1.createCell(2).setCellValue("Java");
		row1.createCell(3).setCellValue("Selenium");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Training");
		row2.createCell(1).setCellValue("Test");
		row2.createCell(2).setCellValue("Job");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("Entering data is done");
		
	}
	
}
