package com.cumberBDD;

import org.junit.runner.RunWith;

import io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features="src/test/resources/Features",glue={"com.cumberBDD"},
monochrome=true,
//plugin={"pretty","html:target/HtmlReports"}
plugin={"json:target/cucumber.json"}
		
		)
public class TestRunerClass {

}
