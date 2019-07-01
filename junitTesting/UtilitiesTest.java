package junitTesting;

import static org.junit.Assert.*;

public class UtilitiesTest {
    static Utilities utilities;
    static String testString1;
    static String testString2;
    static String testString3;

    @org.junit.BeforeClass
    public static void setup(){
        utilities = new Utilities();
        testString1 = "aabcddeff";
        testString2 = "abccabdef";
        testString3 = "aaaaaaaaaaaaaa";
    }

    @org.junit.Test
    public void everyNthChar() {
        // general tests for everyNthChar method
        assertArrayEquals(new char[]{'a','c','d','f'},utilities.everyNthChar(testString1.toCharArray(),2));
        assertArrayEquals(new char[]{'c','e'},utilities.everyNthChar(testString2.toCharArray(),4));
        assertArrayEquals(new char[]{'a','a','a','a','a','a','a','a','a','a','a','a','a','a'},utilities.everyNthChar(testString3.toCharArray(),1));
    }
    @org.junit.Test
    public void everyNthCharNGreaterThenArrayLength() {
        // edge case where user enters Nth character greater then array size
        assertArrayEquals(new char[]{'a','a','b','c','d','d','e','f','f'},utilities.everyNthChar(testString1.toCharArray(),10));
    }

    @org.junit.Test
    public void removePairsGeneralFunctionality() {
        // this test will test the general functionality of the removePairs method
        assertEquals("abcdef",utilities.removePairs(testString1));
        assertEquals("abcabdef",utilities.removePairs(testString2));
        assertEquals("a",utilities.removePairs(testString3));
    }
    @org.junit.Test
    public void removePairsLessThan2Chars() {
        // this test will test the functionality of the edge case when one letter string is added
        assertEquals("a",utilities.removePairs("a"));
    }
    @org.junit.Test
    public void removePairsCapitalLetter() {
        // this test will test the functionality of the edge case when capital letters string is added
        assertEquals("ab",utilities.removePairs("aAbB"));
    }
    @org.junit.Test
    public void removePairsNullString() {
        // this test will test the functionality of the edge case when capital letters string is added
        assertEquals(null,utilities.removePairs(null));
    }

    @org.junit.Test
    public void converter() {
        fail("Test not yet implemented");
    }
}