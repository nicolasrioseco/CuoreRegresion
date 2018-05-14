package MetodosBienes.Bienes;

public class Alta_Bien {
	
	private String bien;
	

	public void setaltaClase(String idClase, String nameClase, String descriptionClase, String idSubClase, String nameSubClase, String descriptionSubClase,
							String idAsocMarca, String nameMarca, String descriptionMarca, String idModelo, String nameModelo, String descriptionModelo,
							String nameAtributo, String valorVersion, String tipificacion, String idTipificacion, String patentable, String idPatentable, 
							String semaforo, String idSemaforo, String iva, String idIva, String tipoSeguro, String idTipo, String claseSeguro, 
							String idClasSeg, String bodyAtributo, String idAtributo, String valorTipo, String valorTipoSeg, String valorClasSeg) {
		
		this.bien = ("{" + 
				"\"classId\": " + idClase + "," + 
				"\"className\": \"" + nameClase + "\"," + 
				"\"classDescription\": \"" + descriptionClase + "\"," + 
				"\"subclassId\": " + idSubClase + "," + 
				"\"subclassName\": \"" + nameSubClase + "\"," + 
				"\"subclassDescription\": \"" + descriptionSubClase + "\"," + 
				"\"brandId\": " + idAsocMarca + "," + 
				"\"brandName\": \"" + nameMarca + "\"," + 
				"\"brandDescription\": \"" + descriptionMarca + "\"," + 
				"\"modelId\": " + idModelo + "," + 
				"\"modelName\": \"" + nameModelo + "\"," + 
				"\"modelDescription\": \"" + descriptionModelo + "\"," + 
				"\"version\": \"" + nameAtributo + ": " + valorVersion + "\"," + 
				"\"attributes\": [" + 
				"{" + 
				"\"active\": false," + 
				"\"attribute\": " + tipificacion + "," + 
				"\"booleanValue\": false," + 
				"\"idAttribute\": " + idTipificacion + "," + 
				"\"idTableValue\": " + valorTipo + "," + 
				"\"optionValue\": null," + 
				"\"modificable\": false," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"textValue\": \"\"" + 
				"}," + 
				"{" + 
				"\"active\": false," + 
				"\"attribute\": " + patentable + "," + 
				"\"booleanValue\": false," + 
				"\"idAttribute\": " + idPatentable + "," + 
				"\"idTableValue\": null," + 
				"\"optionValue\": null," + 
				"\"modificable\": true," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"textValue\": \"\"" + 
				"}," + 
				"{" + 
				"\"active\": false," + 
				"\"attribute\": " + semaforo + "," + 
				"\"booleanValue\": false," + 
				"\"idAttribute\": " + idSemaforo + "," + 
				"\"idTableValue\": null," + 
				"\"optionValue\": null," + 
				"\"modificable\": false," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"textValue\": \"\"" + 
				"}," + 
				"{" + 
				"\"active\": false," + 
				"\"attribute\": " + iva + "," + 
				"\"booleanValue\": false," + 
				"\"idAttribute\": " + idIva + "," + 
				"\"idTableValue\": null," + 
				"\"optionValue\": null," + 
				"\"modificable\": true," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"textValue\": \"21\"" + 
				"}," +
				"{" + 
				"\"active\": false," + 
				"\"attribute\": " + tipoSeguro + "," + 
				"\"booleanValue\": false," + 
				"\"idAttribute\": " + idTipo + "," + 
				"\"idTableValue\": " + valorTipoSeg + "," + 
				"\"optionValue\": null," + 
				"\"modificable\": true," + 
				"\"defineVersion\": true," + 
				"\"versionOrder\": 0," + 
				"\"textValue\": \"\"" + 
				"}," + 
				"{" + 
				"\"active\": false," + 
				"\"attribute\": " + claseSeguro + "," + 
				"\"booleanValue\": false," + 
				"\"idAttribute\": " + idClasSeg + "," + 
				"\"idTableValue\": " + valorClasSeg + "," + 
				"\"optionValue\": null," + 
				"\"modificable\": true," + 
				"\"defineVersion\": true," + 
				"\"versionOrder\": 0," + 
				"\"textValue\": \"\"" + 
				"}," + 
				"{" + 
				"\"active\": false," + 
				"\"attribute\": " + bodyAtributo + "," + 
				"\"booleanValue\": false," + 
				"\"idAttribute\": " + idAtributo + "," + 
				"\"idTableValue\": null," + 
				"\"optionValue\": null," + 
				"\"modificable\": true," + 
				"\"defineVersion\": true," + 
				"\"versionOrder\": 1," + 
				"\"textValue\": \"" + valorVersion + "\"" + 
				"}" + 
				"]" + 
				"}");
	}
	public String getaltaClase() {
		return bien;
	}

}
