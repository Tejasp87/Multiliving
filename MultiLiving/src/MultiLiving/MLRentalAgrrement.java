package MultiLiving;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class MLRentalAgrrement {
	static WebDriver d;

	@Test
	public void RentelAgrrement() throws Exception {

		String actualBoxtitle = d.getTitle();
		System.out.println(actualBoxtitle);
		final String expectedTitle = "Online Rental Agreement | Leave and License Rent Agreement - MultiLiving";
		if (actualBoxtitle.equals(expectedTitle)) {
			System.out.println("Valid Page");
		} else {
			System.out.println("Invalid Page");
		}

		WebDriverWait wait = new WebDriverWait(d, 35);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div/img")));
		Thread.sleep(2000);
		Actions actions = new Actions(d);
		WebElement elementLocator = d.findElement(By.xpath("/html/body/div[6]/div"));
		actions.doubleClick(elementLocator).perform();

		d.findElement(By.xpath("/html/body/div[6]/div")).click();

		Thread.sleep(3000);

		Select sl = new Select(d.findElement(By.xpath("//*[@id=\"party_type\"]")));
		sl.selectByIndex(1);
		d.findElement(By.xpath("//*[@id=\"inputFirstName\"]")).sendKeys("tejas");
		d.findElement(By.xpath("//*[@id=\"inputLastName\"]")).sendKeys("patil");
		d.findElement(By.xpath("//*[@id=\"inputMobile\"]")).sendKeys("9004300384");
		d.findElement(By.xpath("//*[@id=\"inputMailId\"]")).sendKeys("tejasvp87@gmail.com");
		d.findElement(By.xpath("//*[@id=\"stepcta_1\"]")).click();

		Thread.sleep(3000);
		d.findElement(By.id("inputFirstName")).sendKeys("tejas");
		d.findElement(By.className("inputText form-control")).sendKeys("Patil");
		d.findElement(By.name("age")).sendKeys("24");
		d.findElement(By.cssSelector("#inputPan")).sendKeys("DBPPP2999C");
		d.findElement(By.xpath("//*[@id=\"inputMobile\"]")).sendKeys("9004300384");
		d.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("tejasvp87@gmail.com");
		d.findElement(By.xpath("//*[@id=\"inputAddress1\"]"))
				.sendKeys("LIG 1st,sector-2,room no.-A/7,kalamboli,410218");
		d.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys("Kalamboli");
		d.findElement(By.xpath("//*[@id=\"inputPin\"]")).sendKeys("410218");
		d.findElement(By.xpath("//*[@id=\"inputState\"]")).sendKeys("Maharashtra");
		d.findElement(By.xpath("//*[@id=\"inputCountry\"]")).sendKeys("India");
		d.findElement(By.xpath("//*[@id=\"stepcta_2\"]")).click();

		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"inputFirstName\"]")).sendKeys("abc");
		d.findElement(By.xpath("//*[@id=\"inputLastName\"]")).sendKeys("xyz");
		d.findElement(By.xpath("//*[@id=\"inputAge\"]")).sendKeys("22");
		d.findElement(By.xpath("//*[@id=\"inputPan\"]")).sendKeys("DBPPP2999A");
		d.findElement(By.xpath("//*[@id=\"inputMobile\"]")).sendKeys("8286752919");
		d.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("xyz@mail.com");
		d.findElement(By.xpath("//*[@id=\"inputAddress1\"]")).sendKeys("xyzzzz");
		d.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys("mumbai");
		d.findElement(By.xpath("//*[@id=\"inputPin\"]")).sendKeys("400022");
		d.findElement(By.xpath("//*[@id=\"inputState\"]")).sendKeys("Maharashtra");
		d.findElement(By.xpath("//*[@id=\"inputCountry\"]")).sendKeys("India");
		d.findElement(By.xpath("//*[@id=\"stepcta_3\"]")).click();

		Thread.sleep(3000);
		WebElement date = d.findElement(By.xpath("//*[@id=\"start_date\"]"));
		date.sendKeys("1602");
		d.findElement(By.xpath("//*[@id=\"total_duration\"]")).sendKeys("11");
		d.findElement(By.xpath("//*[@id=\"lock_in_end_date\"]")).sendKeys("11");
		d.findElement(By.xpath("//*[@id=\"SlabEnd\"]")).sendKeys("11");
		d.findElement(By.xpath("//*[@id=\"SlabAmount\"]")).sendKeys("5000");
		d.findElement(By.xpath("//*[@id=\"deposit\"]")).sendKeys("20000");
		d.findElement(By.xpath("//*[@id=\"deposit_date\"]")).sendKeys("2801");
		d.findElement(By.xpath("//*[@id=\"building_name\"]")).sendKeys("xyz app.");
		d.findElement(By.xpath("//*[@id=\"unit_no\"]")).sendKeys("4");
		d.findElement(By.xpath("//*[@id=\"floor_number\"]")).sendKeys("2");
		d.findElement(By.xpath("//*[@id=\"carpet_area\"]")).sendKeys("600");
		d.findElement(By.xpath("//*[@id=\"revenuelimit_area\"]")).sendKeys("20");
		d.findElement(By.xpath("//*[@id=\"revenuelimit_district\"]")).sendKeys("20");
		d.findElement(By.xpath("//*[@id=\"revenuelimit_corporation\"]")).sendKeys("20");
		d.findElement(By.xpath("//*[@id=\"stepcta_4\"]")).click();

		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"fan\"]")).sendKeys("1");
		d.findElement(By.xpath("//*[@id=\"tube_light\"]")).sendKeys("2");
		d.findElement(By.xpath("//*[@id=\"bulb\"]")).sendKeys("2");
		d.findElement(By.xpath("//*[@id=\"bed\"]")).sendKeys("1");
		d.findElement(By.xpath("//*[@id=\"sofa\"]")).sendKeys("1");
		d.findElement(By.xpath("//*[@id=\"table\"]")).sendKeys("1");
		d.findElement(By.xpath("//*[@id=\"chair\"]")).sendKeys("4");
		d.findElement(By.xpath("//*[@id=\"cupboard\"]")).sendKeys("1");
		d.findElement(By.xpath("//*[@id=\"air_conditioner\"]")).sendKeys("0");
		d.findElement(By.xpath("//*[@id=\"electric_geyser\"]")).sendKeys("0");
		d.findElement(By.xpath("//*[@id=\\\"gas_geyser\\\"]")).sendKeys("0");
		d.findElement(By.xpath("//*[@id=\"air_cooler\"]")).sendKeys("0");
		d.findElement(By.xpath("//*[@id=\"water_cooler\"]")).sendKeys("0");
		d.findElement(By.xpath("//*[@id=\"curtains\"]")).sendKeys("2");
		d.findElement(By.xpath("//*[@id=\"washing_machine\"]")).sendKeys("0");
		d.findElement(By.xpath("//*[@id=\"other1_name\"]")).sendKeys("shoe rack");
		d.findElement(By.xpath("//*[@id=\"other1_count\"]")).sendKeys("1");
		d.findElement(By.xpath("//*[@id=\"stepcta_5\"]")).click();

		WebElement data = d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div"));
		String data1 = data.getText();
		System.out.println(data1);
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
