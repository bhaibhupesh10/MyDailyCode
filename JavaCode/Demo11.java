import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan. nextInt();
        System.out.println("entered number is : " +a ) ;
        System.out.println("____________________________________");
        System.out.println("enter your height in cm ");
        float b = scan.nextInt();
        System.out.println("entered height is : " +b);
        System.out.println("_____________________________________");
        System.out.println("Are you married? Enter true or false");
        boolean c = scan.nextBoolean();
        System.out.println("marriage status : " +c);
        System.out.println("______________________________________");
        scan.nextLine();
        System.out.println("enter fathers name");
        String d = scan.nextLine();
        System.out.println("entered fathers name is : " +d);






    }
}
