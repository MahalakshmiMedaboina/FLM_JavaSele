import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com"); // open google.com using get() method
		driver.manage().window().maximize(); // maximize the browser window
		
		
		

	}

}
