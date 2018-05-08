package MetodosBienes.Bienes;

public class Alta_Bien {
	
	private String bien;
	

	public void setaltaClase(String idClase, String nameClase, String descriptionClase, String idSubClase, String nameSubClase, String descriptionSubClase,
							String idAsocMarca, String nameMarca, String descriptionMarca, String idModelo, String nameModelo, String descriptionModelo,
							String nameAtributo, String valorVersion, String tipificacion, String patentable, String semaforo, String iva, String bodyAtributo, String idAtributo, String valorTipo) {
		
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
				"\"idAttribute\": 1," + 
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
				"\"idAttribute\": 2," + 
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
				"\"idAttribute\": 3," + 
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
				"\"idAttribute\": 4," + 
				"\"idTableValue\": null," + 
				"\"optionValue\": null," + 
				"\"modificable\": true," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"textValue\": \"21\"" + 
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
