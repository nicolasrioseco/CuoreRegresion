package MetodosBienes.Atributo;


public class Atributo {

	private String altaAtributo;
	
	public void setaltaAtributo(String nombre, String descripcion) {

		
			this.altaAtributo = 
					("{\"name\": \"" + nombre + "\"," + 
					 "\"description\": \"" + descripcion + "\"," + 
					 "\"attributeValueType\": {" + 
					 	"\"id\": 1," + 
						"\"description\": \"Texto\"," + 
						"\"code\": \"TEXTO\"" + 
						"}," + 
					 "\"status\": true," + 
					 "\"options\": []," + 
					 "\"attributeFormat\": {" + 
					 	"\"id\": 2," + 
						"\"description\": \"Alfanumérico\"," + 
						"\"code\": \"ALFANUMERICO\"}" + 
					 "}");
	}
	
	public String getaltaAtributo() {
			return altaAtributo;
	}
		
}