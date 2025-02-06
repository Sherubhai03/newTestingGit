package selenium.parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import java.net.URL;

public class bothparallel3 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL hubUrl = new URL("http://localhost:4444/wd/hub");

        // Initialize WebDriver for Chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver chromeDriver = new RemoteWebDriver(hubUrl, chromeOptions);

        // Initialize WebDriver for Edge
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver edgeDriver = new RemoteWebDriver(hubUrl, edgeOptions);

        // Run tests in Chrome
        System.out.println("Running test on Chrome");
        chromeDriver.get("http://www.google.com");
        System.out.println("Chrome Title: " + chromeDriver.getTitle());

        // Run tests in Edge
        System.out.println("Running test on Edge");
        edgeDriver.get("http://www.google.com");
        System.out.println("Edge Title: " + edgeDriver.getTitle());

        // Quit the driver sessions
        chromeDriver.quit();
        edgeDriver.quit();

	}

}
