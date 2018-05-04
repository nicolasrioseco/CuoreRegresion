package MetodosBienes.Clase;

import utility.Constant;
import utility.ExcelUtils;

public class Datos_Clase {

	public String setdatos_clase(int row) throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Bienes");
		
		String name = ExcelUtils.getCellData(row,3);
		String description = ExcelUtils.getCellData(row,4);;
		
		
		Clase clase = new Clase();
		clase.setaltaClase(name, description);
		String post = clase.getaltaClase();
		
		return post;
		
	}
	
}
