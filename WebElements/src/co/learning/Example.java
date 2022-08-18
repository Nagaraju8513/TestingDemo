package co.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://accounts.google.com/");
		
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("mugala.nagaraju@gmail.com");
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("#Next")).click();
		Thread.sleep(3000);
//		driver.navigate().to("https://www.youtube.com/");
//		Thread.sleep(4000);
//		driver.findElement(By.name("search_query")).sendKeys("rrr movie trailer");
//		driver.findElement(By.xpath("search-icon-legacy")).click();
//		driver.findElement(By.className("extended style-scope ytd-video-renderer")).click();
//		driver.navigate().back();
//		driver.quit();
//		
//		String at = driver.getTitle();
//		
//		String et= "https://accounts.google.com/";
//		if(at.equalsIgnoreCase(et)) {
//			System.out.println("test successfull");
//		}
//		else {System.out.println("test failed");}
//		
				

	}

}
