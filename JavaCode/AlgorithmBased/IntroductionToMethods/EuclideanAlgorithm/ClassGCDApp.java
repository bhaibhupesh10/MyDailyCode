package AlgorithmBased.IntroductionToMethods.EuclideanAlgorithm;
import java.util.Scanner;
public class ClassGCDApp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        EuclideanAlgorithm ea = new EuclideanAlgorithm();
        int res = ea.findGCD(a,b);
        System.out.println("GCD of " +a+ " and " +b+ " is " +res);

    }
}
