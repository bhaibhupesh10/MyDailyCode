import java.util.Scanner;

public class DemoArray1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter marks of student 0 ");
        arr[0] = scan.nextInt();
        System.out.println("enter marks of student 1 ");
        arr[1] = scan.nextInt();
        System.out.println("enter the marks of student 2");
        arr[2] = scan.nextInt();
        System.out.println("enter the marks of student 3");
        arr[3] = scan.nextInt();
        System.out.println("enter the marks of student 4");
        arr[4] = scan.nextInt();

        System.out.println("Arrays contents are: ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

    }
}
