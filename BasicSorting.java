import java.util.*;

// public class BasicSorting {

//     public static void bubbleSort(int arr[]) {
//         for (int turns = 0; turns < arr.length - 1; turns++) {
//             for (int j = 0; j < arr.length - 1 - turns; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         bubbleSort(arr);
//         printArr(arr);
//     }
// }

// public class BasicSorting {
//     public static void selectionSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int minPos = i; // Initialize minPos to the current index i

//             // Find the index of the minimum element in the unsorted part of the array
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[minPos] < arr[j]) {
//                     minPos = j;
//                 }
//             }

//             // Swap the found minimum element with the element at index i
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};

//         // Sort the array using selection sort
//         selectionSort(arr);

//         // Print the sorted array
//         printArr(arr);
//     }
// }

public class BasicSorting{
    // public static void insertionSort(int arr[]){
    //     for(int i=1; i<arr.length; i++){
    //         int curr = arr[i];
    //         int prev = i-1;
    //         while(prev >=0 && arr[prev] > curr){
    //             arr[prev+1] = arr[prev];
    //             prev--;
    //         }
    //         arr[prev + 1] = curr;
    //     }
    // }

    //     public static void printArr(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        // insertionSort(arr);
        // printArr(arr);

        
    }
}