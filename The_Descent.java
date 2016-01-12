import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int max=0;
        // game loop
        int [] list = new int[8];
        while (true) {
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                list[i]=mountainH;
                if (max<mountainH) max=mountainH;
            }
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if (list[spaceX]==max) {System.out.println("FIRE");max=0;}
            else System.out.println("HOLD"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
        }
    }
}