package interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String... args)
    {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Craker", 20000);
        staff[1] = new Employee("Hacker", 70000);
        staff[2] = new Employee("Nerd", 60000);

        /*
        * 要使用sort函数就必须在类中实现Comparable类的compareTo函数
        * 类似Python中的特殊方法.
        * 要使用[]操作符就要在类中实现__getitem__方法．
        * 要想让自己的类拥有一些特殊能力，就必须implements相应的接口并实现.
        *
        * 我觉得implements接口的用处不是弥补没有多继承，因为原来的接口并没有实现什么，仅仅有一个函数声明而已
        * implements之后和重新写也没有什么区别了.
        * 接口的用处是为了配合其他方法而给类附加相应的特殊能力.
        * */
        Arrays.sort(staff);

        for(Employee e : staff){
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }
    }
}
