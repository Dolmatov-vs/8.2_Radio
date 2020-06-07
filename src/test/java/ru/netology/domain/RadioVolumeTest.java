package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioVolumeTest {
    Radio radio = new Radio();

    @Test
    void addSound() {
        Radio radio = new Radio(10, 10, 0, 9, 10, 0);
        radio.soundLouder();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void currentVolumeEqualMaxVolume() {
        radio.setCurrentVolume(100);
        radio.soundLouder();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void reduceSound() {
        radio.setCurrentVolume(1);
        radio.soundQuieter();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void currentVolumeEqualMinVolume() {
        radio.setCurrentVolume(0);
        radio.soundQuieter();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }
}