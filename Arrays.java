import java.util.*;

public class Arrays {
    // public static void update(int marks[]) {
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    // }

    // public static int linearSearch(int numbers[], int key){
    //     for(int i=0; i<numbers.length; i++){
    //         if(numbers[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static int getLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0; i<numbers.length; i++){
    //         if(largest<numbers[i]){
    //             largest = numbers[i];
    //         }
    //     }
    //     return largest;
    // }

    public static int binarySearch(int numbers[], int key){
        int start=0; end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[miid])
        }
    }

    public static int main(String args[]) {
        // int marks [] = new int[100];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Length Of Array: " + marks.length);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("Phy: "+ marks[0]);
        // System.out.println("Chem: "+ marks[1]);
        // System.out.println("Math: "+ marks[2]);
        // int percentage = (marks[0] + marks[1] + marks[2])/3;
        // System.out.println("Percentage = " + percentage + "%");


         // int marks[] = { 97, 98, 99 };
            // update(marks);
            // for (int i = 0; i < marks.length; i++) {
            //     System.out.print(marks[i] + " ");
            // }
            // System.out.println();

        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, };
        // int key = 10;
        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.println("Key Is At Index: " + index);
        // }

        // int numbers[] = {1,2, 6, 3, 5};
        // System.out.println("Largest Value Is: " + getLargest(numbers));
     }
}