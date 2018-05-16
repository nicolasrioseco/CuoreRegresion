package MetodosBienes.SubClase;

public class Alta_SubClase {
	
	private String altaSubClase;
	
	public void setSubClase (String name, String description, String bodyClase, String bodyAtributo, String idAtributo, String valorVersion, int iva, String valorTipo, 
			String bodyTipificacion, String idTipificacion, String bodyPatentable, String idPatentable, String bodySemaforo, String idSemaforo, String bodyIva, String idIva,
			String tipoSeguro, String idTipoSeg, String claseSeguro, String idClasSeg, String valorTipoSeg, String valorClasSeg) {
		
		this.altaSubClase = ("{" + 
				"\"name\": \"" + name + "\"," + 
				"\"description\": \"" + description + "\"," + 
				"\"parent\": " + bodyClase + "," + 
				"\"elements\": [" + 
				"{" + 
				"\"mandatory\": false," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"active\": false," + 
				"\"modificable\": false," + 
				"\"attribute\": "+ bodyTipificacion + "," + 
				"\"attributeId\": " + idTipificacion + "," + 
				"\"value\": {" + 
				"\"textValue\": \"\"," + 
				"\"booleanValue\": false," + 
				"\"idTableValue\": \"" + valorTipo + "\"" + 
				"}" + 
				"}," + 
				"{" + 
				"\"mandatory\": false," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"active\": false," + 
				"\"modificable\": true," + 
				"\"attribute\": " + bodyPatentable + "," + 
				"\"attributeId\": " + idPatentable + "," + 
				"\"value\": {" + 
				"\"textValue\": \"\"," + 
				"\"booleanValue\": false" + 
				"}" + 
				"}," + 
				"{" + 
				"\"mandatory\": false," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"active\": false," + 
				"\"modificable\": false," + 
				"\"attribute\": " + bodySemaforo + "," + 
				"\"attributeId\": " + idSemaforo + "," + 
				"\"value\": {" + 
				"\"textValue\": \"\"," + 
				"\"booleanValue\": false" + 
				"}" + 
				"}," + 
				"{" + 
				"\"mandatory\": false," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"active\": false," + 
				"\"modificable\": true," + 
				"\"attribute\": " + bodyIva + "," + 
				"\"attributeId\": " + idIva + "," + 
				"\"value\": {" + 
				"\"textValue\": \"" + iva + "\"," + 
				"\"booleanValue\": false" + 
				"}" + 
				"}," +
				"{" + 
				"\"mandatory\": false," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"active\": false," + 
				"\"modificable\": false," + 
				"\"attribute\": "+ tipoSeguro + "," + 
				"\"attributeId\": " + idTipoSeg + "," + 
				"\"value\": {" + 
				"\"textValue\": \"\"," + 
				"\"booleanValue\": false," + 
				"\"idTableValue\": \"" + valorTipoSeg + "\"" + 
				"}" +
				"}," +
				"{" + 
				"\"mandatory\": false," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"active\": false," + 
				"\"modificable\": false," + 
				"\"attribute\": "+ claseSeguro + "," + 
				"\"attributeId\": " + idClasSeg + "," + 
				"\"value\": {" + 
				"\"textValue\": \"\"," + 
				"\"booleanValue\": false," + 
				"\"idTableValue\": \"" + valorClasSeg + "\"" + 
				"}" +
				"}," +
				"{" + 
				"\"mandatory\": false," + 
				"\"defineVersion\": true," + 
				"\"versionOrder\": \"1\"," + 
				"\"active\": false," + 
				"\"modificable\": true," + 
				"\"attribute\": " + bodyAtributo + "," + 
				"\"attributeId\": " + idAtributo + "," + 
				"\"value\": {" + 
				"\"textValue\": \"" + valorVersion + "\"," + 
				"\"booleanValue\": false" + 
				"}" + 
				"}" + 
				"]," + 
				"\"status\": \"Alta\"" + 
				"}");	
	}
	
	public String getSubClase() {
		return altaSubClase;
	}
	

}
