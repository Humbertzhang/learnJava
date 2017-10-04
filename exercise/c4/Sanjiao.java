import java.util.Scanner;
//java获取输入可以用Scanner
//配合int x = sc.nextInt()
//String x = sc.nextLine()
//float y = sc.nextFloat()等来输入
public class Sanjiao
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入n:");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            //输出空格
            for(int j = 0; j < n-i; j++)
                System.out.print(" ");
            //输出前半＊
            for(int k = 0; k < i; k++)
                System.out.print("*");
            for(int k = 0; k < i-1; k ++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}