package resources;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pojo.PetStore;

public class TestDataBuilder {

	public PetStore addUserPayload() throws Throwable {
		
		String sheet = "payload";
		String path = getPropertyKeyValue("excel");
		int id = getNumericValueFromExcel(path, sheet, 1, 0);
		String userName = getStringFromExcel(path, sheet, 1, 1);
		String firstName = getStringFromExcel(path, sheet, 1, 2);
		String lastName = getStringFromExcel(path, sheet, 1, 3);
		String email = getStringFromExcel(path, sheet, 1, 4);
		String password = getStringFromExcel(path, sheet, 1, 5);
		int phone = getNumericValueFromExcel(path, sheet, 1, 6);
		int userStatus = getNumericValueFromExcel(path, sheet, 1, 7);
		
		PetStore pet = new PetStore();
		pet.setId(id);
		pet.setUsername(userName);
		pet.setFirstName(firstName);
		pet.setLastName(lastName);
		pet.setEmail(email);
		pet.setPassword(password);
		pet.setPhone(phone);
		pet.setUserStatus(userStatus);
		return pet;
	}

	public String getStringFromExcel(String path, String sheetName, int rowName, int cellName) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.getRow(rowName);
		Cell cl = rw.getCell(cellName);
		String data = cl.getStringCellValue();
		return data;
	}

	public int getNumericValueFromExcel(String path, String sheetName, int rowName, int cellName) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.getRow(rowName);
		Cell cl = rw.getCell(cellName);
		int data = (int) cl.getNumericCellValue();
		return data;
	}

	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fiu = new FileInputStream("src/test/resources/config/global.properties");
		Properties pro = new Properties();
		pro.load(fiu);
		String Value = pro.getProperty(key);
		return Value;
	}
}
