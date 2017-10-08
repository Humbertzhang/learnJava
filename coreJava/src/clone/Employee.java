package clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee (String name, double salary)
    {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException
    {
        Employee cloned = (Employee) super.clone();
        //因为上面的clone是Object类的Clone,只能克隆基本类型.
        //所以对于类的克隆要自己实现
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    public void setHireDay(int year, int month, int day)
    {
        Date newday = new GregorianCalendar(year, month-1, day).getTime();
        hireDay.setTime(newday.getTime());
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent/100;
        salary += raise;
    }

    public String toString()
    {
        return "Employee(name = " + this.name + ",salary = " +
                this.salary + "hireDay = " + this.hireDay + ")";
    }
}
