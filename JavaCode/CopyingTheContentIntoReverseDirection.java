import java.util.Scanner;

public class CopyingTheContentIntoReverseDirection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = scan.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter array contents");
        for (int i = 0; i <= arr1.length - 1; i++)
        {
            System.out.println("Enter an element");
            arr1[i] = scan.nextInt();
        }
        int arr2[] = new int[arr1.length];
        int j = arr2.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++)
        {
            arr2[j] = arr1[i];
            j--;
        }
        System.out.println("Array1 contents are");
        for(int i=0;i<=arr1.length-1;i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Array2 contents are");
        for(int i=0;i<=arr2.length-1;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
