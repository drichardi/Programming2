package com.khsmwv.richardi;

public class Time {

    public static void main(String[] args) {
	    double hour;
	    double minute;
	    double second;
	    double currentHour;
	    double currentMinute;
	    double currentSecond;
	    double currentTotalInSeconds;
	    double elapsedTime;

	    hour = 21.0;
	    minute = 24.0;
	    second = 35.0;

        //convert hours to seconds, minutes to seconds
        double totalSecondsInDay = 24 * 60 * 60;
	    double totalSeconds = (hour * 60 * 60) + minute * 60 + second;

	    System.out.println("Total number of seconds since midnight: "
                + totalSeconds + " seconds");

	    System.out.println("Number of seconds remaining in the day: "
                + (totalSecondsInDay - totalSeconds) + " seconds.");

	    System.out.println("Percentage of the day that has passed: " + Math.round((totalSeconds / totalSecondsInDay) * 100) + "%.");

	    currentHour = 21.0;
	    currentMinute = 46.0;
	    currentSecond = 32.0;

	    currentTotalInSeconds = currentHour * 60 * 60 + currentMinute * 60 + currentSecond;

	    elapsedTime = currentTotalInSeconds - totalSeconds;

	    System.out.println("Total seconds elapsed since starting exercise Time.java: " + elapsedTime + " seconds.");

	    //rounding errors
	    System.out.println(0.1 * 10);
        System.out.println(.1 + .1 + .1 + .1 + .1
                         + .1 + .1 + .1 + .1 + .1);

        //Percentage of time passed using ints vs floating point
        System.out.println(59 / 60);
        System.out.println(59 * 100 / 60);
        System.out.println(59.0 / 60.0);
    //  int x = 1.1; // compiler error
        double y = 1; // legal, but bad style
        double z = 1 / 3; // mistake;
        double dec = 1.0 / 3.0;

        System.out.println(y + ", " + z + ", " + dec);
    }
}
