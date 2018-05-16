package Impuestos;

public class ConfImpuestos {

	private String confImpuesto;
	
	public void setconfImpuesto(int idProv, String provincia, String dador, int idDador, int periodicidad, String tipoAlicuota, 
								double porcentaje, String concepto) {

		
			this.confImpuesto = 
							("["
							+ "{" +  
							"\"sealTaxId\": null," + 
							"\"provinceId\": {" + 
									"\"codCountry\": \"AR\"," + 
									"\"codProvincia\": \"AR-F\"," + 
									"\"id\": " + idProv + "," + 
									"\"provincia\": \"" + provincia + "\"" +
							 "}," +
							"\"sealTaxAliquotFlag\": \"No\"," + 
							"\"sealTaxAliquotI\": \"" + porcentaje + "\"," + 
							"\"sealTaxAliquotM\": \"" + porcentaje + "\"," + 
							"\"sealTaxAmountperSheet\": null," + 
							"\"sealTaxExcedentFlag\": \"No\"," + 
							"\"sealTaxIsExemptMinimum\": true," + 
							"\"sealTaxFixedAmount\": null," + 
							"\"sealTaxLessorFlag\": \"No\"," + 
							"\"sealTaxIsMinimumPayment\": false," + 
							"\"sealTaxMinimumTax\": null," + 
							"\"sealTaxMinimumTaxableBase\": null," + 
							"\"sealTaxState\": \"Alta\"," + 
							"\"sealTaxIsSurplus\": true," + 
							"\"sealTaxIsTaxableMinimum\": false," + 
							"\"sealTaxTitle\": \"Contrato Leasing\"," + 
							"\"sealTaxTypeAliquot\": \"" + tipoAlicuota + "\"," + 
							"\"sealTaxTypeValidation\": null," + 
							"\"taxSurplusList\": []," + 
							"\"reductionAliList\": []," + 
							"\"lessorConfList\": ["
									+ "{" + 
									"\"lessorConfId\": null," + 
									"\"lessorConfPeriod\":" + periodicidad + "," + 
									"\"lessor\": {" + 
											"\"applyImpBenefit\": false," + 
											"\"lessorId\": " + idDador + "," + 
											"\"lessorName\": \"" + dador + "\"}"
									+ "}"
							+ "]," + 
							"\"sealTaxTaxableBase\": ["
							+ "{" +
									"\"sealTaxTaxableBaseId\": null," + 
									"\"sealTaxTaxableBaseIsIva\": false," + 
									"\"taxableBase\": {" + 
									"\"taxableBaseId\": 1," + 
									"\"taxableBaseName\": \"" + concepto + "\"," + 
									"\"taxableBaseVal\": 3.1" + 
							"}" +
							"}" +
							"]" +
							"}" +
							"]");

		}

	
	public String getconfImpuesto() {
		return confImpuesto;
	}
}
