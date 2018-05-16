package Ejecutor;


import utility.Constant;
import utility.ExcelUtils;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;

import MetodosBienes.Atributo.AtributoInicial;
import OrdenEjecucion.OrderedTest;
import OrdenEjecucion.TestRunner;

import Precondiciones.ParametrosBienes;
import Precondiciones.ParametrosProductos;
import Precondiciones.ParametrosProveedores;
import Precondiciones.ParametrosServicios;
import Precondiciones.ParametrosTasas;


@RunWith(TestRunner.class)
public class Ejecutor_Api{

	public static ArrayList<String> proveedores = new ArrayList<String>();
	public static String [][] bienes;
	public static ArrayList<String> acuerdos = new ArrayList<String>();
	public static String ejecucion = "Remoto";//Remoto al ejecutar desde Jenkins y Local al ejecutar desde local

	@OrderedTest(order=1)
	@Test
	public void setInicial() throws Exception {
		System.out.println("\n*************************Inicializando Ejecución*************************\n");
		if(ejecucion.contains("Remoto")) {
			ExcelUtils.setExcelInicial(Constant.Path_Alternative + Constant.File_TestData);
		}else {
			ExcelUtils.setExcelInicial(Constant.Path_TestData + Constant.File_TestData);
		}
		System.out.println(">Iniciando validación de Atributos Cabeceras no parametrizados");
		AtributoInicial setAtributoInicial = new AtributoInicial();
		setAtributoInicial.atributosInicialesTipoSeg();
		setAtributoInicial.atributosInicialesClassSeg();
		System.out.println("--->Finalizó exitosamente la validación de Atributos Cabecera no parametrizados");
		System.out.println("\n*************************************************************************\n");
	}
	
	

	@OrderedTest(order=2)
	@Test
	public void metodosAltaProveedor() throws Exception {
		System.out.println("********************Inicializando Alta  de Proveedores********************\n");
		ExcelUtils.setExcelFile("Proveedor");
		int registros = (int) ExcelUtils.getCellDataint(3,9);
		int i;
		if(registros != 0) {
			for (i= 0; i < (registros); i++) {
				int row = (i+3);
				ParametrosProveedores setParametros = new ParametrosProveedores();
				String proveedor = setParametros.setProveedores(row);
				proveedores.add(i, proveedor);
				System.out.println("> Se dió de alta el " + (row - 2) + "º Proveedor de " + registros);
			}System.out.println("\n*************************************************************************\n");
		}else {
			System.out.println("> No hay Proveedores para dar de alta");
			System.out.println("\n*************************************************************************\n");
		}
	}


	@OrderedTest(order=3)
	@Test
	public void metodosAltaBienes() throws Exception {
		System.out.println("**********************Inicializando Alta  de Bienes**********************\n");
		ExcelUtils.setExcelFile("Bienes");
		int registros = (int) ExcelUtils.getCellDataint(3,15);
		int i;

		if(registros != 0) {

			//Genero matriz
			bienes = new String [registros][4];

			for (i= 0; i < (registros); i++) {
				int row = (i+3);
				ParametrosBienes setParametros = new ParametrosBienes();
				setParametros.atributo(row);
				setParametros.extraerAtributos();
				System.out.println("> Se generó el " + (row-2) + "º Atributo de " + registros );
				bienes[i][0] = setParametros.clase();
				System.out.println("> Se generó la " + (row-2) + "º Clase de " + registros );
				bienes[i][1] = setParametros.subClase();
				System.out.println("> Se generó la " + (row-2) + "º SubClase de " + registros );
				bienes[i][2] = setParametros.marca();
				System.out.println("> Se generó la " + (row-2) + "º Marca Asociada de " + registros );
				setParametros.modelo();
				System.out.println("> Se generó el " + (row-2) + "º Modelo de " + registros );
				setParametros.extraerModel();
				bienes[i][3] = setParametros.bien();
				System.out.println("> Se generó el " + (row-2) + "º Bien de " + registros );
				setParametros.JBPMBienes();
				System.out.println("> Se aprobó el " + (row-2) + "º Bien de " + registros );
				System.out.println("\n*************************************************************************\n");
			}
		}else {
			System.out.println("\nNo hay Bienes para dar de alta");
			System.out.println("\n*************************************************************************\n");
		}

	}


