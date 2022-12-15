class Practice2 {

    String name;
    int age;
    String gender;
    String subject;
    int usn;
    String space;

    void eat()
    {
        System.out.println("Practice2 is eating");
    }
    void sleep()
    {
        System.out.println("Practice2 is sleeping");

    }
    void Practice2study()
    {
        System.out.println("Practice2 is studying");

    }
}

class Pracitce2App
{
    public static void main(String[] args) {
        Practice2 s1 = new Practice2();
        Practice2 s2 = new Practice2();
        Practice2 s3 = new Practice2();

        s1.eat();
        s2.sleep();
        s3.Practice2study();

        s1.name = "Raju";
        s1.age = 223;
        s1.gender = "male";
        s1.subject = "Maths";
        s1.usn = 33;
        s1.space = "------------------------------------------------------------";

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.subject);
        System.out.println(s1.usn);
        System.out.println(s1.space);


        s2.name = "Ram";
        s2.age = 33;
        s2.gender = "female";
        s2.subject = "hindi";
        s2.usn = 22;

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gender);
        System.out.println(s2.subject);
        System.out.println(s2.usn);
        System.out.println(s1.space);

        s3.name = "rakas";
        s3.age = 334;
        s3.subject = "yogic science";
        s3.gender = "gay";
        s3.usn = 222;
        s3.space = "------------------------------------------------------";

        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.subject);
        System.out.println(s3.usn);
        System.out.println(s3.gender);
        System.out.println(s3.space);
    }
}