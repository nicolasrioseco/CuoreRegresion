package Ejecutor;


import utility.Constant;
import utility.ExcelUtils;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;

import OrdenEjecucion.OrderedTest;
import OrdenEjecucion.TestRunner;

import Precondiciones.ParametrosBienes;
import Precondiciones.ParametrosProveedores;
import Precondiciones.ParametrosServicios;
import Precondiciones.ParametrosTasas;


@RunWith(TestRunner.class)
public class Ejecutor_Api{

	public static ArrayList<String> proveedores = new ArrayList<String>();
	public static String [][] bienes;
	public static ArrayList<String> acuerdos = new ArrayList<String>();
	

	@OrderedTest(order=1)
	@Test
	public void metodosAltaProveedor() throws Exception {
		
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Proveedor");
		int registros = (int) ExcelUtils.getCellDataint(3,9);
		int i;
		
		if(registros != 0) {
		
		for (i= 0; i < (registros); i++) {
			int row = (i+3);
			ParametrosProveedores setParametros = new ParametrosProveedores();
			proveedores.add(i, setParametros.setProveedores(row));		
		}
		System.out.println("Se dieron de alta " + registros + " proveedores");
		}else {
			System.out.println("No hay Proveedores para dar de alta");
		}
	}
	
	
	@OrderedTest(order=2)
	@Test
	public void metodosAltaBienes() throws Exception {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Bienes");
		int registros = (int) ExcelUtils.getCellDataint(3,12);
		int i;
		
		if(registros != 0) {
		
			//Genero matriz
		bienes = new String [registros][4];
		
		for (i= 0; i < (registros); i++) {
			int row = (i+3);
		ParametrosBienes setParametros = new ParametrosBienes();
		setParametros.atributo(row);
		setParametros.extraerAtributos(row);
		bienes[i][0] = setParametros.clase(row);
		bienes[i][1] = setParametros.subClase(row);
		bienes[i][2] = setParametros.marca(row);
		setParametros.modelo(row);
		setParametros.extraerModel();
		bienes[i][3] = setParametros.bien(row);
		}
		System.out.println("Se dieron de alta " + registros + " atributos");
		System.out.println("Se dieron de alta " + registros + " clases");
		System.out.println("Se dieron de alta " + registros + " subclases");
		System.out.println("Se dieron de alta " + registros + " marcas");
		System.out.println("Se dieron de alta " + registros + " modelos");
		System.out.println("Se dieron de alta " + registros + " bienes");
		}else {
			System.out.println("No hay Bienes para dar de alta");
		}
		
	}
	
	@OrderedTest(order=3)
	@Test
	public void metodosAltaTasas() throws Exception {
		
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Tasas");
		int registros = (int) ExcelUtils.getCellDataint(3,16);
		int i;
		
		if(registros != 0) {
		
		for (i= 0; i < (registros); i++) {
			int row = (i+3);
			ParametrosTasas setParametros = new ParametrosTasas();
			String tipoTasa = setParametros.tasa(row);
			if(tipoTasa.equals("Variable")) {
				setParametros.tasaVariable(row);
				setParametros.tasaTTR(row);
			}else {
				setParametros.tasaTTR(row);
			}	
		}
		System.out.println("Se generaron " + registros + " Tasas y sus respectivas Tasas TTR");
		}else {
			System.out.println("No hay Tasas para dar de alta");
		}
	}
	
	@OrderedTest(order=4)
	@Test
	public void metodosConfigurarImpuestos() throws Exception {
		
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Impuestos");
		int registros = (int) ExcelUtils.getCellDataint(3,6);
		int i;
		
		if(registros != 0) {
		
		for (i= 0; i < (registros); i++) {
			int row = (i+3);
			ParametrosTasas setImpuestos = new ParametrosTasas();
			setImpuestos.impuestos(row);;
		}
		System.out.println("Se configuraron " + registros + " Impuestos");
		}else {
			System.out.println("No hay Impuestos para configurar");
		}
	}

