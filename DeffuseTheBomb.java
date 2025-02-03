package Class;

import java.util.*;
import java.io.*;

public class DeffuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) {
            return result;
        }
        int start, end, step; // using sliding window concept, 2 pointer technique
        if (k > 0) {
            start = 1;
            end = k;
            step = 1; // coz moving forward
        } else {
            start = -1; // previous element
            end = k;
            step = -1; // moving backward
            k = -k;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= k; j++) {
                int index = (i + (j * step) + n) % n; // for circular array; sorted circular indexing
                sum += code[index];
            }
            result[i] = sum;
        }
        return result;
    }
    public static void main(String[] args) {
        DeffuseTheBomb deffuseTheBomb = new DeffuseTheBomb();
        int[] code = {5,7,1,4};
        int k = 3;
        int[] result = deffuseTheBomb.decrypt(code, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
