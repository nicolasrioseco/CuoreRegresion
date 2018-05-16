package MetodosTasas.Tasa;

public class Alta_Tasa {

	
	private String altaT;

	public void setAltaT(String moneda, String tipo, int idTipo, String nameSubT, String multiplicador, String tope) {
		

		this.altaT = ("{" + 
				"\"rateTypeMoney\": \""+ moneda + "\"," + 
				"\"rateTypeRate\": {" + 
				"\"id\": "+ idTipo + "," + 
				"\"description\": \"" + tipo + "\"" + 
				"}," + 
				"\"rateSubTypeRate\": \"" + nameSubT +"\"," + 
				"\"rateIsMultiplier\": " + multiplicador + "," + 
				"\"rateIsTop\": " + tope + "," + 
				"\"rateState\": \"Alta\"" + 
				"}");
		
	}
	
	public String getAltaT() {
		return altaT;
	}
	
}
