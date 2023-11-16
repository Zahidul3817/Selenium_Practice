package seleniumPractic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Practice_Automationexercise {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Signup / Login")).click();
		driver.findElement(By.name("name")).sendKeys("Zahidul3817");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("Zahidul3817@gmail.com");
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("8376462897");
		driver.findElement(By.xpath("//select[@id='days']")).sendKeys("13");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='months']")).sendKeys("May");
		driver.findElement(By.xpath("//select[@id='years']")).sendKeys("2022");

	}

}
