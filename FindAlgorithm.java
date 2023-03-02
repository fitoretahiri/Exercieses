package algorithms;

// Complete the findIndexForElement method, it should return the index for the searched number
// (if the number 4 is searched you should return the index 4
// If completed try optimise the algorithm as much as possible
public class FindAlgorithm {
    int first;
    public static void main(String[] args) {
       /* int[] sortedList = new int[]{1,4,6,8,10,14,17,20};

        if (binaryAlgorithm(sortedList, 10) == 4) {
            System.out.println("Find worked");
        } else {
            System.out.println("Find didn't work");
        }
        System.out.println(binaryAlgorithm(sortedList,10));*/
        int [] v={41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,-3,43,83,78,82,70,15,-41};
        System.out.println(arraySign(v));
    }


   /* private static int findIndexForElement(int[] sortedList, int number, int x) {
        if (sortedList[x]==number){
            return x;
        }
        return findIndexForElement(sortedList,number,x+1);
    }*/

    //Linear search algorithm O(n)
    private static int findIndexForElement(int[] sortedList, int number) {
    for (int i=0;i<sortedList.length;i++){
            if (sortedList[i]==number){
                return i;
            }
        }
        return -1;
    }

    private static int binaryAlgorithm(int[] sortedList, int number){
        int low = 0;
        int high = sortedList.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (number < sortedList[mid])
                high = mid - 1;
            else if (number == sortedList[mid])
                return mid;
            else
            low = mid + 1;
            }

        return - 1;
    }

    public static int arraySign(int[] nums) {
        int product = 1;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 0) return 0;
            else if (nums[i]>0) continue;
            else product *= -1;
        }
        return product;
    }
}
