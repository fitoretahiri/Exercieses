package com.company;

import java.util.Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int [] arr=new int[]{5,4,3,1,0};
        int [] arr2=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        Arrays.sort(arr2);

        int x=arr.length-1;
        for (int i=0;i<arr.length;i++){
            if(arr2[x--]==arr[i]){
                continue;
            }else {
                System.out.println("False");
                break;
            }
        }
        System.out.println("True");

    }
}
