package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// Use dryRun=true, to execute testCases without stopping 

@CucumberOptions(features="src/test/java/FeatureFiles",
glue="StepDefinitions",monochrome=true, tags="@Test") //everything is case sensitive 


//, plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"}
//pretty is used to generate different type of files

public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
