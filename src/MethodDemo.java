
public class MethodDemo {
int k =35;
    public static void main(String[] args) {

        System.out.println("main method started!!!");
        int i = 10;
        int j = 20;
        int sum = i + j;
        System.out.println(sum);
       MethodDemo s2 =new MethodDemo();
       System.out.println(s2.k);
        printHello(); //method invocation/calling
        System.out.println("main method ended!!!");
    }

    public static int printHello() //method declaration
    {
        System.out.println("printHello method started 3!!");
        int s= addition(10,50); //method calling
        System.out.println("printHello method ended 7!!");
        return s;
        
    }

    public static int addition(int a, int b) // method declaration
    {
        System.out.println("addition method started 4!!");
        int sum = a + b;
        System.out.println(sum +"5");
        System.out.println("addition method ended 6!!");
        return sum;
    }

}
