package com.company;

public class Example {
    public static void main(String[] args) {
        int nr=100;
        int nr1=128;
        System.out.println(hasOne(nr));
        System.out.println(dividesSelf(000));
    }

    public static boolean hasOne(int n) {
        if(n < 1) return false;
        int x = n%10;
        if (x == 1) return true;
        else return hasOne(n/10);
    }

    public static boolean dividesSelf(int n) {
        int tmp = n;
        if (n%10 == 0)
        return false;
        while(n != 0) {
            if (tmp % (n%10) != 0)
                return false;
                n /= 10;
        }
        return true;
    }


}
