import java.util.Scanner;

public class Swaptwoindexes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array length");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter Array contents");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("enter the element");
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the indexes where the contents has to be swap");

        int ind1 = scan.nextInt();
        int ind2 = scan.nextInt();

        System.out.println("array contetns before swapping");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int help;
        help = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = help;
        {
            System.out.println("Array contents after swapping");
            for (int i = 0; i <= arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}