package com.company;
// Return the reversal of an integer, e.g., reverse(456) returns 654
public class ReversePalindrome {
    public static void main(String[] args) {
        int originalInteger=56789;
        int reversed=0;
        int x=0;
        while (originalInteger!=0){
            x=originalInteger%10;
            reversed=reversed*10+x;
            originalInteger=originalInteger/10;
        }

        System.out.println("Nr reversed: "+reversed);
    }
}
