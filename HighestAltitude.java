package Class;

import java.util.*;
import java.io.*;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0; 
        int highestAltitude = 0; 

        for (int g : gain) {
            currentAltitude += g; 
            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude; 
            }
        }

        return highestAltitude; 
    }
    public static void main(String[] args) {
        HighestAltitude h = new HighestAltitude();
        int[] gain = {-5,1,5,0,-7};
        System.out.println(h.largestAltitude(gain)); 
    }
}
