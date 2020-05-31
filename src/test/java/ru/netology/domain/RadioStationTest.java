package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioStationTest {

    @Test
    void increaseCurrentStatin() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.increaseCurrentStatin();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void currentStatinEqualMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseCurrentStatin();
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void currentStatinMoreMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.increaseCurrentStatin();
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.decreaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void currentStationEqualMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void currentStationLessMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.decreaseCurrentStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }
}