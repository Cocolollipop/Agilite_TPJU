package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import mur.Mur;
import titan.Titan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Khaled
 */
public class TitanTest {

    public TitanTest() {
    }

    // Teste du constructeur
    @Test
    public void testTaille() {
        Titan eren = new Titan();
        assertEquals(5, eren.getTaille());
        assertEquals(5, eren.getTaille());
    }

    //Teste des getters & setters
    @Test
    public void testGettersSetters() {
        Titan titan = new Titan();
        titan.setNom("Eren");
        titan.setTaille(10);
        assertEquals(10, titan.getTaille());
        assertEquals("Eren", titan.getNom());

        Mur mur = new Mur();
        mur.setNom("Frontal");
        assertEquals("Frontal", mur.getNom());
    }

    @Test
    public void testDemolitionMur() {
        Titan colosal = new Titan();
        colosal.setNom("Colosal");
        colosal.setTaille(10);

        Mur frontal = new Mur();
        frontal.setNom("Frontal");

        colosal.demolirMur(frontal);

        assertEquals("Colosal", frontal.murDetruitPar().getNom());
    }

    @Test
    public void testAssociation() {
        Titan colosal = new Titan();

        Mur mur1 = new Mur();
        Mur mur2 = new Mur();
        Mur mur3 = new Mur();

        colosal.getMurDemoli().add(mur1);
        colosal.getMurDemoli().add(mur2);
        colosal.getMurDemoli().add(mur3);

        for (Mur murBoucle : colosal.getMurDemoli()) {
            assertEquals("Mur", murBoucle.getNom());
        }
    }

    @Test
    public void testOrdreOrdreMur() {
        Titan colosal = new Titan();

        colosal.demolirMur(new Mur("Intermediaire"));
        if ("Intermediaire".equals(colosal.getCentral().getNom())) {
            assertEquals("Frontal", colosal.getFrontal().getNom());
        }

        colosal.demolirMur(new Mur("Central"));
        if ("Centrale".equals(colosal.getCentral().getNom())) {
            assertEquals("Frontal", colosal.getFrontal().getNom());
            assertEquals("Intermediaire", colosal.getIntermediaire().getNom());
        }
    }
}
