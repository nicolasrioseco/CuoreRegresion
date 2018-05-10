package Precondiciones;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;

import MetodosBienes.Atributo.Datos_Atributo;
import MetodosBienes.Bienes.Datos_Bien;
import MetodosBienes.Clase.Datos_Clase;
import MetodosBienes.JBPMaprobar.CompleteAnalizarBienPorActivos;
import MetodosBienes.JBPMaprobar.CompleteAnalizarBienPorSeguros;
import MetodosBienes.JBPMaprobar.CompleteAnalizarViabilidadDelBien;
import MetodosBienes.JBPMaprobar.TareaAnalizarBienPorActivos;
import MetodosBienes.JBPMaprobar.TareaAnalizarBienPorSeguros;
import MetodosBienes.JBPMaprobar.TareaAnalizarViabilidadDelBien;
import MetodosBienes.Marca.Alta_Marca;
import MetodosBienes.Marca.AsociarMarca;
import MetodosBienes.Modelo.Datos_Modelo;
import MetodosBienes.SubClase.Datos_SubClase;
import io.restassured.response.Response;
import utility.Constant;
import utility.ExcelUtils;


public class ParametrosBienes {


	public static String Defoult_URL = "http://34.234.32.246:8082/api/";
	public static String token = "eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw";
	public static String idBien;
	public static String idClase;
	public static String bodyClase;
	public static String idAtributo;
	public static String bodyAtributo;
	public static String bodySubClase;
	public static String idSubClase;
	public static String bodyMarca;
	public static String idMarca;
	public static String bodyAsocMarca;
	public static String idAsocMarca;
	public static String bodyModelo;
	public static String idModelo;
	public static String bodyBien;
	public static String valorTipo;
	public static String procesoID_Bien;
	public static String bienID;
	public static String procesoAnalizarXActivosID;
	public static String procesoAnalizarXSegurosID;
	public static String vidaUtil;
	public static String procesoAnalizarViabilidadID;
	public static int row;
	public static ArrayList<String> nombresCabeceras = new ArrayList<String>(Arrays.asList("Tipificación","Patentable", "Semaforo", "IVA"));
	public static ArrayList<String> bodyCabeceras = new ArrayList<String>();
	public static ArrayList<String> idCabecera = new ArrayList<String>();

	public void atributo(int row) throws Exception {
		Datos_Atributo datos_Atributos = new Datos_Atributo();
		String atributo_post = datos_Atributos.setdatos_atributo(row);
		ParametrosBienes.row = row;
		ParametrosBienes.bodyAtributo = 
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(atributo_post)
				.when()
				.post(Defoult_URL+"products/good/attribute")
				.getBody().asString();		
		ParametrosBienes.idAtributo = ((bodyAtributo.split("\\{\"id\":"))[1]).split(",\"name\"")[0];
	}


	public void extraerAtributos() throws Exception {

		int i;
		for(i=0; i < 4;i++) {
			String getCabecera = (Defoult_URL + "products/good/attribute/search");
			Response responseCabecera=
					given()
					.contentType("application/json")
					.headers("x-auth-token",token)
					.queryParam("page", 1)
					.queryParam("size", 15)
					.queryParam("name", nombresCabeceras.get(i))
					.queryParam("status", "true")
					.when().get(getCabecera);
			String serchCabecera = responseCabecera.getBody().asString();
			ParametrosBienes.bodyCabeceras.add((i+2), (((serchCabecera.split("content\":\\["))[1]).split("\\]\\}"))[0]);
			ParametrosBienes.idCabecera.add((i+2), (((bodyCabeceras.get(i+2)).split("\\{\"id\":"))[1]).split(",\"name\"")[0]);
		}
	}


	public String clase() throws Exception {

		Datos_Clase datos_clase = new Datos_Clase();
		String clase_post = datos_clase.setdatos_clase(row);
		ParametrosBienes.bodyClase=
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(clase_post)
				.when()
				.post(Defoult_URL+"products/good/class").getBody().asString();

		ParametrosBienes.idClase = ((bodyClase.split("\\{\"id\":"))[1]).split(",\"name\"")[0];

		return idClase;
	}


	public String subClase() throws Exception {

		Datos_SubClase datosSubClase = new Datos_SubClase();
		String subClase_post = datosSubClase.setdatos_clase(bodyClase, bodyAtributo, idAtributo, row, bodyCabeceras.get(2), idCabecera.get(2), 
				bodyCabeceras.get(3), idCabecera.get(3), bodyCabeceras.get(4), idCabecera.get(4), bodyCabeceras.get(5), idCabecera.get(5),
				bodyCabeceras.get(0), idCabecera.get(0), bodyCabeceras.get(1), idCabecera.get(1));
		ParametrosBienes.bodySubClase =
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(subClase_post)
				.when()
				.post(Defoult_URL+"products/good/subclass").getBody().asString();

		ParametrosBienes.idSubClase = ((bodySubClase.split("\\{\"id\":"))[1]).split(",\"name\"")[0];

		return idSubClase;
	}


