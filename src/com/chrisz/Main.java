package com.chrisz;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortArray(myIntegers);
        printArray(sorted);
	// write your code here
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " number of integers");
        int[] unsorted = new int[number];
        for(int i=0; i < unsorted.length; i++) {
            unsorted[i] = scanner.nextInt();
        }
        return unsorted;
    }

    public static void printArray(int[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {

        boolean sorted = false;
        int temp;
        int[] arrayCopy = new int[array.length];
        for(int i=0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arrayCopy.length - 1; i++) {
                if (arrayCopy[i + 1] > arrayCopy[i]) {
                    temp = arrayCopy[i];
                    arrayCopy[i] = arrayCopy[i + 1];
                    arrayCopy[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return arrayCopy;
    }
}

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
