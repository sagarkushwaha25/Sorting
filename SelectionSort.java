package Sorting;

import java.util.*;
public class SelectionSort {
    void selectionsort(int arr[]) {
        int n = arr.length;
        int min = 0;
        for (int i = 0; i < n; i++) {
            min  = i; 
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        obj.selectionsort(arr);
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
