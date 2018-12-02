package cucumber;

import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import vivant.faune.Animal;
import vivant.humain.Homme;

@RunWith(Cucumber.class)
public class US05 {

	@Given("je donne la couleur et la taille rouge {int}")
	public void je_donne_la_couleur_et_la_taille_rouge(Integer int1) {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("je cree un collier")
	public void je_cree_un_collier() {
		// Write code here that turns the phrase above into concrete actions

	}
}
