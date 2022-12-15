package AlgorithmBased.IntroductionToMethods;


    /* Methods: Are the setence of statements used to perform a particular task.
    eg:- void add()            |  rectangular name (parameters)
    { int a = 10;              |  {
    int b = 20;                |   definition
    int c = c;                 |    }
    c = a+ b;                  | output name(import)
    sout(c);                   |{  body }
    }                          |
    There are four types of methods.
    1


     1.Methods that would not take any input and would not give any output;
     2. Methods that would accept the parameters but would not return any value
     3. Methods that would not accept any parameter but would return a value
     4. Methods that would take the parameter and would return the value
     */
//type1 method


public class Math {
    void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public static class MathApp {
        public static void main(String[] args) {
            Math m = new Math();
            m.add();
        }
    }
}