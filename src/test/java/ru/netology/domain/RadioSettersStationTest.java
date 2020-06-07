package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioSettersStationTest {
    Radio radio = new Radio();

    @Test
    void setCurrentStation() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationEqualsMaxStation() {
        radio.setCurrentStation(9);
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentStationMoreMaxStation() {
        radio.setCurrentStation(10);
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentStationEqualsMinStation() {
        radio.setCurrentStation(0);
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentStationLessMinStation() {
        radio.setCurrentStation(-1);
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }
}