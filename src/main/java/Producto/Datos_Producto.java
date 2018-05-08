package Producto;

import junit.framework.TestCase;
import utility.Constant;
import utility.ExcelUtils;

public class Datos_Producto extends TestCase {
	
	public static String nombreProducto;
	
	public String setDatos_Productos(int row, String bodyBien) throws Exception{

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Producto");
		Datos_Producto.nombreProducto = ExcelUtils.getCellData(row,12);
		String feeDador = ExcelUtils.getCellData(row,2);
		String feeImpoDador = ExcelUtils.getCellData(row,4);
		String valorFeeAdm = ExcelUtils.getCellData(row,3);
		String valorFeeImpo = ExcelUtils.getCellData(row,5);
		String tna = ExcelUtils.getCellData(row,6);

		Alta_Producto objProducto = new Alta_Producto();
		objProducto.setAltaProducto(nombreProducto, feeDador, feeImpoDador, bodyBien, valorFeeAdm, valorFeeImpo, tna);
		String variable_json = objProducto.getAltaProducto();
		
		return variable_json;
	}
}

