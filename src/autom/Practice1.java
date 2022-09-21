package autom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream fs=new FileInputStream("D:\\screenshot\\Book1.xlsx");
	Sheet sheet=WorkbookFactory.create(fs).getSheet("Sheet1");
	double value=sheet.getRow(0).getCell(0).getNumericCellValue();	
		System.out.println(value);
		
		
		
	}		
		
		
		
		
		
		
		
		
			
//
//		Dimension d=new Dimension(500,500);
//		driver.manage().window().setSize(d);
//		Point p=new Point(500,500);
//		driver.manage().window().setPosition(p);
//		
	

}
