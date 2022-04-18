public class Student {

    String name;
    int rollNo;
    String universityName;
	public int roll;

    public Student(String name, int rollNo, String universityName)//Parameterized constructor
    {
        this.name = name;
        this.rollNo = rollNo;
        this.universityName = universityName;
    }
    public Student()//No-arg constructor
    {

    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Ram";
        s1.rollNo = 10;
        s1.universityName = "Pune University";

       System.out.println(s1.name);
       System.out.println(s1.rollNo);
       System.out.println(s1.universityName);

       Student s2 = new Student();
       s2.name = "Sham";
       s2.rollNo = 20;
       s2.universityName = "Pune University";

       System.out.println(s2.name);
       System.out.println(s2.rollNo);
       System.out.println(s2.universityName);

       Student s3 = new Student("ABC",30,"Pune University");

        System.out.println(s3.name);
        System.out.println(s3.rollNo);
        System.out.println(s3.universityName);

        Student s4 = new Student("PQR", 40, "Pune University");

        System.out.println(s4.name);
        System.out.println(s4.rollNo);
        System.out.println(s4.universityName);

    }
}