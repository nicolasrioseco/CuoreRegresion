package Precondiciones;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import Impuestos.Datos_confImpuestos;
import MetodosTasas.Tasa.Datos_Tasa;
import MetodosTasas.TasaTTR.Datos_TTR;
import MetodosTasas.TasaVariable.Datos_TasaVariable;

public class ParametrosTasas {


	public static String Defoult_URL = "http://34.234.32.246:8082/api/";
	public static String token = "eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw";
	public String bodyTasa;
	public String idTasa;
	public String bodyTV;
	public String bodyTTR;


	public String tasa(int row) throws Exception {

		Datos_Tasa datosTasa = new Datos_Tasa();
		String tasa_post = datosTasa.setTasa(row);
		this.bodyTasa = 
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(tasa_post)
				.when()
				.post(Defoult_URL+"finances/rate").getBody().asString();
		this.idTasa = ((bodyTasa.split("\"rateID\":"))[1]).split(",\"rateInterest\"")[0];

		String tipoTasa = datosTasa.getTipo();
		return tipoTasa;

	}



	@Test
	public void tasaVariable(int row) throws Exception {

		Datos_TasaVariable datosTV = new Datos_TasaVariable();
		String tv_post = datosTV.setTasaVariable(bodyTasa, row);
		this.bodyTV = 
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(tv_post)
				.when()
				.post(Defoult_URL+"finances/rate").getBody().asString();

	}


	@Test
	public void tasaTTR(int row) throws Exception {

		int cantVidaMedias = 3;
		int i;

		for (i= 0; i < cantVidaMedias; i++) {
			Datos_TTR datos_TasaTTR = new Datos_TTR();
			String TasaTTR_post = datos_TasaTTR.setTasaTTR(i, row);	
			this.bodyTTR = 
					given()
					.contentType("application/json")
					.headers("x-auth-token",token)
					.body(TasaTTR_post)
					.when().post(Defoult_URL+"finances/transferenceRate").getBody().asString();
		}
	}

	public void impuestos(int row) throws Exception {

		Datos_confImpuestos datosImpuestos = new Datos_confImpuestos();
		String impuesto_post = datosImpuestos.setdatosImpuestos(row);
		given()
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(impuesto_post)
		.when().post(Defoult_URL+"finances/sealTax")
		.then().statusCode(201)
		.assertThat().statusCode(201);
	}
}
