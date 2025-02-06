package selenium.parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import java.net.MalformedURLException;
import java.net.URL;

public class mergeparallel2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

        // URL of the Hub
        URL hubUrl = new URL("http://localhost:4444/wd/hub");

        // Set Chrome Options
        ChromeOptions options = new ChromeOptions();
        
        // Initialize RemoteWebDriver with the Hub URL and Chrome options
        RemoteWebDriver driver = new RemoteWebDriver(hubUrl, options);

        // Perform actions
        driver.get("http://www.google.com");
        System.out.println("Title: " + driver.getTitle());

        // Quit the driver session
        driver.quit();
        
        
        WebDriverManager.edgedriver().setup();

        // URL of the Hub
        URL hubUrl1 = new URL("http://localhost:4444/wd/hub");

        // Set Edge Options
        EdgeOptions options1 = new EdgeOptions();
        
        // Initialize RemoteWebDriver with the Hub URL and Edge options
        RemoteWebDriver driver1 = new RemoteWebDriver(hubUrl1, options1);

        // Perform actions
        driver1.get("http://www.google.com");
        System.out.println("Title: " + driver1.getTitle());

        // Quit the driver session
        driver.quit();

	}

}
