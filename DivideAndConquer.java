// public class DivideAndConquer{
    
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
    
//     public static void mergeSort(int arr[], int si, int ei){
//         if(si>=ei){
//             return;
//         }
//         int mid = si+(ei-si)/2;
//         mergeSort(arr, si, mid); //left part
//         mergeSort(arr,mid+1, ei); //rigth part
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(int arr[], int si, int mid, int ei){
//         int temp[] = new int[ei-si+1];
//         int i = si; //iterator for left part
//         int j = mid+1; //iterator for right part
//         int k = 0; //iterator for temp arr
    
//         while(i<=mid && j<=ei){
//             if(arr[i]<arr[j]){
//                 temp[k] = arr[i];
//                 i++; 
//             }else{
//                 temp[k] = arr[j];
//                 j++; 
//             }
//             k++; 
//         }
//         //left
//         while(i<=mid){
//             temp[k++] = arr[i++];
//         }
//         //right
//         while(j<=ei){
//             temp[k++] = arr[j++];
//         }
    
//         //copy temp to original array
//         for(k=0, i=si; k<temp.length; k++, i++){
//             arr[i] = temp[k];
//         }
//     }
    

//     public static void main(String args[]){
//         int arr[] = {6,3,9,5,2,8};
//         mergeSort(arr, 0, arr.length-1);
//         printArr(arr);
//     }
    
// }


// public class DivideAndConquer{
//     public static void printArr(int arr[]){
//     for(int i=0; i<arr.length; i++){
//         System.out.print(arr[i]+" ");
//     }
//         System.out.println();
//     }

//     public static void quickSort(int arr[], int si, int ei){
//         int pidx = partition(arr, si, ei);

//         quickSort(arr, si, pidx-1);
//         quickSort(arr, pidx+1, ei);
//     }  

//     public static int partition(int arr[], int si, int ei){
//         int pivot = arr[ei];
//         int i = si; // Initialize i to the starting index of the sub-array
//         for(int j = si; j < ei; j++){
//             if(arr[j] <= pivot){
//                 // Swap arr[i] and arr[j]
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//                 i++;
//             }
//         }
//         // Swap pivot with arr[i]
//         int temp = arr[ei];
//         arr[ei] = arr[i];
//         arr[i] = temp;
//         return i;
//     }
    

//     public static void main(String args[]){
//     int arr[] = {6,3,9,5,2,8};
//     quickSort(arr, 0, arr.length-1);
//     printArr(arr);
//     }
// }



public class DivideAndConquer{
    
}