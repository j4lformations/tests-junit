package com.j4ltechnologies.junit5.mock;

import com.j4ltechnologies.junit5.mock.mock.service.ICalculatriceService;

/**
 * Classe Calculatrice, créée le 13/06/2022 à 16:46
 *
 * @author Joachim Zadi
 * @version 1.0 du 13/06/2022
 */
public class Calculatrice {

    private ICalculatriceService service;

    public Calculatrice(ICalculatriceService service) {
        this.service = service;
    }

    public int effecterAddition(int a, int b) {
        return service.addition(a, b);
    }
}
