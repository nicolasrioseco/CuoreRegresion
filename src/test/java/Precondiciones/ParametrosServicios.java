package Precondiciones;

import static io.restassured.RestAssured.given;

import Servicio.AprobarServicio;
import Servicio.Datos_Servicio;

public class ParametrosServicios {

	
	public static String Defoult_URL = "http://34.234.32.246:8082/api/";
	public static String token = "eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw";
	public static String bodyServicio;
	public static String idServicio;
	public static String idProcess;
	public static int idTarea;
	
	public void servicio(int row, String bodyBien, String bodyAcuerdo) throws Exception {
		
		
		Datos_Servicio datos_Servicio = new Datos_Servicio();
		String servicio_post = datos_Servicio.setdatosServicio(row,bodyBien,bodyAcuerdo);
		ParametrosServicios.bodyServicio = 
			given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(servicio_post)
			.when()
				.post(Defoult_URL+"products/service")
				.getBody().asString();
		
//		final Gson gson = new Gson();
//		final String representacionJSON = gson.toJson(servicio_post);
//		assertEquals("{\"id\":46,\"nombre\":\"Miguel\",\"empresa\":\"Autentia\"}", representacionJSON);	
		
		ParametrosServicios.idServicio = ((bodyServicio.split(",\"invoicedBy"))[0]).split("goodsSelected\":null,\"id\":")[1];
	}
	
	public void jbpmServicio_Crear() throws InterruptedException {
		
		AprobarServicio crearTarea = new AprobarServicio();
		String postGenerar = crearTarea.setGenerarTarea(idServicio);
		ParametrosServicios.idProcess = 
				given()
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(postGenerar)
		.when().post(Defoult_URL+"bpm/create")
		.getBody().asString();
		ParametrosServicios.idTarea = Integer.parseInt(idProcess) + 10;		
		Thread.sleep(3000);
		
	}
	
	public void jbpmServicio_Aprobar() throws InterruptedException {
		
		AprobarServicio aprobarTarea = new AprobarServicio();
		String postAprobar = aprobarTarea.setAprobarTarea(idServicio, idProcess, idTarea);
		given()
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(postAprobar)
		.when().post(Defoult_URL+"bpm/complete")
		.then()
		.assertThat().statusCode(201);
		
		String postAprobarServicio = aprobarTarea.setAprobarServicio(bodyServicio);
		given()
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(postAprobarServicio)
		.when().post(Defoult_URL+"products/service")
		.then()
		.assertThat().statusCode(201);
	
	}
		
}