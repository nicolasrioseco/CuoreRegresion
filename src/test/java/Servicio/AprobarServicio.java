package Servicio;

public class AprobarServicio {
	
		private String getTarea;
		private String aprobarServicio;
	
	public String setGenerarTarea(String idServicio) {
		
		this.getTarea = ("{" + 
				"\"entityId\": " + idServicio + "," + 
				"\"status\": \"En Evalucion\"," + 
				"\"entityDescription\": \"SERVICIO\"," + 
				"\"processDescription\": \"com.tcc.cuore.process.EvaluarServicio\"," + 
				"\"paramsNames\": [" + 
				"\"iWay\"," + 
				"\"idService\"" + 
				"]," + 
				"\"paramsValues\": [" + 
				"\"aprobar\"," + 
				idServicio + 
				"]" + 
				"}");
		
		return getTarea;
	}
	
	public String setAprobarTarea(String idServicio, String idProcess, int idTarea) {
		
		this.getTarea = ("{" + 
				"\"action\": null," + 
				"\"creationDate\": 1524072996000," + 
				"\"entityDescription\": \"SERVICIO\"," + 
				"\"entityId\": \"" + idServicio + "\"," + 
				"\"expirationDate\": null," + 
				"\"id\": " + idTarea + "," + 
				"\"name\": \"Aprobar Servicio\"," + 
				"\"observation\": \"OK\"," + 
				"\"params\": null," + 
				"\"paramsNames\": [" + 
				"\"iWay\"" + 
				"]," + 
				"\"paramsValues\": [" + 
				"\"aprobar\"" + 
				"]," + 
				"\"priority\": 1," + 
				"\"processDescription\": \"com.tcc.cuore.process.EvaluarServicio\"," + 
				"\"processId\": " + idProcess + "," + 
				"\"status\": \"Habilitado\"," + 
				"\"userOwner\": null," + 
				"\"variables\": {" + 
				"\"iWay\": \"aprobar\"," + 
				"\"initiator\": \"manager\"," + 
				"\"idService\": \"" + idServicio + "\"" + 
				"}" + 
				"}");
		
		return getTarea;
	}
	
	public String setAprobarServicio(String bodyServicio) {
		
		this.aprobarServicio = (bodyServicio.split("stateService\":\\{")[0] +
				"stateService\":{" + 
				"\"name\":\"Habilitado\"," + 
				"\"entityType\":\"SERVICIO\"," + 
				"\"observation\":\"Aprobado Manual\"," + 
				"\"statusDate\":\"2018-05-02T14:40:26.215Z\"," + 
				"\"masterStatus\":{" + 
				"\"id\": 4" + 
				"}" + 
				"}," +
				"\"tcc\":true," + 
				"\"third\":true" + 
				"}");
		
		return aprobarServicio;
				
	}
	

}
