public class WrapperDemo {

    public static void main(String[] args) {

        int i = 2147483647;

        Integer j = i; //Autoboxing

        int x = j; //Autounboxing
        
        System.out.println("Integer i = "+ i);

        System.out.println("Integer j = "+ j);
        System.out.println("int x = "+ x);
    }
}
