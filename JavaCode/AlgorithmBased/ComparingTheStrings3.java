package AlgorithmBased;

public class ComparingTheStrings3 {
    public static void main(String[] args) {
        String s1 = new String("Bhupesh");
        String s2 = new String("Bhupesh");

        if (s1 == s2) {
            System.out.println("References are Equal");
        } else {
            System.out.println("References are unequal");
        }
        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are unequal");
        }
    }
}
