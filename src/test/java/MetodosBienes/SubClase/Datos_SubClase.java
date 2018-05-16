package MetodosBienes.SubClase;

import utility.ExcelUtils;

public class Datos_SubClase {

	public String name;
	public String description;
	public String valorVersion;
	int iva = 21;
	public String valorTipo;
	public String valorTipoSeg;
	public String valorClasSeg;
	
	public String setdatos_clase(String bodyClase, String bodyAtributo, String idAtributo, int row, String bodyTipificacion, 
			String idTipificacion, String bodyPatentable, String idPatentable, String bodySemaforo, String idSemaforo, String bodyIva, 
			String idIva, String tipoSeguro, String idTipoSeg, String claseSeguro, String idClasSeg) throws Exception{
		
		this.name = ExcelUtils.getCellData(row,5);
		this.description = ExcelUtils.getCellData(row,6);
		this.valorVersion = ExcelUtils.getCellData(row,2);
		this.valorTipo = ExcelUtils.getCellData(row,17);
		this.valorTipoSeg = ExcelUtils.getCellData(row,21);
		this.valorClasSeg = ExcelUtils.getCellData(row,23);
		
		Alta_SubClase subClase = new Alta_SubClase();
		subClase.setSubClase(name, description, bodyClase, bodyAtributo, idAtributo, valorVersion, iva, valorTipo, 
				bodyTipificacion, idTipificacion, bodyPatentable, idPatentable, bodySemaforo, idSemaforo, 
				bodyIva, idIva,	tipoSeguro, idTipoSeg, claseSeguro, idClasSeg, valorTipoSeg, valorClasSeg);;
		String post = subClase.getSubClase();
		
		return post;	
	}
	
	public String getName() {
		return name;
	}
}
