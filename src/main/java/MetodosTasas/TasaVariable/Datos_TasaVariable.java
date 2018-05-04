package MetodosTasas.TasaVariable;

import utility.Constant;
import utility.ExcelUtils;

public class Datos_TasaVariable {

	
	public String setTasaVariable(String bodyTasa, int row) throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Tasas");
		
		String bodyTasa1 = bodyTasa.split("\\[\\],")[0];
		String bodyTasa2 = bodyTasa.split("\\[\\],")[1];
		
		String moneda = ExcelUtils.getCellData(row,1);
		String nameSubT = ExcelUtils.getCellData(row,2);
		String interes = ExcelUtils.getCellData(row,5);
		
		Alta_TasaVariable altaTV = new Alta_TasaVariable();
		altaTV.setaltaTasaVariable(bodyTasa1, moneda, nameSubT, interes, bodyTasa2);
		String post = altaTV.getaltaTasaVariable();
		

		return post;
	}	
}
