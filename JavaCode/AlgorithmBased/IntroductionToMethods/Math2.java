package AlgorithmBased.IntroductionToMethods;

public class Math2 {
    int add()
    {
        int a = 10;
        int b = 30;
        int c = a+b;
        return c;
    }

    public static class Math2App {
        public static void main(String[] args) {
            Math2 m = new Math2();
            int res = m.add();
            System.out.println(res);
            }
     }
}
