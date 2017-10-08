/*
java中可以一个类中有多个同名函数
只要保证这些函数的形参列表为不一样的即可
这种特性叫做　方法重载
*/

import java.util.Scanner;

public class Overload {
    public static void test() {
        System.out.println("无参数");
    }

    public static void test(String msg) {
        System.out.println("重载后:" + msg);
    }

    public static void main(String[] args) {
        test();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input message:");
        String msg = sc.nextLine();
        test(msg);
    }
}