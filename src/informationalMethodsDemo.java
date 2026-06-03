import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class informationalMethodsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		//open gmail.com using get() method
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize(); // maximize the browser window
		
		//get the title of the page using getTitle() method
		String title = driver.getTitle();
		
		System.out.println("Title of the page is: " + title);
		
		//get the current URL of the page using getCurrentUrl() method
		String url = driver.getCurrentUrl();
		
		System.out.println("Current URL of the page is: " + url);
		
		

	}

}
