package AlgorithmBased.SelectionSortingAlgorithm;

import java.util.Scanner;
public class SortingApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter array length");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array element");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("enter an element");
            arr[i] = scan.nextInt();
        }
        System.out.println("Array contents before sorting");

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        Sorting s = new Sorting();
        s.SelectionSort(arr);
        System.out.println();

        System.out.println("array elements after sorting");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
