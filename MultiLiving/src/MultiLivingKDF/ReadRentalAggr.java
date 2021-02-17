package MultiLivingKDF;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ReadRentalAggr {
	WebDriver d;

	@Test
	public void f() throws Exception {
		FileInputStream fi = new FileInputStream("C:\\Users\\tejas\\eclipse-workspace\\MultiLiving\\TestData.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fi);
		XSSFSheet sh = wk.getSheet("Sheet1");
		int row = sh.getLastRowNum();
		System.out.println("numbers of keyword is " + row);
		OperationRentalAggr o = new OperationRentalAggr();
		o.verifyPage(d);

		for (int i = 1; i <= row; i++) {
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("keyword is " + key);
			switch (key) {
			case "basicDetails":
				o.basicDetails(d, "tejas", "Patil", "9004300384", "tejasvp87@gmail.com");
				break;
			case "landLordDetails":
				o.landLordDetails(d, "Tejas", "Patil", "24", "DBPPP2999C", "9004300384", "tejasvp87@gmail.com",
						"LIG 1st,sector-2,room no.-A/7,kalamboli,410218", "Kalamboli", "410218", "Maharashtra",
						"India");
				break;
			case "TenantDetails":
				o.TenantDetails(d, "abc", "xyz", "26", "DBPPP2999A", "8286752919", "xyz@gmail.com", "Pqr", "mumbai",
						"400022", "Maharashtra", "India");
				break;
			case "appDetils":
				o.appDetils(d, "1602", "11", "11", "11", "5000", "2000", "2801", "xyz app.", "4", "2", "600", "20",
						"20", "20");
				break;
			case "ItemDetails":
				o.ItemDetails(d, "2", "3", "4", "1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "0", "0", "0", "0");
				break;

			}
		}
		wk.close();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tejas\\eclipse-workspace\\MultiLiving\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		String BASE_URL = "https://www.multiliving.co.in/online-rental-agreement";
		d.get(BASE_URL);
	}

	@AfterTest
	public void afterTest() {
	d.close();
	d.quit();
	}

}
