package HackerRank;
import java.util.Scanner;
public class switchCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a positive number");

        int N = scan.nextInt();

        switch (N){
            case 1:
                System.out.println("this is condition 1");
                break;
            case 2:
                    System.out.println("this is condition 2");
                    break;
            case 3:
                System.out.println("this is condition 3 ");
                break;
            case 4:
                System.out.println("this is condition 4");
                break;
            default:
                System.out.println("out of range from 1-4 :");
        }
    }
}
