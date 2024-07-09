package resuable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.runtime.SwitchBootstraps;
import java.util.Locale;
import java.util.Properties;

public class democode {

    public static WebDriver driver;

    public static void browsercall() throws IOException {

        File f = new File("src/main/resources/configurations/frameworkconfig.properties");
        FileInputStream fis = new FileInputStream(f);

        Properties prob = new Properties();
        prob.load(fis);

        switch (prob.getProperty("browser").toLowerCase()) {

            case "chrome":
                driver = new ChromeDriver();

            case "edge":
                driver = new EdgeDriver();

//            case "safari":
//                driver = new SafariDriver();
        }
        driver.navigate().to(prob.getProperty("url"));
        driver.manage().window().maximize();
    }
}
