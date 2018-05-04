package MetodosTasas.Tasa;

import utility.Constant;
import utility.ExcelUtils;

public class Datos_Tasa {
	
	public String moneda;
	public String tipo;
	public String nameSubT;
	public String multiplicador;  //Si es Fija tiene que ser null
	public String tope;  //Si es Fija tiene que ser null
	
	
	public String setTasa(int row) throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Tasas");
		
		this.moneda = ExcelUtils.getCellData(row,1);
		this.tipo = ExcelUtils.getCellData(row,0);
		this.nameSubT = ExcelUtils.getCellData(row,2);
		this.multiplicador = ExcelUtils.getCellData(row,3);
		this.tope = ExcelUtils.getCellData(row,4);
		
	
		Alta_Tasa tasa = new Alta_Tasa();
		tasa.setAltaT(moneda, tipo, nameSubT, multiplicador, tope);
		String post = tasa.getAltaT();
		
		
		return post;
	
	}
	
	public String getTipo() {
		return tipo;
	}

}
