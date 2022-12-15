package AlgorithmBased;

public class InternMethod {
    public static void main(String[] args)
    {
        String s1 = new String("Omkar");
        String s2 = s1.intern();
        String s3 = "Omkar";
        if(s2==s3) {
            System.out.println("References are equal");
        }
        else
        {
            System.out.println("References are unequal");
        }
    }
}
