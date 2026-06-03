import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class informationalMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		//open gmail.com using navigate().to() method
		driver.navigate().to("https://www.google.com");
		
		System.out.println("New Title of the page is: " + driver.getTitle());
		
		Thread.sleep(2000); // wait for 2 seconds
		
		//back & forward navigation using navigate().back() and navigate().forward() methods
		
		driver.navigate().back();
		System.out.println("Title of the page after back navigation is: " + driver.getTitle());
		Thread.sleep(2000); // wait for 2 seconds
		
		driver.navigate().forward();
		System.out.println("Title of the page after forward navigation is: " + driver.getTitle());
		Thread.sleep(2000); // wait for 2 seconds
		
		driver.navigate().refresh(); // refresh the page using navigate().refresh() method
		
		//get the page source length of the page using getPageSource() method and print the length of the page source
		System.out.println("Length of the page source is: " + driver.getPageSource().length());
		
		//get the page source of the page using getPageSource() method
//		System.out.println("Page source of the page is: " + driver.getPageSource()); // this will print the entire page source which is very long, so we will not print it here
		
		driver.close(); // closes current browser window using close() method
		
		driver.quit(); // closes all the browser windows opened by the driver using quit() method
		
		
		
		
		
		
		
		
		
		
		

	}

}
