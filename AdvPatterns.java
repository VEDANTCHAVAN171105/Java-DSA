import java.util.*;

public class AdvPatterns{
    // public static void hollow_rectangle(int totRows, int totCols){
    //     for(int i=1; i<=totRows; i++){
    //         for(int j=1; j<=totCols; j++){
    //             if(i==1 || i==totRows || j==1 || j==totCols){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void inverted_rotated_half_pyramaid(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void inverted_rotated_half_pyramaid_withNum(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n-i+1; j++){
    //             System.out.print(j + "");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void floyds_traingle(int n){
    //     int counter = 1;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(counter + " ");
    //             counter++;
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void zero_one_triangle(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             if((i+j) % 2==0){
    //                 System.out.print("1");
    //             }else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void butterfly(int n){
    //     for(int i=1; i<=n; i++){
    //         //stars - i
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         //spaces - 2*(n-i)
    //         for(int j=1; j<=2*(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         //stars - i
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     //2nd Half
    //     for(int i=n; i>=1; i--){
    //         //stars - i
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         //spaces - 2*(n-i)
    //         for(int j=1; j<=2*(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         //stars - i
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void solid_rhombus(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=n; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void hollow_rhombus(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         //hollow_rectangle
    //         for(int j=1; j<=n; j++){
    //             if(i==1 || i==n || j==1 || j==n){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void diamond(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=(2*i)-1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     for(int i=n; i>=1; i--){
    //         for(int j=1; j<(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=(2*i)-1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String args[]){
        // hollow_rectangle(4, 5);
        // inverted_rotated_half_pyramaid(5);
        // inverted_rotated_half_pyramaid_withNum(5);
        // floyds_traingle(10);
        // zero_one_triangle(5);
        // butterfly(4);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        // diamond(5);
    }
}