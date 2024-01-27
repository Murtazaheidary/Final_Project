package bdd_final_project.framework.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "bdd_final_project.framework.steps",
        tags = "@FiveRows",
        dryRun = false,
        plugin = {
                "html:target/cucumber_report/report.html",
        },
        snippets = CAMELCASE,
        monochrome = true
)
public class TestRunner {
}
