import java.time.LocalDate;
import java.util.Random;

/*
Java中没有析构函数,
但是可以有finalize方法,它是在垃圾回收清除之前调用
但因为很难知道什么时候调用所以并不靠谱...
*/
public class Employee {
    private static int nextId;
    //可以一开始就赋值也可以在构造器中赋值.
    private String name = "";
    private double salary;
    private int id;

    static
    {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId+=1;
    }

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double s)
    {
        //在构造函数中利用this()调用其他构造函数
        this("Emplyee #" + nextId, s);
    }

    public Employee()
    {
        /*pass*/
    }

    public String getName()
    {
        return this.name;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        id = nextId;
        nextId+=1;
    }

    public static int getNextId()
    {
        return nextId;
    }

    public void raiseSalary(double percent)
    {
        double raise = salary * percent/100;
        salary += raise;
    }

    public void say()
    {
        System.out.println("I am " + name + ", my salary is " + salary + "my id is " + id);
    }
    //main函数用于单元测试
    public static void main(String[] args)
    {
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }

}
