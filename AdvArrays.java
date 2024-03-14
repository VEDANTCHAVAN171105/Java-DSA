import java.util.*;

public class AdvArrays {
    // public static void MaxSubarrays(int numbers[]) {
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;

    //     for (int i = 0; i < numbers.length; i++) {
    //         int start = i;
    //         for (int j = i; j < numbers.length; j++) {
    //             int end = j;
    //             currSum = 0;
    //             for (int k = start; k <= end; k++) {
    //                 currSum += numbers[k];
    //             }
    //             System.out.println(currSum);
    //             if (maxSum < currSum) {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("Max Sum =" + maxSum);
    // }

    // public static void MaxSubarrays(int numbers[]) {
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];
    //     prefix[0] = numbers[0];
    //     for(int  i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }

    //     for (int i = 0; i < numbers.length; i++) {
    //         int start = i;
    //         for (int j = i; j < numbers.length; j++) {
    //             int end = j;
    //             currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
    //             if (maxSum < currSum) {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("Max Sum = " + maxSum);
    // }

    // public static void kadanes(int numbers[]){
    //     int ms = Integer.MIN_VALUE;
    //     int cs = 0;

    //     for(int i=0; i<numbers.length; i++){
    //         cs= cs+numbers[i];
    //         if(cs<0){
    //         cs = 0;
    //     }
    //     ms=Math.max(cs, ms);
    //     }
    //     System.out.println("Max Subarray: "+ms);
    // }

    // public static int trappedRainwater(int height[]) {
    //     int n = height.length;
    
    //     int leftMax[] = new int[n];
    //     leftMax[0] = height[0];
    //     for (int i = 1; i < n; i++) {
    //         leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    //     }
    
    //     int rightMax[] = new int[n];
    //     rightMax[n - 1] = height[n - 1];
    //     for (int i = n - 2; i >= 0; i--) {
    //         rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    //     }
    
    //     int trappedWater = 0;
    //     for (int i = 0; i < n; i++) {
    //         int waterLevel = Math.min(leftMax[i], rightMax[i]);
    //         trappedWater += waterLevel - height[i];
    //     }
    //     return trappedWater;
    // }

    public static int buyAndSellStocks(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<price.length; i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    

    public static void main(String args[]) {
        // int numbers[] = {1, -2, 6, -1, 3}; // Fix: Changed 6.-1 to 6, -1
        // MaxSubarrays(numbers);

        // int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        // kadanes(numbers);

        // int numbers[] = {4,2,0,6,3,2,5};
        // System.out.println(trappedRainwater(numbers));

        int price[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(price));
    }
}
