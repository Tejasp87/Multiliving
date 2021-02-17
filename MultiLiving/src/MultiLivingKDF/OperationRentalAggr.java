package MultiLivingKDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OperationRentalAggr {
	public void verifyPage(WebDriver d) {

		String actualBoxtitle = d.getTitle();
		System.out.println(actualBoxtitle);
		final String expectedTitle = "Online Rental Agreement | Leave and License Rent Agreement - MultiLiving";
		if (actualBoxtitle.equals(expectedTitle)) {
			System.out.println("Valid Page");
		} else {
			System.out.println("Invalid Page");
		}

	}

	public void basicDetails(WebDriver d, String a, String b, String c, String e) throws Exception {

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
		d.findElement(By.xpath("//*[@id=\"inputFirstName\"]")).sendKeys(a);
		d.findElement(By.xpath("//*[@id=\"inputLastName\"]")).sendKeys(b);
		d.findElement(By.xpath("//*[@id=\"inputMobile\"]")).sendKeys(c);
		d.findElement(By.xpath("//*[@id=\"inputMailId\"]")).sendKeys(e);
		d.findElement(By.xpath("//*[@id=\"stepcta_1\"]")).click();
	}

	public void landLordDetails(WebDriver d, String a, String b, String c, String e, String f, String g, String h,
			String i, String j, String k, String l) {
		d.findElement(By.id("inputFirstName")).sendKeys(a);
		d.findElement(By.className("inputText form-control")).sendKeys(b);
		d.findElement(By.name("age")).sendKeys(c);
		d.findElement(By.cssSelector("#inputPan")).sendKeys(e);
		d.findElement(By.xpath("//*[@id=\"inputMobile\"]")).sendKeys(f);
		d.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(g);
		d.findElement(By.xpath("//*[@id=\"inputAddress1\"]")).sendKeys(h);
		d.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys(i);
		d.findElement(By.xpath("//*[@id=\"inputPin\"]")).sendKeys(j);
		d.findElement(By.xpath("//*[@id=\"inputState\"]")).sendKeys(k);
		d.findElement(By.xpath("//*[@id=\"inputCountry\"]")).sendKeys(l);
		d.findElement(By.xpath("//*[@id=\"stepcta_2\"]")).click();
	}

	public void TenantDetails(WebDriver d, String a, String b, String c, String e, String f, String g, String h,
			String i, String j, String k, String l) {
		d.findElement(By.id("inputFirstName")).sendKeys(a);
		d.findElement(By.className("inputText form-control")).sendKeys(b);
		d.findElement(By.name("age")).sendKeys(c);
		d.findElement(By.cssSelector("#inputPan")).sendKeys(e);
		d.findElement(By.xpath("//*[@id=\"inputMobile\"]")).sendKeys(f);
		d.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(g);
		d.findElement(By.xpath("//*[@id=\"inputAddress1\"]")).sendKeys(h);
		d.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys(i);
		d.findElement(By.xpath("//*[@id=\"inputPin\"]")).sendKeys(j);
		d.findElement(By.xpath("//*[@id=\"inputState\"]")).sendKeys(k);
		d.findElement(By.xpath("//*[@id=\"inputCountry\"]")).sendKeys(l);
		d.findElement(By.xpath("//*[@id=\"stepcta_3\"]")).click();

	}

	public void appDetils(WebDriver d, String a, String b, String c, String e, String f, String g, String h, String i,
			String j, String k, String l, String m, String n, String o) {
		WebElement date = d.findElement(By.xpath("//*[@id=\"start_date\"]"));
		date.sendKeys(a);
		d.findElement(By.xpath("//*[@id=\"total_duration\"]")).sendKeys(b);
		d.findElement(By.xpath("//*[@id=\"lock_in_end_date\"]")).sendKeys(c);
		d.findElement(By.xpath("//*[@id=\"SlabEnd\"]")).sendKeys(e);
		d.findElement(By.xpath("//*[@id=\"SlabAmount\"]")).sendKeys(f);
		d.findElement(By.xpath("//*[@id=\"deposit\"]")).sendKeys(g);
		d.findElement(By.xpath("//*[@id=\"deposit_date\"]")).sendKeys(h);

		d.findElement(By.xpath("//*[@id=\"building_name\"]")).sendKeys(i);
		d.findElement(By.xpath("//*[@id=\"unit_no\"]")).sendKeys(j);
		d.findElement(By.xpath("//*[@id=\"floor_number\"]")).sendKeys(k);
		d.findElement(By.xpath("//*[@id=\"carpet_area\"]")).sendKeys(l);
		d.findElement(By.xpath("//*[@id=\"revenuelimit_area\"]")).sendKeys(m);
		d.findElement(By.xpath("//*[@id=\"revenuelimit_district\"]")).sendKeys(n);
		d.findElement(By.xpath("//*[@id=\"revenuelimit_corporation\"]")).sendKeys(o);
		d.findElement(By.xpath("//*[@id=\"stepcta_4\"]")).click();

	}

	public void ItemDetails(WebDriver d, String a, String b, String c, String e, String f, String g, String h, String i,
			String j, String k, String l, String m, String n, String o, String p, String q, String r) {
		d.findElement(By.xpath("//*[@id=\"fan\"]")).sendKeys(a);
		d.findElement(By.xpath("//*[@id=\"tube_light\"]")).sendKeys(b);
		d.findElement(By.xpath("//*[@id=\"bulb\"]")).sendKeys(c);
		d.findElement(By.xpath("//*[@id=\"bed\"]")).sendKeys(e);
		d.findElement(By.xpath("//*[@id=\"sofa\"]")).sendKeys(f);
		d.findElement(By.xpath("//*[@id=\"table\"]")).sendKeys(g);
		d.findElement(By.xpath("//*[@id=\"chair\"]")).sendKeys(h);
		d.findElement(By.xpath("//*[@id=\"cupboard\"]")).sendKeys(i);
		d.findElement(By.xpath("//*[@id=\"air_conditioner\"]")).sendKeys(j);
		d.findElement(By.xpath("//*[@id=\"electric_geyser\"]")).sendKeys(k);
		d.findElement(By.xpath("//*[@id=\\\"gas_geyser\\\"]")).sendKeys(l);
		d.findElement(By.xpath("//*[@id=\"air_cooler\"]")).sendKeys(m);
		d.findElement(By.xpath("//*[@id=\"water_cooler\"]")).sendKeys(n);
		d.findElement(By.xpath("//*[@id=\"curtains\"]")).sendKeys(o);
		d.findElement(By.xpath("//*[@id=\"washing_machine\"]")).sendKeys(p);
		d.findElement(By.xpath("//*[@id=\"other1_name\"]")).sendKeys(q);
		d.findElement(By.xpath("//*[@id=\"other1_count\"]")).sendKeys(r);
		d.findElement(By.xpath("//*[@id=\"stepcta_5\"]")).click();

	}

}
