package Producto;

public class Alta_Producto {
	
	public void setAltaProducto(String dador, String bodyBien) {
		
		
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
				"  \"bankings\": []," + 
				"  \"subBankings\": []," + 
				"  \"segments\": []," + 
				"  \"activities\": [" + 
				"    {" + 
				"      \"description\": \"Agro\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Industria\"," + 
				"      \"id\": 2" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Servicios\"," + 
				"      \"id\": 3" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Finanzas\"," + 
				"      \"id\": 4" + 
				"    }" + 
				"  ]," + 
				"  \"provinces\": []," + 
				"  \"cities\": []," + 
				"  \"holders\": [" + 
				"    {" + 
				"      \"description\": \"TCC\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Comafi\"," + 
				"      \"id\": 2" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Terceros\"," + 
				"      \"id\": 3" + 
				"    }" + 
				"  ]," + 
				"  \"destinations\": [" + 
				"    {" + 
				"      \"description\": \"Comercial\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Particular\"," + 
				"      \"id\": 2" + 
				"    }" + 
				"  ]," + 
				"  \"states\": [" + 
				"    {" + 
				"      \"description\": \"Nuevo\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Usado\"," + 
				"      \"id\": 2" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"De Stock\"," + 
				"      \"id\": 3" + 
				"    }" + 
				"  ]," + 
				"  \"origins\": [" + 
				"    {" + 
				"      \"description\": \"Importado\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Nacional\"," + 
				"      \"id\": 2" + 
				"    }" + 
				"  ]," + 
				"  \"goods\": [" + 
				"    {" + 
				"      \"id\":" + bienID + ","+ 
				"      \"classId\":" + claseID + ","+ 
				"      \"className\":\""+ claseName + "\"," + 
				"      \"classDescription\":\""+ claseDescription + "\"," + 
				"      \"subclassId\":" + subClaseID + ","+  
				"      \"subclassName\":\""+ subClaseName + "\"," + 
				"      \"subclassDescription\":\""+ subClaseDescription + "\"," + 
				"      \"brandId\":" + marcaID + ","+ 
				"      \"brandName\":\""+ marcaName + "\"," + 
				"      \"brandDescription\":\""+ marcaDescription + "\"," + 
				"      \"modelId\":" + modeloID + ","+ 
				"      \"modelName\":\""+ modeloName + "\"," + 
				"      \"modelDescription\":\""+ modeloDescription + "\"," + 
				"      \"version\":\""+ version + "\"," + 
				"      \"creationDate\": 1525713155000," + 
				"      \"status\": \"En Análisis\"," + 
				"      \"usefulLife\": 0," + 
				"      \"type\": 0," + 
				"      \"typification\": 0," + 
				"      \"attributes\": []" + 
				"    }" + 
				"  ]," + 
				"  \"services\": []," + 
				"  \"insurances\": [" + 
				"    {" + 
				"      \"goods\": [" + 
				"        {" + 
				"          \"id\":" + bienID + ","+ 
				"          \"classId\":" + claseID + ","+ 
				"          \"className\":\""+ claseName + "\"," + 
				"          \"classDescription\":\""+ claseDescription + "\"," + 
				"          \"subclassId\":" + subClaseID + ","+  
				"          \"subclassName\":\""+ subClaseName + "\"," + 
				"          \"subclassDescription\":\""+ subClaseDescription + "\"," + 
				"          \"brandId\":" + marcaID + ","+ 
				"          \"brandName\":\""+ marcaName + "\"," + 
				"          \"brandDescription\":\""+ marcaDescription + "\"," + 
				"          \"modelId\":" + modeloID + ","+ 
				"          \"modelName\":\""+ modeloName + "\"," + 
				"          \"modelDescription\":\""+ modeloDescription + "\"," + 
				"          \"version\":\""+ version + "\"," + 
				"          \"creationDate\": 1525713155000," + 
				"          \"status\": \"En Análisis\"," + 
				"          \"usefulLife\": 0," + 
				"          \"type\": 0," + 
				"          \"typification\": 0," + 
				"          \"attributes\": []" + 
				"        }" + 
				"      ]," + 
				"      \"responsibles\": [" + 
				"        {" + 
				"          \"description\": \"TCC\"," + 
				"          \"id\": 2" + 
				"        }" + 
				"      ]," + 
				"      \"carriers\": [" + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"La Segunda Coop Ltda De Seguros\"," + 
				"          \"id\": 1," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"HSBC Seguros Sa.\"," + 
				"          \"id\": 2," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"Generali Corporate S.A.\"," + 
				"          \"id\": 3," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"ACE Seguros Sa.\"," + 
				"          \"id\": 4," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"CHUBB Argentina De Seguros S.A.\"," + 
				"          \"id\": 5," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"SANCOR Cooperativa De Seguros Limitada\"," + 
				"          \"id\": 6," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }," + 
				"        {" + 
				"          \"address\": null," + 
				"          \"contactEmail\": null," + 
				"          \"contactName\": null," + 
				"          \"country\": null," + 
				"          \"cuit\": null," + 
				"          \"description\": \"ZURICH Argentina S.A.\"," + 
				"          \"id\": 7," + 
				"          \"postalCode\": null," + 
				"          \"province\": null," + 
				"          \"website\": null" + 
				"        }" + 
				"      ]," + 
				"      \"policies\": [" + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"La Segunda Autos\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 1," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"La Segunda Autos\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 2," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Hsbc Autos\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 3," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"ACE Ingenieria\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 4," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"ACE Ingenieria\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 5," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Generali Autos\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 6," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"CHUBB Argentina - Bc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 7," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"La Segunda Autos - Bc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 8," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"La Segunda Autos - Tcc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 9," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"GENERALI\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 10," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"CHUBB Argentina - Tcc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 11," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"HSBC\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 12," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"PIPER Lv-Mcy\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 13," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"ZURICH Argentina S.A.\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 14," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"HSBC\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 17," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"ACE Seguros\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 16," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"HSBC La Buenos Aires\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 18," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"ZURICH - 2012-13\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 19," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Poliza Aeronautica\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 20," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Poliza Auto E Ingenieria\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 21," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Automotor Hsbc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 22," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Terceros Completos\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 23," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }," + 
				"        {" + 
				"          \"currencyID\": null," + 
				"          \"description\": \"Terceros Completos Hsbc\"," + 
				"          \"endDate\": null," + 
				"          \"exchangeRate\": null," + 
				"          \"id\": 24," + 
				"          \"insuranceCarrierId\": null," + 
				"          \"insuranceTypeID\": null," + 
				"          \"renewed\": null," + 
				"          \"startDate\": null," + 
				"          \"status\": null" + 
				"        }" + 
				"      ]," + 
				"      \"coverages\": [" + 
				"        {" + 
				"          \"description\": \"Terceros Completos\"," + 
				"          \"id\": 1," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Terceros Completos - Cargas Peligrosas\"," + 
				"          \"id\": 2," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia\"," + 
				"          \"id\": 3," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia - Carga Peligrosa\"," + 
				"          \"id\": 4," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Responsabillidad Civil\"," + 
				"          \"id\": 5," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Operativo\"," + 
				"          \"id\": 6," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia Del 4% Valor Asegurado\"," + 
				"          \"id\": 7," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia $ 900,- Empleado\"," + 
				"          \"id\": 8," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Terceros Completos Empleados\"," + 
				"          \"id\": 9," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo En Tierra, Vuelo Y/O Carreteo\"," + 
				"          \"id\": 10," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia $ 1100 Nacional\"," + 
				"          \"id\": 11," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia Empleado $ 1100\"," + 
				"          \"id\": 13," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"True Todo Riesgo Con Franquicia Del 4%\"," + 
				"          \"id\": 15," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia $ 2200\"," + 
				"          \"id\": 12," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Franquicia Empleado $ 2200\"," + 
				"          \"id\": 14," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Fcia $ 2.000.00\"," + 
				"          \"id\": 16," + 
				"          \"type\": null" + 
				"        }," + 
				"        {" + 
				"          \"description\": \"Todo Riesgo Con Fcia $ 3.000,00\"," + 
				"          \"id\": 17," + 
				"          \"type\": null" + 
				"        }" + 
				"      ]," + 
				"      \"nodeInsurances\": []" + 
				"    }" + 
				"  ]," + 
				"  \"contractTypes\": [" + 
				"    {" + 
				"      \"description\": \"Financiero\"," + 
				"      \"id\": 1," + 
				"      \"ocKnown\": false" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"KPO\"," + 
				"      \"id\": 2," + 
				"      \"ocKnown\": false" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"True\"," + 
				"      \"id\": 3," + 
				"      \"ocKnown\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Software\"," + 
				"      \"id\": 4," + 
				"      \"ocKnown\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Inmuebles\"," + 
				"      \"id\": 5," + 
				"      \"ocKnown\": true" + 
				"    }" + 
				"  ]," + 
				"  \"amortizations\": [" + 
				"    {" + 
				"      \"description\": \"Sistema Francés\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Sistema Alemán\"," + 
				"      \"id\": 2" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Irregular\"," + 
				"      \"id\": 3" + 
				"    }" + 
				"  ]," + 
				"  \"lessors\": [" + 
				"    {" + 
				"      \"applyImpBenefit\": true," + 
				"      \"lessorId\": 1," + 
				"      \"lessorName\": \"TCC\"" + 
				"    }," + 
				"    {" + 
				"      \"applyImpBenefit\": false," + 
				"      \"lessorId\": 2," + 
				"      \"lessorName\": \"COMAFI\"" + 
				"    }" + 
				"  ]," + 
				"  \"hasTermOptionsEnabled\": false," + 
				"  \"contractTermOptions\": null," + 
				"  \"feePeriodicities\": [" + 
				"    {" + 
				"      \"description\": \"Mensual\"," + 
				"      \"id\": 1" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Semestral\"," + 
				"      \"id\": 2" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Anual\"," + 
				"      \"id\": 3" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Irregular\"," + 
				"      \"id\": 4" + 
				"    }" + 
				"  ]," + 
				"  \"productVrKpoItems\": [" + 
				"    {" + 
				"      \"termOption\": []," + 
				"      \"vrValue\": []," + 
				"      \"vrKpo\": []," + 
				"      \"associatedGood\": {" + 
				"          \"id\":" + bienID + ","+ 
				"          \"classId\":" + claseID + ","+ 
				"          \"className\":\""+ claseName + "\"," + 
				"          \"classDescription\":\""+ claseDescription + "\"," + 
				"          \"subclassId\":" + subClaseID + ","+  
				"          \"subclassName\":\""+ subClaseName + "\"," + 
				"          \"subclassDescription\":\""+ subClaseDescription + "\"," + 
				"          \"brandId\":" + marcaID + ","+ 
				"          \"brandName\":\""+ marcaName + "\"," + 
				"          \"brandDescription\":\""+ marcaDescription + "\"," + 
				"          \"modelId\":" + modeloID + ","+ 
				"          \"modelName\":\""+ modeloName + "\"," + 
				"          \"modelDescription\":\""+ modeloDescription + "\"," + 
				"          \"version\":\""+ version + "\"," + 
				"          \"creationDate\": 1525713155000," + 
				"          \"status\": \"En Análisis\"," + 
				"          \"usefulLife\": 0," + 
				"          \"type\": 0," + 
				"          \"typification\": 0," + 
				"          \"attributes\": []" + 
				"      }" + 
				"    }" + 
				"  ]," + 
				"  \"channels\": [" + 
				"    {" + 
				"      \"description\": \"Corporativa\"," + 
				"      \"id\": 9," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"EDN\"," + 
				"      \"id\": 1," + 
				"      \"parentChannel\": null," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Comafi\"," + 
				"      \"id\": 2," + 
				"      \"parentChannel\": null," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"MEGRAS\"," + 
				"      \"id\": 10," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"PYMES\"," + 
				"      \"id\": 11," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"BANCA PRIVADA\"," + 
				"      \"id\": 12," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"MICRO\"," + 
				"      \"id\": 13," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"NYP (Negocios y Profesionales)\"," + 
				"      \"id\": 14," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Individuos\"," + 
				"      \"id\": 15," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Comafi\"," + 
				"        \"id\": 2," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"e-commerce\"," + 
				"      \"id\": 4," + 
				"      \"parentChannel\": null," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Web\"," + 
				"      \"id\": 16," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"e-commerce\"," + 
				"        \"id\": 4," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Mobile\"," + 
				"      \"id\": 17," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"e-commerce\"," + 
				"        \"id\": 4," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Vinculadas\"," + 
				"      \"id\": 6," + 
				"      \"parentChannel\": null," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"NUBI\"," + 
				"      \"id\": 18," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Vinculadas\"," + 
				"        \"id\": 6," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Provencred\"," + 
				"      \"id\": 19," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Vinculadas\"," + 
				"        \"id\": 6," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Cuota YA\"," + 
				"      \"id\": 20," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Vinculadas\"," + 
				"        \"id\": 6," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Crediclick\"," + 
				"      \"id\": 21," + 
				"      \"parentChannel\": {" + 
				"        \"description\": \"Vinculadas\"," + 
				"        \"id\": 6," + 
				"        \"parentChannel\": null" + 
				"      }," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"End User\"," + 
				"      \"id\": 7," + 
				"      \"parentChannel\": null," + 
				"      \"checked\": true" + 
				"    }," + 
				"    {" + 
				"      \"description\": \"Sucursal\"," + 
				"      \"id\": 8," + 
				"      \"parentChannel\": null," + 
				"      \"checked\": true" + 
				"    }" + 
				"  ]," + 
				"  \"vendors\": []," + 
				"  \"brokers\": []," + 
				"  \"appliesForLegalPerson\": true," + 
				"  \"minimumMargin\": 0," + 
				"  \"maximumMargin\": 99999," + 
				"  \"mipyme\": \"\"," + 
				"  \"feeLessor\": {" + 
				"    \"applyImpBenefit\": false," + 
				"    \"lessorId\": 2," + 
				"    \"lessorName\": \"COMAFI\"" + 
				"  }," + 
				"  \"admFeeLessor\": {" + 
				"    \"applyImpBenefit\": true," + 
				"    \"lessorId\": 1," + 
				"    \"lessorName\": \"TCC\"" + 
				"  }," + 
				"  \"upFrontIVA\": {" + 
				"    \"description\": \"Financiado\"," + 
				"    \"id\": 1" + 
				"  }," + 
				"  \"contractCurrency\": {" + 
				"    \"description\": \"Pesos ($)\"," + 
				"    \"id\": 1000" + 
				"  }," + 
				"  \"validFrom\": \"2018-05-07T03:00:00.0Z\"," + 
				"  \"validUntil\": \"2018-12-31T03:00:00.0Z\"," + 
				"  \"appliesForPhysicalPerson\": true," + 
				"  \"contractMinTerm\": 12," + 
				"  \"contractMaxTerm\": 36," + 
				"  \"appliedtaxBenefitVisible\": true," + 
				"  \"portfolioLineVisible\": true," + 
				"  \"taxBenefitVisible\": true," + 
				"  \"rateTypeVisible\": true," + 
				"  \"rateSubtypeVisible\": true," + 
				"  \"initialCanonFirstFeeVisible\": true," + 
				"  \"initialCanonCEVisible\": true," + 
				"  \"ceValueVisible\": true," + 
				"  \"fundsCostVisible\": true," + 
				"  \"equipmentCostVisible\": true," + 
				"  \"equipmentCostEditable\": false," + 
				"  \"hiddenDiscountVisible\": true," + 
				"  \"leasingFactorVisible\": true," + 
				"  \"feeLessorVisible\": true," + 
				"  \"percentualFeeToPayValueVisible\": true," + 
				"  \"admFeeLessorVisible\": true," + 
				"  \"admFeeLessorPercentageValueVisible\": true," + 
				"  \"amountToFinanceVisible\": true," + 
				"  \"upFrontIvaVisible\": true," + 
				"  \"contractCurrencyVisible\": true," + 
				"  \"tnaPercentageValueVisible\": true," + 
				"  \"gracePeriodVisible\": false," + 
				"  \"feeBonificationVisible\": false," + 
				"  \"rateSubtype\": {" + 
				"    \"parentRateId\": null," + 
				"    \"rateDate\": null," + 
				"    \"rateID\": 724," + 
				"    \"rateInterest\": 0," + 
				"    \"rateIsMultiplier\": false," + 
				"    \"rateIsTop\": false," + 
				"    \"rateState\": \"Alta\"," + 
				"    \"rateSub\": []," + 
				"    \"rateSubTypeRate\": \"SubTipo Tasa Fija 1\"," + 
				"    \"rateTypeMoney\": \"Peso\"," + 
				"    \"rateTypeRate\": {" + 
				"      \"description\": \"Fija\"," + 
				"      \"id\": 1" + 
				"    }" + 
				"  }," + 
				"  \"percentualFeeToPayValue\": 3," + 
				"  \"admFeeLessorPercentageValue\": 4," + 
				"  \"tnaPercentageValue\": 5," + 
				"  \"amountToFinanceEditable\": true," + 
				"  \"gracePeriod\": {" + 
				"    \"description\": \"Meses 1\"," + 
				"    \"id\": 1" + 
				"  }," + 
				"  \"gracePeriodEditable\": false," + 
				"  \"feeBonificationEditable\": false," + 
				"  \"name\":\""+ productoName + "\"," + 
				"  \"productStatus\": {" + 
				"    \"statusDate\": \"2018-05-04T20:02:52.706Z\"," + 
				"    \"observation\": \"obs prod en analisis\"," + 
				"    \"name\": \"En Analisis\"," + 
				"    \"entityType\": \"PRODUCTO\"," + 
				"    \"masterStatus\": {" + 
				"      \"id\": 7" + 
				"    }" + 
				"  }," + 
				"  \"observations\": \"Observaciones de Productos\"," + 
				"  \"campaign\": \"\"" + 
				"}");
	}
	
	public String getAltaProducto() {
		return altaProducto;
	}
}
