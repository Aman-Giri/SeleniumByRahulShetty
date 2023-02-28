import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Locaters {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String name = "Aman";
		//DIFFERENT LOCATERS 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		String successmessage = driver.findElement(By.tagName("p")).getText();
		System.out.println("messsage : " + successmessage);
		Assert.assertEquals(successmessage, "You are successfully logged in.");
		String nameText = driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
		System.out.println(nameText);
		Assert.assertEquals(nameText, "Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
	}
}
