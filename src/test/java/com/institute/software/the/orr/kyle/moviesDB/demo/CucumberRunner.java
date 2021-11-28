package com.institute.software.the.orr.kyle.moviesDB.demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
features={"src/test/resources/features"},
glue={"src/test/java/com/institute/software/the/orr/kyle/moviesDB/demo"})
public class CucumberRunner {
}
