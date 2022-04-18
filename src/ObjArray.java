
public class ObjArray {
	
	
	
	
	
    public static void main(String[] args) 
    {
    	
        Student s1 = new Student("Pune",10,"Ram");
        Student s2 = new Student("Pune",20,"Sham");
        Student s3 = new Student("Pune",30,"AAA");
        Student s4 = new Student("Pune",40,"BBB");
        Student s5 = new Student("Pune",50,"CCC");

        Student[] studentArray = new Student[5];

        studentArray[0] = s1;
        studentArray[1] = s2;
        studentArray[2] = s3;
        studentArray[3] = s4;
        studentArray[4] = s5;


        for(Student s : studentArray)
        {
            if(s.roll >= 40)
            System.out.println(s);
        }
    }

}
