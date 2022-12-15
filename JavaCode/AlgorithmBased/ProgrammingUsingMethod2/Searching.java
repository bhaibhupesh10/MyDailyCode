package AlgorithmBased.ProgrammingUsingMethod2;
/*
Write a java program to check whether the entered string contains the character 'S' or not.
Note: Programmer should not use inbuilt methods contains() or charAt() or index()
        or any method which helps in searching the specfied character easily

note2: Programmer should write the set of instructions used to check whether 's' is present or not in a method by name check() which should return a boolean bvalue i.e. true irf srig contains 's' and false if it doesn't

Sample output 1                             Sample output 2
* Enter a string                            enter a string
 OMKAR                                      success
String doesn't contain 's'                  string doesn't contains 's'

 */

public class Searching {
        boolean checkS(String str){
            char ch[] = str.toCharArray();
            for(int i=0;i<=ch.length-1;i++) {
                if (ch[i] == 'S' || ch[i] == 's') {
                    return true;
                }
            }
            return false;
                }
            }
