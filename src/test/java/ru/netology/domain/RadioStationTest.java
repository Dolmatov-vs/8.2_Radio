package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioStationTest {

    @Test
    void nextStatin() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStatin();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void currentStatinEqualMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStatin();
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void currentStatinMoreMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
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

    @Test
    void currentStationLessMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prevStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }
}