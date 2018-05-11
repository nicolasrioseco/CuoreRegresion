package MetodosBienes.Atributo;

import utility.ExcelUtils;

public class Datos_Atributo {

	public String nombre;
	public String descripcion;


	public String setdatos_atributo(int row) throws Exception{
		
		this.nombre = ExcelUtils.getCellData(row,0);
		this.descripcion = ExcelUtils.getCellData(row,1);

		Atributo atributo = new Atributo();
		atributo.setaltaAtributo(nombre, descripcion);
		String post = atributo.getaltaAtributo();		


		return post;

	}

}
