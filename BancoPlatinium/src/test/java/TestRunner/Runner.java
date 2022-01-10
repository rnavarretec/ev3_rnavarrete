package TestRunner;

import org.junit.runner.RunWhit;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWhit(Cucumber.class)
@CucumberOptions(features="Features", glue= {"StepDefinition"})
public class Runner 
{

    }

