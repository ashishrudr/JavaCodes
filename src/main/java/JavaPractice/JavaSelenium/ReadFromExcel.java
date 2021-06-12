package JavaPractice.JavaSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) {
		List<Employee> ls=new ArrayList<>();
		
		File fl=new File("C://Users//rudra//eclipse-workspace//JavaSelenium//ExcelData.xlsx");
		try {
			FileInputStream fis=new FileInputStream(fl);
			FileOutputStream fout=new FileOutputStream("C://Users//rudra//eclipse-workspace//JavaSelenium//NotePad.txt");
			try {
				XSSFWorkbook xs=new XSSFWorkbook(fis);
				XSSFSheet  xssh=xs.getSheetAt(0);
				
				Iterator<Row> itr=xssh.iterator();
				 while(itr.hasNext()) {
					Row row=itr.next();
					  Iterator<Cell> cell = row.cellIterator();
				while(cell.hasNext()) {
					System.out.println(cell.next());
					fout.write('c');
					
				} 
				 }
				 fout.close();
				// XSSFCell cell=row.getCell(0);
				// System.out.println(cell.getStringCellValue());
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
