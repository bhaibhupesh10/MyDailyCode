import java.util.Scanner;
public class DemoArray3{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];

            for (int i = 0; i <= arr.length-1; i++) {
                System.out.println("enter marks of the student:" + i);
                arr[i] = scan.nextInt();
            }
                System.out.println(" Arrays contents are");
                for (int i = 0; i <= arr.length-1; i++)
            {
                    System.out.println(arr[i]);
            }
        }
    }