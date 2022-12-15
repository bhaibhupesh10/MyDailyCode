package AlgorithmBased.DifferenceBtwInstanceVariableAndLocalVariable;


public class Calculator {
    int a = 10;
    int b = 20;

    void add() {
        int x = 30;
        int y = 40;
        int z = a + b + x + y;
        System.out.println(z);
    }

    public static class CalculatorApp {
        public static void main(String[] args) {
            Calculator calci = new Calculator();
            calci.add();
        }
    }
}


/* Instance variables are present in inside the class outside the method
    * local variables are present inside the method
    *********************OBJECT CREATION****************************
    # INSTANCE VARIABLE                       # LOCAL VARIABLES
    * These are such variables which            * these are such variable which are present inside the method.
      are present inside the class but         * These variables will get the memory in the activation reword in the stack
      outside the method                        * these variables will get the memory when the method is called uinside the activation reword.
    * These variables will get the memory
    * inside the instance or object
    * These variables will get the namely
     at the time of instiation(object
       creation)
   */