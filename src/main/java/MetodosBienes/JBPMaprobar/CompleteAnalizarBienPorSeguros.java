package MetodosBienes.JBPMaprobar;

public class CompleteAnalizarBienPorSeguros {
	
	public static String varCompleteanalizarBienXSeguros;

	public String mtdCompleteanalizarBienXSeguros(String bienID,String processId, String id) {
		return CompleteAnalizarBienPorSeguros.varCompleteanalizarBienXSeguros = ("{" + 
				"  \"action\": \"Finalizar análisis\"," + 
				"  \"creationDate\": 1524749102000," + 
				"  \"entityDescription\": \"BIEN\"," + 
				"  \"entityId\":" + bienID + ","+ 
				"  \"expirationDate\": null," + 
				"  \"id\":" + id + ","+ 
				"  \"name\": \"Analizar Bien por Seguros\"," + 
				"  \"observation\": \"ninguna observacion de seguros\"," + 
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
