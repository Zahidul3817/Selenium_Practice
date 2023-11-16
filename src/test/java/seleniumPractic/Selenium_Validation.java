package seleniumPractic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Validation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testpages.eviltester.com/styled/validation/input-validation.html");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).sendKeys("Zahidul");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("Haque Zahidul");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("26");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='country']")).sendKeys("Bangladesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("Frist_Project");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
