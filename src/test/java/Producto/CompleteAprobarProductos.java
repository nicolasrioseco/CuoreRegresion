package Producto;

public class CompleteAprobarProductos {
	public static String varCompleteAprobarProducto;

	public String setCompletAprobarProducto(String productoID, String procesoID_Producto, String aprobarProductoID) {

		return varCompleteAprobarProducto = ("{" + 
				"  \"action\": null," + 
				"  \"creationDate\": 1525797848000," + 
				"  \"entityDescription\": \"PRODUCTO\"," + 
				"  \"entityId\":" + productoID + ","+ 
				"  \"expirationDate\": null," + 
				"  \"id\":" + aprobarProductoID + ","+ 
				"  \"name\": \"Aprobar Producto\"," + 
				"  \"observation\": \"aprobao\"," + 
				"  \"params\": null," + 
				"  \"paramsNames\": [" + 
				"    \"iWay\"" + 
				"  ]," + 
				"  \"paramsValues\": [" + 
				"    \"aprobar\"" + 
				"  ]," + 
				"  \"priority\": 0," + 
				"  \"processDescription\": \"com.tcc.cuore.process.EvaluacionDeProducto\"," + 
				"  \"processId\":" + procesoID_Producto + ","+
				"  \"status\": \"Habilitado\"," + 
				"  \"userOwner\": null," + 
				"  \"variables\": {" + 
				"    \"iWay\": \"analizarProducto\"," + 
				"    \"initiator\": \"manager\"," + 
				"    \"idProduct\":" + productoID + ""+
				"  }" + 
				"}");
	}
}
