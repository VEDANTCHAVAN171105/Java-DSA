// public class RecursionBasics{
//      public static void printDecreasing(int n){
//         if(n==1){
//            System.out.print(n);
//            return;
//         }
//          System.out.print(n+" ");
//          printDecreasing(n-1);
//      }

//      public static void main(String args[]){
//         int n=10;
//         printDecreasing(n);
//      }
// }

// public class RecursionBasics{
//     public static void printInc(int n){
//        if(n==1){
//         System.out.print(n+" ");
//         return;
//        }
//         printInc(n-1);
//        System.out.print(n+" ");
//     }

//     public static void main(String args[]){
//        int n=5;
//        printInc(n);
//     }
// }

// public class RecursionBasics{
//     public static int fact(int n){
//         if(n==0){
//             return 1;
//         }
        
//         int fnm1 = fact(n-1);
//         int fn = n*fact(n-1);
//         return fn; 
//     }

//     public static void main(String args[]){
//         int n=5;
//         System.out.println(fact(n));
//     }
// }


// public class RecursionBasics{
//     public static int calcSum(int n){
//         if(n==1){
//             return 1;
//         }
//         int snm1 = calcSum(n-1);
//         int sn = n + snm1;
//         return sn;
//     }
    
//     public static void main(String args[]){
//           int n=5;
//           System.out.println(calcSum(n));
//     }
// }


// public class RecursionBasics{
//     public static int fib(int n){
//         if(n==0||n==1){
//             return n;
//         }
        
//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n-2);
//         int fnm = fnm1+fnm2;
//         return fnm;
//     }
    

//     public static void main(String args[]){
//         int n = 25;
//         System.out.println(fib(n));
//     }
// }


// public class RecursionBasics{
//     public static boolean isSorted(int arr[], int i){
//         if(i== arr.length-1){
//             return true;
//         }
//         if(arr[i] > arr[i+1]){
//             return false;
//         }
//         return isSorted(arr, i+1);
//     }

//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         System.out.println(isSorted(arr, 0));
//     }
// }

// public class RecursionBasics{
//     public static int firstccurance(int arr[], int key, int i){
//         if(i==arr.length){
//             return -1;
//         }
        
//         if(arr[i] == key){
//             return i;
//         }

//         return firstccurance(arr, key, i+1);
//     }

//     public static void main(String args[]){
//                  int arr[] = {8,3,6,9,5,10,2,5,3};
//                  System.out.println(firstccurance(arr, 5, 0));
//             }
// }

// public class RecursionBasics{
//     public static int lastccurance(int arr[], int key, int i){
//         if(i==arr.length){
//             return -1;
//         }
        
//         int isFound = lastccurance(arr, key, i+1);
//         if(isFound == -1 && arr[i]==key){
//             return i;
//         }

//         return isFound;
//     }

//     public static void main(String args[]){
//         int arr[] = {8,3,6,9,5,10,2,5,3};
//         System.out.println(lastccurance(arr, 5, 0));
//     }
// }


// public class RecursionBasics{
//      public static int power(int x, int n){
//             if(n==0){
//                 return 1;
//             }
            
//             // int xnm1 = power(x, n-1);
//             // int xn = x * xnm1;
//             // return xn;

//             return x * power(x, n-1);
//          }

//       public static void main(String args[]){
//         System.out.println(power(2, 10));
//       }
// }              