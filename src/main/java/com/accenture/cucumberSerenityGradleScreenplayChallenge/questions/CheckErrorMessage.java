package com.accenture.cucumberSerenityGradleScreenplayChallenge.questions;


import com.accenture.cucumberSerenityGradleScreenplayChallenge.interactions.CheckAttempForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.CurrentlyEnabled;
import net.serenitybdd.screenplay.targets.Target;

public class CheckErrorMessage implements Question<Boolean>{
	
	private  Target[] target;
	public boolean flagAttempForm;
	public boolean flagDisablebutton;
	public boolean flagMesaggeError;
	public boolean flagVisibilityButton;
	
	int flagAmountError=0;

	public CheckErrorMessage(Target[] target) {
		this.target = target;	
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {		
		flagAttempForm = CheckAttempForm.formAttemp;
	
		if(flagAttempForm) {
			for(int i=0;i <target.length; i++) {
				if(i!=target.length) {
					flagMesaggeError = CurrentlyEnabled.of(target[i]).viewedBy(actor).asBoolean();
					if(flagMesaggeError == true) {
						flagAmountError++;
					}
				}else if(i==target.length){
					flagDisablebutton = CurrentlyEnabled.of(target[i]).viewedBy(actor).asBoolean();
					flagVisibilityButton = CurrentVisibility.of(target[i]).viewedBy(actor).asBoolean();	
				}
			}		
		}else {
			System.out.println("form is not attemp to move on with the automation");
			flagAttempForm = false;
		}
		
		if(flagAmountError==4 && flagDisablebutton==false && flagVisibilityButton==true) {
			flagAttempForm = true;
		}		
		return flagAttempForm;
	}
	
	public static CheckErrorMessage on(Target[] target) {
		return new CheckErrorMessage(target);
	}


}
