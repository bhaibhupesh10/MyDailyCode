package AlgorithmBased;

import java.util.StringTokenizer;

public class StringTokenizerStMethod {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("KODNEST TECHNOLOGIES PVT LMT"," ");
        while(st.hasMoreTokens()==true)
        {
            System.out.println(st.nextToken());
        }
    }
}
