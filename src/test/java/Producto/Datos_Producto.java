package Producto;

import static io.restassured.RestAssured.given;

import utility.ExcelUtils;

public class Datos_Producto {

	public static String nombreProducto;
	public static String Defoult_URL = "http://34.234.32.246:8082/api/";
	public static String token = "eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw";

	public String setDatos_Productos(int row, String bodyBien) throws Exception{
		
		Datos_Producto.nombreProducto = ExcelUtils.getCellData(row,0);
		String feeDador = ExcelUtils.getCellData(row,2);
		String feeImpoDador = ExcelUtils.getCellData(row,4);
		int valorFeeAdm = (int) ExcelUtils.getCellDataint(row,3);
		int valorFeeImpo = (int) ExcelUtils.getCellDataint(row,5);
		int tna = (int) ExcelUtils.getCellDataint(row,6);
		int tipoTasa = (int) ExcelUtils.getCellDataint(row,16);
		String subTasa = ExcelUtils.getCellData(row,8);


		String responseTasa =
				given() 
				.contentType("application/json")
				.headers("x-auth-token",token)
				.queryParam("page", 1)
				.queryParam("size", 10)
				.queryParam("typeRate", tipoTasa)
				.queryParam("subTypeRate", subTasa)
				.when().get(Defoult_URL+"finances/rate/search/filter").getBody().asString();
		String bodyTasa =  (responseTasa.split("\\],\"first\"")[0]).split("content\":\\[")[1];
		
		Alta_Producto objProducto = new Alta_Producto();
		objProducto.setAltaProducto(nombreProducto, feeDador, feeImpoDador, bodyBien, valorFeeAdm, valorFeeImpo, tna, bodyTasa);
		String variable_json = objProducto.getAltaProducto();

		return variable_json;
	}
}

