package com.accenture.cucumberSerenityGradleScreenplayChallenge.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class ChangeWindow implements Interaction{
	
	private  WebDriver browser;
	
	public ChangeWindow(WebDriver browser) {
		this.browser = browser;
	}	

	@Override
	public <T extends Actor> void performAs(T actor) {
		String parent=browser.getWindowHandle(); 
		Set<String>s1=browser.getWindowHandles();
		Iterator<String> I1= s1.iterator();
		
	
		while(I1.hasNext())
		{
		   String child_window=I1.next();
		 		 
		if(!parent.equals(child_window))
		{
			browser.switchTo().window(child_window);
		}
		 
		}
	}
	
	public static ChangeWindow theApp(WebDriver hisBrowser) {		
		return instrumented(ChangeWindow.class, hisBrowser);
	}
	
	

}
