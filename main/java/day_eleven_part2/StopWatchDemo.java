package day_eleven_part2;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class StopWatchDemo {

//UC 6 => Simulate Stopwatch Program
//a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
//the start and end clicks
//b. I/P -> Start the Stopwatch and End the Stopwatch
//c. Logic -> Measure the elapsed time between start and end
//d. O/P -> Print the elapsed time.

        public static void main(String[] args) {
            StopWatchDemo st = new StopWatchDemo();
            LocalTime start = st.getStartTime();
            System.err.println("Start time : "+  start);
            LocalTime end = st.getEndTime();
            System.err.println("End time : "+ end);
            long sec = start.until(end, ChronoUnit.SECONDS);
            System.err.println("Time Elasped : "+ sec +" Seconds");
        }

        public LocalTime getStartTime(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any Character to start the stopWatch");
            char select = sc.next().charAt(0);
            if(select <=0){
                LocalTime time = LocalTime.now();
                System.out.println("Current time: "+time.getClass());
            }
            return LocalTime.now();
        }
        public LocalTime getEndTime(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any Character to stop the stopWatch");
            char select = sc.next().charAt(0);
            if(select <= 0){
                LocalTime time = LocalTime.now();
                System.out.println("Current time: "+time.getClass());
            }
            return LocalTime.now();
        }
    }


