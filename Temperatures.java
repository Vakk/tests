import java.util.*;
import java.io.*;
import java.math.*;
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        int closest=0;
        StringBuilder number = new StringBuilder();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        String [] arr =temps.split("[^\\S\\d]");
        if(n>0)closest=Integer.parseInt(arr[0]);
        for (int i=0;i<n;i++){
            int tmp = Integer.parseInt(arr[i]);
            int absolute =Math.abs(tmp);
            if (Math.abs(closest)>absolute){
                closest=tmp;
            }
            if (Math.abs(closest)==absolute){
                if(closest<tmp) closest=tmp;
            }
        }
        System.out.println(closest);
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }
}