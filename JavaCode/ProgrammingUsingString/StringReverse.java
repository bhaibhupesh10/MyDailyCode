package ProgrammingUsingString;

//Write a java program to reverse the string without using inbuilt functions.
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

        char arr1[] = str.toCharArray();
        char arr2[] = new char[arr1.length];

        int j = arr2.length - 1;

        for (int i = 0; i <= arr1.length - 1; i++) {
            arr2[j] = arr1[i];
            j--;
        }

        str = new String(arr2);
        System.out.print(str);
    }
}

/*OUTPUT:  Enter a string
KODNEST TECHNOLOGIES
SEIGOLONHGCET TSENDOK

 */