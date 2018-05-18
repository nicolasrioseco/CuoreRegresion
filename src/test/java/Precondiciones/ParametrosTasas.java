package Precondiciones;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import Impuestos.Datos_confImpuestos;
import MetodosTasas.Tasa.Datos_Tasa;
import MetodosTasas.TasaTTR.Datos_TTR;
import MetodosTasas.TasaVariable.Datos_TasaVariable;
import utility.Constant;

public class ParametrosTasas {


	public static String Defoult_URL = Constant.Defoult_URL;
	public static String token = Constant.token;
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
