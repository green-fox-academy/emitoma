package variables;

public class SecondsInADay {
    public static void main (String[] args){
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int secondsInADay = 24 * 60 * 60; //24 hours * 60 mins * 60 secs
        System.out.println(secondsInADay);

        int passedSeconds = (14 * 60 * 60) + (34 * 60) + 42; //(14hours * 60mins * 60secs) + (34mins * 60 secs) + 42 secs
        System.out.println(passedSeconds);

        int remainingSeconds = secondsInADay - passedSeconds;
        System.out.println(remainingSeconds);
    }
}
