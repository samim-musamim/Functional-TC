package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabalities {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.apple.com/iphone/");
		
		driver.findElement(By.id("ac-gn-link-search")).click();
		
		driver.findElement(By.id("ac-gn-searchform-input")).sendKeys("return");
		
		driver.findElement(By.id("ac-gn-searchform-submit")).click();
		
		
	String text =  driver.findElement(By.xpath("//div[@class='rf-serp-resultcount']")).getText();
		if(text.contains("results found")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		
	}

}
