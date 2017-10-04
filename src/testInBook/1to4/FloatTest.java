public class FloatTest
{
    public static void main(String[] args)
    {
        float af = 3.1411f;
        System.out.println(af);
        double a = 0.0;
        double c = Double.NEGATIVE_INFINITY;
        double d = Float.NEGATIVE_INFINITY;
        //两个NEGATIVE_INFINITY之间为相等的
        System.out.println(c == d);
        //非数不和任何东西相等
        //0.0除以0.0得到一个非数
        //而整数除以0抛出异常
        System.out.println(a/a == Float.NaN);
        //所有正无穷大相等
        System.out.println(6.0 / 0 == 555.0 / 0);

    }
}
