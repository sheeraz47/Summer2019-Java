package day61_ExcelReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcelReadWrite {

	 public static void main(String[] args) throws Exception{

         String path = "/Users/cybertekstudios/Desktop/TestData.xlsx";
         String sheetName = "Sheet1";

         ExcelReadWrite obj = new ExcelReadWrite(path, sheetName);

         String data1 = obj.readData(1, 0);
         System.out.println(data1);

         obj.WriteData(1, 0, "Mehmet");

         String data2 =  obj.readData(1, 0);
         System.out.println( data2 );


		}
}
