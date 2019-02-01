package com.accenture.cucumberSerenityGradleScreenplayChallenge.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class WriteOnForm implements Task{
	private  Target target;
	private String moneyToGoal; 
	
	public WriteOnForm(Target target, String moneyToGoal) {
		this.target = target;
		this.moneyToGoal = moneyToGoal;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(moneyToGoal).into(target).thenHit(Keys.ENTER)); 
	}	
	
	public static WriteOnForm theApp(Target target, String moneyToGoal) {		
		return instrumented(WriteOnForm.class, target, moneyToGoal);
	}
}
