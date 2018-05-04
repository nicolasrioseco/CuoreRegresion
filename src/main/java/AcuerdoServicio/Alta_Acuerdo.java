package AcuerdoServicio;

public class Alta_Acuerdo {

		private String altaAcuerdo;
	
	public void setAltaAcuerdo(String bien, String proveedor, String nombre) {
		
		this.altaAcuerdo = ("{\"goods\":[{\"good\":{" + bien + "}]},"
				+ "\"cost\":1500,"
				+ "\"price\":2000,"
				+ "\"markup\":500,"
				+ "\"selected\":true}],"
				+ "\"nodes\":[],"
				+ "\"channels\":"
				+ "[{\"description\":\"EDN\"," + 
				"\"id\":1,"
				+ "\"parentChannel\":null,"
				+ "\"checked\":true}],\"brokers\":[],\"vendors\":[],\"supplier\":" + proveedor + ","
				+ "\"name\":\"" + nombre + "\"," + 
				"\"validFrom\":\"2018-04-03T03:00:00.000Z\"," + 
				"\"validUntil\":\"2018-04-11T03:00:00.000Z\"," + 
				"\"servicePeriodicity\":\"2\"," + 
				"\"hasSupplierBilling\":true,\"chargedWithPercentage\":false,\"chargedWithCurrency\":true,\"currency\":{\"id\":\"\"},"
				+ "\"appliesRefund\":false,\"hasEventQuantity\":false,\"minimumQuantity\":null,\"comissionValue\":null,"
				+ "\"chargeClientPerEvent\":false,\"appliesFixedValue\":false,\"chargedValue\":null,\"feeValue\":null,"
				+ "\"paymentPeriodicity\":null,\"appliesBilling\":true,\"appliesUnifiedPrice\":true,\"unitaryPrice\":1500,"
				+ "\"appliesUnifiedMarkup\":false,\"markupValue\":null,\"appliesPercentageValueMarkup\":true,\"appliesFixedValueMarkup\":false,"
				+ "\"observations\":\"OK\"," + 
				"\"stateServiceAgreement\":{\"statusDate\":\"2018-04-18T15:08:17.688Z\"," + 
				"\"observation\":\"Observaciones\"," + 
				"\"name\":\"Borrador\"," + 
				"\"entityType\":\"ACUERDO\"," + 
				"\"masterStatus\":{\"id\":14}}}" + 
				"");		
	}
	
	public String getaltaAcuerdo() {
		return altaAcuerdo;
	}
}
