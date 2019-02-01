package com.accenture.cucumberSerenityGradleScreenplayChallenge.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class GoTo implements Task {
	
	private  Target target;
	
	public GoTo(Target target) {
		this.target = target;
	}	

	@Override
	@Step("{0} goes to #target")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target));	
	}
	
	public static GoTo theApp(Target target) {		
		return instrumented(GoTo.class, target);
	}
}
