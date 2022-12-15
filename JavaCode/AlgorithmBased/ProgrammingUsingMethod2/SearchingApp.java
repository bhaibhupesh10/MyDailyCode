package AlgorithmBased.ProgrammingUsingMethod2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class SearchingApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String st = scan.nextLine();
        Searching s = new Searching();
        boolean res = s.checkS(st);
        if (res==true) {
            System.out.println("String contains S");
        } else {
            System.out.println("String does not contain S");

        }
    }

}
