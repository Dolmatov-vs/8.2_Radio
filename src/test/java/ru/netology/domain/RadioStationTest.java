package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioStationTest {
//    Radio radio = new Radio();

    @Test
    void nextStatin() {
        Radio radio = new Radio(8, 9, 0, 5, 100, 0);
        radio.nextStatin();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void currentStatinEqualMaxStation() {
        Radio radio = new Radio(10, 10, 0, 5, 10, 0);
        radio.nextStatin();

        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void currentStationEqualMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }
}