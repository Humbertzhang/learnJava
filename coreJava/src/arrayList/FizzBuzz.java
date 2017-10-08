package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //ArrayList<>尖括号中的不允许是基本类型
        ArrayList<String> rlt = new ArrayList<>();

        System.out.println("Input N");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i%3 != 0 && i%5 != 0)
                rlt.add(Integer.toString(i));
            else if(i%15 == 0)
                rlt.add("FizzBuzz");
            else if(i%5 == 0)
                rlt.add("Buzz");
            else if(i%3 == 0)
                rlt.add("Fizz");
        }

        System.out.println("FizzBuzz Output:");
        for(int j = 0; j < rlt.size(); j++){
            System.out.println(rlt.get(j));
        }
        //关于自动转换进制:对于2进制到36进制(用A,B,C...Z来代表大的数)可以转换
        //大于36之后就失效了
        System.out.println(Integer.toString(100, 35));
        System.out.printf("%s", "fq");
    }
}