package com.j4ltechnologies.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe FizzBuzzTest, créée le 13/06/2022 à 11:03
 *
 * @author Joachim Zadi
 * @version 1.0 du 13/06/2022
 */
class FizzBuzzTest {

//    @Test
//    public void neFaitRien() {
//        assertTrue(true);
//    }

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void retourne_1_si_le_parametre_est_1() {
        assertEquals("1", fizzBuzz.generate(1, 1));
    }

    @Test
    public void retourne_2_si_le_parametre_est_2() {
        assertEquals("2", fizzBuzz.generate(2, 2));
    }

    @Test
    public void retourne_fizz_si_le_parametre_est_3() {
        assertEquals("Fizz", fizzBuzz.generate(3, 3));
    }

    @Test
    public void retourne_fizz_si_le_parametre_est_6() {
        assertEquals("Fizz", fizzBuzz.generate(6, 6));
    }

    @Test
    public void retourne_buzz_si_le_parametre_est_5() {
        assertEquals("Buzz", fizzBuzz.generate(5, 5));
    }

    @Test
    public void retourne_buzz_si_le_parametre_est_10() {
        assertEquals("Buzz", fizzBuzz.generate(10, 10));
    }

    @Test
    public void retourne_fizzbuzz_si_le_parametre_est_15() {
        assertEquals("FizzBuzz", fizzBuzz.generate(15, 15));
    }

    @Test
    public void retourne_fizzbuzz_si_le_parametre_est_30() {
        assertEquals("FizzBuzz", fizzBuzz.generate(30, 30));
    }

    @Test
    public void retourne_12_si_les_parametres_sont_1_2() {
        assertEquals("12", fizzBuzz.generate(1, 2));
    }

    @Test
    public void retourne_12Fizz_si_les_parametres_sont_1_2_3() {
        assertEquals("12Fizz", fizzBuzz.generate(1, 3));
    }
}