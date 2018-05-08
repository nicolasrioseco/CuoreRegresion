package Producto;

import junit.framework.TestCase;
import utility.ExcelUtils;

public class Datos_Producto extends TestCase {
	
	public String setDatos_Productos(String bienID,String claseID, String claseName, String claseDescription, String subClaseID,
			String subClaseName, String subClaseDescription, String marcaID, String marcaName, String marcaDescription, 
			String modeloID, String modeloName, String modeloDescription, String version) throws Exception{



		String productoName = ExcelUtils.getCellData(1,12);

		

		Alta_Producto objProducto = new Alta_Producto();
		objProducto.setAltaProducto(bienID, claseID, claseName, claseDescription, subClaseID, subClaseName, subClaseDescription, 
				marcaID, marcaName, marcaDescription, modeloID, modeloName, modeloDescription, version,productoName);
		String variable_json = objProducto.getAltaProducto();
		
		
		return variable_json;
	}
}

