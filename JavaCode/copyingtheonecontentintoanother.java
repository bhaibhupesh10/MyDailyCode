import java.util.Scanner;

public class copyingtheonecontentintoanother {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array length");
        int n = scan.nextInt();
        int arr1 [] = new int [n];
        System.out.println("enter Array contents");
        for(int i=0;i<=arr1.length-1;i++)
	 {
            System.out.println("enter an element");
            arr1[i] = scan.nextInt();
        }
        int arr2[] = new int [arr1.length];
        for(int i=0;i<=arr1.length-1;i++) 	
	{
            arr2[i] = arr1[i];
        }
        System.out.println("Array 1 contents are");
        for(int i=0;i<=arr1.length-1;i++) 	
	{
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Array2 contents are");

        for(int i=0;i<=arr2.length-1;i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
