package com.j4ltechnologies.junit4;

import org.junit.*;

/**
 * Classe CycleDeVieTest, créée le 09/06/2022 à 14:16
 *
 * @author Joachim Zadi
 * @version 1.0 du 09/06/2022
 */
public class CycleDeVieTest {

    public CycleDeVieTest() {
        System.out.printf("Création de l'instance : %s%n", this);
    }

    @BeforeClass
    public static void avantTousLesTests() {
        System.out.println("Méthode statique @BeforeClass invoquée.==============\n");
    }

    @AfterClass
    public static void apresTousLesTests() {
        System.out.println("Méthode statique @AfterClass invoquée.==============\n");
    }

    @Test
    public void test1() {
        System.out.printf("@Test de la méthode test1 sur l'instance : %s%n", this);
    }

    @Test
    public void test2() {
        System.out.printf("@Test de la méthode test2 sur l'instance : %s%n", this);
    }

    @Test
    public void test3() {
        System.out.printf("@Test de la méthode test3 sur l'instance : %s%n", this);
    }

    @Before
    public void avantChaqueTest() {
        System.out.printf("@Before invoqué sur l'instance : %s%n", this);
    }

    @After
    public void apresChaqueTest() {
        System.out.printf("@After invoqué sur l'instance : %s%n%n", this);
    }
}
