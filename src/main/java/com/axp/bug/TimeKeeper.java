package com.axp.bug;

public class TimeKeeper {

    private int hours;
    private int minutes;
    private int seconds;

    public TimeKeeper(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String getTime() {
        return "" + hours + ":" + minutes + ":" + seconds;
    }
}
