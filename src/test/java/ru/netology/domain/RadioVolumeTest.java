package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioVolumeTest {

    @Test
    void addSound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.soundLouder();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void currentVolumeEqualMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.soundLouder();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void currentVolumeMoreMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.soundLouder();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void reduceSound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.soundQuieter();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void currentVolumeEqualMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.soundQuieter();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void currentVolumeLessMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.soundQuieter();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }
}