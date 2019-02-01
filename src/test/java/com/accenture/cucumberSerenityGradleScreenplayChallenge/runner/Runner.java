package com.accenture.cucumberSerenityGradleScreenplayChallenge.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features", 
		tags= {"@Feature1"},
		glue = {"com.accenture.cucumberSerenityGradleScreenplayChallenge.stepdefinitions"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		dryRun = false,
		plugin = {"json:reportJson/cucumber.json"}
)

public class Runner {}
