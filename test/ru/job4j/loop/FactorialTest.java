package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int inMethod = 5;
        assertThat(Factorial.calc(inMethod), is(expected));
    }

    @Test
    public void whenCalculateFactorialForSixThenSevenHundredTwenty() {
        int expected = 720;
        int inMethod = 6;
        assertThat(Factorial.calc(inMethod), is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int inMethod = 0;
        assertThat(Factorial.calc(inMethod), is(expected));
    }
}