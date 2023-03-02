package algorithms;

import java.util.Random;

public class Solutions {
    //TASK 1
    //0 1 -1
    public static int arraySign(int[] nums) {
        int product = 1;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 0) return 0;
            else if (nums[i]>0) continue;
            else product *= -1;
        }
        return product;
    }

    //TASK 2
    //Zevendsimi i plus dhe minus + -
    public static String plusMinus(String word){
        String s="";
        String output="";

        for (int i=0;i<word.length();i++){
            s=s+word.charAt(i);

            if (s.equals("plus")){
                output=output+"+";
                s="";
            }
            if (s.equals("minus")){
                output=output+"-";
                s="";
            }
            if (s.length()>5) s="";
        }

        return output;
    }

    //TASK 3
    //Detyra me string, nr tek , me shkronja te vogla
    //Me provu me math.random me dal shkronjat e vogla te asccii
    public static String stringOcc(int n){
        Random r = new Random();

        String s="";
        if(n % 2 != 0){
            for(int i = 0; i < n; i++) s+=(char)(r.nextInt(26) + 'a');
        }
        else{
            for(int i = 0; i < n-1; i++) s+=(char)(r.nextInt(26) + 'a');
            s+=(char)(r.nextInt(26) + 'a');
        }
        return s;
    }


    //TASK 4
    //Me kqyr a dallojn 2 numra per 1
    public static boolean solution(int [] A){
        if (A.length<2){
            return false;
        }
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A.length;j++){
                if(Math.abs(A[i]-A[j])==1){
                    return true;
                }
            }
        }
        return false;
    }


    //TASK 5
    //String concatenation Solution
    public static int concSolution(String [] A){
        int c=0;
        String s="";
        String sFinal="";
        for (int i=0;i<A.length;i++){
            s=s+A[i];
            for (int j=0;j<A[i].length();j++){
                if (!s.contains(s.charAt(j)+"")){
                    continue;
                }
                else break;
            }
        }
        return s.length();
    }

    public static int solutionConc(String [] A){
        String s="";
        String sFinal="";
        int count=0;
        for (int i=0;i<A.length;i++){
            s+=A[i];
            for (int j=0;j<s.length();j++){
                if (!s.contains(s.charAt(j)+"")){
                    sFinal+=s;
                    //s="";
                }
                else s="";
            }
        }
        return sFinal.length();
    }


    //TASK 6
    //SUMS
    public static int fairIndex(int a[], int b[]){
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            sumB += b[i];
        }
        int k = 0;
        int tempA = a[0];
        int tempB = b[0];

        for (int i = 1; i < a.length; i++) {
            if (i != 1 && tempA == tempB && 2 * tempA == sumA && 2 * tempB == sumB) {
                k++;
            }
            tempA += a[i];
            tempB += b[i];
        }
        return k;
    }

    //TASK3
    public static boolean solution1(int [] A){
        int c=0;
        if (A.length%2!=0) return false;
        for (int i=0;i<A.length;i++){
            for (int j=i;j<A.length;j++){
                if (A[i]==A[j]){
                    c++;
                }
            }
        }
        if (c==A.length/2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(stringOcc(4));
        System.out.println(plusMinus("minusplusminusminusplusfitoreplusminus"));
        System.out.println( arraySign(new int[]{2,5,3,2}));
        System.out.println(solution(new int[]{2,0,5,2,20}));

        int [] a=new int[]{0,4,-1,0,3};
        int [] b=new int[]{0,-2,5,0,3};
        System.out.println(fairIndex(a,b));

        String [] A=new String[]{"co","dil","ity"};
        System.out.println(solutionConc(A));

        int [] v=new int[]{1,2,2,1,1,1};
        System.out.println(solution1(v));
    }

    }
