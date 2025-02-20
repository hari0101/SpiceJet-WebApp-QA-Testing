package utilities;


import org.testng.annotations.DataProvider;

public class DataProviders {

	//Create account invalid input to the fields.
	@DataProvider(name="Create_Account_Invalid_Input")	
	public String[][] invalid_Create_Account_Data() {
		
		String excel_Path ="D:\\NEW PROJECT\\DataProvider_SpiceJet.xlsx";
		
		ExcelUtility excel = new ExcelUtility(excel_Path);
		int rowsize = excel.getRowLength("DataDriven");
		int cellsize = excel.getCellLength("DataDriven", 0);
		
		String data[][] = new String[rowsize][cellsize];
		
		for(int i=1; i<=rowsize; i++){
			
			for(int j=0; j<cellsize; j++) {
				
				data[i-1][j]= excel.getCellData("DataDriven", i, j);
				
			}
			
		}
		return data;
	}	

	@DataProvider(name="Invalid_Login_MobileNumber")	
	public String[][] invalid_Login_MobileNumber_Data() {
		
		String excel_Path ="D:\\NEW PROJECT\\DataProvider_SpiceJet.xlsx";
		
		ExcelUtility excel = new ExcelUtility(excel_Path);
		int rowsize = excel.getRowLength("LoginNumber");
		int cellsize = excel.getCellLength("LoginNumber", 0);
		
		String data[][] = new String[rowsize][cellsize];
		
		for(int i=1; i<=rowsize; i++){
			
			for(int j=0; j<cellsize; j++) {
				
				data[i-1][j]= excel.getCellData("LoginNumber", i, j);
				
			}
			
		}
		return data;
	}	

	@DataProvider(name="Invalid_Login_EmailAddress")	
	public String[][] invalid_Login_EmailAddress_Data() {
		
		String excel_Path ="D:\\NEW PROJECT\\DataProvider_SpiceJet.xlsx";
		
		ExcelUtility excel = new ExcelUtility(excel_Path);
		int rowsize = excel.getRowLength("LoginEmail");
		int cellsize = excel.getCellLength("LoginEmail", 0);
		
		String data[][] = new String[rowsize][cellsize];
		
		for(int i=1; i<=rowsize; i++){
			
			for(int j=0; j<cellsize; j++) {
				
				data[i-1][j]= excel.getCellData("LoginEmail", i, j);
				
			}
			
		}
		return data;
	}



	
	
	
	
	
	
}
