// public class RecursionBasics2{
//     public static int tiling(int n){
//         if(n==0||n==1){
//             return 1;
//          }
//         int fnm1 = tiling(n-1);

//         int fnm2 = tiling(n-2);

//         int totalways = fnm1+fnm2;
//         return totalways;
//     }

//     public static void main (String args[]){
//         System.out.println(tiling(4));
//     }
// }

// public class RecursionBasics2{
//     public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]){
//         if(idx == str.length()){
//             System.out.println(newstr);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         if(map[currChar-'a'] == true){
//             removeDuplicates(str, idx+1, newstr, map);
//         }else{
//             map[currChar-'a'] = true;
//             removeDuplicates(str, idx+1, newstr.append(currChar), map);
//         }
//     }

//     public static void main (String args[]){
//         String str = "appnnacollege";
//         removeDuplicates(str, 0 , new StringBuilder(""), new boolean[26]);
//     }
// }

public class RecursionBasics2{
    public static int friendsPairing(int n){
        if(n==1||n==2){
           return n; 
        }
        
        // int fnm1 = friendsPairing(n-1);

        // int fnm2 = friendsPairing(n-2);

        // int pairways = (n-1)*fnm2;

        // int totWays = fnm1 + pairways;
        // return totWays;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void main (String args[]){
        System.out.println(friendsPairing(3));
    }
} 