package com.zipcodewilmington.person;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Before
    public void setUp() {
        Person bob = new Person("bob", 34, true, "red", true, "Software Developer", "Wilmington");
        Person alice = new Person("alice", 70, false, "green", true, "Baker", "Boston");
    }

    @Test
    public void getAlive() {

        Person bob = new Person("bob", 34, true, "red", true, "Software Developer", "Wilmington");

        Boolean expected = true;
        Boolean actual = bob.getAlive();
        assertEquals(expected, actual);
    }

    @Test
    public void setAlive() {
        Person alice = new Person("alice", 70, false, "green", true, "Baker", "Boston");

        Boolean expected = true;
        alice.setAlive(true);

        assertEquals(expected, alice.getAlive());

    }

    @Test
    public void getFavoriteColor() {
        Person bob = new Person("bob", 34, true, "red", true, "Software Developer", "Wilmington");

        String expected = "red";
        String actual = bob.getFavoriteColor();
        assertEquals(expected, actual);
    }

    @Test
    public void setFavoriteColor() {

        Person alice = new Person("alice", 70, false, "green", true, "Baker", "Boston");

        String expected = "blue";
        alice.setFavoriteColor("blue");

        assertEquals(expected, alice.getFavoriteColor());
    }

    @Test
    public void getHasPet() {
        Person bob = new Person("bob", 34, true, "red", true, "Software Developer", "Wilmington");

        Boolean expected = true;
        Boolean actual = bob.getHasPet();
        assertEquals(expected, actual);
    }

    @Test
    public void setHasPet() {

        Person alice = new Person("alice", 70, false, "green", true, "Baker", "Boston");

        Boolean expected = false;
        alice.setHasPet(false);

        assertEquals(expected, alice.getHasPet());
    }

    @Test
    public void getJob() {
        Person bob = new Person("bob", 34, true, "red", true, "Software Developer", "Wilmington");

        String expected = "Software Developer";
        String actual = bob.getJob();
        assertEquals(expected, actual);
    }

    @Test
    public void setJob() {

        Person alice = new Person("alice", 70, false, "green", true, "Baker", "Boston");

        String expected = "Sky Diver";
        alice.setJob("Sky Diver");

        assertEquals(expected, alice.getJob());
    }

    @Test
    public void getResidence() {
        Person bob = new Person("bob", 34, true, "red", true, "Software Developer", "Wilmington");

        String expected = "Wilmington";
        String actual = bob.getResidence();
        assertEquals(expected, actual);
    }

    @Test
    public void setResidence() {

        Person alice = new Person("alice", 70, false, "green", true, "Baker", "Boston");

        String expected = "Chicago";
        alice.setResidence("Chicago");

        assertEquals(expected, alice.getResidence());
    }
}