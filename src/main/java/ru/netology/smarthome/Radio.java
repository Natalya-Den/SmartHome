package ru.netology.smarthome;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public void setCurrentStation(int station) {
        if ((station < 0) || (station > 9)) {
            currentStation = 0;
            System.out.println("Введите номер станции от 0 до 9. Вы ввели " + station);
        } else {
            currentStation = station;
        }
    }

    public void setCurrentVolume(int volume) {
        if ((volume < 0) || (volume > 100)) {
            currentVolume = 0;
            System.out.println("Введите громкости от 0 до 100. Вы ввели " + volume);
        } else {
            currentVolume = volume;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int nextStation() {
        if (currentStation >= 9) {
            return currentStation = 0;
        } else {
            currentStation++;
            return currentStation;
        }
    }

    public int prevStation() {
        if (currentStation <= 0) {
            return currentStation = 9;
        } else {
            currentStation--;
            return currentStation;
        }
    }

    public int increaseVolume() {
        if (currentVolume >= 100) {
            return currentVolume = 100;
        } else {
            currentVolume++;
            return currentVolume;
        }
    }

    public int decreaseVolume() {
        if (currentVolume <= 0) {
            return currentVolume = 0;
        } else {
            currentVolume--;
            return currentVolume;
        }
    }
}
