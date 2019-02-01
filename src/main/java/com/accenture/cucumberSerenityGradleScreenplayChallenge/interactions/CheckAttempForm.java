package com.accenture.cucumberSerenityGradleScreenplayChallenge.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class CheckAttempForm implements Interaction{
	
	public static boolean formAttemp;
	private  Target[] target;
	 
	public CheckAttempForm(Target[] target) {
		this.target = target;	
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		int flag = 0;
		for (int i=0; i <target.length; i++ ) {
			if(i==0 || i==2) {
				formAttemp = SelectedVisibleTextValue.of(target[i]).viewedBy(actor).asBoolean();
			}else {
				formAttemp = Text.of(target[i]).viewedBy(actor).asBoolean();
			}
			
			if(formAttemp == true) {
				flag++;
			}
		}
		
		if(flag==0) {
			formAttemp= true;
		}else {
			formAttemp= false;
		}
		
	}
	
	public static CheckAttempForm checkForm(Target[] target) {
		return new CheckAttempForm(target);
	}

}