	public String marca() throws Exception {

		Alta_Marca altaMarca = new Alta_Marca();
		String altaMarca_post = altaMarca.setaltaMarca(row);
		ParametrosBienes.bodyMarca =
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(altaMarca_post)
				.when()
				.post(Defoult_URL+"products/good/brandMaster").getBody().asString();
		ParametrosBienes.idMarca = ((bodyMarca.split("\"id\":"))[1]).split(",\"name\"")[0];

		//		Asociar Marca generada

		AsociarMarca asocMarca = new AsociarMarca();
		String asocMarca_post = asocMarca.setAsocMarca(bodySubClase, bodyMarca, row);
		ParametrosBienes.bodyAsocMarca =
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(asocMarca_post)
				.when()
				.post(Defoult_URL+"products/good/brand").getBody().asString();
		ParametrosBienes.idAsocMarca = ((bodyAsocMarca.split("\\{\"id\":"))[1]).split(",\"name\"")[0];

		return idAsocMarca;
	}


	public void modelo() throws Exception {

		Datos_Modelo altaModelo = new Datos_Modelo();
		String altaModelo_post = altaModelo.setAltaModelo(bodyAsocMarca, row);
		ParametrosBienes.bodyModelo =
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(altaModelo_post)
				.when()
				.post(Defoult_URL+"products/good/model").getBody().asString();
	}


	public void extraerModel() {

		Response responseModel=
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.queryParam("page", 1)
				.queryParam("size", 15)
				.queryParam("modelName")
				.queryParam("classId", idClase)
				.queryParam("subclassId", idSubClase)
				.queryParam("brandId", idAsocMarca)
				.when().get(Defoult_URL + "products/good/model/search");
		String serchModel = responseModel.getBody().asString();
		ParametrosBienes.idModelo = (((serchModel.split("content\":\\[\\{\"id\":"))[1]).split(",\"name"))[0];
	}


	public String bien() throws Exception {


		Datos_Bien altaBien = new Datos_Bien();
		String altaBien_post = altaBien.datosBien(idClase, idSubClase, idAsocMarca, idModelo, bodyCabeceras.get(2), idCabecera.get(2), 
				bodyCabeceras.get(3), idCabecera.get(3), bodyCabeceras.get(4), idCabecera.get(4), bodyCabeceras.get(5), idCabecera.get(5),
				bodyCabeceras.get(0), idCabecera.get(0), bodyCabeceras.get(1), idCabecera.get(1), bodyAtributo, idAtributo, row);
		ParametrosBienes.bodyBien =
				given()
				.contentType("application/json")
				.headers("x-auth-token",token)
				.body(altaBien_post)
				.when()
				.post(Defoult_URL+"products/good").getBody().asString();
		ParametrosBienes.idBien = (((bodyBien.split("\\{\""))[1]).split(",\"classId"))[0];

		return bodyBien;
	}

	public void JBPMBienes() throws Exception {

		obtenerNumeroProceso_Bien();
		obtenerIDActivosYSeguros();
		TareaAnalisisBienPorActivos();
		CompleteAnalisisBienPorActivos();
		TareaAnalisisBienPorSeguros();
		CompleteAnalisisBienPorSeguros();
		obtenerIDViabiliadBien();
		TareaAnalizarViabilidad();
		CompleteAnalizarViabilidad();
	}


	//Para obtener el numero procesID

	public void obtenerNumeroProceso_Bien() throws Exception {

		bienID = (bodyBien.split(",\"classId\":")[0]).split("\"id\":")[1];

		ParametrosBienes.procesoID_Bien = given() 
				.contentType("application/json")
				.headers("x-auth-token",token)
				.when().post(Defoult_URL+"products/good/analize/" + bienID).getBody().asString();

	}

	//Para obtener los ID de las tareas analizar bienes por activos y analizar bienes por seguros

