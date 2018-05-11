package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

	public static Workbook Workbook;

	private static org.apache.poi.ss.usermodel.Cell Cell;

	private static Row Row;

	private static Sheet ExcelWSheet;

	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

	public static void setExcelInicial(String Path) throws Exception {

		try {

			System.out.println("Abriendo el documento TestData.xlsx");
			FileInputStream ExcelFile = new FileInputStream(Path);

			System.out.println("Accediendo al documento");
			System.out.println("Esta tarea puede demorar unos segundos");
			ExcelUtils.Workbook  = new XSSFWorkbook(ExcelFile);
			System.out.println("Acceso establecido exitosamente");
			System.out.println("\n*************************************************************************\n");
		} catch (Exception e){

			throw (e);

		}

	}
	
	public static void setExcelFile(String SheetName) throws Exception {

		try {
			
			ExcelWSheet = Workbook.getSheet(SheetName);
		} catch (Exception e){

			throw (e);

		}

	}

	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum){

		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;


		}catch (Exception e){
			return"";

		}
		
	}
		public static double getCellDataint(int RowNum, int ColNum){

			try{

				Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

				double CellData = Cell.getNumericCellValue();

				return CellData;


			}catch (Exception e){
				return 0;

			}

	}

	//This method is to write in the Excel cell, Row num and Col num are the parameters

	public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

		try{

			Row  = ExcelWSheet.getRow(RowNum);

			Cell = Row.getCell(ColNum);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

			// Constant variables Test Data path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);

			Workbook.write(fileOut);

			fileOut.flush();

			fileOut.close();

		}catch(Exception e){

			throw (e);

		}

	}

}