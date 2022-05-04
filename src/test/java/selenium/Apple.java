package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Apple {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.apple.com/iphone/");
		Thread.sleep(5000);
		boolean a = driver.findElement(By.xpath("//span[normalize-space()='From $999']")).isDisplayed();
		
		System.out.println(a);
		
		

	}

}
