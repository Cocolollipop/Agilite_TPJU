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
public class US01 {

	@Given("je donne un nom Richard")
	public void je_donne_un_nom_Richard() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("je cree un animal {string} {int} {string} {int} ")
	public void je_cree_un_animal_Richard() {
		Animal chat = new Animal("Richard", 18, "rouge", 2);

	}

	@Then("<statut>")
	public void statut() {
		Animal chat = new Animal("Richard", 18, "rouge", 2);
		 assertEquals("test constructeur Animal","SansNom", chat.getNom());

	}
}
