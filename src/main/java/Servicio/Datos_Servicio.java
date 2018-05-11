package Servicio;

import utility.ExcelUtils;

public class Datos_Servicio {
	
	public String setdatosServicio(int row, String bodyBien, String bodyAcuerdo) throws Exception{
		
		String name = ExcelUtils.getCellData(row,0);
		int dador = (int) ExcelUtils.getCellDataint(row,17);
		int facturado = (int) ExcelUtils.getCellDataint(row,18);
		
		Alta_Servicio clase = new Alta_Servicio();
		clase.setaltaServicio(name, dador, facturado, bodyBien, bodyAcuerdo);
		String post = clase.getaltaServicio();
		
		return post;
	}
}