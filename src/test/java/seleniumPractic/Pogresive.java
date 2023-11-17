package seleniumPractic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pogresive {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.progressive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Log In")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Zahidulhaquw111@gmail.com");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("7535787543");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='flex justify-center items-center pv2 buttonText'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='flex justify-center items-center pv2 buttonText'])[2]")).click();
	}

}
