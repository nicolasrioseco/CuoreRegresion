package MetodosTasas.TasaTTR;

import utility.ExcelUtils;

public class Datos_TTR {
	
		public int vidaMedia;
		public double interes;
		public String tope;
		public String multiplicador;
	
		public String setTasaTTR(int i, int row) throws Exception{
			
			int dador = (int) ExcelUtils.getCellDataint(row,15); //1=TCC, 2=BC
			String moneda = ExcelUtils.getCellData(row,1);
			String tipo = ExcelUtils.getCellData(row,0);
			String nameSubT = ExcelUtils.getCellData(row,2);
			double valorTopeMin = ExcelUtils.getCellDataint(row,13);
			
			if(tipo.equals("Variable")) {
				this.tope = ExcelUtils.getCellData(row,4);
				this.multiplicador = ExcelUtils.getCellData(row,3);
			}else {
				this.tope = "false";
				this.multiplicador = "false";
			}
			
			
			int vidaMedia1 = (int) ExcelUtils.getCellDataint(row,7); 
			double interes1 = ExcelUtils.getCellDataint(row,8);

			int vidaMedia2 = (int) ExcelUtils.getCellDataint(row,9); 
			double interes2 = ExcelUtils.getCellDataint(row,10);

			int vidaMedia3 = (int) ExcelUtils.getCellDataint(row,11); 
			double interes3 = ExcelUtils.getCellDataint(row,12);


			if(i == 0) {
				this.vidaMedia = vidaMedia1;
				this.interes = interes1;
			}else if(i == 1) {
				this.vidaMedia = vidaMedia2;
				this.interes = interes2;
			}else {
				this.vidaMedia = vidaMedia3;
				this.interes = interes3;
			}


			Alta_TTR datos_TTR = new Alta_TTR();
			datos_TTR.setaltaTTR(dador, moneda, tipo, nameSubT, vidaMedia, interes, multiplicador, tope, valorTopeMin);
			String post = datos_TTR.getaltaTTR();
			
			return post;
		}	



}
