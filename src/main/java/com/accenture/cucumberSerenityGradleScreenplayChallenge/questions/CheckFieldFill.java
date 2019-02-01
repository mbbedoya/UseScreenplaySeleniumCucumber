package com.accenture.cucumberSerenityGradleScreenplayChallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;

public class CheckFieldFill implements Question<Boolean>{
	
	public Target target;
	public boolean flagMesaggeError;
	
	public CheckFieldFill(Target target)
	{
		this.target = target;
	}
	@Override
	public Boolean answeredBy(Actor actor) {
		flagMesaggeError = CurrentVisibility.of(target).viewedBy(actor).asBoolean();
		if(!flagMesaggeError) {
			return flagMesaggeError=true;	
		}else {
			return flagMesaggeError=false;
		}
		
	}
	
	public static CheckFieldFill fieldFillCheck(Target target) {
		return new CheckFieldFill(target);
	}

}
