import java.lang.reflect.Array;
import java.util.Arrays;

//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of
// the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
public class MinMaxSum {
    //[1,2,4,5,6]

    public static void main(String[] args) {
        int [] array=new int[]{3,2,5,1,2};
        Arrays.sort(array);
        int minSum=0;
        int maxSum=0;
        int sum=0;
        for (int i=0;i<array.length;i++){
            /*if (i<4){
                minSum=minSum+array[i];
            }
            if (i>0){
                maxSum=maxSum+array[i];
            }*/
            sum=sum+array[i];
        }
        System.out.println("Minimum = "+(sum-array[4]));
        System.out.println("Max ="+(sum-array[0]));

       /* int sum=0;
        int max=0;
        int min=0;
        for (int i=0;i<array.length;Math.random()){
            sum+=array[i];
            if (sum>max){
                min=max;
                max=sum;
            }
            if (i==3){
                i=0;
            }
        }*/
    }
}