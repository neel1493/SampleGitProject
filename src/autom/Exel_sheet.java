package autom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel_sheet {
	
	static Sheet sheet;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String Path ="C:\\Users\\HP-PC\\Desktop\\snapshots\\Book1.xlsx";
		FileInputStream file=new FileInputStream(Path);
		sheet=WorkbookFactory.create(file).getSheet("Sheet1");
		
		copydata();
	}
	
	public static void copydata()
	{
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			for(int j=0;j<2;j++)
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
