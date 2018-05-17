package Precondiciones;

import static io.restassured.RestAssured.given;

import Producto.AprobarProducto;
import Producto.CompleteAprobarProductos;
import Producto.CreateProducto;
import Producto.Datos_Producto;



public class ParametrosProductos {

	public static String Defoult_URL = "http://34.234.32.246:8082/api/";
	public static String token = "eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw";
	public static String bodyProducto;
	public static String productoID;
	public static String procesoID_Producto;
	public static String aprobarProductoID;

	//Da de alta un Producto
	public void AltaProducto(int row, String bodyBien) throws Exception {
		
		Datos_Producto objDatos_Producto = new Datos_Producto();
		String altaProducto_post = objDatos_Producto.setDatos_Productos(row, bodyBien);
		System.out.println(altaProducto_post);
		ParametrosProductos.bodyProducto =
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(altaProducto_post)
				.when()
				.post(Defoult_URL+"products/product").getBody().asString();	
		System.out.println(ParametrosProductos.bodyProducto);
		ParametrosProductos.productoID = ((bodyProducto.split("],\"id\":"))[1]).split(",\"initialCanonCEVisible")[0];
	}

	//CREA LA TAREA APROBAR PRODUCTO
	public void createProducto() throws Exception {

		CreateProducto objDatosCreateProductos = new CreateProducto();
		String CreateProducto_post = objDatosCreateProductos.setCreateProducto(productoID);

		ParametrosProductos.procesoID_Producto=
				given() 
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(CreateProducto_post)
				.when()
				.post(Defoult_URL+"bpm/create").getBody().asString();		



		//OBTENER EL ID DE LA TAREA APROBAR PRODUCTO
		ParametrosProductos.aprobarProductoID =
				given() 
				.contentType("application/json")
				.headers("x-auth-token",token)
				.queryParam("page", 1)
				.queryParam("size", 10)
				.queryParam("name", "Aprobar Producto")
				.when().get(Defoult_URL + "bpm/cuore.admin.QA").getBody().asString();

		aprobarProductoID = ((aprobarProductoID.split(",\"id\":"))[1]).split(",\"name")[0];
	}

	//COMPLETA LA TAREA Y LA ELIMINA DE LA BANDEJA
	public void CompleteAprobarProducto() throws Exception {

		CompleteAprobarProductos objCompleteAprobarProductos = new CompleteAprobarProductos();

		String post_CompleteAprobarProducto= objCompleteAprobarProductos.setCompletAprobarProducto(productoID, 
				procesoID_Producto, aprobarProductoID);

		given() 
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(post_CompleteAprobarProducto)
		.when().post(Defoult_URL+"bpm/complete");								
	}

	//SE APRUEBA EL PRODUCTO
	public void aprobarProducto() throws Exception {

		AprobarProducto objAprobarProducto = new AprobarProducto();

		String post_AprobarProducto= objAprobarProducto.setAprobarProducto(bodyProducto);

		given() 
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(post_AprobarProducto)
		.when().post(Defoult_URL+"products/product");								
	}

}
