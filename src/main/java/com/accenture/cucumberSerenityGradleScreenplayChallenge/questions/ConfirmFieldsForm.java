package com.accenture.cucumberSerenityGradleScreenplayChallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmFieldsForm implements Question<Boolean>{
	private  boolean flagFieldsForm;
	public ConfirmFieldsForm(boolean flagFieldsForm) {
		this.flagFieldsForm = flagFieldsForm;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		if(flagFieldsForm) {
			return flagFieldsForm;	
		}else {
			return flagFieldsForm;
		}
	}
	
	public static ConfirmFieldsForm checkFieldsForm(boolean datafieldForms) {
		return new ConfirmFieldsForm(datafieldForms);
	}
	

}
