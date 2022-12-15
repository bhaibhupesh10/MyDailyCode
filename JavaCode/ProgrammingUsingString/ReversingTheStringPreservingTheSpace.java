package ProgrammingUsingString;
/* Write a java program to reverse a string by preserving the spaces
eg. KODNEST TECHNOLOGIES
TO: SEIGOLO NHCETTSENDOK
 */

import java.util.Scanner;

public class ReversingTheStringPreservingTheSpace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        char arr1[] = str.toCharArray();
        char arr2[] = new char[arr1.length];
        for (int i = 0; i <= arr1.length - 1; i++) {
            if (arr1[i] == ' ') {
                arr2[i] = arr1[i];
            }
        }
        int j = arr2.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            if (arr1[i]!=' ') {
                if (arr2[j]==' ') {
                    j--;
                }
                arr2[j] = arr1[i];
                j--;
            }
        }
        str = new String(arr2);
        System.out.println(str);
    }
}
/* OUTPUT: ENTER A STRING
= KODENST TECHNOLOGIES
+SEIGOLO NHCETTSENDOK

 */