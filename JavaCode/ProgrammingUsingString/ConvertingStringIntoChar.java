package ProgrammingUsingString;

// Write a java program to convert the "String" into a character "Array



import java.util.Scanner;

public class ConvertingStringIntoChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");

        String str = scan.nextLine();
        char cha[] = str.toCharArray();
        for(int i = 0;i<=cha.length-1;i++)
        {
            System.out.print(cha[i]+ " ");
        }
    }
}


//Enter a String: Hello World
//Output: H e l l o W o r l d