package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement passengers = driver.findElement(By.id("divpaxinfo"));
		passengers.click();
		Thread.sleep(5000);
		
//		int i = 1;
//		while(i<4) {
//			c
//           i++;
//		}
		
		
		for(int i=0; i<4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		
		
	}

}
