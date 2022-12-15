package AlgorithmBased;

public class StringBuilderMethod2 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity());
        s.append("Virat Kohli is a Batsman");
        System.out.println(s.capacity());
        s.append("He plays for RCB");
        System.out.println(s.capacity());
        }
}
