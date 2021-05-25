package me.tudoriem.cts.testing.tests;

import me.tudoriem.cts.testing.exceptions.WrongAgeException;
import me.tudoriem.cts.testing.exceptions.WrongNameExceptions;
import me.tudoriem.cts.testing.models.Student;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    static Student student;
    static ArrayList<Integer> grades;
    static  int initialAge = 21;
    static  String initialName = "John Doe";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        grades = new ArrayList<>();
        grades.add(5);
        grades.add(9);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        grades.clear();
        grades = null;
    }

    @org.junit.Before
    public void setUp() throws Exception {
        student = new Student(initialName, initialAge, grades);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        student = null;
    }

    @Ignore
    @Test
    public void test(){

    }

    @Test
    public void testSetNameRightValue() throws WrongNameExceptions {
        String newName = "Cosmin";
        student.setName(newName);
        assertEquals("Testing with a right name", newName, student.getName());
    }

    @Test
    public  void testSetAgeRightValue(){
        int newAge = initialAge +1;
        try {
            student.setAge(newAge);
            assertEquals("Test for right age value", newAge, student.getAge());
        } catch (WrongAgeException e) {
            fail("We got an exception for a right value");
        }
    }

    @Test
    public void setAgeWrongValue(){
        int newAge = initialAge * (-1);
        try {
            student.setAge(newAge);
            fail("We didn't got an exception for negative age");
        } catch (WrongAgeException e) {
            assertTrue(true);
        }
    }

    @Test(expected = WrongAgeException.class)
    public void testSetAgeWrongValueGreaterThanMax() throws WrongAgeException {
        int newAge = Student.MAX_AGE + 20;
        student.setAge(newAge);
    }

}