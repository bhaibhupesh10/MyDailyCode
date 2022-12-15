import java.util.Scanner;

public class RemoveRedundancyp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the 1st and second dimensions");
        int arr[][] = new int[scan.nextInt()][scan.nextInt()];

        System.out.println("enter the marks");
        for (int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr[i].length-1;j++)
            {
                System.out.println("enter the  marks of the college " +i+ "enter the marks of student " +j);
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Arrays contents are");
        for (int i=0;i<=arr.length-1;i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
