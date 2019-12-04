import java.util.*;
import java.lang.*;
import java.io.*;

class Clock {

    int hours;
    int minutes;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
}

class Program {

    public static void main(String[] args) {


        Clock clock1 = new Clock(12, 20);
        Clock clock2 = new Clock(13, 59);
        Clock clock3 = new Clock(14, 15);
        Clock clock4 = new Clock(24, 10);


        LinkedList<Clock> clocks = new LinkedList<Clock>();
        clocks.add(clock1);
        clocks.add(clock2);
        clocks.add(clock3);
        clocks.add(clock4);


        int hour = 24;
        int minute = 59;

        for (Clock clock : clocks) {
            if (clock.hours < 24 && clock.minutes < 59) {
                clock.hours++;
                clock.minutes++;
                System.out.println("time: " + (clock.hours) + ":" + (clock.minutes));
            } else if (clock.hours >= 24){
                clock.minutes++;
                System.out.println("time: " + (clock.hours - hour) + "0:" + (clock.minutes));
            } else if (clock.minutes >= 59) {
                clock.hours++;
                System.out.println("time: " + (clock.hours) + ":0" + (clock.minutes - minute));
            }
        }
    }
}






