package com.banistmo.personas.certification.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/feature/rate.feature"},
        glue = "com.banistmo.personas.certification.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RateRunner {
}
