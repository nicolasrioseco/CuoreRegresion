package Precondiciones;

import static io.restassured.RestAssured.given;

import Proveedor.Alta_AcuerdoServicio;
import Proveedor.Datos_AcuerdoServicio;
import Proveedor.Datos_Proveedor;
import io.restassured.response.Response;

public class ParametrosProveedores {

	public static String Defoult_URL = "http://34.234.32.246:8082/api/";
	public static String token = "eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw";
	public static String idAcuerdo;
	public static String bodyAcuerdo;
	public static String idTareaAcuerdo;
	public static String acuerdo;
	public static String acuerdoPart1;
	public static String acuerdoPart2;
	public static String idProcessAcuerdo;
	public static String bpmAcuerdo_post;
	public static Alta_AcuerdoServicio bpmAcuerdo;
	public Response responseAcuerdo;

	public String setProveedores(int row) throws Exception{
		Datos_Proveedor datos_Proveedor = new Datos_Proveedor();
		String proveedor_post = datos_Proveedor.setdatosProveedor(row);
		String proveedor=
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(proveedor_post)
				.when().post(Defoult_URL+"products/supplier").getBody().asString();
		
		return proveedor;

		//		final Gson gson = new Gson();
		//		this.proveedor = gson.toJson(post);
		//		assertEquals("{\"id\":46,\"nombre\":\"Miguel\",\"empresa\":\"Autentia\"}", post);		
	}

	public String acuerdoServicio(int row, String bodyBien, String bodyProveedor) throws Exception{
		Datos_AcuerdoServicio datos_Acuerdo = new Datos_AcuerdoServicio();
		String acuerdo_post = datos_Acuerdo.setDatosAcuerdo(row, Defoult_URL, token, bodyBien, bodyProveedor);
		ParametrosProveedores.acuerdo=
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(acuerdo_post)
				.when().post(Defoult_URL+"products/supplier/agreement").getBody().asString();
		ParametrosProveedores.idAcuerdo = (acuerdo.split(",\"markupValue")[0]).split("hasSupplierBilling\":true,\"id\":")[1];
		
//		this.acuerdoPart1 = acuerdo.split("\"stateServiceAgreement")[0];
//		this.acuerdoPart2 = acuerdo.split("\"supplier")[1];
		
		return acuerdo;
	}

	public void bpmAcuerdoCreate() throws Exception{

		ParametrosProveedores.bpmAcuerdo = new Alta_AcuerdoServicio();
		ParametrosProveedores.bpmAcuerdo_post = bpmAcuerdo.setBPMacuerdoCreate(idAcuerdo);;
		ParametrosProveedores.idProcessAcuerdo=
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(bpmAcuerdo_post)
				.when().post(Defoult_URL+"bpm/create").getBody().asString();
		
	}
//	
//	public void extractValuesAcuerdo() {
//
//		this.responseAcuerdo=
//				given()
//				.contentType("application/json")
//				.headers("x-auth-token",token)
//				.queryParam("page", 1)
//				.queryParam("size", 10)
//				.queryParam("name", "Editar Acuerdo")
//				.when().get(Defoult_URL + "products/good/good/search");
//		String serchAcuerdo = responseAcuerdo.getBody().asString();
//		System.out.println("La búsqueda de Tipificación: " + serchAcuerdo);
//		this.bodyAcuerdo = (((serchAcuerdo.split("content\":\\["))[1]).split("\\],\"first"))[0];
//		this.idTareaAcuerdo = ((bodyAcuerdo.split(idProcessAcuerdo)[0]).split(",\"name")[0]).split("id\": ")[1];
//		System.out.println("El Body de Acuerdo es: " + bodyAcuerdo);
//		System.out.println(idTareaAcuerdo);
//		
//	}
//	
//	public void aprobarAcuerdo() {
//		
//		String aprobarAcuerdo_post = bpmAcuerdo.setAprobarAcuerdo(acuerdoPart1, acuerdoPart2);
//		String responseAprobarAcuerdo=
//				given()
//				.contentType("application/json")
//				.headers("x-auth-token",token)
//				.body(aprobarAcuerdo_post)
//				.when().post(Defoult_URL+"products/supplier/agreement").getBody().asString();
//		System.out.println(responseAprobarAcuerdo);	
//	}
//	
//	public void bpmAcuerdoComplete() {
//		
//		String bpmAcuerdoComplete = bpmAcuerdo.setBPMAcuerdoComplete(idProcessAcuerdo, idTareaAcuerdo);
//		String responseBPMAcuerdoComplete =
//				given()
//				.contentType("application/json")
//				.headers("x-auth-token",token)
//				.body(bpmAcuerdoComplete)
//				.when().post(Defoult_URL+"bpm/complete").getBody().asString();
//		System.out.println(responseBPMAcuerdoComplete);
//		
//	}	

}
