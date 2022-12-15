package AlgorithmBased;

public class StringContinuation {
    public static void main(String[] args) {
        String s1 = "omkar";
        String s2 = new String("OMKAR");

        if (s1 == s2) {
            System.out.println("References are Equal");
        } else {
            System.out.println("References are unequal");
        }
        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        } else
        {
            System.out.println("Strings are unequal");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are Equal");
        }
        else
        {
            System.out.println("Strings are unequal");
        }
    }
}
