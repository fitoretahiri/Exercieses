package algorithms;
//Given an array of integers, find the longest subarray where the absolute difference between any
// two elements is less than or equal to.
// Example [1,1,2,2,3,4] the longest subarray would be [1,1,2,2]
// Example [1,1,2,3,4,5] the longest subarray would be [1,1,2]
//https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
public class PickingNumbers{
    public static void main(String[] args) {
        // longest subarray would be [3,3,4,4,4,4]
        int[] numbers = new int[]{1,1,1,3,3,4,4,4,4,5,6,8};

        if (getSubarraySize(numbers) == 6) {
            System.out.println("Algorithm solved!");
        } else {
            System.out.println("Algorithm isn't solved");
        }
        System.out.println(getSubarraySize(numbers));
    }

    // size of longest subarray should be outputed
    private static int getSubarraySize(int[] numbers) {
        int[] subArr = new int[100];
        for(int i = 0; i < numbers.length; ++i){
            subArr[numbers[i]]++;
        }

        int size = 0;
        for(int i = 0; i < 99; ++i){
            size = Math.max(size, subArr[i]+subArr[i+1]);
        }
        return size;
    }
}
