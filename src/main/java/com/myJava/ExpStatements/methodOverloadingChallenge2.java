package com.myJava.ExpStatements;

public class methodOverloadingChallenge2 {
    public static void main(String[] args) {
        getDurationString(183, 45);
        getDurationString(200);
        getDurationString(-1200);
        getDurationString(360, 59);
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))) {
            int hours = (int) (0.0166667 * minutes);
            int newMin = minutes % 60;
            String out = hours + "h " + newMin + "m " + seconds + "s";
            System.out.println(out);
        } else {
            System.out.println("Invalid value");
        }
        return null;
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value!");
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            getDurationString(minutes, remainingSeconds);
        }
    }
}
