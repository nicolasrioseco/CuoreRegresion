package MetodosTasas.TasaVariable;

public class Alta_TasaVariable {
	
	private String altaTasaVariable;
	
	public void setaltaTasaVariable(String bodyTasa1, String moneda, String nameSubT, String interes, String bodyTasa2) {

		this.altaTasaVariable = (bodyTasa1 + 
				"[{" + 
				"\"rateSub\": []," + 
				"\"rateTypeMoney\": \"" + moneda + "\"," + 
				"\"rateTypeRate\": {" + 
				"\"id\": 2," + 
				"\"description\": \"Variable\"" + 
				"}," + 
				"\"rateSubTypeRate\": \"" + nameSubT + "\"," + 
				"\"rateInterest\": \"" + interes + "\"," + 
				"\"rateDate\": \"2018-04-19T03:00:00.0Z\"," + 
				"\"rateState\": \"Alta\"" + 
				"}]," + 
				bodyTasa2);
	}

	public String getaltaTasaVariable() {
		return altaTasaVariable;
	}
}
