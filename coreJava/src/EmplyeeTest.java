public class EmplyeeTest {
    public static void main(String[] args)
    {
        /*一开始先默认初始化了三个类，之后重新初始化了三个赋值给他们，
        * 之前的就垃圾回收掉了*/
        /*使用Employee类的时候会自动编译Employee.java文件*/
        /*Java中一定要带new来使用构造器，与C++不同*/
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("A", 1000);
        staff[1] = new Employee("B", 1200);
        staff[2] = new Employee("C", 1500);

        for(Employee e : staff)
            e.raiseSalary(5.0);

        for(Employee e:staff)
            e.say();
    }
}
