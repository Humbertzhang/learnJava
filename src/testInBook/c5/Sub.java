class Base{
    public double size;
    public String name;
    public Base(double size, String name)
    {
        this.name = name;
        this.size = size;
    }
}

public class Sub extends Base
{
    public String color;
    public Sub(double size, String name, String color)
    {
        
    }
}
