class Parent{
    public String tag = "parent class";
}
class Derived extends Parent{
    private String tag = "derived class";
}

public class HideTest
{
    public static void main(String[] args)
    {
        Derived d = new Derived();
        //将d显式上升为Parent类,则因Parent类中的tag为 public 变量则可以正常输出.
        System.out.println(((Parent)d).tag);
    }
}
