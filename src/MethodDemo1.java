
public class MethodDemo1 {

    public static void main(String[] args) {

        System.out.println("main method started 1 !!!");
        int result;
        result = addition(30, 50);
        System.out.println(result +"9");
        System.out.println("main method ended 10!!!");
    }

    public static int addition(int a, int b) // method declaration
    {
        System.out.println("addition method started 2!!");
        int sum = a + b;
        int res = MethodDemo.printHello();
        System.out.println(res+",60,"+ "7");
        System.out.println("addition method ended 8!!");
        return sum;
    }


}
