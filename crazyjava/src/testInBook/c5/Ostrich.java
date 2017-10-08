import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Ostrich extends Bird {
    public void fly()
    {
        System.out.println("I am a Bird BUT I can't fly...");
    }
    //方法重写
    //方法重写要注意static方法也即类方法要一致
    //且子类无法重写父类的private方法

    public void sufly()
    {
        super.fly();
        //要在子类调用父类被覆盖的方法可以用super()限定
        //且super应由一个类来调用
    }

    public static void main(String[] args)
    {
        Ostrich os = new Ostrich();
        os.fly();
        os.sufly();
    }
}
