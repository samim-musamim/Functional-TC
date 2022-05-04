package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class CalenderHandling {
	protected WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.delta.com/flight-search/book-a-flight");

		WebElement oneWay = driver.findElement(By.id("selectTripType"));

		Select select = new Select(oneWay);

		select.selectByValue("ONE_WAY");

		WebElement date = driver.findElement(By.id("input_departureDate_1"));
		date.click();
		// visibility of calendar
		new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("dl-datepicker-calendar")));

		String MY = driver.findElement(By.className("dl-datepicker-title")).getText();

		if (MY.contains("April")) {
			System.out.println("April 2022 is selected");
		} else {
			System.out.println("Correct date is not selected");

		}

		driver.findElement(By.xpath("(//a[text()='27'])[1]")).click();

		driver.findElement(By.xpath("//button[@class='donebutton']")).click();
		driver.findElement(By
				.xpath("(//label[@class='content icon-Checked booking-widget_checkbox-mobile searchOptionFilter'])[1]"))
				.click();
		
		WebElement dropdown = driver.findElement(By.id("faresFor"));
		Select select1 = new Select(dropdown);
		select1.selectByValue("FIRST");
		
		
		driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
		
		
		
	}

}
