package com.j4ltechnologies.junit4;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Classe TestExecutionOrder, créée le 10/06/2022 � 11:20
 *
 * @author Joachim Zadi
 * @version 1.0 du 10/06/2022
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestExecutionOrder {

    @Test
    public void edit() throws Exception {
        System.out.println("édition exécutée");
    }

    @Test
    public void create() throws Exception {
        System.out.println("créer exécuté");
    }

    @Test
    public void remove() throws Exception {
        System.out.println("suppression exécutée");
    }
}