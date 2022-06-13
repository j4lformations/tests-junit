package com.j4ltechnologies.junit5;

/**
 * Classe FizzBuzz, créée le 13/06/2022 à 11:03
 *
 * @author Joachim Zadi
 * @version 1.0 du 13/06/2022
 */
public class FizzBuzz {
    //    String generate(int nombre) {
    String generate(int min, int max) {
//        if (nombre == 1)
//            return "1";
//        return "2";

//        if (nombre == 3)
//            return "Fizz";
//        if (nombre == 3 || nombre == 6)
//            return "Fizz";

//        if (nombre % 3 == 0)
//            return "Fizz";
//        if (nombre % 5 == 0)
//            return "Buzz";

//        if (min %15 == 0)
//            return "FizzBuzz";
//        if (min % 3 == 0)
//            return "Fizz";
//        if (min % 5 == 0)
//            return "Buzz";
//        return String.valueOf(min);

        StringBuilder resultat = new StringBuilder();

//        if (min < max) {
//            resultat += evaluate(max);
//        }
//        return resultat;

        while (min <= max) {
            resultat.append(evaluate(min++));
        }
        return resultat.toString();
    }

    private String evaluate(int nombre) {
        if (nombre % 15 == 0)
            return "FizzBuzz";
        if (nombre % 3 == 0)
            return "Fizz";
        if (nombre % 5 == 0)
            return "Buzz";
        return String.valueOf(nombre);
    }
}
