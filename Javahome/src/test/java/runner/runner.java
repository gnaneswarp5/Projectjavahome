package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/featurefile"},
        glue = {"stepdefinationfile"},
        tags = "@dropdown",
        plugin = {"pretty", //reports
        "html:target/report/cucumberreport.html",
        "junit:target/report/junitreport.xml",
        "json:target/report/jsonreport"}
)
public class runner {

}
