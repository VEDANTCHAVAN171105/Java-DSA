// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

/*public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //Get
        int element = list.get(2);
        System.out.println(element);

        //Delete
        list.remove(2);
        System.out.println(list);

        //Set
        list.set(2,10);
        System.out.println(list);

        Contains
        System.out.println(list.contains(2));

        ArrayList<Integer>list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size());

        //Print ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Print Reverse - O(n)
        ArrayList<Integer>list = new ArrayList<>(); 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i=list.size() - 1; i>=0; i--){
        System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
*/

//Container With Maximum Water - Brute Force - O(n^2)
public class ArraysList{
    public static int storeWater(ArrayList<Integer>height){
        int maxWater = 0;
        //Brute Force
        for(int i=0; i<height.size();i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-1;
                int currWater = ht*width;
                maxWater = Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
      ArrayList<Integer>height = new ArrayList<>();
      height.add(1);
      height.add(8);
      height.add(6);
      height.add(2);
      height.add(5);
      height.add(4);
      height.add(8);
      height.add(3);
      height.add(7);

      System.out.println(storeWater(height));
    }
}