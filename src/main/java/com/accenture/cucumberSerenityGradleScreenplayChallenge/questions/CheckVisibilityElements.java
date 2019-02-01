package com.accenture.cucumberSerenityGradleScreenplayChallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;

public class CheckVisibilityElements implements Question<Boolean>{
	
	private Target target;
	
	public CheckVisibilityElements(Target target) {
		this.target = target;	
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return CurrentVisibility.of(target).viewedBy(actor).asBoolean();
	}
	
	public static CheckVisibilityElements checkElementsVisibility(Target target) {
		return new CheckVisibilityElements(target);
	}

}
