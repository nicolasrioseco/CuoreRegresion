package Proveedor;

public class AltaProveedor {
	
	private String altaProveedor;
	
	public void setDatosProveedor(String nombre, String vendor, String broker, String bienes, String servicios, String importador) {
		this.altaProveedor = ("{" + 
				"\"vendor\": " + vendor + "," + 
				"\"broker\": " + broker + "," + 
				"\"selected\": false," + 
				"\"statusId\": 0," + 
				"\"id\": \"\"," + 
				"\"name\": \"" + nombre + "\"," + 
				"\"identificationType\": {" + 
				"\"id\": \"96\"" + 
				"}," + 
				"\"identificationNumber\": 1234577," + 
				"\"activity\": \"4567\"," + 
				"\"client\": \"\"," + 
				"\"supplierRating\": {" + 
				"\"id\": \"1\"" + 
				"}," + 
				"\"ratingDate\": \"2018-04-18T03:00:00.0Z\"," + 
				"\"goods\": " + bienes + "," + 
				"\"services\": " + servicios + "," + 
				"\"importation\": " + importador + "," + 
				"\"observations\": \"12345\"," + 
				"\"contactList\": [" + 
				"{" + 
				"\"id\": \"\"," + 
				"\"name\": \"23456\"," + 
				"\"phone\": 1234567898," + 
				"\"mobilephone\": 1234567890," + 
				"\"email\": \"asdfg@sdf.com\"," + 
				"\"position\": \"123456\"" + 
				"}" + 
				"]," + 
				"\"addressStreet\": \"123456\"," + 
				"\"addressNumber\": 1245," + 
				"\"addressFloor\": 12," + 
				"\"addressApt\": \"1\"," + 
				"\"addressZipcode\": \"1234\"," + 
				"\"country\": {" + 
				"\"id\": \"1\"" + 
				"}," + 
				"\"province\": {" + 
				"\"id\": \"2\"" + 
				"}," + 
				"\"city\": {" + 
				"\"id\": \"\"" + 
				"}" + 
				"}");
	}

	public String getAltaProveedor() {
		return altaProveedor;
	}
}