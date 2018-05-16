package MetodosBienes.JBPMaprobar;

public class TareaAnalizarViabilidadDelBien {

	public static String varAnalizarViabilidad;

	public String setAnalizarViabilidad(String bodyBien, String valorTipo) {

		String bodyBien1 = bodyBien.split("\"status\":\"Borrador\"")[0];
		String bodyBien2 = bodyBien.split("\"attributes\":")[1];

		return TareaAnalizarViabilidadDelBien.varAnalizarViabilidad = ("{" + 
				"  \"good\": " + bodyBien1 + 
				"    \"status\": \"En Análisis\"," + 
				"    \"usefulLife\": 180," + 
				"    \"type\": 1," + 
				"    \"typification\": 4," + 
				"    \"attributes\": " + bodyBien2 + "," + 
				"  }," + 
				"  \"depreciations\": [" + 
				"    {" + 
				"      \"referencedValue\": \"1\"," + 
				"      \"referencedValueDate\": \"2018-04-27T03:00:00.0Z\"," + 
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
				"  \"secondaryMarket\": \"Merc sec del prov\"," + 
				"  \"activeAnalysisObservations\": \"ninguna observacion del analisis por activos\"," + 
				"  \"insuranceAnalysisObservations\": \"ninguna observacion de seguros\"," + 
				"  \"observations\": \"observaciones de analizar viabilidad del bien\"," + 
				"  \"kilometersYear\": \"18\"," + 
				"  \"hoursYear\": \"19\"," + 
				"  \"surplusValue\": \"20\"," + 
				"  \"validFrom\": \"2018-04-27T03:00:00.0Z\"," + 
				"  \"validUntil\": \"2018-05-27T03:00:00.0Z\"," + 
				"  \"hasInsurance\": true," + 
				"  \"carrier\": {" + 
				"    \"address\": null," + 
				"    \"contactEmail\": null," + 
				"    \"contactName\": null," + 
				"    \"country\": null," + 
				"    \"cuit\": null," + 
				"    \"description\": \"La Segunda Coop Ltda De Seguros\"," + 
				"    \"id\": 1," + 
				"    \"postalCode\": null," + 
				"    \"province\": null," + 
				"    \"website\": null" + 
				"  }," + 
				"  \"coverage\": {" + 
				"    \"description\": \"Terceros Completos\"," + 
				"    \"id\": 1," + 
				"    \"type\": null" + 
				"  }," + 
				"  \"policy\": {" + 
				"    \"currencyID\": null," + 
				"    \"description\": \"La Segunda Autos\"," + 
				"    \"endDate\": null," + 
				"    \"exchangeRate\": null," + 
				"    \"id\": 1," + 
				"    \"insuranceCarrierId\": null," + 
				"    \"insuranceTypeID\": null," + 
				"    \"renewed\": null," + 
				"    \"startDate\": null," + 
				"    \"status\": null" + 
				"  }," + 
				"  \"analysisStatus\": {" + 
				"    \"entityType\": \"BIEN\"," + 
				"    \"statusDate\": \"2018-04-27T18:50:05.010Z\"," + 
				"    \"observation\": \"observaciones de analizar viabilidad del bien\"," + 
				"    \"masterStatus\": {" + 
				"      \"id\": 19" + 
				"    }" + 
				"  }" + 
				"}");
	}
}
