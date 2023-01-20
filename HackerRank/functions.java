package HackerRank;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int result = addNumbers(a , b );
        System.out.println(result);
    }
    public static int addNumbers(int a, int b){
        int sum = a+b;
        return sum ;

        }
    }

