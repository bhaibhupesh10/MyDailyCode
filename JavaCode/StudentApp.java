class Student
{
    String name;
    int age;
    String gender;
    int usn;
    String illegle;
    void eat()
    {
        System.out.println("Student is eating");
    }

  void sleep()
  {
      System.out.println("Student is sleeping");

  }
  void studentstudy()
  {
      System.out.println("Student is studying");

  }

}

class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.eat();
        s2.sleep();
        s3.studentstudy();

        s1.name = "Raju";
        s1.age = 22;
        s1.gender = "male";
        s1.usn = 33;
        s1.illegle = "kdsjklf";


        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.usn);
        System.out.println(s1.illegle);
    }
}