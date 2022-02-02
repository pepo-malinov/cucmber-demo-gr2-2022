package uni.fmi;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty", "html:target/home-feature"},
features = {"src/test/resources/uni/fmi/category"}, glue = {"uni.fmi.category"})
public class CategoryStarter {

}
