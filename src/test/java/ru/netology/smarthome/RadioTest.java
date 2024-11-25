package ru.netology.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setStation.csv")
    void setCurrentStationTest(int station, int expected) {
        Radio rad = new Radio();

        rad.setCurrentStation(station);
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setStationCounter.csv")
    void setCurrentStationWithCounterTest(int station, int expected) {
        Radio rad = new Radio(17);

        rad.setCurrentStation(station);
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setVolume.csv")
    void setCurrentVolumeTest(int volume, int expected) {
        Radio rad = new Radio();

        rad.setCurrentVolume(volume);
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    void nextStationTest(int station, int expected) {
        Radio rad = new Radio();

        rad.setCurrentStation(station);
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStationCounter.csv")
    void nextStationWithCounterTest(int station, int expected) {
        Radio rad = new Radio(17);

        rad.setCurrentStation(station);
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStation.csv")
    void prevStationTest(int station, int expected) {
        Radio rad = new Radio();

        rad.setCurrentStation(station);
        int actual = rad.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStationCounter.csv")
    void prevStationWithCounterTest(int station, int expected) {
        Radio rad = new Radio(17);

        rad.setCurrentStation(station);
        int actual = rad.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    void increaseVolumeTest(int volume, int expected) {
        Radio rad = new Radio();

        rad.setCurrentVolume(volume);
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseVolume.csv")
    void decreaseVolumeTest(int volume, int expected) {
        Radio rad = new Radio();

        rad.setCurrentVolume(volume);
        int actual = rad.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}