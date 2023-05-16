package Sorting;
import java.util.*;
public class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        obj.bubbleSort(arr);
        System.out.println("Sorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}