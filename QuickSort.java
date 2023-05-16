package Sorting;

public class QuickSort {
    static int partition(int arr[],int l,int r) {
        int i = (l - 1); 
        for(int j = l;j<r;j++) {
            if (arr[j]<arr[r]) {
                i++; 
                int t = arr[i];  
                arr[i] = arr[j];  
                arr[j] = t;
            }
        } 
        int temp = arr[i+1];  
        arr[i+1] = arr[r];  
        arr[r] = temp;  
        return (i + 1);   
    }
    static void quicksort(int arr[], int l, int r) {
        if (l < r) {
            int pi = partition(arr, l, r);
            quicksort(arr, l, pi - 1);
            quicksort(arr, pi + 1, r);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 7 };
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++)
        System.out.print(arr[i] + " "); 
        System.out.println();

    }
}
