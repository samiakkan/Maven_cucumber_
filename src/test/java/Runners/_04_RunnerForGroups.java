package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        tags = "@SmokeTest", // runs the scenarios that have this tag
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class _04_RunnerForGroups extends AbstractTestNGCucumberTests {
}
