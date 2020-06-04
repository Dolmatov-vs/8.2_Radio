package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioSettersVolumeTest {
    Radio radio = new Radio();

    @Test
    void setCurrentVolume() {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeEqualsMaxVolume() {
        radio.setCurrentVolume(10);
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeMoreMaxVolume() {
        radio.setCurrentVolume(11);
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeEqualsMinVolume() {
        radio.setCurrentVolume(0);
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeLessMinVolume() {
        radio.setCurrentVolume(-1);
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }
}