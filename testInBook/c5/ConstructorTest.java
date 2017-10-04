public class ConstructorTest
{
    public String name;
    public int count;
    /*
    1）构造方法的方法名必须与类名相同。
    2）构造方法没有返回值类型，不能使用return语句。
    java用这两个来区分是否是构造函数
    */
    public ConstructorTest(String name, int count)
    {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args)
    {
        ConstructorTest tc = new ConstructorTest("test", 100);
        System.out.println("name:" + tc.name + " count:" + tc.count);
    }
}