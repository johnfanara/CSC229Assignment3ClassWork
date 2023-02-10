/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_assignment03.cw;
import java.util.Scanner;
/**
 *
 * @author johnf
 */
public class SortSearch {
    static void bubbleSort(int[] arr) {
        int outer, inner, temp;
        int size = arr.length;
        
        for (outer = size - 1; outer > 0; outer--) {
            for (inner = 0; inner < outer; inner++) {
                if (arr[inner] > arr[inner + 1]) {
                    temp = arr[inner];
                    arr[inner] = arr[inner + 1];
                    arr[inner + 1] = temp;
                }
            }
        }
    }
    
    static int binarySearch(int num, int[] arr) {
       int start = 0;
       int end = arr.length - 1;
       
       while (start <= end) {
           int middle = (start + end) / 2;
           if (num < arr[middle]) {
               end = middle - 1;
           }
           if (num > arr[middle]) {
               start = middle + 1;
           }
           if (num == arr[middle]) {
               return middle;
           }
       }
       return -1;
    }
    
    static int linearSearch(int num, int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           if (num == arr[i]) {
           return i;
           }
        }
        
       return -1;
    }
    
    static void printArray(int[] arr) {
       for (int i = 0; i < arr.length - 1; i++) {
           System.out.print(arr[i] + ", ");
       }
       System.out.println(arr[arr.length-1]);
    }
    
    public static void main(String[] args){
        int[] numArr = new int[]{4, 60, 42, 80, 3, 13, 67, 8, 102, 17, 33, 24, 91};
        
        System.out.println("Array: ");
        printArray(numArr);
        System.out.println();
        
        System.out.println("Sorting array...");
        System.out.println();
        bubbleSort(numArr);
        
        System.out.println("Sorted array: ");
        printArray(numArr);
        System.out.println();
        
        System.out.println("Enter number to search: ");
        Scanner search = new Scanner(System.in);
        int x = search.nextInt();
        
        System.out.println();
        System.out.println("Searching array for " + x + " using Binary Search...");
        int binResult = binarySearch(x, numArr);
        
        if (binResult != -1){
            System.out.println(x + " found at index " + binResult);
        }
        else{
            System.out.println(x + " not found in array");
        }
        System.out.println();
        
        System.out.println("Searching array for " + x + " using Linear Search...");
        int linResult = linearSearch(x, numArr);
        
        if (linResult != -1) {
            System.out.println(x + " found at index " + linResult);
        }
        else{
            System.out.println(x + " not found in array");
        }
        
    
    }
}

