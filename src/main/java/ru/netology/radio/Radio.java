package ru.netology.radio;

public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.station = station;
    }

    public void nextStation() {
        if (station != 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prevStation() {
        if (station != 0) {
            station--;
        } else {
            station = 9;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public void upVolume() {
        if (volume != 10) {
            volume++;
        }
    }

    public void dawnVolume() {
        if (volume != 0) {
            volume--;
        }
    }
}