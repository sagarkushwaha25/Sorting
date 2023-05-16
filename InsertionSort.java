package Sorting;
import java.util.*;
public class InsertionSort {
    void insertionsort(int[] arr) {
        int temp , j ;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j >0 && arr[j-1] > temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        obj.insertionsort(arr);
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
