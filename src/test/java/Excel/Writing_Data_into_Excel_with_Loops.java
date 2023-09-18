package Excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_into_Excel_with_Loops 
{
	//Excel File-->Workbook-->Sheet-->Rows-->Cells
		public static void main(String args[]) throws IOException
		{
			FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile1.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet();
			
			//Create row, cell and update data without loops
			Scanner sc = new Scanner(System.in);
			
			for(int r=0;r<=3;r++)
			{
				XSSFRow CurrentRow = sheet.createRow(r);//create row
				
				for(int c=0;c<2;c++)
				{
					//CurrentRow.createCell(c).setCellValue("Welcome");//Create cell and set Value
					
					System.out.println("Enter the values");
					String value = sc.next();
					CurrentRow.createCell(c).setCellValue(value);
				}
			}
			workbook.write(file);
			workbook.close();
			file.close();
			System.out.println("Entering data is done");
			
		}

}
