package com.j4ltechnologies.junit4;

import org.junit.*;

/**
 * Classe SanityTest, créée le 10/06/2022 � 10:27
 *
 * @author Joachim Zadi
 * @version 1.0 du 10/06/2022
 */
public class SanityTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class est invoqué avant tous les Test\n");
    }

    @Before
    public void before(){
        System.out.println("Before est invoqué avant chaque Test");
    }

    @After
    public void after(){
        System.out.println("After est invoqué apres chaque Test\n");
    }

    @Test
    public void test1(){
        System.out.println("Invocation de la methode  test1()");
    }

    @Test
    public void test2(){
        System.out.println("Invocation de la methode  test2()");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class est invoqué apres tous les test");
    }

}
