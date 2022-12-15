public class Pattern21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 9; j >= 2 * i - 1; j--) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}