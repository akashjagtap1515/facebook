package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class utility {
	//excelsheet data
	
	public  void excelData(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		String path = "E:\\Selenium\\fb excel.xlsx";
		 
		FileInputStream file =new FileInputStream(path);
		
		Sheet s = WorkbookFactory.create(file).getSheet("Login");
		s.getRow(1).getCell(0).getStringCellValue();
		 String user= s.getRow(1).getCell(1).getStringCellValue();
		  
		
	}

}

