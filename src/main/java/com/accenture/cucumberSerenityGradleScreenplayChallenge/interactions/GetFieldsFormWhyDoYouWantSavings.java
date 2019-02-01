package com.accenture.cucumberSerenityGradleScreenplayChallenge.interactions;


import java.util.ArrayList;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class GetFieldsFormWhyDoYouWantSavings implements Interaction{
	
	private  Target target;
	private ArrayList<String> data;
	public static boolean DatafieldForms;
	 
	public GetFieldsFormWhyDoYouWantSavings(Target target, ArrayList<String> data) {
		this.target = target;	
		this.data = data;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		String fieldForms = Text.of(target).viewedBy(actor).asString();
		ArrayList<String> fieldFormsCopy = new ArrayList<String>();
		
		for(int i=0; i < this.data.size(); i++) {
			String[] partsfieldForms = fieldForms.split("\n");
			String part = partsfieldForms[i]; 
			fieldFormsCopy.add(part);
		}
		
		if(fieldFormsCopy.size() == this.data.size() && fieldFormsCopy.containsAll(this.data)) {
			DatafieldForms = true;
		}else {
			DatafieldForms = false;
		}
	}
	
	public static GetFieldsFormWhyDoYouWantSavings getFieldsForm(Target target, ArrayList<String> data) {
		return new GetFieldsFormWhyDoYouWantSavings(target, data);
	}

}
