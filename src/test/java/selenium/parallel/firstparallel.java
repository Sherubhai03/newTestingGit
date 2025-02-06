package selenium.parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class firstparallel {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		 String browser = "edge"; // Change to "edge" for Edge browser

	        WebDriver driver = null;

	        // URL of the Hub
	        URL hubUrl = new URL("http://localhost:4444/wd/hub");

	        if (browser.equalsIgnoreCase("chrome")) {
	            // Setup WebDriver for Chrome
	            WebDriverManager.chromedriver().setup();

	            // Set Chrome Options
	            ChromeOptions chromeOptions = new ChromeOptions();

	            // Initialize RemoteWebDriver with the Hub URL and Chrome options
	            driver = new RemoteWebDriver(hubUrl, chromeOptions);

	        } else if (browser.equalsIgnoreCase("edge")) {
	            // Setup WebDriver for Edge
	            WebDriverManager.edgedriver().setup();

	            // Set Edge Options
	            EdgeOptions edgeOptions = new EdgeOptions();

	            // Initialize RemoteWebDriver with the Hub URL and Edge options
	            driver = new RemoteWebDriver(hubUrl, edgeOptions);
	        }

	        // Perform actions with the selected browser
	        driver.get("http://www.google.com");
	        System.out.println("Title: " + driver.getTitle());

	        // Quit the driver session
	        driver.quit();

	}

}
