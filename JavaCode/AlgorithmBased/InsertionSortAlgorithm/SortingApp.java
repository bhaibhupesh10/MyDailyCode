package AlgorithmBased.InsertionSortAlgorithm;

import java.util.Scanner;
public class SortingApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array contents");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter a number");
            arr[i] = scan.nextInt();
        }
        System.out.println("Array contents before sorting");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Sorting s = new Sorting();
        s.insertionSort(arr);
        System.out.println("Array contents after sorting");

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
