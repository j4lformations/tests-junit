package com.j4ltechnologies.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe FizzBuzzTest, créée le 13/06/2022 à 11:03
 *
 * @author Joachim Zadi
 * @version 1.0 du 13/06/2022
 */
class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void retourne_1_si_le_parametre_est_1() {
        assertEquals("1", fizzBuzz.perform(1, 1));
    }

    @Test
    public void retourne_2_si_le_parametre_est_2() {
        assertEquals("2", fizzBuzz.perform(2, 2));
    }

    @Test
    public void retourne_fizz_si_le_parametre_est_3() {
        assertEquals("Fizz", fizzBuzz.perform(3, 3));
    }

    @Test
    public void retourne_fizz_si_le_parametre_est_6() {
        assertEquals("Fizz", fizzBuzz.perform(6, 6));
    }

    @Test
    public void retourne_buzz_si_le_parametre_est_5() {
        assertEquals("Buzz", fizzBuzz.perform(5, 5));
    }

    @Test
    public void retourne_buzz_si_le_parametre_est_10() {
        assertEquals("Buzz", fizzBuzz.perform(10, 10));
    }

    @Test
    public void retourne_fizzbuzz_si_le_parametre_est_15() {
        assertEquals("FizzBuzz", fizzBuzz.perform(15, 15));
    }

    @Test
    public void retourne_fizzbuzz_si_le_parametre_est_30() {
        assertEquals("FizzBuzz", fizzBuzz.perform(30, 30));
    }

    //Passage de 2 nombres

    @Test
    public void retourne_12_si_les_parametres_sont_1_a_2() {
        assertEquals("12", fizzBuzz.perform(1, 2));
    }

    @Test
    public void retourne_12Fizz_si_les_parametres_sont_1_a_3() {
        assertEquals("12Fizz", fizzBuzz.perform(1, 3));
    }

    @Test
    public void retourne_12Fizz4Buzz_si_les_parametres_sont_1_a_5() {
        assertEquals("12Fizz4Buzz", fizzBuzz.perform(1, 5));
    }
}