	public void obtenerIDActivosYSeguros() throws Exception {


		ParametrosBienes.procesoAnalizarXActivosID =
				given() 
				.contentType("application/json")
				.headers("x-auth-token",token)
				.queryParam("page", 1)
				.queryParam("size", 10)
				.queryParam("name", "Analizar Bien por Activos")
				.when().get(Defoult_URL+"bpm/cuore.admin.QA").getBody().asString();
		procesoAnalizarXActivosID = ((procesoAnalizarXActivosID.split("id\":"))[1]).split(",\"name")[0];

		ParametrosBienes.procesoAnalizarXSegurosID =
				given() 
				.contentType("application/json")
				.headers("x-auth-token",token)
				.queryParam("page", 1)
				.queryParam("size", 10)
				.queryParam("name", "Analizar Bien por Seguros")
				.when().get(Defoult_URL+"bpm/cuore.admin.QA").getBody().asString();
		procesoAnalizarXSegurosID = ((procesoAnalizarXSegurosID.split("id\":"))[1]).split(",\"name")[0];

	}

	//Completa los campos de la tarea analizar bienes por activos

	public void TareaAnalisisBienPorActivos() throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Bienes");
		ParametrosBienes.valorTipo = ExcelUtils.getCellData(row,17);
		ParametrosBienes.vidaUtil = ExcelUtils.getCellData(row,19);

		TareaAnalizarBienPorActivos analizarBienXActivos = new TareaAnalizarBienPorActivos();

		String post_AnalisisActivos= analizarBienXActivos.setTareaAnalizarBienPorActivos(bodyBien, valorTipo, vidaUtil);
		given() 
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(post_AnalisisActivos)
		.when().post(Defoult_URL+"products/good/analysis");								
	}	

	//Par completar la tarea jbpm de analizar bienes por activos 

	public void CompleteAnalisisBienPorActivos() throws Exception {

		CompleteAnalizarBienPorActivos objCompleteAnalizarBienXActivos = new CompleteAnalizarBienPorActivos();

		String post_CompleteActivos= objCompleteAnalizarBienXActivos.mtdCompleteanalizarBienXActivos(bienID, procesoID_Bien, 
				procesoAnalizarXActivosID);

		given() 
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(post_CompleteActivos)
		.when().post(Defoult_URL+"bpm/complete");								
	}	

	//Completa los campos de la tarea analizar bienes por seguros

	public void TareaAnalisisBienPorSeguros() throws Exception {

		TareaAnalizarBienPorSeguros varAnalizarBienXSeguros = new TareaAnalizarBienPorSeguros();

		String post_AnalisisSeguros= varAnalizarBienXSeguros.setTareaAnalizarBienPorSeguros(bodyBien, valorTipo, vidaUtil);

		given() 
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(post_AnalisisSeguros)
		.when().post(Defoult_URL+"products/good/analysis");								
	}	

	//Par completar la tarea jbpm de analizar bienes por SEGUROS 

	public void CompleteAnalisisBienPorSeguros() throws Exception {

		CompleteAnalizarBienPorSeguros objCompleteAnalizarBienXSeguros = new CompleteAnalizarBienPorSeguros();

		String post_CompleteSeguros= objCompleteAnalizarBienXSeguros.mtdCompleteanalizarBienXSeguros(bienID, procesoID_Bien,
				procesoAnalizarXSegurosID);

		given() 
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(post_CompleteSeguros)
		.when().post(Defoult_URL+"bpm/complete");								
	}

	public void obtenerIDViabiliadBien() throws Exception {


		ParametrosBienes.procesoAnalizarViabilidadID = given() 
				.contentType("application/json")
				.headers("x-auth-token",token)
				.queryParam("page", 1)
				.queryParam("size", 10)
				.queryParam("name", "Analizar Vialidad del Bien")
				.when().get(Defoult_URL+"bpm/cuore.admin.QA").getBody().asString();


		procesoAnalizarViabilidadID = ((procesoAnalizarViabilidadID.split("id\":"))[1]).split(",\"name")[0];

	}


	public void TareaAnalizarViabilidad() throws Exception {

		TareaAnalizarViabilidadDelBien varAnalizarViabilidadDelBien = new TareaAnalizarViabilidadDelBien();

		String post_AnalisisViabilidad= varAnalizarViabilidadDelBien.setAnalizarViabilidad (bodyBien, valorTipo);

		given() 
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(post_AnalisisViabilidad)
		.when().post(Defoult_URL+"products/good/analysis");								
	}	

	//Par completar la tarea jbpm de analizar bienes por SEGUROS 

	public void CompleteAnalizarViabilidad() throws InterruptedException {
		Thread.sleep(10000);

		CompleteAnalizarViabilidadDelBien objCompeteViabilidad = new CompleteAnalizarViabilidadDelBien();

		String post_CompleteViabilidad= objCompeteViabilidad.mtdCompleteAnalizarViabilidad(bienID, procesoID_Bien, 
				procesoAnalizarViabilidadID);

		given() 
		.contentType("application/json")
		.headers("x-auth-token",token)
		.body(post_CompleteViabilidad)
		.when().post(Defoult_URL+"bpm/complete");								
	}

}
