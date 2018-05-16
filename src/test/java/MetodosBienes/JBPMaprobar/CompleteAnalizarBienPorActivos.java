package MetodosBienes.JBPMaprobar;

public class CompleteAnalizarBienPorActivos {
	
	public static String varCompleteanalizarBienXActivos;

	public String mtdCompleteanalizarBienXActivos(String bienID,String processId, String id) {

		return CompleteAnalizarBienPorActivos.varCompleteanalizarBienXActivos = ("{" + 
				"  \"action\": \"Finalizar análisis\"," + 
				"  \"creationDate\": 1524749102000," + 
				"  \"entityDescription\": \"BIEN\"," + 
				"  \"entityId\":" + bienID + ","+ 
				"  \"expirationDate\": null," + 
				"  \"id\":" + id + ","+ 
				"  \"name\": \"Analizar Bien por Activos\"," + 
				"  \"observation\": \"ninguna observacion del analisis por activos\"," + 
				"  \"params\": null," + 
				"  \"paramsNames\": null," + 
				"  \"paramsValues\": null," + 
				"  \"priority\": 0," + 
				"  \"processDescription\": \"com.tcc.cuore.process.GestionDeBienes\"," + 
				"  \"processId\":" + processId + ","+ 
				"  \"status\": \"Borrador\"," + 
				"  \"userOwner\": null," + 
				"  \"variables\": {" + 
				"    \"toAsset\": \"true\"," + 
				"    \"idBien\":" + bienID + ","+ 
				"    \"initiator\": \"manager\"," + 
				"    \"toInsurance\": \"true\"" + 
				"  }" + 
				"}");
		}

}
