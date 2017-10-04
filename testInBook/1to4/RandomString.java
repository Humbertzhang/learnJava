public class RandomString
{
    public static void main(String[] args)
    {
        String result = "";
        for(int i = 0; i < 6; i++)
        {
            //math.random()生成一个0~1之间的小数
            //因此ival为一个97-122之间的数
            int iVal = (int)(Math.random() * 26 + 97);
            result = result + (char)iVal;
        }
        System.out.println(result);
    }
}