public class BlocksDemo {

    public BlocksDemo() {
        System.out.println("inside no-arg constructor!!!");
    }

    {
        System.out.println("inside instance block 2 !!!");
    }

    {
        System.out.println("inside instance block 1 !!!");
    }


    static {
        System.out.println("inside static block 1 !!!");
    }

    static {
        System.out.println("inside static block 2 !!!");
    }

    public static void main(String[] args) {
        System.out.println("inside main method!!!");
        BlocksDemo obj1 = new BlocksDemo();
        BlocksDemo obj2 = new BlocksDemo();

    }
}
