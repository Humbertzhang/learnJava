public class PrimitiveAndString
{
	public static void main(String []args)
	{
		//若想要将一个非字符串基本类型转换乘字符串
		//可以将其与一个空字符串连接，就会自动转换
		String str2 = 3.5f + "";
		System.out.println(str2);
		//输出7Hello!
		System.out.println(3+4+"Hello!");
		//输出Hello!34,因为3 + 4 会识别为字符串
		System.out.println("Hello!" + 3 + 4);
	}
}