package RNG;

import java.util.*;

public class RandomListGenerator{
    int[] arr;
    public RandomListGenerator(int n){
        Random rand = new Random();
        arr = new int[n];
        int x = 0;
        for(int i = 0; i<n; i++){
            x = rand.nextInt(4) + x;
            arr[i] = x;
        }
    }

    public int[] readArr(int n){
        return arr;
    }
}