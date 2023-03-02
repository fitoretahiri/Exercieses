package algorithms;

// sort the given array use the private method checkSort(int[] sortedArray) with the array you sorted to check if it worked
public class SortList {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{1,3,6,2,8,7,0};

       for (int i=0;i<unsortedArray.length;i++){
           for (int j=i+1;j<unsortedArray.length;j++){
               int temp=0;
               if (unsortedArray[i] > unsortedArray[j])
               {
                   temp = unsortedArray[i];
                   unsortedArray[i] = unsortedArray[j];
                   unsortedArray[j] = temp;
               }
           }
           System.out.println(unsortedArray[i]);
       }

       checkSort(unsortedArray);
    }

    // input the sorted array here to check if it worked;
    private static boolean checkSort(int[] sortedArray) {
        int[] b = new int[] {0,1,2,3,6,7,8};
        for(int i = 0; i < b.length; i++) {
            if (b[i] != sortedArray[i]) {
                System.out.println("Sorting failed.");
                return false;
            }
        }
        System.out.println("Sorting worked!");
        return true;
    }
}
