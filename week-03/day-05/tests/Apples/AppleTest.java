package Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    @Test
    public void getAppleGetsAString(){
        Apple apple = new Apple("apple");

        assertEquals("apple", apple.getApple());
    }
    @Test
    public void getAppleGetsAStringFail(){
        Apple apple = new Apple("Dog");

        assertEquals("apple", apple.getApple());
    }
}