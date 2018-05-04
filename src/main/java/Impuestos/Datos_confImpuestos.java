package Impuestos;

import utility.Constant;
import utility.ExcelUtils;

public class Datos_confImpuestos {

	public String setdatosImpuestos(int row) throws Exception {
		
		
//		Listado de Provincias e id:
//		1-> Provincia de Buenos Aires, 2->CABA, 3-> Catamarca, 4 -> Chaco, 5 -> Chubut, 6 -> Córdoba, 7 -> Corrientes, 8 -> Entre Rios
//		9 -> Formosa, 10 -> Jujuy, 11 -> La Pampa, 12 -> La Rioja, 13 -> Mendoza, 14 -> Misiones, 15 -> Neuquén, 16 -> Río Negro,
//		17 -> Salta, 18 -> San Juan, 19 -> San Luis, 20 -> Santa Cruz, 21 -> Santa Fe, 22 -> Santiago del Estero,
//		23 -> Tierra del Fuego, 24 -> Tucumán
		
//		Dadores e id:
//		TCC -> 1, COMAFI -> 2
		
//		Periodicidad:
//		15 -> Quincenal, 30 -> Mensual
		
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Impuestos");
		
		int idProv = (int) ExcelUtils.getCellDataint(row,7);
		String provincia = ExcelUtils.getCellData(row,0);
		String dador = ExcelUtils.getCellData(row,1);
		int idDador = (int) ExcelUtils.getCellDataint(row,8);
		int periodicidad = (int) ExcelUtils.getCellDataint(row,2);
		String tipoAlicuota = "General";//esta versión solo va a configurar alicuotas generales
		double porcentaje = ExcelUtils.getCellDataint(row,3);
		String concepto = ExcelUtils.getCellData(row,4); //es el único vigente, corregir cuando se carge toda la parametría en la app
		
		
		
		ConfImpuestos datosImpuestos = new ConfImpuestos();
		datosImpuestos.setconfImpuesto(idProv, provincia, dador, idDador, periodicidad, tipoAlicuota, porcentaje, concepto);
		String post = datosImpuestos.getconfImpuesto();
		
		
		return post;
	}
	
}
