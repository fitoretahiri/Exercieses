package com.company;
//////(Convert milliseconds to hours, minutes, and seconds) Write a method that converts milliseconds to hours,
// minutes, and seconds
public class ParseTime {
    public static void main(String[] args) {
        int milliseconds = 10234214;

        int hours=milliseconds/3600000;
        //milliseconds=milliseconds-(hours*3600000);
        int minutes=(milliseconds-(hours*3600000))/60000;
        int seconds=(milliseconds-(hours*3600000)-(minutes*60000))/1000;

        System.out.println(hours+":"+minutes+":"+seconds);

    }
}
