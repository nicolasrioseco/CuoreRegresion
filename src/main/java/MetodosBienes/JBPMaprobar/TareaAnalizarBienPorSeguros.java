package MetodosBienes.JBPMaprobar;

public class TareaAnalizarBienPorSeguros {
	
public static String varAnalizarBienXSeguros;
	
	public String setTareaAnalizarBienPorSeguros(String bodyBien, String valorTipo, String vidaUtil) {
		
		String bodyBien1 = bodyBien.split("\"status\":\"Borrador\"")[0];
		String bodyBien2 = bodyBien.split("\"attributes\":")[1];
	
		return TareaAnalizarBienPorSeguros.varAnalizarBienXSeguros = ("{" + 
				"  \"good\": " + bodyBien1 + 
				"    \"status\": \"En Análisis\"," + 
				"    \"usefulLife\": " + vidaUtil + "," + 
				"    \"type\": 1," + 
				"    \"typification\": " + valorTipo + "," + 
				"    \"attributes\": " + bodyBien2 + "," +
				"  \"restrictions\": []," + 
				"  \"isActiveRestrictionRecommended\": false," + 
				"  \"terms\": []," + 
				"  \"secondaryMarket\": \"\"," + 
				"  \"activeAnalysisObservations\": \"\"," + 
				"  \"insuranceAnalysisObservations\": \"ok\"," + 
				"  \"observations\": \"\"," + 
				"  \"kilometersYear\": \"\"," + 
				"  \"hoursYear\": \"\"," + 
				"  \"surplusValue\": \"\"," + 
				"  \"validFrom\": null," + 
				"  \"validUntil\": null," + 
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
				"    \"statusDate\": \"2018-05-07T21:04:42.447Z\"," + 
				"    \"observation\": \"ok\"," + 
				"    \"masterStatus\": {" + 
				"      \"id\": 18" + 
				"    }" + 
				"  }}");
		}
	


}
