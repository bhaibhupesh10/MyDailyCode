package ProgrammingUsingString;


/* Write a java program to reverse each word in a sentence
eg. 1. get the words
    2. reverse the words.
        3. all the reversal word to reverse sentece.
        * how are you
        * woH era you
--------------------------------------------------------
Reversing word logic
** Word = "How";
reword = " ";
revword = revword + word.charAt[j];
        +w
        revword = w
        revword = revword + wordcharAt[j];
                = w+o
        revword = revword+wordcharAt[j];
        revword = wo =H
        revword = woH
        revsent = revsent + revword + " ";
        revsent = revert + revword + " ";
        revert = " " + woH
        revert = woH
        revsent = revsent + revword
            WwoH "" + era
            resent = woHera

 */

import java.util.Scanner;
public class StringProgramming3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a sentence");
        String str = scan.nextLine();
        String strarr[] = str.split(" ");

        String revsent = " ";
        for(int i = 0; i<=strarr.length-1; i++)
        {
            String word = strarr[i];
            String revword = "";

            for(int j= word.length()-1; j>=0;j--)

            {
                revword = revword + word.charAt(j);
            }
                revsent = revsent + revword + " ";
            }
            System.out.println(revsent);

            }
        }
