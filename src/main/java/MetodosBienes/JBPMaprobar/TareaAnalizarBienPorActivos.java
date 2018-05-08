package MetodosBienes.JBPMaprobar;

public class TareaAnalizarBienPorActivos {
	
public static String analizarBienXActivos;
	
	public String setTareaAnalizarBienPorActivos(String bodyBien, String valorTipo, String vidaUtil) {
		
		String bodyBien1 = bodyBien.split("\"status\":\"Borrador\"")[0];
		String bodyBien2 = bodyBien.split("\"attributes\":")[1];
	
		return TareaAnalizarBienPorActivos.analizarBienXActivos = ("{" + 
				"  \"good\": " + bodyBien1 + 
				"    \"status\": \"En Análisis\"," + 
				"    \"usefulLife\": " + vidaUtil + "," + 
				"    \"type\": 1," + 
				"    \"typification\": " + valorTipo + "," + 
				"    \"attributes\": " + bodyBien2 + "," +
				"  \"depreciations\": [" + 
				"    {" + 
				"      \"referencedValue\": \"1\"," + 
				"      \"referencedValueDate\": \"2018-04-26T03:00:00.0Z\"," + 
				"      \"fmv\": \"2\"," + 
				"      \"differenceReferenceValueFMV\": -1," + 
				"      \"usefulLife\": \"3\"," + 
				"      \"firstYear\": \"4\"," + 
				"      \"secondYear\": \"5\"," + 
				"      \"thirdYear\": \"6\"," + 
				"      \"fourthYear\": \"7\"," + 
				"      \"fifthYear\": \"8\"," + 
				"      \"sixthPlusYear\": \"9\"" + 
				"    }" + 
				"  ]," + 
				"  \"restrictions\": []," + 
				"  \"isActiveRestrictionRecommended\": false," + 
				"  \"terms\": [" + 
				"    {" + 
				"      \"isCRRVR\": true," + 
				"      \"ccrterm\": 10," + 
				"      \"crrCollateralRisk\": 11," + 
				"      \"crrResidualValue\": 12" + 
				"    }," + 
				"    {" + 
				"      \"isVRKPO\": true," + 
				"      \"vrkpoTerm\": 13," + 
				"      \"vrkpoValue\": 14," + 
				"      \"vrkpoResidualValue\": 15," + 
				"      \"vrkpoCollateralRisk\": 16," + 
				"      \"vrkpoQuoteProductValue\": 17" + 
				"    }" + 
				"  ]," + 
				"  \"secondaryMarket\": \"merc sec del proveedor\"," + 
				"  \"activeAnalysisObservations\": \"ninguna observacion del analisis por activos\"," + 
				"  \"insuranceAnalysisObservations\": \"\"," + 
				"  \"observations\": \"\"," + 
				"  \"kilometersYear\": \"18\"," + 
				"  \"hoursYear\": \"19\"," + 
				"  \"surplusValue\": \"20\"," + 
				"  \"validFrom\": \"2018-04-26T03:00:00.0Z\"," + 
				"  \"validUntil\": \"2020-05-26T03:00:00.0Z\"," + 
				"  \"hasInsurance\": \"\"," + 
				"  \"carrier\": null," + 
				"  \"coverage\": null," + 
				"  \"policy\": null," + 
				"  \"analysisStatus\": {" + 
				"    \"entityType\": \"BIEN\"," + 
				"    \"statusDate\": \"2018-05-07T18:06:54.340Z\"," + 
				"    \"observation\": \"ninguna observacion del analisis por activos\"," + 
				"    \"masterStatus\": {" + 
				"      \"id\": 18" + 
				"    }" + 
				"  }" + 
				"}");
		}

}
