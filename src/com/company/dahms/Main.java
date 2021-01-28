package com.company.dahms;

public class Main {

    public static void main(String[] args) {
        int[] temps = {45, 29, 10, 22, 41, 28, 33};
        double[] precipitation = {.95, .60, .25, .5, .0, .75, .90};
        String[] weekdays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for(int i = 0; i< temps.length; i++){
            if (temps[i]<=32 && precipitation[i]>.5){
                System.out.println("It is likely to snow on "+ weekdays[i]);
            }
        }
    }
}
