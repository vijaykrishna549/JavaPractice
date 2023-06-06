//Day 10 Practice problems

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Array Demo");
        int[] id = {13, 64, 12, 24, 25, 64, 13, 54, 25, 81, 98, 64};
        int[] numArr = new int[]{13, 64, 12, 24, 25, 64, 13, 54, 25, 81, 98, 64};


        sumArray(id);
        printArray(numArr);     //1
        frquencyFinder(id);     //2
        findLargest(id);        //3
        findSmallest(id);       //4
        evenPositionElement(numArr); //5
        reverseArray(numArr);       //6
        oddPositionElement(numArr); //7
        duplicateElement(id);   //8
        sortedArray(id);        //9
        secondLargest();        //10
    }

    //1) Java Program to print the elements of an array
public static void printArray(int[] arr){
    System.out.println("All elements of the array : ");
    for (int i : arr) {
        System.out.println(i);
    }
}
    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("the sum of array is : " + sum);
    }

// 2)   Java Program to find the frequency of each element in the array

    public static void frquencyFinder(int[] arr) {
        System.out.println("Frequency is");
    }

//3) Java Program to print the largest element in an array

    public static void findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
//4) Java Program to print the smallest element in an array

    public static void findSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }

    //    5) Java Program to print the elements of an array present on even position
    public static void evenPositionElement(int[] arr) {
        //Loop through the array by incrementing value of i by 2
        System.out.println("Elements at even position are");
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.println(arr[i]);
        }
    }

    //   6) Java Program to print the elements of an array in reverse order
    public static void reverseArray(int[] arr) {
        System.out.println("Array in reverse order: ");
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println(arr[i]);
        }
    }


    //7) Java Program to print the elements of an array present on odd position
    public static void oddPositionElement(int[] arr) {
        //Loop through the array by incrementing value of i by 2
        System.out.println("Elements at odd position are");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }

    //    8) Java Program to print the duplicate elements of an array
    public static void duplicateElement(int[] arr) {
        System.out.println("Duplicate elements in array are ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }

    //9) Java Program to sort the elements of an array in ascending order

    public static void sortedArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println(
                "Elements of array sorted in ascending order : "
                        + Arrays.toString(arr));
    }

    //10) Find 2nd Largest Number in an Array

    public static void secondLargest() {
        int temp, size;
        int array[] = {10, 20, 25, 63, 96, 57};
        size = array.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second second largest number is:: " + array[size - 2]);
    }


}








