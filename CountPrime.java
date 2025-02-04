package Class;

import java.util.*;
import java.io.*;

public class CountPrime {
    public int countPrimes(int n) {
        //Sieve of Eratosthenes process
        if(n<=2) return 0;
        int count=0;
        int[] result = new int[n]; //will store 1 if prime, 0 if not prime
        for(int i=0;i<n;i++){
            result[i]=1; //initially, we will store 1 n times in the array
        }
        result[0]=result[1]=0; //0 and 1 are not prime numbers, so 0
        
        for(int i=2;i*i<n;i++){
            if(result[i]==1){
                for(int j=i*i;j<n;j+=i){
                    result[j]=0;
                }
            }  
        }
        for(int i=2;i<n;i++){
            if(result[i]==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountPrime cp = new CountPrime();
        System.out.println(cp.countPrimes(10)); 
    }
}
