package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioSettersStationTest {

    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationEqualsMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentStationMoreMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentStationEqualsMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentStationLessMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }
}