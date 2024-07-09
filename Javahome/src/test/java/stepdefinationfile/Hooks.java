package stepdefinationfile;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuable.democode;

import java.io.IOException;
import java.sql.SQLOutput;

public class Hooks  extends democode{


    @Before()
    public void startMethod() throws IOException {

        System.out.println("Execution Started");
        democode.browsercall();
    }

    @After()
    public void endMethod(){

        System.out.println("Execution Ended");
    }

    @BeforeStep()
    public  void m1(){

    }

    @AfterStep()
    public  void  takeScreeenshot(Scenario sc){
        byte[] imageByte = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(imageByte,"image/png",sc.getName());
    }
}
