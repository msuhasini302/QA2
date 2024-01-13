package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetTitleFB {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']"));
		username.sendKeys("facebook.personalacc@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']"));
		password.sendKeys("FB@Suha48");
		WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		login.click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
				
	}

}
