package MetodosTasas.Tasa;

public class Alta_Tasa {

	
	private String altaT;

	public void setAltaT(String moneda, String tipo, String nameSubT, String multiplicador, String tope) {
		
		int id;
		
		if(tipo=="Fija") {
			id=1;
		}else {
			id=2;
		}
		
		this.altaT = ("{" + 
				"\"rateTypeMoney\": \""+ moneda + "\"," + 
				"\"rateTypeRate\": {" + 
				"\"id\": "+ id + "," + 
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
