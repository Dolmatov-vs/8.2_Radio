package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioSettersVolumeTest {

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeEqualsMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeMoreMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeEqualsMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeLessMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }
}