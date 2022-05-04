package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GoogleSearchPage {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=common/home");

		driver.findElement(By.xpath("//a[@class='btn btn-link navbar-btn']")).click();
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("musamim3@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("shahab123$");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
		
       
		
	}

}
