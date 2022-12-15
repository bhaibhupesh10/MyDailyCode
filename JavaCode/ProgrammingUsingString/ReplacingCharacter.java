package ProgrammingUsingString;

/* Que. :- Write a java program to replace the specified character of a string with character 'A'.  */

public class ReplacingCharacter {
    public static void main(String[] args) {
        String s = "Raja Ram Mohan Roy";
        System.out.println(s);
        s = s.replace('R','A');
        System.out.println(s);

    }
}
/* Output: Raja Ram Mohan Roy
    Aaja Aam Moyhan Aoy
 */