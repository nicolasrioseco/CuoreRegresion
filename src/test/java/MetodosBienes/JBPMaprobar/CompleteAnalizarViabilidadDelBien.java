package MetodosBienes.JBPMaprobar;

public class CompleteAnalizarViabilidadDelBien {

	public static String varCompleteanalizarViabilidadDelBien;

	public String mtdCompleteAnalizarViabilidad(String bienID,String processId, String id) {
		return CompleteAnalizarViabilidadDelBien.varCompleteanalizarViabilidadDelBien = ("{" + 
				"  \"action\": \"Finalizar análisis\"," + 
				"  \"creationDate\": 1524774590000," + 
				"  \"entityDescription\": \"BIEN\"," + 
				"  \"entityId\":" + bienID + "," + 
				"  \"expirationDate\": null," + 
				"  \"id\":" + id + "," + 
				"  \"name\": \"Analizar Vialidad del Bien\"," + 
				"  \"observation\": \"observaciones de analizar viabilidad del bien\"," + 
				"  \"params\": null," + 
				"  \"paramsNames\": [" + 
				"    \"iWay\"" + 
				"  ]," + 
				"  \"paramsValues\": [" + 
				"    \"finalizar\"" + 
				"  ]," + 
				"  \"priority\": 0," + 
				"  \"processDescription\": \"com.tcc.cuore.process.GestionDeBienes\"," + 
				"  \"processId\":" + processId + "," + 
				"  \"status\": \"Evaluado\"," + 
				"  \"userOwner\": null," + 
				"  \"variables\": {" + 
				"    \"toAsset\": \"true\"," + 
				"    \"idBien\":" + bienID + "," + 
				"    \"initiator\": \"manager\"," + 
				"    \"toInsurance\": \"true\"" + 
				"  }" + 
				"}");
	}

}
