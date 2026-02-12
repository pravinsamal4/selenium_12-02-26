package _01_utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _01_excel {

	public static String getdata(int a ,int b ,String data) throws EncryptedDocumentException, IOException { 
		FileInputStream file=new FileInputStream("D:\\practice_selenium\\sept_2025_selenium\\Selenium_parametrization(excel)\\data.xlsx");
		
	String value=	WorkbookFactory.create(file).getSheet(data).getRow(a).getCell(b).getStringCellValue();
	
	return value;
	} 
}
