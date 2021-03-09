package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//A JSF ManagedBean example: BackingBean, a bean that can fill ui components on XHTML pages

//in order to do that, we get use of CDI @Named annoation

@Named
@RequestScoped
public class WelcomeBean {

	private String welcomeMessage = "Managed bean welcome output..";
	
	
	public String getWelcomeMessage() {
		return welcomeMessage;
	}
	
}
