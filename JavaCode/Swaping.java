import java.util.Scanner;

class Swaping
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int help;

        System.out.println("Enter 2 numbers");
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("contents before swaping");
        System.out.println(a + " " + b);

        help = a;
        a = b;
        b = help;

        System.out.println("contents after swaping");
        System.out.println(a + " " +b);

    }
}