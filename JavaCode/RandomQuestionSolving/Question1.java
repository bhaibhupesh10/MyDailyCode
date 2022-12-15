package RandomQuestionSolving;

public class Question1 {
    public static void main(String[] args) {
        int i=5;
        while(i>=0){
            int j=i;
            while(j>0){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i--;
        }
    }
}