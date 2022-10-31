package Selenium_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class primera_prueba {
		public static void main (String[] args)throws InterruptedException {

			System.setProperty("webdriver.edge.driver","C:\\Users\\Maria\\OneDrive\\Escritorio\\Lab8Selenium\\src\\test\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://www.amazon.com/");
			//Inserta tu código aquí
			Thread.sleep(350000);
		driver.quit();
		
		}
}