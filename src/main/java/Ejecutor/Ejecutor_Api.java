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
	public static ArrayList<String> seleccion = new ArrayList<String>();

	@OrderedTest(order=1)
	@Test
	public void setInicial() throws Exception {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Tareas");
		seleccion.add(0,ExcelUtils.getCellData(5,2));//proveedores -> habilita solo Proveedores
		seleccion.add(1,ExcelUtils.getCellData(6,2));//Bienes -> habilita solo Bienes
		seleccion.add(2,ExcelUtils.getCellData(7,2));//Tasas -> habilita solo Tasas
		seleccion.add(3,ExcelUtils.getCellData(8,2));//Impuestos -> habilita solo Impuestos
		seleccion.add(4,ExcelUtils.getCellData(9,2));//Acuerdos de Servicios -> habilita Bienes, Proveedores y Acuerdo
		seleccion.add(5,ExcelUtils.getCellData(10,2));//Servicios -> habilita Bienes, Acuerdos y Servicios
		seleccion.add(6,ExcelUtils.getCellData(11,2));//Productos -> habilita Bienes, Tasas y Producto 
		
		AtributoInicial setAtributoInicial = new AtributoInicial();
		setAtributoInicial.atributosIniciales();
	}
	
	

	@OrderedTest(order=2)
	@Test
	public void metodosAltaProveedor() throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Proveedor");
		int registros = (int) ExcelUtils.getCellDataint(3,9);
		int i;

		if(registros != 0 && (seleccion.get(0).contains("Si"))) {

			for (i= 0; i < (registros); i++) {
				int row = (i+3);
				ParametrosProveedores setParametros = new ParametrosProveedores();
				proveedores.add(i, setParametros.setProveedores(row));
				System.out.println("> Se dió de alta el " + (row - 2) + "º Proveedor de " + registros);
			}System.out.println("\n*************************************************************************\n");
		}else {
			System.out.println("No hay Proveedores para dar de alta");
			System.out.println("\n*************************************************************************\n");
		}
	}


	@OrderedTest(order=3)
	@Test
	public void metodosAltaBienes() throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Bienes");
		int registros = (int) ExcelUtils.getCellDataint(3,15);
		int i;

		if(registros != 0 && (seleccion.get(1).contains("Si"))) {

			//Genero matriz
			bienes = new String [registros][4];

			for (i= 0; i < (registros); i++) {
				int row = (i+3);
				ParametrosBienes setParametros = new ParametrosBienes();
				setParametros.atributo(row);
				setParametros.extraerAtributos();
				bienes[i][0] = setParametros.clase();
				bienes[i][1] = setParametros.subClase();
				bienes[i][2] = setParametros.marca();
				setParametros.modelo();
				setParametros.extraerModel();
				bienes[i][3] = setParametros.bien();
				setParametros.JBPMBienes();
				System.out.println("> Se generó y aprobó el " + (row-2) + "º Bien de " + registros + ".\n--->Generando su Clase, Subclase, Marca Asociada y Modelo<---");
			}System.out.println("\n*************************************************************************\n");
		}else {
			System.out.println("\nNo hay Bienes para dar de alta");
			System.out.println("\n*************************************************************************\n");
		}

	}


	@OrderedTest(order=4)
	@Test
	public void metodosAltaTasas() throws Exception {


		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Tasas");
		int registros = (int) ExcelUtils.getCellDataint(3,16);
		int i;

		if(registros != 0 && (seleccion.get(2).contains("Si"))) {

			for (i= 0; i < (registros); i++) {
				int row = (i+3);
				ParametrosTasas setParametros = new ParametrosTasas();
				String tipoTasa = setParametros.tasa(row);
				if(tipoTasa.equals("Variable")) {
					setParametros.tasaVariable(row);
					setParametros.tasaTTR(row);
					System.out.println("> Se dió de alta la " + (row-2) + "º Tasa de " + registros + ".\n--->Generando su SubTasa, Tasa Variable y sus Tasas TTR<---");
					System.out.println("\n*************************************************************************\n");
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


		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Impuestos");
		int registros = (int) ExcelUtils.getCellDataint(3,6);
		int i;

		if(registros != 0 && (seleccion.get(3).contains("Si"))) {

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

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"AcuerdoServicio");
		int registros = (int) ExcelUtils.getCellDataint(3,7);
		int i;
		if(registros != 0 && (seleccion.get(4).contains("Si"))) {

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


		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Servicios");
		int registros = (int) ExcelUtils.getCellDataint(3,6);
		int i;

		if(registros != 0 && (seleccion.get(5).contains("Si"))) {
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

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Productos");
		int registros = (int) ExcelUtils.getCellDataint(3,10);
		int i;
		if(registros != 0 && (seleccion.get(6).contains("Si"))) {

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
