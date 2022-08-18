package co.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {

	public static void main(String[] args) throws InterruptedException {
	//first we need to set the browser driver (working on chrome browser)
		
		//set system property
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		//create an object for the chrome driver
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		//get the url of the web page which we are going to perform the operations
		
		driver.get("http://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco F1");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("OnePlus")).click();
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		driver.quit();    
	}

}
