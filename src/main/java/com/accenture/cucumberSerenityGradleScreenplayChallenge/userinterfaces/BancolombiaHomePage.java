package com.accenture.cucumberSerenityGradleScreenplayChallenge.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/acerca-de")
public class BancolombiaHomePage extends PageObject{
	public static final Target PERSON_BUTTON = Target.the("Person Button").locatedBy("//li[@id='linkPersonas']");
	public static final Target NEEDS_LINK = Target.the("Needs Link").locatedBy("//a[contains(text(),'Necesidades')]");
	public static final Target CAR_LINK = Target.the("Car Link").locatedBy("//*[@id=\"necesidadesPersonas\"]/div/div[1]/div[1]/div/div[7]/div");
	public static final Target SAVINGS_SIMULATOR_LINK = Target.the("Savings_Simulator_Link").locatedBy("//a[@title='null']");
	
}
