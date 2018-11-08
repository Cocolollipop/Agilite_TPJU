package cucumber;

import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import faune.Animal;
import humain.Homme;

@RunWith(Cucumber.class)
public class US04 {

	@Given("je donne un homme")
	public void je_donne_un_homme() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("je modifie son nom {string}")
	public void je_modifie_son_nom(String string) {
		// Write code here that turns the phrase above into concrete actions

	}
}
