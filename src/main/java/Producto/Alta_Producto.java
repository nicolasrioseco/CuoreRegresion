package Producto;

public class Alta_Producto {
	
	private String altaProducto;
	private String dador;
	
	public void setAltaProducto(String dador) {
		
		
		if(dador=="Comafi") {
			this.dador = ("\"{" + 
					"\"applyImpBenefit\": true," + 
					"\"lessorId\\\": 1," + 
					"\"lessorName\": \"TCC\"" + 
					"}");
		}else {
			this.dador = ("\"{" + 
					"\"applyImpBenefit\": false," + 
					"\"lessorId\\\": 2," + 
					"\"lessorName\": \"COMAFI\"" + 
					"}");
		}
		
		this.altaProducto = ("{" + 
				"\"bankings\": []," + 
				"\"subBankings\": []," + 
				"\"segments\": []," + 
				"\"activities\": [" + 
				"{" + 
				"\"description\": \"Agro\"," + 
				"\"id\": 1" + 
				"}," + 
				"{" + 
				"\"description\": \"Industria\"," + 
				"\"id\": 2" + 
				"}," + 
				"{" + 
				"\"description\": \"Servicios\"," + 
				"\"id\": 3" + 
				"}," + 
				"{" + 
				"\"description\": \"Finanzas\"," + 
				"\"id\": 4" + 
				"}" + 
				"]," + 
				"\"provinces\": [" + 
				"{" + 
				"\"codCountry\": \"AR\"," + 
				"\"codProvincia\": \"AR-B\"," + 
				"\"id\": 1," + 
				"\"provincia\": \"Provincia de Buenos Aires\"" + 
				"}," + 
				"{" + 
				"\"codCountry\": \"AR\"," + 
				"\"codProvincia\": \"AR-C\"," + 
				"\"id\": 2," + 
				"\"provincia\": \"Capital Federal\"" + 
				"}," + 
				"{" + 
				"\"codCountry\": \"AR\"," + 
				"\"codProvincia\": \"AR-X\"," + 
				"\"id\": 6," + 
				"\"provincia\": \"Córdoba\"" + 
				"}" + 
				"]," + 
				"\"cities\": []," + 
				"\"holders\": [" + 
				"{" + 
				"\"description\": \"TCC\"," + 
				"\"id\": 1" + 
				"}," + 
				"{" + 
				"\"description\": \"Comafi\"," + 
				"\"id\": 2" + 
				"}" + 
				"]," + 
				"\"destinations\": [" + 
				"{" + 
				"\"description\": \"Comercial\"," + 
				"\"id\": 1" + 
				"}," + 
				"{" + 
				"\"description\": \"Particular\"," + 
				"\"id\": 2" + 
				"}" + 
				"]," + 
				"\"states\": [" + 
				"{" + 
				"\"description\": \"Nuevo\"," + 
				"\"id\": 1" + 
				"}" + 
				"]," + 
				"\"origins\": [" + 
				"{" + 
				"\"description\": \"Importado\"," + 
				"\"id\": 1" + 
				"}," + 
				"{" + 
				"\"description\": \"Nacional\"," + 
				"\"id\": 2" + 
				"}" + 
				"]," + 
				"\"goods\": [{ " + 
				"\"id\": 6, " + 
				"\"classId\": 1, " + 
				"\"className\": \"Automotriz\", " + 
				"\"classDescription\": \"Bienes de clase automotriz\", " + 
				"\"subclassId\": 1063, " + 
				"\"subclassName\": \"Utilitario Deportivo SUV\", " + 
				"\"subclassDescription\": \"Bienes de subclase utilitario deportivo suv\", " + 
				"\"brandId\": 110326, " + 
				"\"brandName\": \"Bmw\", " + 
				"\"brandDescription\": \"Bienes de marca Bmw\", " + 
				"\"modelId\": 215293, " + 
				"\"modelName\": \"X1\", " + 
				"\"modelDescription\": \"Bienes modelo X1\", " + 
				"\"version\": \"Infoauto: Ford Fiesta KD Titanium 5 puertas\", " + 
				"\"creationDate\": 1524233965362, " + 
				"\"status\": \"Borrador\", " + 
				"\"usefulLife\": 0, " + 
				"\"type\": 0, " + 
				"\"typification\": 0, " + 
				"\"attributes\": [ " + 
				"{ " + 
				"\"id\": 34, " + 
				"\"attribute\": { " + 
				"\"id\": 1, " + 
				"\"name\": \"Tipificación\", " + 
				"\"description\": \"Tipificación\", " + 
				"\"attributeValueType\": { " + 
				"\"id\": 4, " + 
				"\"description\": \"Tabla\", " + 
				"\"code\": \"TABLA\" " + 
				"}, " + 
				"\"attributeFormat\": null, " + 
				"\"status\": true, " + 
				"\"options\": [ " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Aerodinos en general (aviones, hidroaviones, helicópteros)\", " + 
				"\"uid\": 1, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Aguadas y bebederos\", " + 
				"\"uid\": 2, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Alambradas y tranqueras\", " + 
				"\"uid\": 3, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Barcos\", " + 
				"\"uid\": 4, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Contenedores (incluídos contenedores cisternas y contenedores depósitos para cualquier medio de transporte)\", " + 
				"\"uid\": 5, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Contenedores, excepto silos (toneles, tambores)\", " + 
				"\"uid\": 6, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Cosechadoras (granos, oleaginosas y forrajes)\", " + 
				"\"uid\": 7, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Edificios\", " + 
				"\"uid\": 8, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Embarcaciones de recreo\", " + 
				"\"uid\": 9, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Equipos de computación y accesorios de informática\", " + 
				"\"uid\": 10, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Equipos y maquinarias de arrastre (sembradoras, discos, arados de reja, arados de cinceles, escardadores, etc)\", " + 
				"\"uid\": 11, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Equipos, aparatos e instrumental de precisión de uso técnico y profesional\", " + 
				"\"uid\": 12, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Equipos, aparatos e instrumental de uso técnico y profesional\", " + 
				"\"uid\": 13, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Ferrocarriles (locomotoras y vagones)\", " + 
				"\"uid\": 14, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Galpones\", " + 
				"\"uid\": 15, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Hacienda reproductora\", " + 
				"\"uid\": 16, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Herramientas\", " + 
				"\"uid\": 17, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Instalaciones\", " + 
				"\"uid\": 18, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Maquinarias y equipos\", " + 
				"\"uid\": 19, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Molinos\", " + 
				"\"uid\": 20, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Muebles y utiles\", " + 
				"\"uid\": 21, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Pulverizadoras motopropulsadas\", " + 
				"\"uid\": 22, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Rodados (automóviles, camiones, acoplados, autoelevadores, grúas, máquinas viales y motocicletas)\", " + 
				"\"uid\": 23, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Rotoenfardadoras\", " + 
				"\"uid\": 24, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Silos\", " + 
				"\"uid\": 25, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Tarros tambo\", " + 
				"\"uid\": 26, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Tractores\", " + 
				"\"uid\": 27, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Software\", " + 
				"\"uid\": 28, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"} " + 
				"], " + 
				"\"applyAsset\": false, " + 
				"\"systemAttribute\": false, " + 
				"\"level\": 2, " + 
				"\"entity\": { " + 
				"\"idEntity\": 1, " + 
				"\"name\": \"Tipificación\", " + 
				"\"entityTableName\": \"t_com_equipmentClassification\", " + 
				"\"entityCode\": \"description\", " + 
				"\"entityId\": \"idEquipmentClassification\" " + 
				"}, " + 
				"\"key\": null " + 
				"}, " + 
				"\"idAttribute\": 1, " + 
				"\"active\": false, " + 
				"\"textValue\": \"\", " + 
				"\"booleanValue\": false, " + 
				"\"idTableValue\": 23, " + 
				"\"optionValueId\": null, " + 
				"\"optionValue\": null, " + 
				"\"modificable\": false, " + 
				"\"defineVersion\": false, " + 
				"\"versionOrder\": 0 " + 
				"}, " + 
				"{ " + 
				"\"id\": 35, " + 
				"\"attribute\": { " + 
				"\"id\": 2, " + 
				"\"name\": \"Patentable\", " + 
				"\"description\": \"SI /NO\", " + 
				"\"attributeValueType\": { " + 
				"\"id\": 3, " + 
				"\"description\": \"Si/No\", " + 
				"\"code\": \"BOOLEAN\" " + 
				"}, " + 
				"\"attributeFormat\": null, " + 
				"\"status\": true, " + 
				"\"options\": [], " + 
				"\"applyAsset\": false, " + 
				"\"systemAttribute\": false, " + 
				"\"level\": 2, " + 
				"\"entity\": null, " + 
				"\"key\": null " + 
				"}, " + 
				"\"idAttribute\": 2, " + 
				"\"active\": false, " + 
				"\"textValue\": \"\", " + 
				"\"booleanValue\": true, " + 
				"\"idTableValue\": null, " + 
				"\"optionValueId\": null, " + 
				"\"optionValue\": null, " + 
				"\"modificable\": false, " + 
				"\"defineVersion\": false, " + 
				"\"versionOrder\": 0 " + 
				"}, " + 
				"{ " + 
				"\"id\": 36, " + 
				"\"attribute\": { " + 
				"\"id\": 3, " + 
				"\"name\": \"Semaforo\", " + 
				"\"description\": \"SI/NO (Rojo/Verde) cuando está en SI implica que al cotizar este bien debe pasar por la supervisión de activos\", " + 
				"\"attributeValueType\": { " + 
				"\"id\": 3, " + 
				"\"description\": \"Si/No\", " + 
				"\"code\": \"BOOLEAN\" " + 
				"}, " + 
				"\"attributeFormat\": null, " + 
				"\"status\": true, " + 
				"\"options\": [], " + 
				"\"applyAsset\": false, " + 
				"\"systemAttribute\": false, " + 
				"\"level\": 2, " + 
				"\"entity\": null, " + 
				"\"key\": null " + 
				"}, " + 
				"\"idAttribute\": 3, " + 
				"\"active\": false, " + 
				"\"textValue\": \"\", " + 
				"\"booleanValue\": false, " + 
				"\"idTableValue\": null, " + 
				"\"optionValueId\": null, " + 
				"\"optionValue\": null, " + 
				"\"modificable\": false, " + 
				"\"defineVersion\": false, " + 
				"\"versionOrder\": 0 " + 
				"}, " + 
				"{ " + 
				"\"id\": 37, " + 
				"\"attribute\": { " + 
				"\"id\": 4, " + 
				"\"name\": \"IVA %\", " + 
				"\"description\": \"Porcentaje IVA %\", " + 
				"\"attributeValueType\": { " + 
				"\"id\": 1, " + 
				"\"description\": \"Texto\", " + 
				"\"code\": \"TEXTO\" " + 
				"}, " + 
				"\"attributeFormat\": { " + 
				"\"id\": 4, " + 
				"\"description\": \"Decimal\", " + 
				"\"code\": \"DECIMAL\" " + 
				"}, " + 
				"\"status\": true, " + 
				"\"options\": [], " + 
				"\"applyAsset\": false, " + 
				"\"systemAttribute\": false, " + 
				"\"level\": 2, " + 
				"\"entity\": null, " + 
				"\"key\": null " + 
				"}, " + 
				"\"idAttribute\": 4, " + 
				"\"active\": false, " + 
				"\"textValue\": \"21\", " + 
				"\"booleanValue\": false, " + 
				"\"idTableValue\": null, " + 
				"\"optionValueId\": null, " + 
				"\"optionValue\": null, " + 
				"\"modificable\": false, " + 
				"\"defineVersion\": false, " + 
				"\"versionOrder\": 0 " + 
				"}, " + 
				"{ " + 
				"\"id\": 38, " + 
				"\"attribute\": { " + 
				"\"id\": 301, " + 
				"\"name\": \"Tipo de seguro\", " + 
				"\"description\": \"descripcion tipo seguro\", " + 
				"\"attributeValueType\": { " + 
				"\"id\": 4, " + 
				"\"description\": \"Tabla\", " + 
				"\"code\": \"TABLA\" " + 
				"}, " + 
				"\"attributeFormat\": null, " + 
				"\"status\": true, " + 
				"\"options\": [ " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"AUTOMOTOR\", " + 
				"\"uid\": 1, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"INGENIERIA\", " + 
				"\"uid\": 2, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"AERONAUTICO\", " + 
				"\"uid\": 3, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"} " + 
				"], " + 
				"\"applyAsset\": false, " + 
				"\"systemAttribute\": false, " + 
				"\"level\": 0, " + 
				"\"entity\": { " + 
				"\"idEntity\": 3, " + 
				"\"name\": \"InsuranceType\", " + 
				"\"entityTableName\": \"t_fin_InsuranceType\", " + 
				"\"entityCode\": \"InsuranceType_Name\", " + 
				"\"entityId\": \"InsuranceType_ID\" " + 
				"}, " + 
				"\"key\": null " + 
				"}, " + 
				"\"idAttribute\": 301, " + 
				"\"active\": false, " + 
				"\"textValue\": \"\", " + 
				"\"booleanValue\": false, " + 
				"\"idTableValue\": 1, " + 
				"\"optionValueId\": null, " + 
				"\"optionValue\": null, " + 
				"\"modificable\": false, " + 
				"\"defineVersion\": false, " + 
				"\"versionOrder\": 0 " + 
				"}, " + 
				"{ " + 
				"\"id\": 39, " + 
				"\"attribute\": { " + 
				"\"id\": 302, " + 
				"\"name\": \"Clase seguro\", " + 
				"\"description\": \"desc clase seguro\", " + 
				"\"attributeValueType\": { " + 
				"\"id\": 4, " + 
				"\"description\": \"Tabla\", " + 
				"\"code\": \"TABLA\" " + 
				"}, " + 
				"\"attributeFormat\": null, " + 
				"\"status\": true, " + 
				"\"options\": [ " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"ACOPLADO\", " + 
				"\"uid\": 1, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"AUTOGRUA\", " + 
				"\"uid\": 2, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"AUTOMOVIL\", " + 
				"\"uid\": 3, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"CAMION HASTA 4 TN\", " + 
				"\"uid\": 4, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"CAMION MAS 4 TN\", " + 
				"\"uid\": 5, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"PICK UP A\", " + 
				"\"uid\": 6, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"PICK UP B\", " + 
				"\"uid\": 7, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"COMUNICACIONES A1\", " + 
				"\"uid\": 8, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"CONTRATISTA A1\", " + 
				"\"uid\": 9, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"ELECTRONICOS A1\", " + 
				"\"uid\": 10, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"MAQUINARIAS A1\", " + 
				"\"uid\": 11, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"MEDICOS A1\", " + 
				"\"uid\": 12, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"MUEBLES A1\", " + 
				"\"uid\": 13, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"SOFTWARE\", " + 
				"\"uid\": 14, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"NO ASEGURABLE\", " + 
				"\"uid\": 15, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"CAMION MAS 4 TN ACCESORIOS\", " + 
				"\"uid\": 16, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"ACOPLADO ACCESORIOS\", " + 
				"\"uid\": 17, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"AUTOMOVIL ACCESORIOS\", " + 
				"\"uid\": 18, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"CAMION HASTA 4TN ACCESORIOS\", " + 
				"\"uid\": 19, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"PICK UP B ACCESORIOS\", " + 
				"\"uid\": 20, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"AERONAVES\", " + 
				"\"uid\": 21, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"GR 700EX\", " + 
				"\"uid\": 22, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"PICK UP A ACCESORIOS\", " + 
				"\"uid\": 23, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"} " + 
				"], " + 
				"\"applyAsset\": false, " + 
				"\"systemAttribute\": false, " + 
				"\"level\": 0, " + 
				"\"entity\": { " + 
				"\"idEntity\": 4, " + 
				"\"name\": \"InsuranceClass\", " + 
				"\"entityTableName\": \"t_fin_InsuranceClass\", " + 
				"\"entityCode\": \"InsuranceClass_Name\", " + 
				"\"entityId\": \"InsuranceClass_ID\" " + 
				"}, " + 
				"\"key\": null " + 
				"}, " + 
				"\"idAttribute\": 302, " + 
				"\"active\": false, " + 
				"\"textValue\": \"\", " + 
				"\"booleanValue\": false, " + 
				"\"idTableValue\": 3, " + 
				"\"optionValueId\": null, " + 
				"\"optionValue\": null, " + 
				"\"modificable\": false, " + 
				"\"defineVersion\": false, " + 
				"\"versionOrder\": 0 " + 
				"}, " + 
				"{ " + 
				"\"id\": 40, " + 
				"\"attribute\": { " + 
				"\"id\": 300, " + 
				"\"name\": \"Infoauto\", " + 
				"\"description\": \"descripcion infoauto\", " + 
				"\"attributeValueType\": { " + 
				"\"id\": 1, " + 
				"\"description\": \"Texto\", " + 
				"\"code\": \"TEXTO\" " + 
				"}, " + 
				"\"attributeFormat\": { " + 
				"\"id\": 2, " + 
				"\"description\": \"Alfanumérico\", " + 
				"\"code\": \"ALFANUMERICO\" " + 
				"}, " + 
				"\"status\": true, " + 
				"\"options\": [ " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Aerodinos en general (aviones, hidroaviones, helicópteros)\", " + 
				"\"uid\": 1, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Aguadas y bebederos\", " + 
				"\"uid\": 2, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Alambradas y tranqueras\", " + 
				"\"uid\": 3, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Barcos\", " + 
				"\"uid\": 4, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Contenedores (incluídos contenedores cisternas y contenedores depósitos para cualquier medio de transporte)\", " + 
				"\"uid\": 5, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Contenedores, excepto silos (toneles, tambores)\", " + 
				"\"uid\": 6, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Cosechadoras (granos, oleaginosas y forrajes)\", " + 
				"\"uid\": 7, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Edificios\", " + 
				"\"uid\": 8, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Embarcaciones de recreo\", " + 
				"\"uid\": 9, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Equipos de computación y accesorios de informática\", " + 
				"\"uid\": 10, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Equipos y maquinarias de arrastre (sembradoras, discos, arados de reja, arados de cinceles, escardadores, etc)\", " + 
				"\"uid\": 11, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Equipos, aparatos e instrumental de precisión de uso técnico y profesional\", " + 
				"\"uid\": 12, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Equipos, aparatos e instrumental de uso técnico y profesional\", " + 
				"\"uid\": 13, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Ferrocarriles (locomotoras y vagones)\", " + 
				"\"uid\": 14, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Galpones\", " + 
				"\"uid\": 15, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Hacienda reproductora\", " + 
				"\"uid\": 16, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Herramientas\", " + 
				"\"uid\": 17, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Instalaciones\", " + 
				"\"uid\": 18, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Maquinarias y equipos\", " + 
				"\"uid\": 19, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Molinos\", " + 
				"\"uid\": 20, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Muebles y utiles\", " + 
				"\"uid\": 21, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Pulverizadoras motopropulsadas\", " + 
				"\"uid\": 22, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Rodados (automóviles, camiones, acoplados, autoelevadores, grúas, máquinas viales y motocicletas)\", " + 
				"\"uid\": 23, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Rotoenfardadoras\", " + 
				"\"uid\": 24, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Silos\", " + 
				"\"uid\": 25, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Tarros tambo\", " + 
				"\"uid\": 26, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Tractores\", " + 
				"\"uid\": 27, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"}, " + 
				"{ " + 
				"\"id\": null, " + 
				"\"name\": \"Software\", " + 
				"\"uid\": 28, " + 
				"\"description\": null, " + 
				"\"attributeDTO\": null " + 
				"} " + 
				"], " + 
				"\"applyAsset\": false, " + 
				"\"systemAttribute\": false, " + 
				"\"level\": 0, " + 
				"\"entity\": { " + 
				"\"idEntity\": 1, " + 
				"\"name\": \"Tipificación\", " + 
				"\"entityTableName\": \"t_com_equipmentClassification\", " + 
				"\"entityCode\": \"description\", " + 
				"\"entityId\": \"idEquipmentClassification\" " + 
				"}, " + 
				"\"key\": null " + 
				"}, " + 
				"\"idAttribute\": 300, " + 
				"\"active\": false, " + 
				"\"textValue\": \"Ford Fiesta KD Titanium 5 puertas\", " + 
				"\"booleanValue\": false, " + 
				"\"idTableValue\": null, " + 
				"\"optionValueId\": null, " + 
				"\"optionValue\": null, " + 
				"\"modificable\": false, " + 
				"\"defineVersion\": true, " + 
				"\"versionOrder\": 1 " + 
				"} " + 
				"] " + 
				"} " + 
				"]," + 
				"\"services\": []," + 
				"\"insurances\": []," + 
				"\"contractTypes\": [" + 
				"{" + 
				"\"description\": \"Financiero\"," + 
				"\"id\": 1," + 
				"\"ocKnown\": false" + 
				"}," + 
				"{" + 
				"\"description\": \"KPO\"," + 
				"\"id\": 2," + 
				"\"ocKnown\": false" + 
				"}," + 
				"{" + 
				"\"description\": \"True\"," + 
				"\"id\": 3," + 
				"\"ocKnown\": true" + 
				"}," + 
				"{" + 
				"\"description\": \"Software\"," + 
				"\"id\": 4," + 
				"\"ocKnown\": true" + 
				"}" + 
				"]," + 
				"\"amortizations\": [" + 
				"{" + 
				"\"description\": \"Financiero\"," + 
				"\"id\": 1," + 
				"\"ocKnown\": false" + 
				"}," + 
				"{" + 
				"\"description\": \"Sistema Alemán\"," + 
				"\"id\": 2" + 
				"}," + 
				"{" + 
				"\"description\": \"Irregular\"," + 
				"\"id\": 3" + 
				"}" + 
				"]," + 
				"\"lessors\": [" + dador + 
				"]," +
				"\"gracePeriod\": null," + 
				"\"gracePeriodEditable\": false," + 
				"\"gracePeriodVisible\": false," + 
				"\"hasInitialCanonCePercentageValueEnabled\": true," + 
				"\"hasInitialCanonCeValueEnabled\": false," + 
				"\"hasInitialCanonFirstFeeEnabled\": false," +
				"\"hasTermOptionsEnabled\": true," + 
				"\"contractTermOptions\": [" + 
				"12," + 
				"24," + 
				"36" + 
				"]," + 
				"\"feePeriodicities\": [" + 
				"{" + 
				"\"description\": \"Mensual\"," + 
				"\"id\": 1" + 
				"}," + 
				"{" + 
				"\"description\": \"Semestral\"," + 
				"\"id\": 2" + 
				"}," + 
				"{" + 
				"\"description\": \"Anual\"," + 
				"\"id\": 3" + 
				"}," + 
				"{" + 
				"\"description\": \"Irregular\"," + 
				"\"id\": 4" + 
				"}" + 
				"]," + 
				"\"productVrKpoItems\": []," + 
				"\"channels\": [" + 
				"{" + 
				"\"description\": \"EDN\"," + 
				"\"id\": 1," + 
				"\"parentChannel\": null" + 
				"}," + 
				"{" + 
				"\"description\": \"End User\"," + 
				"\"id\": 7," + 
				"\"parentChannel\": null" + 
				"}," + 
				"{" + 
				"\"description\": \"Corporativa\"," + 
				"\"id\": 9," + 
				"\"parentChannel\": {" + 
				"\"description\": \"Comafi\"," + 
				"\"id\": 2," + 
				"\"parentChannel\": null" + 
				"}" + 
				"}" + 
				"]," + 
				"\"vendors\": []," + 
				"\"brokers\": []," + 
				"\"appliesForLegalPerson\": true," + 
				"\"minimumMargin\": 0," + 
				"\"maximumMargin\": 99999," + 
				"\"mipyme\": \"\"," + 
				"\"upFrontIVA\": {" + 
				"\"description\": \"Financiado\"," + 
				"\"id\": 1" + 
				"}," + 
				"\"feeLessor\": {" + 
				"\"applyImpBenefit\": false," + 
				"\"lessorId\": 2," + 
				"\"lessorName\": \"COMAFI\"" + 
				"}," + 
				"\"admFeeLessor\": {" + 
				"\"applyImpBenefit\": true," + 
				"\"lessorId\": 1," + 
				"\"lessorName\": \"TCC\"" + 
				"}," + 
				"\"contractCurrency\": {" + 
				"\"description\": \"Dolares (U$S)\"," + 
				"\"id\": 2000" + 
				"}," + 
				"\"appliesForPhysicalPerson\": true," + 
				"\"contractMinTerm\": 12," + 
				"\"contractMaxTerm\": 36," + 
				"\"appliedtaxBenefitVisible\": true," + 
				"\"portfolioLineVisible\": true," + 
				"\"taxBenefitVisible\": true," + 
				"\"rateTypeVisible\": true," + 
				"\"rateSubtypeVisible\": true," + 
				"\"initialCanonFirstFeeVisible\": true," +
				"\"initialCanonFirstFeeEditable\": true," +
				"\"portfolioLine\": {" + 
				"\"description\": \"LS Especial\"," + 
				"\"id\": 1" + 
				"}," + 
				"\"initialCanonCEVisible\": true," + 
				"\"initialCanonCeEditable\": true," +
				"\"ceValueVisible\": true," + 
				"\"ceValue\": null," + 
				"\"portfolioLineEditable\": true," + 
				"\"rateTypeEditable\": true," + 
				"\"rateSubtypeEditable\": true," + 
				"\"rateSubtype\": {" + 
				"\"parentRateId\": null," + 
				"\"rateDate\": null," + 
				"\"rateID\": 93," + 
				"\"rateInterest\": 0," + 
				"\"rateIsMultiplier\": false," + 
				"\"rateIsTop\": false," + 
				"\"rateState\": \"Alta\"," + 
				"\"rateSub\": []," + 
				"\"rateSubTypeRate\": \"Nico2\"," + 
				"\"rateTypeMoney\": \"Peso\"," + 
				"\"rateTypeRate\": {" + 
				"\"description\": \"Fija\"," + 
				"\"id\": 1" + 
				"}" + 
				"}," + 
				"\"fundsCostVisible\": true," + 
				"\"equipmentCostVisible\": true," + 
				"\"hiddenDiscountVisible\": true," + 
				"\"leasingFactorVisible\": true," + 
				"\"equipmentCostEditable\": true," + 
				"\"feeLessorVisible\": true," + 
				"\"percentualFeeToPayValue\": null," + 
				"\"percentualFeeToPayValueVisible\": true," + 
				"\"percentualFeeToPayValueEditable\": true," + 
				"\"feeLessorEditable\": true," + 
				"\"admFeeLessorVisible\": true," + 
				"\"admFeeLessorPercentageValueVisible\": true," + 
				"\"admFeeLessorEditable\": true," + 
				"\"admFeeLessorPercentageValueEditable\": true," + 
				"\"admFeeLessorPercentageValue\": 6," + 
				"\"upFrontIvaVisible\": true," + 
				"\"contractCurrencyVisible\": true," + 
				"\"contractCurrencyEditable\": true," + 
				"\"tnaPercentageValue\": 66," + 
				"\"tnaPercentageValueVisible\": true," + 
				"\"tnaPercentageValueEditable\": true," + 
				"\"feeBonificationVisible\": true," + 
				"\"validFrom\": \"2018-04-20T03:00:00.0Z\"," + 
				"\"validUntil\": \"2019-04-06T03:00:00.0Z\"," + 
				"\"name\": \"Producto 17\"," + 
				"\"productStatus\": {" + 
				"\"statusDate\": \"2018-04-20T15:33:21.876Z\"," + 
				"\"observation\": \"obs prod en analisis\"," + 
				"\"name\": \"En Analisis\"," + 
				"\"entityType\": \"PRODUCTO\"," + 
				"\"masterStatus\": {" + 
				"\"id\": 7" + 
				"}" + 
				"}," + 
				"\"observations\": \"Producto 17\"," + 
				"\"campaign\": \"\"" + 
				"}");
	}
	
	public String getAltaProducto() {
		return altaProducto;
	}
}
