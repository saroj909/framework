package generic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcelData implements Autoconstant
{  
	public static String excellLibrary(String sheet, int row, int cell) throws Exception 
	{
		FileInputStream fis =new FileInputStream(excelfile);
		Workbook wb =new XSSFWorkbook(fis);
		Sheet s = wb.getSheet(sheet);
		String cellvaule= s.getRow(row).getCell(cell).getStringCellValue();
		return cellvaule;
		
		
   // :- now we can write data inside the excel sheet also .
//		File excelldoc= new File("C:\\Users\\saroj\\OneDrive\\Desktop\\doc\\excel\\sss - Copy.xlsx");
//		FileInputStream fi = new  FileInputStream(excelldoc);
//		Workbook wb =new XSSFWorkbook(fi);
//		Sheet s =wb.getSheet("saroj");
//		Row r=s.createRow(3);
//		Cell c =r.createCell(0);
//		c.setCellValue("demo");
//		FileOutputStream fo= new FileOutputStream(excelldoc);
//		wb.write(fo);
//		System.out.println(c.getStringCellValue());
		
	}
}