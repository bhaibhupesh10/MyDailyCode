package AlgorithmBased.SelectionSortingAlgorithm;

/* Write a java program to sort the elements of an integer array in ascending order by using selection sort algorithm.
Note:- The statements of selection sor t algorithm shoudl be kept in ma method by name selectionSort() which would
        accept an integer array as input and would return void

Sample output:- 1.
enter array length
= 5
enter array elements
    86
    42
    23
    18
    25

   Elements before sorting
   86 23 25 42 86
   Elements after sorting
   18 23 25 42 86
 */

public class Sorting {

    void SelectionSort(int a[]) {
        int min;
        int pos;
        int help;
        for (int i = 0; i <= a.length - 2; i++) {
            min = a[i];
            pos = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < min) {
                    min = a[j];
                    pos = j;
                }
            }


            help = a[i];
            a[i] = a[pos];
            a[pos] = help;
        }
    }
}