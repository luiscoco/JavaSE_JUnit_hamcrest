package com.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AppTest {

    @Test
    public void testSomething() {
        List<String> myList = Arrays.asList("apple", "banana", "cherry");

        // Using Hamcrest to check if the list contains "apple" and has a size of 3
        assertThat(myList, hasItem("apple"));
        assertThat(myList, hasSize(3));
    }
}