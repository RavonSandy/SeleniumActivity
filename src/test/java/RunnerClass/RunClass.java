package RunnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\santhoshg\\eclipse-workspace\\Orange\\FeatureFiles\\ParaBank.feature"
		,glue={"Step"}
		)
public class RunClass 
{
	
}

