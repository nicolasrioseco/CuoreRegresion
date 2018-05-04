package MetodosBienes.Bienes;

import utility.Constant;
import utility.ExcelUtils;

public class Datos_Bien {
	
	public String datosBien(String idClase, String idSubClase, String idAsocMarca, String idModelo, String tipificacion, 
							String patentable, String semaforo, String iva, String bodyAtributo, String idAtributo, int row) throws Exception {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Bienes");

		String nameAtributo = ExcelUtils.getCellData(row,0);
		String valorVersion = ExcelUtils.getCellData(row,2);
		String nameClase = ExcelUtils.getCellData(row,3);
		String descriptionClase = ExcelUtils.getCellData(row,4);
		String nameSubClase = ExcelUtils.getCellData(row,5);
		String descriptionSubClase = ExcelUtils.getCellData(row,6);
		String nameMarca = ExcelUtils.getCellData(row,7);
		String descriptionMarca = ExcelUtils.getCellData(row,8);
		String nameModelo = ExcelUtils.getCellData(row,9);
		String descriptionModelo = ExcelUtils.getCellData(row,10);
		
		Alta_Bien altaBien = new Alta_Bien();
		altaBien.setaltaClase(idClase, nameClase, descriptionClase, idSubClase, nameSubClase, descriptionSubClase, idAsocMarca, nameMarca, descriptionMarca, 
								idModelo, nameModelo, descriptionModelo, nameAtributo, valorVersion, tipificacion, patentable, semaforo, iva, bodyAtributo, idAtributo);
		
		String post = altaBien.getaltaClase();
		return post;
	}

}
