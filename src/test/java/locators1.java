
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators1 {
    public static void main(String[] args){
        //sibling - child to parent traverse
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       String buttonText =  driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
       System.out.println("Text of the button is : " + buttonText);

       //child to parent 
      String buttonText2 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
      System.out.println("Button text again : " + buttonText2);

      driver.close();
    }
}
