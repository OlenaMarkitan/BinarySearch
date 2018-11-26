package com.marlen.java.lesson_1.Lesson7_1.Home7.Search.Binary_Search;

// Binary search in the sorted array

public class Binary_Search_1 {
    public static void main(String[] args) {
        Binary_Search_1 bin=new Binary_Search_1();
        int[]a={1,3,5,7,9,45,78,90,112,456};
        //bin.runBinarySearchIteratively(a,7,0,a.length-1);
        System.out.println(bin.runBinarySearchIteratively(a,456,0,a.length-1));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    public int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("in "+mid+"     a[i]= "+sortedArray[mid] );
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
