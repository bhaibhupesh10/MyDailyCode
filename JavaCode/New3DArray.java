import java.util.Scanner;

public class New3DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][][] = new int[3][3][4];

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println("enter the colleges " + i + " branches " + j + " and students " + k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("Array contents are");

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.print(arr[i][j][k] + "    ");
                }
                System.out.println();
            }
        }
    }
}