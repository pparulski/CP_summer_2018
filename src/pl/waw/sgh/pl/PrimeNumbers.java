package pl.waw.sgh.pl;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i =0;
        int num =0;
        String  primeNumbers = "";
        int count = 0;
        int n = 10000;
        for (i = 1; i <= n; i++)
        {
            int j=0;
            for(num = i; num >= 1; num--)
            {
                if(i % num == 0)
                {
                    j = j + 1;
                }
            }
            if (j == 2)
            {
                primeNumbers = primeNumbers + i + " ";
                count = count + 1;
            }
        }
        System.out.println("Number of prime numbers from 1 to " + n + " is: " + count);
        System.out.println("Prime numbers from 1 to " + n + " are:");
        System.out.println(primeNumbers);
    }

    //HW: print n numbers of Fibonacci sequence
}
