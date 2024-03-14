import java.util.*;

public class Functions{
    // public static void printHelloWorld(){
    //     System.out.println("HELLO WORLD");
    //     System.out.println("HELLO WORLD");
    //     System.out.println("HELLO WORLD");
    // }

    // public static void calculateSum(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a+b;
    //     System.out.println("Sum Is: " + sum);
    // }

    // public static int calculateSum(int num1, int num2){
    //     int sum = num1+num2;
    //     return sum;
    // }

    // public static void swap(int a, int b){
    //     int temp = a;
    //     a=b;
    //     b=temp;
    //     System.out.println("a = " + a);
    //     System.out.println("b = " + b);
    // }

    // public static int multiply(int a,int b){
    //     int product = a*b;
    //     return product;
    // }

    // public static int factorial(int n){
    //     int f = 1;
    //     for(int i=1; i<=n; i++){
    //         f = f*i;
    //     }
    //     return f;
    // }

    // public static int binCoeff(int n, int r){
    //     int A = factorial(n);
    //     int B = factorial(r);
    //     int C = factorial(n-r);

    //     int binCoeff = A/(B*C);
    //     return binCoeff;
    // }

    // public static int sum(int a, int b){
    //     return a + b;
    // }

    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }

    // public static int sum(int a, int b){
    //     return a + b;
    // }

    // public static float sum(float a, float b){
    //     return a + b;
    // }

    // public static boolean Prime(int n){
    //     boolean Prime =true;
    //     for(int i =2; i<=n-1; i++){
    //         if(n%i == 0){
    //             Prime = false;
    //             break;
    //         }
    //     }
    //     return Prime;
    // }

    // public static boolean isPrime(int n){
    //     if(n == 2){
    //         return true;
    //     }

    //     for(int i=2; i<=Math.sqrt(n); i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void primeinRange(int n){
    //     for(int i =2; i<=n; i++){
    //         if(isPrime(i)){
    //             System.out.println(i+" ");
    //         }
    //     }
    //     System.out.println();
    // }

    // public static void binToDec(int binNum){
    //     int myNum = binNum;
    //     int pow = 0;
    //     int decNum=0;
    //     while(binNum > 0){
    //         int lastdigit = binNum % 10;
    //         decNum = decNum + (lastdigit * (int)Math.pow(2,pow));
    //         pow++;
    //         binNum = binNum / 10;
    //     }
    //     System.out.println("Dec Of " + binNum + "=" + decNum);
    // }

    // public static void decToBin(int n){
    //     int myNum = n;
    //     int pow = 0;
    //     int binNum = 0;
    //     while(n > 0){
    //         int rem = n%2;
    //         binNum = binNum + (rem*(int)Math.pow(10, pow));
    //         pow++;
    //         n = n/2;
    //     }
    //     System.out.println("Binary Of" + myNum + "=" + binNum);
    // }

    public static void main(String args[]){
        // printHelloWorld();

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a,b);
        // System.out.println("Sum Is: " + sum);

        // int a = 10;
        // int b = 5;
        // swap(a,b);

        // int a=3;
        // int b=5;
        // int prod = multiply(a, b);
        // System.out.println("Product Of a*b = "+prod);
        // prod = multiply(10, 20);
        // System.out.println("Product Of a*b = "+prod);

        // System.out.println(factorial(7));

        // System.out.println(binCoeff(5, 2));

        // System.out.println(sum(10, 20));
        // System.out.println(sum(10, 20, 30));

        // System.out.println(sum(10, 20));
        // System.out.println(sum(10.2f, 20.5f));

        // System.out.println(Prime(7));

        // System.out.println(isPrime(16));

        // primeinRange(20);

        // binToDec(111);

        // decToBin(7);
    }
}
