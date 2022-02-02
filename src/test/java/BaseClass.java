import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;
    public static String endPoint;
    public static String url;
    public String projectLocation = null;
    private Properties properties = new Properties();

    public String executionProperties() throws IOException {
        projectLocation = System.getProperty("user.dir");
        FileInputStream inputStream = null;

        inputStream = new FileInputStream(projectLocation + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "properties" + File.separator + "/Framework.properties");
        properties.load(inputStream);

        url = properties.getProperty("url");
        endPoint = url;

        return endPoint;
    }

    public void openBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();

    }
}
