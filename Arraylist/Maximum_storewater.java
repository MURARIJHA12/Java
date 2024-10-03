/* 
import java.util.*;
public class Maximum_storewater {
    public static int storeWater(ArrayList<Integer>height){
        int maxwater=0;
        //brute force
        for(int i=0;i<height.size();i++){
            for(int j=0;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currentwater=ht*width;
                maxwater=Math.max(maxwater,currentwater);
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
    ArrayList<Integer>height=new ArrayList<>();
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
*/

//2 pointerf approch

import java.util.*; // Line 1

class MaximumStoreWater { // Line 2
    public static int storeWater(ArrayList<Integer> height) { // Line 3
        int maxWater = 0; // Line 4
        int lp = 0; // Line 5
        int rp = height.size() - 1; // Line 6
        while (lp < rp) { // Line 7
            // Calculate water area
            int ht = Math.min(height.get(lp), height.get(rp)); // Line 8
            int width = rp - lp; // Line 9
            int currentWater = ht * width; // Line 10
            maxWater = Math.max(maxWater, currentWater); // Line 11

            // Update pointer
            if (height.get(lp) < height.get(rp)) { // Line 12
                lp++; // Line 13
            } else {
                rp--; // Line 14
            } // Line 15
        } // Line 16
        return maxWater; // Line 17
    } // Line 18

    public static void main(String[] args) { // Line 19
        ArrayList<Integer> height = new ArrayList<>(); // Line 20
        height.add(1); // Line 21
        height.add(8); // Line 22
        height.add(6); // Line 23
        height.add(2); // Line 24
        height.add(5); // Line 25
        height.add(4); // Line 26
        height.add(8); // Line 27
        height.add(3); // Line 28
        height.add(7); // Line 29
        System.out.println(storeWater(height)); // Line 30
    } // Line 31
} // Line 32
