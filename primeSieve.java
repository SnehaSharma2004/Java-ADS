package Class;

import java.util.*;
import java.io.*;

public class primeSieve {
    public static void main(String[] args) {
        /*
         * what is Prime Sieve
         * the prime sieve is a algo rithum to effeciently generate all the prime
         * numbers
         * upto a specifuc limit N
         * 
         * STEPS:
         * 1.create a boolean array isPrime[] where each index represent
         * if the number is prime
         * 
         * 2.initially mark all the numbers from 2 to N atrue.
         * 
         * 3.Starting form the frst prime(2)mark all multiples of 2 as false;
         * 
         * 4.Move to teh next number that is still mark true,and marks its all mutiple
         * as false.
         * 
         * 5.Continue this untill you reach sq.root of n.
         */
        int n = 10;
        sieve(n);
    }

    public static void sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;
        for (int p = 2; p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        System.out.println("Prime Numbers upto:" + n + " :");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i + " ");
            }
        }
    }

    // when range ids given
    /*
     * public class primeRange {
     * public static void main(String[] args) {
     * int L=10;
     * int R=30;
     * System.out.println(countP(L, R));
     * }
     * public static int countP(int L,int R){
     * int[] primes= new int[R+1];
     * for(int i=0;i<=R;i++){
     * primes[i]=1;
     * }
     * primes[0]=primes[1]=0;
     * for(int i=2;i*i<=R;i++){
     * if(primes[i]==1){
     * for(int j=i*i;j<=R;j+=i){
     * primes[j]=0;
     * }
     * }
     * }
     * int count=0;
     * for(int i=L;i<=R;i++){
     * if(primes[i]==1){
     * count++;
     * }
     * }
     * return count;
     * }
     * }
     */

}
