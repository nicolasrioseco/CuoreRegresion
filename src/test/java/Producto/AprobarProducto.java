package Producto;

public class AprobarProducto {

	public static String bodyAprobarProducto;

	public String setAprobarProducto(String bodyProducto){

		String bodyProducto1 = bodyProducto.split("\"productStatus\"")[0];
		String bodyProducto2 = bodyProducto.split("\"productVrKpoItems\":")[1];

		return AprobarProducto.bodyAprobarProducto =(bodyProducto1 + 
				"  \"productStatus\": {" + 
				"    \"name\": \"Habilitado\"," + 
				"    \"entityType\": \"PRODUCTO\"," + 
				"    \"observation\": \"aprobado\"," + 
				"    \"statusDate\": \"2018-05-07T16:24:56.273Z\"," + 
				"    \"masterStatus\": {" + 
				"      \"id\": 9" + 
				"    }" + 
				"  }," + 
				"  \"productVrKpoItems\": " + bodyProducto2);	
	}

}
