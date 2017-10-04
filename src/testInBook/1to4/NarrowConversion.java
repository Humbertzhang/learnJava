public class NarrowConversion
{
    public static void main(String[] args)
    {
        int iValue = 233;
        byte bValue = (byte)iValue;
        //强制类型转换导致输出-23
        System.out.println(bValue);
        double dv = 3.99;
        int iv = (int)dv;
        System.out.println(iv);
    }
}