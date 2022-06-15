package com.j4ltechnologies.junit5;

/**
 * Classe FizzBuzz, créée le 13/06/2022 à 11:03
 *
 * @author Joachim Zadi
 * @version 1.0 du 13/06/2022
 */
public class FizzBuzz {

    public String perform(int min, int max) {
//        if (min % 15 == 0)
//            return "FizzBuzz";
//        if (min % 3 == 0)
//            return "Fizz";
//        if (min % 5 == 0)
//            return "Buzz";

//        ---------------------------------

//        String resultat = "";
//        String resultat = evaluation(min);
//
//        if (min < max) {
//            resultat += evaluation(max);
//        }
//        return resultat;

//        ---------------------------------

//        String resultat = evaluation(min);
//        String resultat = "";
//
//        resultat = evaluation(min, max, resultat);
//        return resultat;

        //        ---------------------------------

        return evaluation(min, max);
    }

    private String evaluation(int min, int max/*, String resultat*/) {
        String resultat = "";
        while (min <= max) {
            resultat += evaluation(min++);
        }
        return resultat;
    }

    private String evaluation(int nombre) {
        if (nombre % 15 == 0)
            return "FizzBuzz";
        if (nombre % 3 == 0)
            return "Fizz";
        if (nombre % 5 == 0)
            return "Buzz";
        return String.valueOf(nombre);
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.evaluation(1, 100));
    }
}
