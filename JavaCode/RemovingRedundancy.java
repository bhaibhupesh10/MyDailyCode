import java.util.Scanner;

public class RemovingRedundancy {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 1st Dimensions length");
        int a = scan.nextInt();

        System.out.println("Enter the 2nd Dimensions of length");
        int b = scan.nextInt();

        int arr[][] = new int[a][b];
        System.out.println("Enter the marks");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("Enter the marks of college" + i + "enter the marks of student" + j);
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array contents are");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++)
                System.out.print(arr[i][j] + "  ");


            System.out.println();
        }
    }
}