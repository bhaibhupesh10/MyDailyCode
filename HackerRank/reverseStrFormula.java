package HackerRank;

public class reverseStrFormula {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Bhupesh");
//        System.out.println(str);
//        System.out.println(str.reverse());
        for(int i = 0;i<str.length()/2;i++)
        {
            int front = i;
            int back = str.length()-1-i;
            char frontface = str.charAt(front);
            char backface = str.charAt(back);
            str.setCharAt(front,backface);
            str.setCharAt(back, frontface);
            System.out.println(str);
        }



    }
}
