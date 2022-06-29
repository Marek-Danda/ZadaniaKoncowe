package FirstTask;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/tasks/features/first-task/first-task.feature",
        plugin ={"pretty", "html:report/result.html"} )

public class FirstTaskTest {
}
