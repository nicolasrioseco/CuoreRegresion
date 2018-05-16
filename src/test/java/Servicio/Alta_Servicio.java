package Servicio;

public class Alta_Servicio {

private String altaServicio;
	
	public void setaltaServicio(String name, int dador, int facturado, String bodyBien, String bodyAcuerdo) {

		this.altaServicio = ("{\"name\":\"" + name + "\"," + 
				"\"donor\": \"" + dador + "\"," + 
				"\"invoicedBy\": \"" + facturado + "\"," + 
				"\"third\":true," + 
				"\"comafi\":true," + 
				"\"tcc\":true," + 
				"\"goodNew\":true," + 
				"\"goodUsed\":true," + 
				"\"goodStock\":true," + 
				"\"goods\":[" + (bodyBien.split("\\}\\]\\}")[0]) + "}]," + 
				"\"serviceSelected\":true}]," + 
				"\"nodes\":[]," + 
				"\"serviceAgreements\":[" + (bodyAcuerdo.split("vendors\":\\[\\]\\}")[0]) + 
				"vendors\":[]," +
				"\"selected\": true" +
				"}]," + 
				"\"dateFrom\":\"2018-04-17T03:00:00.000Z\"," + 
				"\"dateUntil\":\"2018-12-31T03:00:00.000Z\"," + 
				"\"stateService\":{\"statusDate\":\"2018-04-27T17:17:51.651Z\"," + 
				"\"observation\":\"\"," + 
				"\"entityType\":\"SERVICIO\"," + 
				"\"name\":\"En Evalucion\"," + 
				"\"masterStatus\":{\"id\":2}}}" + 
				"");
	}

	public String getaltaServicio() {
		return altaServicio;
	}
	
	
}
