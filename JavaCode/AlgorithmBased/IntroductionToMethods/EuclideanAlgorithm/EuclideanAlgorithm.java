package AlgorithmBased.IntroductionToMethods.EuclideanAlgorithm;

/*
Write a java program to find the GCD of 2 numbers using Euclidean Algorithm
not: The set of instruction to find GCD should be written in a method bny the name find GCD
        wich would take 2 number as parameters and would return calculated GCD of numbers
 */


public class EuclideanAlgorithm {
    int findGCD(int m, int n )
    {
        int rem;
        while(n!=0)
        {
            rem = m%n;
            m = n;
            n = rem;
        }
        int gcd = m;
        return gcd;
    }
}
