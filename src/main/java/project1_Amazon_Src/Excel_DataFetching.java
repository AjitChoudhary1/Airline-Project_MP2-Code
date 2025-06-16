package project1_Amazon_Src;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excel_DataFetching {

	public static String un1;
	public static String pwd1;
	
	public static String un2;
	public static String pwd2;
	
	public static String un3;
	public static String pwd3;
	
	public void LoginData() throws EncryptedDocumentException, IOException
	{
		  FileInputStream f1= new FileInputStream("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs2\\Excel Sheet\\Login Details.xlsx");
	       
	        Workbook w1=  WorkbookFactory.create(f1);			           
	        
	        
	         un1 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(0).getCell(0).getNumericCellValue());
	         pwd1 = w1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
	      
	         
	         un2 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(2).getCell(0).getNumericCellValue());
		     pwd2 = w1.getSheet("Login").getRow(2).getCell(1).getStringCellValue();
	         
		     un3 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(4).getCell(0).getNumericCellValue());
		     pwd3 = w1.getSheet("Login").getRow(4).getCell(1).getStringCellValue();
	}
}
