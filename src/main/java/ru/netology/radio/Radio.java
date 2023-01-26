package ru.netology.radio;

public class Radio {
    private int station;
    private int volume;
    private int minStation;
    private int maxStation;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio() {
        minStation = 0;
        maxStation = 9;
    }

    public Radio(int station) {
        maxStation = station - 1;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < minStation) {
            return;
        }
        if (station > maxStation) {
            return;
        }
        this.station = station;
    }

    public void nextStation() {
        if (station != maxStation) {
            station++;
        } else {
            station = minStation;
        }
    }

    public void prevStation() {
        if (station != minStation) {
            station--;
        } else {
            station = maxStation;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void upVolume() {
        if (volume != maxVolume) {
            volume++;
        }
    }

    public void dawnVolume() {
        if (volume != minVolume) {
            volume--;
        }
    }
}