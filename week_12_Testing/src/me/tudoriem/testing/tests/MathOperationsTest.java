package me.tudoriem.testing.tests;

import me.tudoriem.testing.models.MathOperations;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathOperationsTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Hello");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("Bye");
    }


    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("prepare the test");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("Clear after test");
    }

    @Test
    public void test(){
        fail("not implemented");
    }
    @Test
    public void testAdd(){
        int a = 5;
        int b = 6;
        int expectedResult = 11;
        int actualResult = MathOperations.add(a,b);
        assertEquals("Check the addition", expectedResult, actualResult);
    }
}