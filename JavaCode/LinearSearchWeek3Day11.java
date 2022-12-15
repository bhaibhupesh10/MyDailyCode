import java.util.Scanner;

public class LinearSearchWeek3Day11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter Array length");
        int n = scan.nextInt();
        int arr1[] = new int[n];
        System.out.println("enter array contents");

        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println("enter an element");
            arr1[i] = scan.nextInt();
        }
        System.out.println("_____________________________________");
        System.out.println("enter key to Search");
        int Key = scan.nextInt();
        for (int i = 0; i <= arr1.length - 1; i++) {
            if (Key == arr1[i]) {
                System.out.println("key found at the index: " + i);
                System.exit(0);
            }
        }
        System.out.println("Key not found");
    }
}

