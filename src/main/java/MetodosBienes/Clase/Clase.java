package MetodosBienes.Clase;


public class Clase {
	
	private String clase;

	public void setaltaClase(String name, String description) {
		
		this.clase = ("{\"name\": \""+ name + "\"," + 
				"\"description\": \"" + description + "\"," + 
				"\"status\": \"Alta\"," + 
				"\"elements\": []" + 
				"}");
	}
	public String getaltaClase() {
		return clase;
	}
}
