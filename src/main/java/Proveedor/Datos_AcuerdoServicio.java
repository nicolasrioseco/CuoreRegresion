package Proveedor;

import utility.Constant;
import utility.ExcelUtils;

public class Datos_AcuerdoServicio {
	
	public String nombre;
	public double costo;
	public double markup;
	public String observaciones;

	public String setDatosAcuerdo(int row, String Defoult_URL, String token, String bodyBien, String bodyProveedor) throws Exception {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"AcuerdoServicio");
		
		this.nombre = ExcelUtils.getCellData(row,0);
		this.costo = ExcelUtils.getCellDataint(row,1);
		this.markup = ExcelUtils.getCellDataint(row,2);
		this.observaciones = ExcelUtils.getCellData(row,3);
		
		Alta_AcuerdoServicio acuerdo = new Alta_AcuerdoServicio();
		String post = acuerdo.setAcuerdoServicio(nombre, bodyBien, bodyProveedor, costo, markup, observaciones);
		
		return post;
		
	}

}
