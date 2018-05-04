package Precondiciones;

import static io.restassured.RestAssured.given;

import MetodosBienes.Atributo.Datos_Atributo;
import MetodosBienes.Bienes.Datos_Bien;
import MetodosBienes.Clase.Datos_Clase;
import MetodosBienes.Marca.Alta_Marca;
import MetodosBienes.Marca.AsociarMarca;
import MetodosBienes.Modelo.Datos_Modelo;
import MetodosBienes.SubClase.Datos_SubClase;
import io.restassured.response.Response;


public class ParametrosBienes {
	

	public static String Defoult_URL = "http://34.234.32.246:8082/api/";
	public static String token = "eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw";
	public static String idBien;
	public static String acuerdo;
	public static String proveedor;
	public static String idClase;
	public static String bodyClase;
	public static String idAtributo;
	public static String bodyAtributo;
	public static String bodySubClase;
	public static String idSubClase;
	public static String bodyMarca;
	public static String idMarca;
	public static String bodyAsocMarca;
	public static String idAsocMarca;
	public static String idTasa;
	public static String bodyTasa;
	public static String bodyTV;
	public static String bodyTTR;
	public static String bodyModelo;
	public static String idModelo;
	public static String model;
	public static String tipificacion;
	public static String patentable;
	public static String newAtributo;
	public static String iva;
	public static String bodyBien;
	public static String semaforo;


	public void atributo(int row) throws Exception {
		Datos_Atributo datos_Atributos = new Datos_Atributo();
		String atributo_post = datos_Atributos.setdatos_atributo(row);
		ParametrosBienes.bodyAtributo = 
			given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(atributo_post)
			.when()
				.post(Defoult_URL+"products/good/attribute")
				.getBody().asString();		
		ParametrosBienes.idAtributo = ((bodyAtributo.split("\\{\"id\":"))[1]).split(",\"name\"")[0];
	}
	

	public void extraerAtributos(int row) throws Exception {
			

		String getTipificacion = (Defoult_URL + "products/good/attribute/search?page=1&size=15&name=Tipificaci&status=true");
		Response responseTipificacion=
		given()
			.contentType("application/json")
			.headers("x-auth-token",token)
			.when().get(getTipificacion);
		String serchTipificacion = responseTipificacion.getBody().asString();
		ParametrosBienes.tipificacion = (((serchTipificacion.split("content\":\\["))[1]).split("\\]\\}"))[0];
		
		String getPatentable = (Defoult_URL + "products/good/attribute/search?page=1&size=15&name=Patentable&status=true");
		Response responsePatentable=
		given()
			.contentType("application/json")
			.headers("x-auth-token",token)
			.when().get(getPatentable);
		String serchPatentable = responsePatentable.getBody().asString();
		ParametrosBienes.patentable = (((serchPatentable.split("content\":\\["))[1]).split("\\]\\}"))[0];
		
		
		String getSemaforo = (Defoult_URL + "products/good/attribute/search?page=1&size=15&name=Semaforo&status=true");
		Response responseSemaforo=
		given()
			.contentType("application/json")
			.headers("x-auth-token",token)
			.when().get(getSemaforo);
		String serchSemaforo = responseSemaforo.getBody().asString();
		ParametrosBienes.semaforo = (((serchSemaforo.split("content\":\\["))[1]).split("\\]\\}"))[0];
		
		String getIVA = (Defoult_URL + "products/good/attribute/search?page=1&size=15&name=IVA&status=true");
		Response responseIVA=
		given()
			.contentType("application/json")
			.headers("x-auth-token",token)
			.when().get(getIVA);
		String serchIVA = responseIVA.getBody().asString();
		ParametrosBienes.iva = (((serchIVA.split("content\":\\["))[1]).split("\\]\\}"))[0];
	}


