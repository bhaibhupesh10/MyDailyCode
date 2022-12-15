package AlgorithmBased.IntroductionToMethods;

/*
Method that would accept the parameters but would not return any value
 */
public class Math1 {
    void add(int a, int b)
    {
        int c = a+ b;
        System.out.println(c);
    }

    public static class Math1App {
        public static void main(String[] args) {
            Math1 m = new Math1();
            int x = 15;
            int y = 20;
            m.add(x,y);
        }
    }
}