	@OrderedTest(order=5)
	@Test
	public void metodosAltaAcuerdo() throws Exception {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"AcuerdoServicio");
		int registros = (int) ExcelUtils.getCellDataint(3,7);
		int i;
		if(registros != 0) {
			
		for (i= 0; i < (registros); i++) {
			int row = (i+3);
			int seleccionBien = (int) ExcelUtils.getCellDataint(row,12);
			int seleccionProveedor = (int) ExcelUtils.getCellDataint(row,17);
			ParametrosProveedores setParametros = new ParametrosProveedores();
			acuerdos.add(i, (setParametros.acuerdoServicio(row, bienes[seleccionBien][3], proveedores.get(seleccionProveedor))));
		}
		System.out.println("Se dieron de alta " + registros + " Acuerdos de Servicios");
		}else {
			System.out.println("No hay Acuerdos para dar de alta");
		}
	}
	
	@OrderedTest(order=6)
	@Test
	public void metodosServicio() throws Exception {
		
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Servicios");
		int registros = (int) ExcelUtils.getCellDataint(3,6);
		int i;
		
		if(registros != 0) {
		for (i= 0; i < (registros); i++) {
			int row = (i+3);
			int seleccionBien = (int) ExcelUtils.getCellDataint(row,13);
			int seleccionAcuerdo = (int) ExcelUtils.getCellDataint(row,16);
			ParametrosServicios setParametros = new ParametrosServicios();
			setParametros.servicio(row, bienes[seleccionBien][3], acuerdos.get(seleccionAcuerdo));
			setParametros.jbpmServicio_Crear();
			setParametros.jbpmServicio_Aprobar();
			System.out.println("Se generaron y aprobaron " + registros + " Servicios");
		}
		}else {
			System.out.println("No hay Servicios para dar de alta");
		}
	}
}



