package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioStationTest {
    Radio radio = new Radio();

    @Test
    void nextStatin() {
        radio.setCurrentStation(8);
        radio.nextStatin();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void currentStatinEqualMaxStation() {
        radio.setCurrentStation(9);
        radio.nextStatin();
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        radio.setCurrentStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void currentStationEqualMinStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }
}