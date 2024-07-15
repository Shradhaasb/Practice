package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/Features"},
		glue="StepDefination",
		dryRun=false,
		monochrome= true,
		plugin= {"html:\\reports\\abc.html"}
		)

public class RunnerTest {

}
