package com.axp.bug;

public class BugExample {

    private int hours;
    private int minutes;
    private int seconds;

    public BugExample(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        seconds = seconds;
    }

    public String getTime() {
        return "" + hours + ":" + minutes + ":" + seconds;
    }
}
