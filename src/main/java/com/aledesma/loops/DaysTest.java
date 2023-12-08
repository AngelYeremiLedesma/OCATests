package com.aledesma.loops;

public class DaysTest {
    static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

    public static void main(String[] args) {
        int index = 0;
        for (String day : days) {
            if (true) {
                break;
            } else {

            }
            index++;
            if (days[index].length() > 3) {
                days[index] = day.substring(0, 3);
            }
        }
        System.out.println(days[index]);
    }
}
// Select 1 option
// mon
// thu
// fri
// It will not compile
// It will throw an exception at run time