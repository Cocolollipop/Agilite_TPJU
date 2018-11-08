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
public class US07 {

	@Given("je donne un animal {string} {int} {string} {int}")
	public void je_donne_un_animal(String string, Integer int1, String string2, Integer int2) {
		Animal animal = new Animal(string, int1, string2, int2);

	}

	@When("je le presente")
	public void je_le_presente() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}
}
