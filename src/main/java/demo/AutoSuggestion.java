package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(false);
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("Af");
		Thread.sleep(3000);
		
	      Assert.assertEquals(false, null);
	      Assert.assertEquals(true, false);
	      Calende

		
		
		List <WebElement> country = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

				for(WebElement obj:country) {
					
					if(obj.getText().equalsIgnoreCase("Afghanistan")) {
						Thread.sleep(3000);
						obj.click();
						break;
					}
					
				}
				
				
	}


}
