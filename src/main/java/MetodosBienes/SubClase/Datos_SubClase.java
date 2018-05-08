package MetodosBienes.SubClase;

import utility.Constant;
import utility.ExcelUtils;

public class Datos_SubClase {

	public String name;
	public String description;
	public String valorVersion;
	int iva = 21;
	public String valorTipo;
	
	
	public String setdatos_clase(String bodyClase, String bodyAtributo, String idAtributo, int row) throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Bienes");
		this.name = ExcelUtils.getCellData(row,5);
		this.description = ExcelUtils.getCellData(row,6);
		this.valorVersion = ExcelUtils.getCellData(row,2);
		this.valorTipo = ExcelUtils.getCellData(row,17);
		
		Alta_SubClase subClase = new Alta_SubClase();
		subClase.setSubClase(name, description, bodyClase, bodyAtributo, idAtributo, valorVersion, iva, valorTipo);;
		String post = subClase.getSubClase();
		
		return post;
		
	}
	
	public String getName() {
		return name;
	}
	
}
