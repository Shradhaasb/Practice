package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	protected static WebDriver driver;
	protected static Properties prop;

	public static void initialization() {

		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		String url = prop.getProperty("URL");
		driver.get(url);

	}

	public BaseClass() {

		prop = new Properties();

		String path = System.getProperty("user.dir") + "//src//main//java//Configuration//config.properties";
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.getStackTrace();

		}

	}

}
