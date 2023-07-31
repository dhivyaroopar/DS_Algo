 package com.qa.factory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DriverFactory {

		public WebDriver driver;
		public WebDriverWait wait;

		public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

		/**
		 * This method is used to initialize the thradlocal driver on the basis of given
		 * browser
		 * 
		 * @param browser
		 * @return this will return tldriver.
		 */
		public WebDriver init_driver(String browser) {
			
			
			System.out.println("browser value is: " + browser);

			if (browser.equals("chrome")) {
				
				ChromeOptions options= new ChromeOptions();			
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--headless");
				options.addArguments("--no-sandbox");	
				options.addArguments("--disable-dev-shm-usage");	
				options.addArguments("--ignore-ssl-errors=yes");
				options.addArguments("--ignore-certificate-errors");
				options.addArguments("--single-process");
				options.addArguments("--remote-debugging-port=9515");
				options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");	
				
				
				//WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
				WebDriverManager.chromedriver().setup();
				tlDriver.set(new ChromeDriver(options));
				
			} else if (browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				tlDriver.set(new FirefoxDriver());
			} else if (browser.equals("safari")) {
				WebDriverManager.safaridriver().setup();
				tlDriver.set(new SafariDriver());
			} else {
				System.out.println("Please pass the correct browser value: " + browser);
			}

			getDriver().manage().deleteAllCookies();
			getDriver().manage().window().maximize();
			//getDriver().get(url);
			getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return getDriver();

		}

		/**
		 * this is used to get the driver with ThreadLocal
		 * 
		 * @return
		 */
		public static synchronized WebDriver getDriver() {
			return tlDriver.get();
		}
	}