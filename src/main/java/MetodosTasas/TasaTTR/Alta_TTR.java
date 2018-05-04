package MetodosTasas.TasaTTR;

public class Alta_TTR {
	
	private String altaTTR;
	public String topMin;
	
	public void setaltaTTR(int dador, String moneda, String tipo, String nameSubT, int vidaMedia, double interes, String multiplicador, String tope, double valorTopeMin) {

		if(tope.equals("true")) {
			this.topMin = ("\"" + valorTopeMin + "\"");
		}else {
			this.topMin = ("null");
		}
		
			this.altaTTR = 
						("{" + 
						"\"transferenceRateCompany\": \"" + dador + "\"," + 
						"\"transferenceRateTypeMoney\": \"" + moneda + "\"," + 
						"\"transferenceRateTypeRate\": \"" + tipo + "\"," + 
						"\"transferenceRateSubTypeRate\": \"" + nameSubT + "\"," + 
						"\"transferenceRatePeriodicity\": \"meses\"," + 
						"\"transferenceRateHalflife\": \"" + vidaMedia + "\"," + 
						"\"transferenceRateInterest\": \"" + interes + "\"," + 
						"\"transferenceRateIsMultiplier\": " + multiplicador + "," + 
						"\"transferenceRateIsTop\": null," + 
						"\"transferenceRateTypeTopMin\": null," + 
						"\"transferenceRateValueTopMin\": " + topMin + "," + 
						"\"transferenceRateTypeTopMax\": null," + 
						"\"transferenceRateValueTopMax\": null," + 
						"\"transferenceRateState\": \"Alta\"" + 
						"}");
	}

	public String getaltaTTR() {
		return altaTTR;
	}
}
