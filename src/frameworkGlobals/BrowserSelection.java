package frameworkGlobals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import interfaces.GlobalComponents;
import utilities.ReadProp;

public class BrowserSelection {
	protected static WebDriver driver;
	protected static Capabilities caps;
	public static Logger log1 = Logger.getLogger("rootLogger");

	public static WebDriver initDriver() throws IOException {
		System.out.println("Selecting browser");

		String browser = ReadProp.ReadGlobalData("selectedBrowser");
		switch (browser) {
		case "MF":
			System.out.println("Mozilla firefox selected");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			caps = ((RemoteWebDriver) driver).getCapabilities();
			String browserNameAndVersionMF = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ caps.getPlatform();
			System.out.println(browserNameAndVersionMF);
			log1.info(browserNameAndVersionMF);

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			break;

		case "GC":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + GlobalComponents.chromeExecutable);
			System.out.println("Google chrome selected");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			caps = ((RemoteWebDriver) driver).getCapabilities();
			String browserNameAndVersionGC = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ caps.getPlatform();
			System.out.println(browserNameAndVersionGC);
			log1.info(browserNameAndVersionGC);

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			break;

		case "IE":
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + GlobalComponents.ieExecutable);
			System.out.println("Internet explorer selected");
			DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
			dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(dc);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			caps = ((RemoteWebDriver) driver).getCapabilities();
			String browserNameAndVersionIE = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ caps.getPlatform();
			System.out.println(browserNameAndVersionIE);
			log1.info(browserNameAndVersionIE);

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			break;

		case "AS":
			System.setProperty("webdriver.safari.driver",
					System.getProperty("user.dir") + "************local path to safari exe***********");
			System.out.println("Apple safari selected");
			driver = new SafariDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			break;

		default:
			System.out.println("Mozilla firefox selected");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			caps = ((RemoteWebDriver) driver).getCapabilities();
			String browserNameAndVersionDefault = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ caps.getPlatform();
			System.out.println(browserNameAndVersionDefault);
			log1.info(browserNameAndVersionDefault);

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			break;
		}
		return driver;
	}
}