package com.j4ltechnologies.junit4;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Classe AssertTest, cr��e le 10/06/2022 � 10:47
 *
 * @author Joachim Zadi
 * @version 1.0 du 10/06/2022
 */
public class AssertTest {

    @Test
    public void assertTrueAndFalseTest() {
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    public void assertNullAndNotNullTest() {
        Object monObject = null;
        assertNull(monObject);

        monObject = new String("Mon Objet");
        assertNotNull(monObject);
    }

    @Test
    public void assertEqualsTest() throws Exception {
        Integer i = new Integer("5");
        Integer j = new Integer("5");
        assertEquals(i, j);
    }

    @Test
    public void assertNotSameTest() throws Exception {
        Integer i = new Integer("5");
        Integer j = new Integer("5");
        ;
        assertNotSame(i, j);
    }

    @Test
    public void assertSameTest() throws Exception {
        Integer i = new Integer("5");
        Integer j = i;
        assertSame(i, j);
    }

    @Test(expected = RuntimeException.class)
    public void exceptionTest() {
        throw new RuntimeException();
    }

    @Test
    @Ignore("John's holiday stuff failing")
    public void when_today_is_holiday_then_stop_alarm() {
    }
}
