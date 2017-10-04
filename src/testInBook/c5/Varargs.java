public class Varargs
{
    public static void test(String... books)
    {
        //...导致形参个数可变的本质是将他们放入了一个数组
        for (String item:books)
        {
            System.out.print(item + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args)
    {
        test("A", "Harry Potter", "B");
    }
}