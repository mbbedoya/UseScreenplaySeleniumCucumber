package com.accenture.cucumberSerenityGradleScreenplayChallenge.stepdefinitions;


import org.openqa.selenium.WebDriver;

import com.accenture.cucumberSerenityGradleScreenplayChallenge.exceptions.NoMatchingButtonIsVisible;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.interactions.ChangeWindow;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.interactions.CheckAttempForm;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.interactions.GetFieldsFormWhyDoYouWantSavings;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.questions.CheckErrorMessage;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.questions.CheckFieldFill;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.questions.CheckVisibilityElements;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.questions.ConfirmFieldsForm;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.tasks.GoTo;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.tasks.OpenTheBrowser;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.tasks.WriteOnForm;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.userinterfaces.BancolombiaHomePage;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.userinterfaces.SavingsInvestmentSimulatorForm;
import com.accenture.cucumberSerenityGradleScreenplayChallenge.utils.ExcellReader;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import cucumber.api.java.en.Then;
public class stepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor yeison = Actor.named("Yeison");
	private BancolombiaHomePage bancolombiaHomePage;
	
	@Before
	public void setup() {
		yeison.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
	}
	
	@Given("^User is on form Bancolombia's savings and investment simulator$")
	public void userIsOnFormBancolombiaSSavingsAndInvestmentSimulator() {
		yeison.wasAbleTo(OpenTheBrowser.at(bancolombiaHomePage),
				GoTo.theApp(BancolombiaHomePage.PERSON_BUTTON),
				GoTo.theApp(BancolombiaHomePage.NEEDS_LINK),
				GoTo.theApp(BancolombiaHomePage.CAR_LINK),
				GoTo.theApp(BancolombiaHomePage.SAVINGS_SIMULATOR_LINK),
				ChangeWindow.theApp(hisBrowser));
	}

	@When("^User is on form Bancolombia's savings and investment simulator without fill it any field$")
	public void userIsOnFormBancolombiaSSavingsAndInvestmentSimulatorWithoutFillItAnyField() {
		yeison.attemptsTo(CheckAttempForm.checkForm(SavingsInvestmentSimulatorForm.FORMARRAY_SAVINGSINVESTMENT_SIMULATOR));
	}

	@Then("^check that each form's field show a message the \"([^\"]*)\" and button is disabled$")
	public void checkThatEachFormSFieldShowAMessageTheAndButtonIsDisabled(String arg1) {
		yeison.should(seeThat(CheckErrorMessage.on(SavingsInvestmentSimulatorForm.FORMARRAY_SAVINGSINVESTMENT_SIMULATOR_ERRORMESSAGE)));
	   
	}

	@When("^user has got form's fields  why do you want to savings?")
	public void userHasClickedFormSField() throws Exception {
		yeison.attemptsTo(GetFieldsFormWhyDoYouWantSavings.getFieldsForm(SavingsInvestmentSimulatorForm.FORMARRAY_SAVINGSINVESTMENT_SIMULATOR[0], ExcellReader.fullyData()));			
	}

	@Then("^check that are found  the amount and names of the elements of such field are right$")
	public void checkThatAreFoundTheAmountAndNamesOfTheElementsOfSuchFieldAreRight() throws Exception {
	    yeison.should(seeThat(ConfirmFieldsForm.checkFieldsForm(GetFieldsFormWhyDoYouWantSavings.DatafieldForms)));
	}

	@When("^user have entered one correct data on form's field \"([^\"]*)\"$")
	public void userHaveEnteredOneCorrectDataOnFormSField(String arg1) {
	    yeison.attemptsTo(GoTo.theApp(SavingsInvestmentSimulatorForm.WHY_WANT_SAVINGS_FORM),
	    		          GoTo.theApp(SavingsInvestmentSimulatorForm.WHY_WANT_SAVINGS_FORM_FIELDTRAVEL));
	}

	@Then("^form's field \"([^\"]*)\" don't show error message$")
	public void formSFieldDonTShowErrorMessage(String arg1) {
		yeison.should(seeThat(CheckFieldFill.fieldFillCheck(SavingsInvestmentSimulatorForm.FORMARRAY_SAVINGSINVESTMENT_SIMULATOR_ERRORMESSAGE[0])));
	}
		
	@When("^user have type one correct data on form's field \"([^\"]*)\"$")
    public void userHaveTypeOneCorrectDataOnFormsFieldSomething(String strArg1) throws Throwable {
		String amountMonthGoal = "48";
		yeison.attemptsTo(WriteOnForm.theApp(SavingsInvestmentSimulatorForm.FORMARRAY_SAVINGSINVESTMENT_SIMULATOR[1], amountMonthGoal));
    }
	
	@Then("^form's field \"([^\"]*)\" won't show error message$")
    public void formsFieldSomethingWontShowErrorMessage(String strArg1) throws Throwable {
		yeison.should(seeThat(CheckFieldFill.fieldFillCheck(SavingsInvestmentSimulatorForm.FORMARRAY_SAVINGSINVESTMENT_SIMULATOR_ERRORMESSAGE[1])));
    }
	
	@When("^user had typing one correct data on form's field \"([^\"]*)\"$")
	public void userHadTypingOneCorrectDataOnFormSField(String arg1) {
		yeison.attemptsTo(GoTo.theApp(SavingsInvestmentSimulatorForm.SELECT_PRODUCT_FORM));
	}

	@Then("^form's field \"([^\"]*)\" would haven't error message$")
	public void formSFieldWouldHavenTErrorMessage(String arg1) {
	    yeison.should(seeThat(CheckVisibilityElements.checkElementsVisibility(SavingsInvestmentSimulatorForm.SELECT_PRODUCT_FORM_FIDUCUENTA)).orComplainWith(NoMatchingButtonIsVisible.class, String.format("element not visible '%s'", SavingsInvestmentSimulatorForm.SELECT_PRODUCT_FORM_FIDUCUENTA)));
	}
	
	
	
	

}
