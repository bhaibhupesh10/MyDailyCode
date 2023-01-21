package HackerRank;

public class prePostInc {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // Pre increment                                    // Post increment
//        b = a++;                                             // b = ++a;
//        System.out.println(a);
//        System.out.println(b);

        // Post increment
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
