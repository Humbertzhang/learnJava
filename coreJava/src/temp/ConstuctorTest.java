import java.util.*;

public class ConstuctorTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();
        for(Employee item : staff){
            System.out.println("name = " + item.getName() + ",id = " + item.getId()
                                + ",salary = " + item.getSalary());
        }
    }
}
