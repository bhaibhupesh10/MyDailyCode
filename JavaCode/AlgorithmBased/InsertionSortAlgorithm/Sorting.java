package AlgorithmBased.InsertionSortAlgorithm;

/*
Write a java program to sort the contents of an integer array in ascending order by using insertion sort algorithm

Note:- The statementys to sort an array using insertion sort algorithm should be written in a method b name
insertionSort()_ which would accept an integer array as a parameter and would return void.

Sample output1
enter array length
5
Enter array elements
86
42
23 18
25
Elements before sorting
86 42 23 18 25
Elements after Sorting
18 23 25 42 86
 */

public class Sorting {
    void insertionSort(int a[]) {
        int item;
        int j;
        for (int i = 1; i <= a.length - 1; i++)
        {
            item = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > item)
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = item;
        }
    }
}















