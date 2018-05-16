package Producto;

public class CreateProducto {
	private String bodyCreateProducto;

	public String setCreateProducto(String productoID){


		bodyCreateProducto=("{" + 
				"  \"processDescription\": \"com.tcc.cuore.process.EvaluacionDeProducto\"," + 
				"  \"entityId\":" + productoID +","+ 
				"  \"status\": \"En Analisis\"," + 
				"  \"entityDescription\": \"PRODUCTO\"," + 
				"  \"paramsNames\": [" + 
				"    \"iWay\"," + 
				"    \"idProduct\"" + 
				"  ]," + 
				"  \"paramsValues\": [" + 
				"    \"analizarProducto\"," + 
				productoID + 
				"  ]" + 
				"}");
		return bodyCreateProducto;
	}

}
