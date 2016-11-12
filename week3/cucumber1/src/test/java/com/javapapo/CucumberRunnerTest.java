package com.javapapo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        format = {"pretty", "html:target/cucumber"} )
@RunWith(Cucumber.class)
public class CucumberRunnerTest {
}
