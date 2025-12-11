package runner;


import base.baseClass;
import io.cucumber.core.options.CucumberOptionsAnnotationParser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFolder/makeMyTrip.feature", glue = "stepDefinition")
public class runnerClass extends baseClass {

    @BeforeClass
    public static void start() {
        launch();
        max();
    }

    @AfterClass
    public static void end() throws InterruptedException {
        Thread.sleep(5000);
        closeBrowser();
    }

}
