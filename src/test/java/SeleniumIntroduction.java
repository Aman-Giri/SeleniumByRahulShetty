import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntroduction {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\MyStorage\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(); // we can do like this according to the selenium 4 (without including the edgedriver)
		driver.get("https://www.google.com/");
		
	}
}
