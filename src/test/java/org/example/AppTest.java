package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    @DisplayName("Check that 6 returns \"Good morning!\"")
    public void firstTest() {
        Assertions.assertEquals("Good morning!",App.getGreeting(6));

    }

    @Test
    @DisplayName("Check that 15 returns \"Good afternoon!\"")
    public void secondTest() {
        Assertions.assertEquals("Good afternoon!", App.getGreeting(15));
    }

    @Test
    @DisplayName("Check that 19 returns \"Good evening!\"")
    public void thirdTest() {
        Assertions.assertEquals("Good evening!", App.getGreeting(19));
    }

    @Test
    @DisplayName("Check that 72 returns \"Good evening!\"")
    public void fourthTest() {
        Assertions.assertEquals("Good evening!", App.getGreeting(72));
    }

    @Test
    @DisplayName("Check that -13 returns \"Good evening!\"")
    public void fifthTest() {
        Assertions.assertEquals("Good evening!", App.getGreeting(-5));
    }

    @ParameterizedTest
    @ValueSource(ints ={5,8,12})
    @DisplayName("Check against 5,8, and 12")
    public void checkAgainst5_8_and12(int timeOfDay) {
        Assertions.assertEquals("Good morning!", App.getGreeting(timeOfDay));
    }





    }
