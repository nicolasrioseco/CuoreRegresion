package MetodosBienes.SubClase;

public class Alta_SubClase {
	
	private String altaSubClase;
	
	public void setSubClase (String name, String description, String bodyClase, String bodyAtributo, String idAtributo, String valorVersion, int iva) {
		
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
				"\"attribute\": {" + 
				"\"id\": 1," + 
				"\"name\": \"Tipificación\"," + 
				"\"description\": \"Tipificación\"," + 
				"\"attributeValueType\": {" + 
				"\"id\": 4," + 
				"\"description\": \"Tabla\"," + 
				"\"code\": \"TABLA\"" + 
				"}," + 
				"\"attributeFormat\": null," + 
				"\"status\": true," + 
				"\"options\": [" + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Aerodinos en general (aviones, hidroaviones, helicópteros)\"," + 
				"  \"uid\": 1," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Aguadas y bebederos\"," + 
				"  \"uid\": 2," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Alambradas y tranqueras\"," + 
				"  \"uid\": 3," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Barcos\"," + 
				"  \"uid\": 4," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Contenedores (incluídos contenedores cisternas y contenedores depósitos para cualquier medio de transporte)\"," + 
				"  \"uid\": 5," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Contenedores, excepto silos (toneles, tambores)\"," + 
				"  \"uid\": 6," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Cosechadoras (granos, oleaginosas y forrajes)\"," + 
				"  \"uid\": 7," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Edificios\"," + 
				"  \"uid\": 8," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Embarcaciones de recreo\"," + 
				"  \"uid\": 9," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Equipos de computación y accesorios de informática\"," + 
				"  \"uid\": 10," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Equipos y maquinarias de arrastre (sembradoras, discos, arados de reja, arados de cinceles, escardadores, etc)\"," + 
				"  \"uid\": 11," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Equipos, aparatos e instrumental de precisión de uso técnico y profesional\"," + 
				"  \"uid\": 12," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Equipos, aparatos e instrumental de uso técnico y profesional\"," + 
				"  \"uid\": 13," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Ferrocarriles (locomotoras y vagones)\"," + 
				"  \"uid\": 14," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Galpones\"," + 
				"  \"uid\": 15," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Hacienda reproductora\"," + 
				"  \"uid\": 16," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Herramientas\"," + 
				"  \"uid\": 17," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Instalaciones\"," + 
				"  \"uid\": 18," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Maquinarias y equipos\"," + 
				"  \"uid\": 19," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Molinos\"," + 
				"  \"uid\": 20," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Muebles y utiles\"," + 
				"  \"uid\": 21," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Pulverizadoras motopropulsadas\"," + 
				"  \"uid\": 22," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Rodados (automóviles, camiones, acoplados, autoelevadores, grúas, máquinas viales y motocicletas)\"," + 
				"  \"uid\": 23," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Rotoenfardadoras\"," + 
				"  \"uid\": 24," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Silos\"," + 
				"  \"uid\": 25," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Tarros tambo\"," + 
				"  \"uid\": 26," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Tractores\"," + 
				"  \"uid\": 27," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}," + 
				"{" + 
				"  \"id\": null," + 
				"  \"name\": \"Software\"," + 
				"  \"uid\": 28," + 
				"  \"description\": null," + 
				"  \"attributeDTO\": null" + 
				"}" + 
				"]," + 
				"\"applyAsset\": false," + 
				"\"systemAttribute\": true," + 
				"\"level\": 2," + 
				"\"entity\": {" + 
				"\"idEntity\": 1," + 
				"\"name\": \"Tipificación\"," + 
				"\"entityTableName\": \"t_com_equipmentClassification\"," + 
				"\"entityCode\": \"description\"," + 
				"\"entityId\": \"idEquipmentClassification\"" + 
				"}," + 
				"\"key\": null" + 
				"}," + 
				"\"attributeId\": 1," + 
				"\"value\": {" + 
				"\"textValue\": \"\"," + 
				"\"booleanValue\": false," + 
				"\"idTableValue\": \"4\"" + 
				"}" + 
				"}," + 
				"{" + 
				"\"mandatory\": false," + 
				"\"defineVersion\": false," + 
				"\"versionOrder\": 0," + 
				"\"active\": false," + 
				"\"modificable\": true," + 
				"\"attribute\": {" + 
				"\"id\": 2," + 
				"\"name\": \"Patentable\"," + 
				"\"description\": \"SI /NO\"," + 
				"\"attributeValueType\": {" + 
				"\"id\": 3," + 
				"\"description\": \"Si/No\"," + 
				"\"code\": \"BOOLEAN\"" + 
				"}," + 
				"\"attributeFormat\": null," + 
				"\"status\": true," + 
				"\"options\": []," + 
				"\"applyAsset\": false," + 
				"\"systemAttribute\": true," + 
				"\"level\": 2," + 
				"\"entity\": null," + 
				"\"key\": null" + 
				"}," + 
				"\"attributeId\": 2," + 
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
				"\"attribute\": {" + 
				"\"id\": 3," + 
				"\"name\": \"Semaforo\"," + 
				"\"description\": \"SI/NO (Rojo/Verde) cuando está en SI implica que al cotizar este bien debe pasar por la supervisión de activos\"," + 
				"\"attributeValueType\": {" + 
				"\"id\": 3," + 
				"\"description\": \"Si/No\"," + 
				"\"code\": \"BOOLEAN\"" + 
				"}," + 
				"\"attributeFormat\": null," + 
				"\"status\": true," + 
				"\"options\": []," + 
				"\"applyAsset\": false," + 
				"\"systemAttribute\": true," + 
				"\"level\": 2," + 
				"\"entity\": null," + 
				"\"key\": null" + 
				"}," + 
				"\"attributeId\": 3," + 
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
				"\"attribute\": {" + 
				"\"id\": 4," + 
				"\"name\": \"IVA %\"," + 
				"\"description\": \"Porcentaje IVA %\"," + 
				"\"attributeValueType\": {" + 
				"\"id\": 1," + 
				"\"description\": \"Texto\"," + 
				"\"code\": \"TEXTO\"" + 
				"}," + 
				"\"attributeFormat\": {" + 
				"\"id\": 4," + 
				"\"description\": \"Decimal\"," + 
				"\"code\": \"DECIMAL\"" + 
				"}," + 
				"\"status\": true," + 
				"\"options\": []," + 
				"\"applyAsset\": false," + 
				"\"systemAttribute\": true," + 
				"\"level\": 2," + 
				"\"entity\": null," + 
				"\"key\": null" + 
				"}," + 
				"\"attributeId\": 4," + 
				"\"value\": {" + 
				"\"textValue\": \"" + iva + "\"," + 
				"\"booleanValue\": false" + 
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
