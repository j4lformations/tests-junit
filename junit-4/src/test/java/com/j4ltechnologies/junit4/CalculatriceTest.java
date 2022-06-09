package com.j4ltechnologies.junit4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Classe CalculatriceTest, créée le 09/06/2022 à 14:06
 *
 * @author Joachim Zadi
 * @version 1.0 du 09/06/2022
 */
public class CalculatriceTest {

    private Calculatrice calculatrice;

    @Before
    public void init(){
        calculatrice = new Calculatrice();
    }

    @Test
    public void multiplication() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(15, calculatrice.multiplication(3, 5));
    }

    @Test
    public void division() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(51, calculatrice.division(255, 5));
    }

    @Test
    public void addition() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(11, calculatrice.addition(6, 5));
    }
}