	@OrderedTest(order=4)
	@Test
	public void metodosAltaTasas() throws Exception {
		System.out.println("************************Inicializando Alta de Tasas************************\n");
		ExcelUtils.setExcelFile("Tasas");
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
					System.out.println("> Se dió de alta la " + (row-2) + "º Tasa de " + registros + ".\n--->Generando su SubTasa, Tasa Variable y sus Tasas TTR<---");
				}else {
					setParametros.tasaTTR(row);
					System.out.println("> Se dió de alta la " + (row-2) + "º Tasa de " + registros + ".\n--->Generando su SubTasa y sus Tasas TTR<---");
				}	System.out.println("\n*************************************************************************\n");
			}
		}else {
			System.out.println("\nNo hay Tasas para dar de alta");
			System.out.println("\n*************************************************************************\n");
		}
	}

	@OrderedTest(order=5)
	@Test
	public void metodosConfigurarImpuestos() throws Exception {
		System.out.println("*********************Inicializando Alta de Impuestos*********************\n");
		ExcelUtils.setExcelFile("Impuestos");
		int registros = (int) ExcelUtils.getCellDataint(3,6);
		int i;

		if(registros != 0) {

			for (i= 0; i < (registros); i++) {
				int row = (i+3);
				ParametrosTasas setImpuestos = new ParametrosTasas();
				setImpuestos.impuestos(row);
				System.out.println("> Se configuro el " + (row-2) + "º Impuesto de " + registros);	
			}System.out.println("\n*************************************************************************\n");
		}else {
			System.out.println("\nNo hay Impuestos para configurar");
			System.out.println("\n*************************************************************************\n");
		}
	}

	@OrderedTest(order=6)
	@Test
	public void metodosAltaAcuerdo() throws Exception {
		System.out.println("***************Inicializando Alta de Acuerdos de Servicios***************\n");
		ExcelUtils.setExcelFile("AcuerdoServicio");
		int registros = (int) ExcelUtils.getCellDataint(3,7);
		int i;
		if(registros != 0) {

			for (i= 0; i < (registros); i++) {
				int row = (i+3);
				int seleccionBien = (int) ExcelUtils.getCellDataint(row,12);
				int seleccionProveedor = (int) ExcelUtils.getCellDataint(row,17);
				ParametrosProveedores setParametros = new ParametrosProveedores();
				acuerdos.add(i, (setParametros.acuerdoServicio(row, bienes[seleccionBien][3], proveedores.get(seleccionProveedor))));
				System.out.println("> Se dió de alta el " + (row-2) + "º Acuerdo de Servicio de " + registros);
			}System.out.println("\n*************************************************************************\n");
		}else {
			System.out.println("\nNo hay Acuerdos para dar de alta");
			System.out.println("\n*************************************************************************\n");
		}
	}

	@OrderedTest(order=7)
	@Test
	public void metodosServicio() throws Exception {
		System.out.println("***********Inicializando Alta de Servicios***********\n");
		ExcelUtils.setExcelFile("Servicios");
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
				System.out.println("> Se generó y aprobó el " + (row-2) + "º Servicio de " + registros);
			}System.out.println("\n*************************************************************************\n");
		}else {
			System.out.println("\nNo hay Servicios para dar de alta");
			System.out.println("\n*************************************************************************\n");
		}
	}

	@OrderedTest(order=8)
	@Test
	public void metodosProducto() throws Exception {
		System.out.println("***********Inicializando Alta de Productos***********\n");
		ExcelUtils.setExcelFile("Productos");
		int registros = (int) ExcelUtils.getCellDataint(3,10);
		int i;
		if(registros != 0) {

			for (i= 0; i < (registros); i++) {
				int row = (i+3);
				int seleccionBien = (int) ExcelUtils.getCellDataint(row,15);
				ParametrosProductos setParametros = new ParametrosProductos();
				setParametros.AltaProducto(row, bienes[seleccionBien][3]);
				System.out.println("> Se dió de alta y aprobó el " + (row-2) + "º Producto de " + registros);
			}System.out.println("\n*************************************************************************\n");
		}else {
			System.out.println("\nNo hay Productos para dar de alta");
			System.out.println("\n*************************************************************************\n");
		}
	}
}
