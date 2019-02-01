package com.accenture.cucumberSerenityGradleScreenplayChallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SavingsInvestmentSimulatorForm {
	
	public static final Target WHY_WANT_SAVINGS_FORM = Target.the("Why want savings form").locatedBy("//select[@name='nmSelectAhorro']");
	public static final Target HOW_MANY_TIME_SAVINGS_GOALFORM = Target.the("How many tim savings goal form").locatedBy("//input[@name='nmMesesAhorro']");
	public static final Target SELECT_PRODUCT_FORM = Target.the("Selet product form").locatedBy("//select[@name='nmselectProducto']");
	public static final Target HOW_MANY_MONEY_GOALFORM = Target.the("How many money goal form").locatedBy("//input[@name='nmCantidadAhorro']");
	
	public static final Target  WHY_WANT_SAVINGS_FORM_FIELDTRAVEL = Target.the("Field travel from form").locatedBy("//option[contains(text(),'Viaje')]");
	public static final Target  SELECT_PRODUCT_FORM_FIDUCUENTA = Target.the("Field fiducuenta from form").locatedBy("//option[contains(text(),'Fiducuenta')]");

	
	public static final Target WHY_WANT_SAVINGS_MESSAGE = Target.the("Error message").locatedBy("//form[@name='formAhorro']//div[2]//div[1]//div[1]//span[1]");
	public static final Target HOW_MANY_TIME_SAVINGS_MESSAGE = Target.the("Error message").locatedBy("//div[@min='1']//span[@class='ng-binding'][contains(text(),'Este campo es obligatorio.')]");
	public static final Target SELECT_PRODUCT_MESSAGE = Target.the("Error message").locatedBy("//form[@name='formAhorro']//div[4]//div[1]//div[1]//span[1]");
	public static final Target HOW_MANY_MONEY_MESSAGE = Target.the("Error message").locatedBy("//form[@name='formAhorro']//div[5]//div[1]//div[1]//span[1]");
	public static final Target AGREGATE_PLAINSAVINGS_BUTTON = Target.the("Agregate plain savings button").locatedBy("//button[@type='button']");
	
    public static final Target[] FORMARRAY_SAVINGSINVESTMENT_SIMULATOR = {WHY_WANT_SAVINGS_FORM, HOW_MANY_TIME_SAVINGS_GOALFORM, SELECT_PRODUCT_FORM, HOW_MANY_MONEY_GOALFORM};
    public static final Target[] FORMARRAY_SAVINGSINVESTMENT_SIMULATOR_ERRORMESSAGE = {WHY_WANT_SAVINGS_MESSAGE, HOW_MANY_TIME_SAVINGS_MESSAGE, SELECT_PRODUCT_MESSAGE, HOW_MANY_MONEY_MESSAGE, AGREGATE_PLAINSAVINGS_BUTTON};
}
