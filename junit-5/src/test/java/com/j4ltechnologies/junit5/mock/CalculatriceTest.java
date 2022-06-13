package com.j4ltechnologies.junit5.mock;

import com.j4ltechnologies.junit5.mock.mock.service.ICalculatriceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Classe CalculatriceTest, créée le 13/06/2022 à 16:52
 *
 * @author Joachim Zadi
 * @version 1.0 du 13/06/2022
 */
class CalculatriceTest {
    Calculatrice calculatrice;

//    ICalculatriceService service = new ICalculatriceService() {
//        @Override
//        public int addition(int a, int b) {
//            return a+b;
//        }
//    };

    ICalculatriceService service = mock(ICalculatriceService.class);

    @BeforeEach
    void setUp() {
        calculatrice = new Calculatrice(service);
    }

    @Test
    void testEffectuerAddition() {
        when(service.addition(2,3)).thenReturn(5);
        assertEquals(5, calculatrice.effecterAddition(2, 3));
    }
}