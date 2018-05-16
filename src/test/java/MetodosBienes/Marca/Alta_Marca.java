package MetodosBienes.Marca;

import utility.ExcelUtils;

public class Alta_Marca {
	
	public String name;
	public String description;
	
	
	public String setaltaMarca(int row) throws Exception {
		
		this.name = ExcelUtils.getCellData(row,8);
		this.description = ExcelUtils.getCellData(row,7);
		
		String altaMarca = ("{" + 
				"\"description\": \"" + description +"\"," + 
				"\"name\": \"" + name + "\"" + 
				"}");
		
		return altaMarca;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return name;
	}

}