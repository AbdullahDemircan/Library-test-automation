package library.runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "library/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
}