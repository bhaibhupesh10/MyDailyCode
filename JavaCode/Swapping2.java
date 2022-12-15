import java.util.*;

public class Swapping2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter array length");

        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.println("enter array contents");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("enter the elements");
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the indexes where the contents has to be swapped");
        int ind1 = scan.nextInt();
        int ind2 = scan.nextInt();

        System.out.println("array contents before swapping");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println();

            int help;
            help = arr[ind1];
            arr[ind1] = arr[ind2];
            arr[ind2] = help;
        {   System.out.println("array contents after swapping");
            for(int i= 0; i<=arr.length-1;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
