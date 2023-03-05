import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Staticdropdown {
    public static void main(String[] args) {
        //handling static dropdown
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       WebElement dropdown =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
       Select select = new Select(dropdown);
       select.selectByIndex(3);
       String textofselected = select.getFirstSelectedOption().getText();
       System.out.println(textofselected);
       select.selectByVisibleText("AED");
      String textofselected1 = select.getFirstSelectedOption().getText();
      System.out.println(textofselected1);
      select.selectByValue("INR");
     String  textofselected2 = select.getFirstSelectedOption().getText();
        System.out.println(textofselected2);

    }
}
