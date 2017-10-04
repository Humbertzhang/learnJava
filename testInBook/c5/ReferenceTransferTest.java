class DataWrap
{
    int a;
    int b;
}
/*
虽然java中参数传递仍然是值传递
但是传递的值是dw对象的引用变量
也即为一个地址
所以swap中对dw的交换就是对其本身的交换

但是swap中dw与main()中dw不同
即便在swap最后将dw设置为null
在main函数中仍可以使用
*/
public class ReferenceTransferTest
{
    public static void swap(DataWrap dw)
    {
        int tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;

        System.out.println("swap中 a:" + dw.a + " b:" + dw.b);
        dw = null;
    }
    
    public static void main(String[] args)
    {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        System.out.println("swap 前 a:" + dw.a + " b:" + dw.b);
        swap(dw);
        System.out.println("swap后 a:" + dw.a + " b:" + dw.b);
    }
}