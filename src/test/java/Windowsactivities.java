import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowsactivities {
    public static void main(String[] args){

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/"); 
        driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
        driver.navigate().back();
        
    }
}