	public String clase(int row) throws Exception {
			
		Datos_Clase datos_clase = new Datos_Clase();
		String clase_post = datos_clase.setdatos_clase(row);
		ParametrosBienes.bodyClase=
				given()
					.contentType("application/json")
					.headers("x-auth-token",token)
					.body(clase_post)
				.when()
					.post(Defoult_URL+"products/good/class").getBody().asString();
		
		ParametrosBienes.idClase = ((bodyClase.split("\\{\"id\":"))[1]).split(",\"name\"")[0];

		return idClase;
	}
	

	public String subClase(int row) throws Exception {
		
		Datos_SubClase datosSubClase = new Datos_SubClase();
		String subClase_post = datosSubClase.setdatos_clase(bodyClase, bodyAtributo, idAtributo, row);
		ParametrosBienes.bodySubClase =
				given()
					.contentType("application/json")
					.headers("x-auth-token",token)
					.body(subClase_post)
				.when()
					.post(Defoult_URL+"products/good/subclass").getBody().asString();
		
		ParametrosBienes.idSubClase = ((bodySubClase.split("\\{\"id\":"))[1]).split(",\"name\"")[0];
		
		return idSubClase;
	}
	

	public String marca(int row) throws Exception {
		
		Alta_Marca altaMarca = new Alta_Marca();
		String altaMarca_post = altaMarca.setaltaMarca(row);
		ParametrosBienes.bodyMarca =
				given()
					.contentType("application/json")
					.headers("x-auth-token",token)
					.body(altaMarca_post)
				.when()
					.post(Defoult_URL+"products/good/brandMaster").getBody().asString();
		ParametrosBienes.idMarca = ((bodyMarca.split("\"id\":"))[1]).split(",\"name\"")[0];
		
//		Asociar Marca generada
		
		AsociarMarca asocMarca = new AsociarMarca();
		String asocMarca_post = asocMarca.setAsocMarca(bodySubClase, bodyMarca, row);
		ParametrosBienes.bodyAsocMarca =
				given()
					.contentType("application/json")
					.headers("x-auth-token",token)
					.body(asocMarca_post)
				.when()
					.post(Defoult_URL+"products/good/brand").getBody().asString();
		ParametrosBienes.idAsocMarca = ((bodyAsocMarca.split("\\{\"id\":"))[1]).split(",\"name\"")[0];
		
		return idAsocMarca;
	}
	

	public void modelo(int row) throws Exception {
		
		Datos_Modelo altaModelo = new Datos_Modelo();
		String altaModelo_post = altaModelo.setAltaModelo(bodyAsocMarca, row);
		ParametrosBienes.bodyModelo =
				given()
					.contentType("application/json")
					.headers("x-auth-token",token)
					.body(altaModelo_post)
				.when()
					.post(Defoult_URL+"products/good/model").getBody().asString();
	}
	

	public void extraerModel() {
			

		String getModel = (Defoult_URL + "products/good/model/search?page=1&size=15&modelName=&classId=" + idClase + "&subclassId=" + idSubClase + "&brandId=" + idAsocMarca);
		Response responseModel=
		given()
			.contentType("application/json")
			.headers("x-auth-token",token)
			.when().get(getModel);
		String serchModel = responseModel.getBody().asString();
		ParametrosBienes.model = (((serchModel.split("content\":\\[\\{\"id\":"))[1]).split(",\"name"))[0];
	}
	
	
	public String bien(int row) throws Exception {
			

		Datos_Bien altaBien = new Datos_Bien();
		String altaBien_post = altaBien.datosBien(idClase, idSubClase, idAsocMarca, idModelo, tipificacion, patentable, semaforo, iva, bodyAtributo, idAtributo, row);
				ParametrosBienes.bodyBien =
				given()
					.contentType("application/json")
					.headers("x-auth-token",token)
					.body(altaBien_post)
				.when()
					.post(Defoult_URL+"products/good").getBody().asString();
		ParametrosBienes.idBien = (((bodyBien.split("\\{\""))[1]).split(",\"classId"))[0];
		
		return bodyBien;
	}

}
