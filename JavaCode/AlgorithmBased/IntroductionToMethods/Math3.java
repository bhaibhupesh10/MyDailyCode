package AlgorithmBased.IntroductionToMethods;

public class Math3 {
    int add(int a, int b)
    {
        int c = a+b;
        return c;
    }

    public static class Math3App {
        public static void main(String[] args) {

            Math3 m = new Math3();
            int x = 10;
            int y = 20;
            int res = m.add(x,y);
            System.out.println(res);
        }
    }
}
/*
    1. The methods that would not take any input would not give any output.
    2. Methods that would accept any parameter but would not return any value.
    3. Methods thatt would not accept any parameter but would return value
    4. Methods that would accpet the parameter and would return the value.
 */