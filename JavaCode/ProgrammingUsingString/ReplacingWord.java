package ProgrammingUsingString;

/* Write a java program to replace "Hello" with "Hi". */

public class ReplacingWord {
    public static void main(String[] args) {
        String s = "Hello Hello Bhupesh Hello";
        System.out.println(s);
        s = s.replaceAll("Hello" , "HI");
        System.out.println(s);

    }
}
/* Output: Hello Hello Bhupesh Hello
            Hi Hi Bhupesh Hi
 */