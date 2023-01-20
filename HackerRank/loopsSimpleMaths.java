package HackerRank;
import java.util.Scanner;
public class loopsSimpleMaths {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int N = scan.nextInt();
        System.out.println("entered number is "+N);
        for(int i=1;i<=10;i++){
            System.out.println(N +  "*" +i+ "=" +N*i);
        }
    }
}
