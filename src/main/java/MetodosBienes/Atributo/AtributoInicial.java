package MetodosBienes.Atributo;

import static io.restassured.RestAssured.given;


import Precondiciones.ParametrosBienes;
import io.restassured.response.Response;

public class AtributoInicial {

	public static String Defoult_URL = "http://34.234.32.246:8082/api/";
	public static String token = "eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw";
	public static String getRequest = (Defoult_URL + "products/good/attribute/search");
	public static String altaAtributte;

	public void atributosInicialesTipoSeg() {
		
		System.out.println("> Buscando Atributo Cabecera: \"Tipo de Seguro\"");
		Response responseTipo=
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.queryParam("page", 1)
				.queryParam("size", 15)
				.queryParam("name", "Tipo de seguro")
				.queryParam("valueType", 4)
				.queryParam("status", "true")
				.when().get(getRequest);
		int serchCabeceraTipo = responseTipo.path("numberOfElements");
		
		if(serchCabeceraTipo == 0) {
			System.out.println("> Atributo Cabecera no encontrado");
			String atributo_post = bodyAltaAtributo("Tipo de seguro");
			System.out.println(atributo_post);
			String bodyTipo = given()
					.contentType("application/json")
					.headers("x-auth-token",token)
					.body(atributo_post)
					.when()
					.post(Defoult_URL+"products/good/attribute")
					.getBody().asString();
			ParametrosBienes.idCabecera.add(0,((bodyTipo.split("\\{\"id\":"))[1]).split(",\"name\"")[0]);
			ParametrosBienes.bodyCabeceras.add(0, bodyTipo);
			System.out.println("> Se dió de alta el Atributo Cabecera: \"Tipo de seguro\"");
		}else {
			String tipoSeguro = responseTipo.getBody().asString();
			ParametrosBienes.bodyCabeceras.add(0, (((tipoSeguro.split("content\":\\["))[1]).split("\\]\\}"))[0]);
			ParametrosBienes.idCabecera.add(0,(((ParametrosBienes.bodyCabeceras.get(0)).split("\\{\"id\":"))[1]).split(",\"name\"")[0]);
			System.out.println("> Atributo Cabecera encontrado");
		}
	}
	
	public void atributosInicialesClassSeg() {
		
		System.out.println("> Buscando Atributo Cabecera: \"Clase Seguro\"");
		Response responseClase=
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.queryParam("page", 1)
				.queryParam("size", 15)
				.queryParam("name", "Clase seguro")
				.queryParam("valueType", 4)
				.queryParam("status", "true")
				.when().get(getRequest);

		int serchCabeceraClase = responseClase.path("numberOfElements");
		if(serchCabeceraClase == 0) {

			String atributo_post1 = bodyAltaAtributo("Clase seguro");
			String bodyClase = given()
					.contentType("application/json")
					.headers("x-auth-token",token)
					.body(atributo_post1)
					.when()
					.post(Defoult_URL+"products/good/attribute")
					.getBody().asString();
			ParametrosBienes.idCabecera.add(1,((bodyClase.split("\\{\"id\":"))[1]).split(",\"name\"")[0]);
			ParametrosBienes.bodyCabeceras.add(1, bodyClase);
			System.out.println("> Se dió de alta el Atributo Cabecera: \"Clase seguro\"");
		}else {
			String claseSeguro = responseClase.getBody().asString();
			ParametrosBienes.bodyCabeceras.add(1, (((claseSeguro.split("content\":\\["))[1]).split("\\]\\}"))[0]);
			ParametrosBienes.idCabecera.add(1,(((ParametrosBienes.bodyCabeceras.get(1)).split("\\{\"id\":"))[1]).split(",\"name\"")[0]);
			System.out.println("> Atributo Cabecera encontrado");
		}
	}


	public String bodyAltaAtributo(String atributo) {

		String valor;
		String type = "Tipo de seguro";
		int i;
		
		if(atributo == type) {
			valor = "Type";
			i = 3;
		}else {
			valor = "Class";
			i = 4;
		}
		
		AtributoInicial.altaAtributte = 
				("{\"name\": \"" + atributo + "\"," + 
						"\"description\": \"" + atributo + "\"," + 
						"\"attributeValueType\": {" + 
						"  \"id\": 4," + 
						"  \"description\": \"Tabla\"," + 
						"  \"code\": \"TABLA\"" + 
						"}," + 
						"\"status\": true," + 
						"\"entity\": {" + 
						"  \"idEntity\": " + i + "," + 
						"  \"name\": \"Insurance" + valor + "\"," + 
						"  \"entityTableName\": \"t_fin_Insurance" + valor + "\"," + 
						"  \"entityCode\": \"Insurance" + valor + "_Name\"," + 
						"  \"entityId\": \"Insurance" + valor + "_ID\"" + 
						"}," + 
						"\"options\": []" + 
						"}");		

		return altaAtributte;
	}

}
