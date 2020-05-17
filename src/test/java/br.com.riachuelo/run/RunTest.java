package br.com.riachuelo.run;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    dryRun = false,
    strict = false,
    monochrome = false,
    features = "features",
    glue = "br.com.riachuelo/steps",
    tags = {"@turnos,@calendario"},
    plugin = {"json:target/cucumber.json", "pretty","html:target/cucumber-reports"},
    snippets = SnippetType.CAMELCASE
)
public class RunTest {


}
