package co.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("mugala.nagaraju@gmail.com");
		 driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		 String at = driver.getTitle();
		 String et ="gmail.com";
		 driver.close();
		 if (at.equalsIgnoreCase(et)) {
			 System.out.println("Test sucessfull");
		 }
		 else {
			 System.out.println("Test was Un-Successful");
		 }

	}

}
