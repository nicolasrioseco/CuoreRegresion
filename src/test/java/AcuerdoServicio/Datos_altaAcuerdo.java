package AcuerdoServicio;

import utility.ExcelUtils;

public class Datos_altaAcuerdo {
	
	public String setDatosAcuerdo(String bien, String proveedor, int row) throws Exception {
		
		String nombre = ExcelUtils.getCellData(row,1);
		
		Alta_Acuerdo altaAcuerdo = new Alta_Acuerdo();
		altaAcuerdo.setAltaAcuerdo(bien, proveedor, nombre);
		
		String post = altaAcuerdo.getaltaAcuerdo();
		
		
		
		return post;		
	}
	

}
