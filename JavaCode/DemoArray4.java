import java.util.Scanner;

public class DemoArray4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[7];
        for (int i = 0; i <= 6; i++) {
            System.out.println("enter the data of employee:" + i);
            arr[i] = scan.nextInt();

        }
            System.out.println("Arrays contents are:");
            for (int i = 0; i <= 6; i++) {
                System.out.println(arr[i]);

        }
    }
}