//	@Test
//	public void Producto() throws Exception {
//		
//		Datos_Producto altaProducto = new Datos_Producto();
//		String name = altaProducto.setAltaProductos();
//		System.out.println(name);
//		String altaProducto_post = altaProducto.getAltaProducto();
//		
//				given()
//					.contentType("application/json")
//					.headers("x-auth-token",token)
//					.body(altaProducto_post)
//				.when()
//					.post(Defoult_URL+"products/product")
//				.then().assertThat().statusCode(201);
//	}
//
//	@Test
//	public void servicios() throws InterruptedException{
//		
//		
//		
//		String getBien = "http://34.234.32.246:8082/api/products/good/good/search?page=1&size=15&version=&classId=2000062&subclassId=2000130&brandId=2000134&modelId=2000135";
//		String bodyBien=
//		given()
//			.contentType("application/json")
//			.headers("x-auth-token",token)
//			.when().get(getBien).getBody().asString();		
//		this.bien = ((((bodyBien.split("\"content\":\\[\\{"))[1])).split("\\}\\]"))[0];
//		System.out.println(bien);
//		
//		
//		Datos_Servicio datosServicio = new Datos_Servicio();
//		String post = datosServicio.setdatosServicio(bien);
//		int idServicio = 
//				given()
//		.contentType("application/json")
//		.headers("x-auth-token",token)
//		.body(post)
//		.when().post(Defoult_URL+"products/service")
//		.then()
//		.assertThat().statusCode(201).extract().path("id");
//		
//		System.out.println("Se generó el servicio: " + (idServicio));
//		
//		Thread.sleep(3000);
//		
//		JBPM_Servicio jbpmServicio = new JBPM_Servicio();
//		System.out.println(jbpmServicio.jbpmServicio(idServicio,Defoult_URL));
//		
//		final Gson gson = new Gson();
//		final String representacionJSON = gson.toJson(post);
//		assertEquals("{\"id\":46,\"nombre\":\"Miguel\",\"empresa\":\"Autentia\"}", representacionJSON);	
//	
//	}
//
//@Test
//public void acuerdoServicio() throws InterruptedException{
//	
//	Datos_Proveedor datos_Proveedor = new Datos_Proveedor();
//	String post = datos_Proveedor.setdatosProveedor();
//	String proveedor=
//	given()
//	.contentType("application/json")
//	.headers("x-auth-token",token)
//	.body(post)
//	.when().post(Defoult_URL+"products/supplier")
//	.then()
//	.assertThat().statusCode(201).extract().body().asString();
//	final Gson gson = new Gson();
//	this.proveedor = gson.toJson(proveedor);
//	System.out.println("llegue aca");
//	
//	Thread.sleep(1000);
//	
//	String getBien = "http://34.234.32.246:8082/api/products/good/good/search?page=1&size=15&version=&classId=2000062&subclassId=2000130&brandId=2000134&modelId=2000135";
//	String bodyBien=
//	given()
//		.contentType("application/json")
//		.headers("x-auth-token",token)
//		.when().get(getBien).getBody().asString();		
//	this.bien = ((((bodyBien.split("\"content\":\\[\\{"))[1])).split("\\}\\]"))[0];
//	
//	Thread.sleep(1000);
//	
//	Datos_altaAcuerdo datosAcuerdo = new Datos_altaAcuerdo();
//	String post2 = datosAcuerdo.setDatosAcuerdo(bien, proveedor);
//	given()
//	.contentType("application/json")
//	.headers("x-auth-token",token)
//	.body(post2)
//	.when().post(Defoult_URL+"products/supplier/agreement")
//	.then()
//	.assertThat().statusCode(201);
//
//	System.out.println(post2);	
//}
//
//@Test
//public void obtenerAnalisisactivoID() throws Exception {
//
// String procesoID_Bien =
//   given() 
//   .contentType("application/json")
//   .headers("x-auth-token","eyJraWQiOiJCTWltU1VNNWtxNTJsSXhDQk1LWiswQlBnSjNleE1sb3VCQlRDMlhIRk5BPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2YjBiNjY3YS00ZGM4LTQ5OTktYTM5ZS02YjliYWZmMzhkZWQiLCJjb2duaXRvOmdyb3VwcyI6WyJDVU9SRS1BZG1pbiJdLCJldmVudF9pZCI6IjNlNzdlY2E3LTM4ZGItMTFlOC1hMGZmLTE1YmVkYmIxZmYyZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1MjI5Mzc0OTMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0VmWXZQajdCRyIsImV4cCI6MTUyMjk0MTA5MywiaWF0IjoxNTIyOTM3NDkzLCJqdGkiOiI5NmNjMjJmMS0wYWEyLTRkZjctYWQxMi1jNzI4YjQ3M2M4Y2IiLCJjbGllbnRfaWQiOiIxbTZqamZpbDVuaXVjcml2ZDgyZnVuamlmcyIsInVzZXJuYW1lIjoiY3VvcmUuYWRtaW4uUUEifQ.RJiOseAcOCAs9i_ktU1RC9ohrSkP-lxfW_vx3JLoT2Xzuat1XvlfjCdX-7-_J96Sw4oQ38ZRY1i7q-jlVs9CMWBNBaSjWGSWYLXiOhhk4lE4nGuMhvBA0_lpPkw0fLgANq1Ua7KPH7BZ5xyfIU4G2WL9TlOmR4GfHNzYgqwgMGUBR0XrdYE_wCN_DzXOY5AC3_80r71DPOBA-2qQmkwc03z1PBeaInMnV2MwSBCzKU3eeK8Jtxwq5c83S43HzaZowk_7L8aTVzEMWwxZYSondAg3zuGEnP9StlZ1dGbjalLuAvmIEmbNhXb28ITtYvL0R_ZxljOOCHNUoJIraXF3cw")
//   .queryParam("page", 1)
//   .queryParam("size", 10)
//   .queryParam("name", "Analizar Bien por Activos")
//   .when().get("http://34.234.32.246:8082/api/bpm/cuore.admin.QA").getBody().asString();
// 
// System.out.println(procesoID_Bien);
//}
