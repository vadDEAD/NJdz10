package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test //1.1
    public void currentStation() {
        Radio radio = new Radio();
        radio.setStation(7);
        int expected = 7;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void station(){
        Radio radio = new Radio(20);
        radio.setStation(19);
        int expected = 19;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test //1.2
    public void overMaxStation() {
        Radio radio = new Radio();
        radio.setStation(14);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test //1.3
    public void underMinStation() {
        Radio radio = new Radio();
        radio.setStation(-5);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test //2
    public void nextStation() {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test //2.1
    public void overMaxNextStation() {
        Radio radio = new Radio();
        radio.setStation(11);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test //2.2
    public void maxNextStation() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test //3
    public void prevStation() {
        Radio radio = new Radio();
        radio.setStation(3);
        radio.prevStation();
        int expected = 2;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test //3.1
    public void minNextStation() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test //3.2
    public void overMinNextStation() {
        Radio radio = new Radio();
        radio.setStation(-1);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test //4.1
    public void currentVolume() {
        Radio radio = new Radio();
        radio.setVolume(9);
        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //4.2
    public void underMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(-5);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //4.3
    public void overMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(102);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //5.1
    public void upVolume() {
        Radio radio = new Radio();
        radio.setVolume(88);
        radio.upVolume();
        int expected = 89;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //5.2
    public void maxUpVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.upVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //5.3
    public void overUpVolume() {
        Radio radio = new Radio();
        radio.setVolume(101);
        radio.upVolume();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //5.1
    public void downVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.dawnVolume();
        int expected = 4;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //5.1
    public void minDownVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.dawnVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //5.1
    public void underMinDownVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.dawnVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}