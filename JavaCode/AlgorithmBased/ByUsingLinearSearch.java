import java.util.Scanner;
public class ByUsingLinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("Enter an element");
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter key to search");
        int key = scan.nextInt();
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low<=high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                System.out.println("Key found at the index: " + mid);
                System.exit(0);
            } else if (key > arr[mid]) {
                low = mid + 1;
                high = high;
            }
            else
            {
                high = mid - 1;
                low = low;
            }
        }
        System.out.println("Key not found");
    }
}
