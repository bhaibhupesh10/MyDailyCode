public class Demo6 {
    public static void main(String[]args)
    {
        int a = 10;
        int b =1_0;
        int c = 1__0;
        int d = 1___________0;
        float m = 3_4.147f;
        float n = 34.1_47f;
       // int p = 0_*45;
        //int e = _10{invalid}
        //int f = 10_ {invalid also}
        //int g = 0x10{invalid}
        // int h = 0x_10; (invalid)
        // float i = 3.147_f (invalid)
        //float j= 3.147f_ (invalid)
        // float k = 3._147f;(invalid)
        // float l = 3_.147f; (invalid)
        ////only one special symbol permitted which is "-"  but within the numbers not after and before

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(m);
        System.out.println(n);
    }
}
