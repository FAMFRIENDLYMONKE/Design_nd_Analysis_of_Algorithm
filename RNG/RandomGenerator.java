package RNG;
import java.io.*;
import java.util.*;

public class RandomGenerator{
    public RandomGenerator(int n){
        Random rand  = new Random();
        Writer w;
        try{
            w = new FileWriter("RNG.txt");
            for(int i = 0; i < n; i++){
                int r = rand.nextInt(32767);
                w.write(Integer.toString(r)+"\n");
            }
        }catch(Exception e){}
        
    }

    public int[] readArr(int n){
        Reader r;
        int[] arr = new int[n];
        int i = 0;
        String s = "";
        int a;
        try{
            r = new FileReader("RNG.txt");
            
            while((a = r.read()) != -1){
                if (a =='\n'){
                    arr[i] = Integer.parseInt(s);
                    i++;
                    s = "";
                }else{
                    s+=Character.toString((char)a);
                }
            }
       }catch(Exception e){}
       return arr;
    }
}