package cucumber;

import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import vivant.faune.Animal;
import vivant.humain.homme.Homme;

@RunWith(Cucumber.class)
public class US02 {

	@When("je modifie son age {int}")
	public void je_modifie_son_age(Integer int1) {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("je modifie son nom")
	public void je_modifie_son_nom() {
		// Write code here that turns the phrase above into concrete actions

	}
}
