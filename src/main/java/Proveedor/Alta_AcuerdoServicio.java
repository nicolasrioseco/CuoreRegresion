package Proveedor;

public class Alta_AcuerdoServicio {
	
	public String acuerdoServicio;
	public String bpmAcuerdoCreate;
	public String aprobarAcuerdo;
	public String observaciones;
	public String bpmAcuerdoComplete;
	public String idAcuerdo;
	
	public String setAcuerdoServicio(String nombre, String bodyBien, String bodyProveedor, double costo, double markup, String observaciones) {

		this.observaciones = observaciones;
		double precio = (costo+markup);
		this.acuerdoServicio = ("{" + 
				"\"goods\": [" + 
				"{" + 
				"\"good\": " + bodyBien + "," + 
				"\"cost\": " + costo + "," + 
				"\"price\": " + precio + "," + 
				"\"markup\": " + markup +  
				"}]," + 
				"\"nodes\": []," + 
				"\"channels\": [" + 
				"{" + 
				"\"description\": \"EDN\"," + 
				"\"id\": 1," + 
				"\"parentChannel\": null" + 
				"}]," + 
				"\"brokers\": []," + 
				"\"vendors\": []," + 
				"\"supplier\": " + bodyProveedor + "," + 
				"\"name\": \"" + nombre + "\"," + 
				"\"validFrom\": \"2018-04-20T03:00:00.000Z\"," + 
				"\"validUntil\": \"2018-05-06T03:00:00.000Z\"," + 
				"\"servicePeriodicity\": \"2\"," + 
				"\"hasSupplierBilling\": true," + 
				"\"chargedWithPercentage\": false," + 
				"\"chargedWithCurrency\": true," + 
				"\"currency\": {" + 
				"\"id\": \"\"" + 
				"}," + 
				"\"appliesRefund\": false," + 
				"\"hasEventQuantity\": false," + 
				"\"minimumQuantity\": null," + 
				"\"comissionValue\": null," + 
				"\"chargeClientPerEvent\": false," + 
				"\"appliesFixedValue\": false," + 
				"\"chargedValue\": null," + 
				"\"feeValue\": null," + 
				"\"paymentPeriodicity\": null," + 
				"\"appliesBilling\": true," + 
				"\"appliesUnifiedPrice\": true," + 
				"\"unitaryPrice\": " + costo + "," + 
				"\"appliesUnifiedMarkup\": false," + 
				"\"markupValue\": null," + 
				"\"appliesPercentageValueMarkup\": true," + 
				"\"appliesFixedValueMarkup\": false," + 
				"\"observations\": \"" + observaciones + "\"," + 
				"\"stateServiceAgreement\": {" + 
				"\"statusDate\": \"2018-04-26T15:11:34.480Z\"," + 
				"\"observation\": \"Observaciones\"," + 
				"\"name\": \"Borrador\"," + 
				"\"entityType\": \"ACUERDO\"," + 
				"\"masterStatus\": {" + 
				"\"id\": 14" + 
				"}}}");
		
		return acuerdoServicio;
	}
	
	
	public String setBPMacuerdoCreate(String idAcuerdo) {
		
		this.idAcuerdo = idAcuerdo;
		
		this.bpmAcuerdoCreate = ("{" + 
				"\"entityId\": " + idAcuerdo + "," + 
				"\"status\": \"Borrador\"," + 
				"\"entityDescription\": \"ACUERDO\"," + 
				"\"processDescription\": \"com.tcc.cuore.process.EvaluarAcuerdoConProveedor\"," + 
				"\"paramsNames\": [" + 
				"\"iWay\"," + 
				"\"idAgreement\"" + 
				"]," + 
				"\"paramsValues\": [" + 
				"\"borrador\"," + 
				idAcuerdo + 
				"]" + 
				"}");
		
		return bpmAcuerdoCreate;
	}
	
	public String setAprobarAcuerdo(String acuerdoPart1, String acuerdoPart2) {
		
		this.aprobarAcuerdo = (acuerdoPart1 + 
				"\"stateServiceAgreement\": {" + 
				"\"statusDate\": \"2018-04-26T19:53:09.598Z\"," + 
				"\"observation\": \"Observaciones\"," + 
				"\"name\": \"Borrador\"," + 
				"\"entityType\": \"ACUERDO\"," + 
				"\"masterStatus\": {" + 
				"\"id\": 14" + 
				"}" + 
				"}," +
				acuerdoPart2);
		
		return aprobarAcuerdo;
		
	}
	
	public String setBPMAcuerdoComplete(String idProcessAcuerdo, String idTareaAcuerdo) {
		
		this.bpmAcuerdoComplete = ("{" + 
				"\"action\": null," + 
				"\"creationDate\": 1524770265000," + 
				"\"entityDescription\": \"ACUERDO\"," + 
				"\"entityId\": \"" + idAcuerdo + "\"," + 
				"\"expirationDate\": null," + 
				"\"id\": " + idTareaAcuerdo + "," + 
				"\"name\": \"Editar Acuerdo\"," + 
				"\"observation\": null," + 
				"\"params\": null," + 
				"\"paramsNames\": [" + 
				"\"iWay\"" + 
				"]," + 
				"\"paramsValues\": [" + 
				"\"aprobar\"" + 
				"]," + 
				"\"priority\": 1," + 
				"\"processDescription\": \"com.tcc.cuore.process.EvaluarAcuerdoConProveedor\"," + 
				"\"processId\": " + idProcessAcuerdo + "," + 
				"\"status\": \"Ready\"," + 
				"\"userOwner\": null," + 
				"\"variables\": {" + 
				"\"iWay\": \"borrador\"," + 
				"\"idAgreement\": \"" + idAcuerdo + "\"," + 
				"\"initiator\": \"manager\"" + 
				"}" + 
				"}");
		
		return bpmAcuerdoComplete;
	}

}
