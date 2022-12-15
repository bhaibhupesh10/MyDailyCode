package AlgorithmBased;

public class StringContinuation3 {
    public static void main(String[] args) {
        String s1 = "Kod";
        String s2 = "Nest";
        String s3 = "Kod" + "Nest";
        String s4 = "Kod" + "Nest";
        if (s3 == s4) {
            System.out.println("References are Equal");
        }
        else {
            System.out.println("References are unequal");
        }
            if (s3.equals(s4))
            {
                System.out.println("Strings are equal");
            }
            else
            {
                System.out.println("Strings are unequal");
            }
        }
    }
