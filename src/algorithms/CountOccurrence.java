package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Have a method that receives an int[] as an input and counts the occurences
// of each element
// {1,2,4,1,2,2,6} would output
// 0 - 0 time/s
// 1 - 2 time/s
// 2 - 3 time/s
// 3 - 0 time/s
// 4 - 1 time/s
// 5 - 0 time/s
// 6 - 1 time/s
// 7 - 0 time/s
public class CountOccurrence {
    public static void main(String[] args) {
        int[] inputArray = new int[] {1, 2, 4, 1, 2, 2, 20};
       /* Map<Integer, Integer> mapOfOccurences = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            mapOfOccurences.put(inputArray[i],
                    mapOfOccurences.getOrDefault(inputArray[i], 0) + 1);
        }

        mapOfOccurences.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });*/
        int [] array=new int[4];
        int count=1;
        Arrays.sort(inputArray);
        for (int i=0; i<inputArray.length;i++){
            if (i<inputArray.length-1) {
                if (inputArray[i] == inputArray[i + 1]) count++;
                else {
                    System.out.println(inputArray[i]+" : "+count+" time/s");
                    count = 1;
                }
            }
            else {
                System.out.println(inputArray[i]+" : "+count+" time/s");
            }
        }
    }
}
