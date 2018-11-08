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
public class US06 {

	@Given("Je suis un Homme {string}")
	public void je_suis_un_Homme(String string) {

	}

	@Given("Il existe un Animal {string}")
	public void il_existe_un_Animal(String string) {

	}

	@When("Un Homme {string} adopte un Animal {string}")
	public void un_Homme_adopte_un_Animal(String string, String string2) {

	}

	@Then("success Un Homme devient le proprietaire de l Animal et l Animal appartient a l Homme")
	public void success_Un_Homme_devient_le_proprietaire_de_l_Animal_et_l_Animal_appartient_a_l_Homme() {

	}

}
