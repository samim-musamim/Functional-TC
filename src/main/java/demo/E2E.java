package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2E {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
        
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// Give me the count of the links in the page
		// any tag with name (a) is link
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		
		
		
	}

}
