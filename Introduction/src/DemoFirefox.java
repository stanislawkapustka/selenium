import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFirefox {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Pobrane\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fadn.mggp.com.pl");
		System.out.println(driver.getTitle());
		
	}

}
