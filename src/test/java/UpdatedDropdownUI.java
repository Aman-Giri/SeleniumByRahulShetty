import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatedDropdownUI {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
         driver.findElement(By.id("divpaxinfo")).click();
         Thread.sleep(2000);
    
        for(int i=1;i<6;i++){
           driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        String noofAdult =  driver.findElement(By.id("divpaxinfo")).getText();
        System.out.println("The number of the selected adults are : " + noofAdult);
    }
}
